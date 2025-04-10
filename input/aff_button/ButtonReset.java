package aff_button;

import javax.swing.JButton;

import fonction.Empl;
import aff.*;
public class ButtonReset extends JButton{
        //impl --->[constructor]{
        public ButtonReset(Empl e,Table t){
            super("Reset");
            addActionListener(_->{
                e.reset();
                t.repaint();
            });
        }
        // }
}
