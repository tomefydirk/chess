package aff_button;

import javax.swing.JButton;

import aff.*;
import fonction.Empl;
import fonction.Piece;

import javax.swing.JPanel;
public class ButtonDelete extends JButton{
        public ButtonDelete(Formulaire f,Table t,JPanel j){
             
                        super("Retirer");
                        this.addActionListener(_ -> {
                            int valX =Integer.parseInt(f.get_x_Field().getText()) ;
                            int valY =Integer.parseInt(f.get_y_Field().getText()) ;
                            
                         
                            Empl e =t.getEmpl();
                            Piece detected = e.getP(valY, valX);
                            e.delete_Empl(valY, valX,detected);
                            t.repaint();
                           
                        });
                    
        }
}
