package aff;

import javax.swing.JButton;

import fonction.Empl;

public class ButtonReset extends JButton{
        public ButtonReset(Empl e){
            super("Reset");
            addActionListener(_->{
                e.reset();
            });
        }
}
