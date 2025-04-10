package aff_button;

import javax.swing.JButton;
import javax.swing.JPanel;

import aff.Formulaire;
import aff.Table;
import asset_formulaire.D_Panel;
import fonction.Piece;

public class ButtonAjouter extends JButton{
    public ButtonAjouter(Formulaire f,Table t,JPanel j){
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
            
            f.setEror(false);
          
            if(!t.getEmpl().get_est_pris(valY, valX) && t.getEmpl().get_q(valCouleur).general_get(valpiece)>0){
             
                t.getEmpl().set_Empl(valY, valX, true, new Piece(valpiece, valCouleur));
            }else{
                f.setEror(true);
            }
            if(f.setEror()){
              D_Panel.make_eror_message(j);
            }else{
                D_Panel.destroy_eror_message(j);
            }
            t.repaint();
           
        });
    }
}
