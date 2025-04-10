package aff;
import java.awt.*;

import javax.swing.*;

import aff_button.*;
import asset_formulaire.*;
public class Formulaire  extends JPanel{
    JTextField x,y;
    JComboBox piece;
    public JComboBox getPiece() {
        return piece;
    }
    JComboBox couleur;
    
    public JComboBox getCouleur() {
        return couleur;
    }
    boolean eror;
    
    public boolean setEror() {
        return eror;
    }
    public JTextField get_x_Field(){
        return this.x;
    }
    public JTextField get_y_Field(){
        return this.y;
    }
    public void setEror(boolean eror) {
        this.eror = eror;
    }
    Table t;

    JTextField save;
    JTextField upload;

    //impl --->[constructor]{
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
      
       add(new A_Panel(piece));
       add(new A_Panel(couleur));
       add(new C_Panel("x", "y", x, y));
       add(new D_Panel(this, t));
       
        make_bouton_uppload_and_save();
        make_main_panel_button();
        Ecoute e=new Ecoute(t,x,y);
        e.succes_mesage();
    } 
    // }

    //hashage {
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
    // }

    //impl -->[make_function]{
    void make_bouton_uppload_and_save(){
        JPanel bouton_panel=new JPanel();
        this.save=new JTextField("default_save",10);
        bouton_panel.add(this.save);

        this.upload=new JTextField("default_save",10);
      

        bouton_panel.add(new ButtonSave(this.t.empl,this.save,t.rows,t.cols));
        bouton_panel.add(new Label("       "));

        bouton_panel.add(this.upload);
        bouton_panel.add(new ButtonUppload(this.t.empl,this.upload,t));
        add(bouton_panel);
    }
    void make_main_panel_button(){

        JPanel bouton_bar=new JPanel();
        bouton_bar.add(new ButtonReset(this.t.empl, t));
        add(bouton_bar);

    }
    void maketextfield(String nom,JTextField t){
        JPanel text_panel=new JPanel();
        JLabel label=new JLabel(nom);
    
        text_panel.add(label);
        text_panel.add(t);
        add(text_panel);

    }
    void make_checkbox(String nom,JCheckBox c){
        JPanel check_panel=new JPanel();
     
        c=new JCheckBox(nom);
        check_panel.add(c);
        add(check_panel);
        
    }
    // }
}