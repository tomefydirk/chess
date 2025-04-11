package aff;

import java.awt.*;

import javax.swing.*;


public class Mafenetre extends JFrame{
    Table t;
    Formulaire f;
    //impl -->[constructor]{
    public Mafenetre(int row,int cols){
      super("Chess game");
      this.setLayout(new GridLayout(1, 2));
      this.setMinimumSize(new Dimension(1000,1000));
      this.setLocationRelativeTo(null);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
     // ImageIcon icon = new ImageIcon(getClass().getResource("/img/util/chess.png"));
     // this.setIconImage(icon.getImage());
      //System.out.println("Image chargée ? " + (icon.getImage() != null));
      this.t=new Table(row,cols);
      this.f=new Formulaire(t);
 
    this.add(f);
    this.add(t);
     this.setVisible(true);
        
    }
    // }

    //impl --->[Debug]{
    public void succes_mesage(){
        System.out.println("Ma fenetre marche!!");
    }
    // }
}
