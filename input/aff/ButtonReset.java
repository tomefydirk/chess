package aff;

import javax.swing.JButton;

import fonction.Empl;

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
