package aff_button;

import javax.swing.JButton;

import aff.Formulaire;
import aff.Table;
import java.awt.Point;
public class Button_pointer extends JButton{
         public Button_pointer(Formulaire f,Table t){
             
                        super("Pointer");
                        this.addActionListener(_ -> {
                            int valX =Integer.parseInt(f.get_x_Field().getText()) ;
                            int valY =Integer.parseInt(f.get_y_Field().getText()) ;
                            t.setSelected(new Point(valX,valY));
                            t.repaint();
                           
                        });
                    
        }        
}
