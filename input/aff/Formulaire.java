package aff;
import java.awt.*;

import javax.swing.*;


import fonction.Piece;
public class Formulaire  extends JPanel{
    JTextField x,y;
    JComboBox piece;
    JComboBox couleur;
    
    boolean eror;
    Table t;

    JTextField save;
    JTextField upload;

    public Formulaire(Table t){
        this.t=t;
        this.setLayout(new GridLayout(6, 9));
        this.eror=false;
        this.piece=new JComboBox<String>(new String[]{
            "Roi",
            "Reine",
            "Fou",
            "Cavalier",
            "Tour",
            "Pion"
        });
        this.couleur=new JComboBox<String>(new String[]{"noir","blanc"});
        this.x=new JTextField("x",10);
        this.y=new JTextField("y",10);
        makeComboBxp("Pièce",piece);
        makeComboBxp("Couleur",  couleur);
        makedoubletextfield("x ", "y ", x, y);
       
        JButton bouton = new JButton("Appliquer");
        make_bouton_appliquer(bouton);
        make_bouton_uppload_and_save();
    } 
    public static char hashage_piece(String indifiant){
       switch (indifiant) {
        case "Pion":
            return 'p';
        case "Roi":
            return 'k';
        case "Reine" :
            return 'q';
        case "Fou":
            return 'f';
        case "Cavalier":
            return 'c';
        case "Tour":
            return 't';
        default:
            return '_';
       }
    }
    void make_bouton_appliquer(JButton bouton){
        JPanel bouton_panel=new JPanel();
        bouton.addActionListener(_ -> {
            int valX =Integer.parseInt(x.getText()) ;
            int valY =Integer.parseInt(y.getText()) ;
            char valpiece = hashage_piece((String) piece.getSelectedItem());
            String valCouleur = (String) couleur.getSelectedItem();
        
            System.out.println("X : " + valX);
            System.out.println("Y : " + valY);
            System.out.println("piece : " + valpiece);
            System.out.println("Couleur : " + valCouleur);
            eror=false;
          
            if(!t.empl.get_est_pris(valY, valX) && t.empl.get_q(valCouleur).general_get(valpiece)>0){
             
                t.empl.set_Empl(valY, valX, true, new Piece(valpiece, valCouleur));
            }else{
                eror=true;
            }
            if(eror){
                make_eror_message(bouton_panel);
            }else{
                destroy_eror_message(bouton_panel);
            }
            t.repaint();
           
        });
        bouton_panel.add(bouton);
        add(bouton_panel);
    }
    void make_bouton_uppload_and_save(){
        JPanel bouton_panel=new JPanel();
        this.save=new JTextField("default_save",10);
        bouton_panel.add(this.save);

        this.upload=new JTextField("default_save",10);
      

        bouton_panel.add(new ButtonSave(this.t.empl,this.save));
        bouton_panel.add(new Label("       "));

        bouton_panel.add(this.upload);
        bouton_panel.add(new ButtonUppload(this.t.empl,this.upload,t));
        add(bouton_panel);
    }
    void makeComboBxp(String nom, JComboBox c) {
        JPanel combo_bar = new JPanel();
        combo_bar.add(new JLabel(nom));
        combo_bar.add(c);
        add(combo_bar);
    }   
    void maketextfield(String nom,JTextField t){
        JPanel text_panel=new JPanel();
        JLabel label=new JLabel(nom);
    
        text_panel.add(label);
        text_panel.add(t);
        add(text_panel);

    }
    static void  make_eror_message(JPanel p) {
       
        for (Component comp : p.getComponents()) {
            if (comp instanceof Erorpanel) {
                return; 
            }
        }
        
        JPanel errorPanel = new Erorpanel(); 
        p.add(errorPanel); 
        p.revalidate();
        p.repaint();   
    }
    static void destroy_eror_message(JPanel p){
        for (Component comp : p.getComponents()) {
            if (comp instanceof Erorpanel) { 
                p.remove(comp); 
                break;
            }
        }
        p.revalidate(); 
        p.repaint();
    }
    void makedoubletextfield(String nom1,String nom2,JTextField t1,JTextField t2){
        JPanel text_panel=new JPanel();
        JLabel label1=new JLabel(nom1);
      
        text_panel.add(label1);
        text_panel.add(t1);

        text_panel.add(new JLabel("        "));

        JLabel label2=new JLabel(nom2);
       
        text_panel.add(label2);
        text_panel.add(t2);


        add(text_panel);
    }
    void make_checkbox(String nom,JCheckBox c){
        JPanel check_panel=new JPanel();
     
        c=new JCheckBox(nom);
        check_panel.add(c);
        add(check_panel);
        
    }
}