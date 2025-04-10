package aff;
import java.awt.*;

import javax.swing.*;
import asset_formulaire.*;
public class Formulaire  extends JPanel{
    JTextField x,y;
    JComboBox piece;
    JComboBox couleur;
    boolean eror;
    
    
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
       add(new E_Panel(this, t,t.rows, t.cols));
       add(new F_Panel(t));
       
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

    //impl --->[get_field]{
        public JComboBox getPiece() {
            return piece;
        }
        
        
        public JComboBox getCouleur() {
            return couleur;
        }
        public JTextField get_x_Field(){
            return this.x;
        }
        public JTextField get_y_Field(){
            return this.y;
        }
        public JTextField getSave() {
            return save;
        }
        public JTextField getUpload() {
            return upload;
        }
    //}

    //impl --->[mut_field]{
        public boolean setEror() {
            return eror;
        }
       
        public void setEror(boolean eror) {
            this.eror = eror;
        }
        public void setSave(JTextField save) {
            this.save = save;
        }
        public void setUpload(JTextField upload) {
            this.upload = upload;
        }
    //}
    
}