package aff_button;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import aff.Formulaire;
import aff.Table;
import fonction.Piece;

public class ButtonAjouter extends JButton{
        void make_eror(){
          ImageIcon icon = new ImageIcon("/home/tomefy/Documents/prog/java/chess/img/util/sad.png");

       
        JLabel imageLabel = new JLabel(icon);

        JLabel textLabel = new JLabel("Erreur sur la positon ou nombre maximale atteint");
      

        
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.LEFT));
    
        panel.add(textLabel);
        panel.add(imageLabel);

        
        JOptionPane.showMessageDialog(null, panel, "Impossible d'ajouter la case", JOptionPane.ERROR_MESSAGE);
        }
       public ButtonAjouter(Formulaire f,Table t){
        super("Ajouter");
        this.addActionListener(_ -> {
            int valX =Integer.parseInt(f.get_x_Field().getText()) ;
            int valY =Integer.parseInt(f.get_y_Field().getText()) ;
            char valpiece = Formulaire.hashage_piece((String) f.getPiece().getSelectedItem());
            String valCouleur = (String) f.getCouleur().getSelectedItem();
        
           /* System.out.println("X : " + valX);
            System.out.println("Y : " + valY);
            System.out.println("piece : " + valpiece);
            System.out.println("Couleur : " + valCouleur); */

          
          
            if(!t.getEmpl().get_est_pris(valY, valX) && t.getEmpl().get_q(valCouleur).general_get(valpiece)>0){
             
                t.getEmpl().set_Empl(valY, valX, true, new Piece(valpiece, valCouleur));
            }else{
               make_eror();
            }
          
            t.repaint();
           
        });
    }
}
