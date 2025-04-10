package asset_formulaire;

import java.awt.Component;
import javax.swing.JPanel;


import aff.ErorPositionpanel;
import aff.Formulaire;
import aff.Table;
import aff_button.ButtonAjouter;

public class D_Panel extends JPanel{
        public static void  make_eror_message(JPanel p) {
       
        for (Component comp : p.getComponents()) {
            if (comp instanceof ErorPositionpanel) {
                return; 
            }
        }
        
        JPanel errorPanel = new ErorPositionpanel(); 
        p.add(errorPanel); 
        p.revalidate();
        p.repaint();   
        }
        public static void destroy_eror_message(JPanel p){
        for (Component comp : p.getComponents()) {
            if (comp instanceof ErorPositionpanel) { 
                p.remove(comp); 
                break;
            }
        }
        p.revalidate(); 
        p.repaint();
        }
        public D_Panel(Formulaire f,Table t){
          super();
        
        this.add(new ButtonAjouter(f, t, this)); 
        }
}
