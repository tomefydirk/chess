package aff;

import javax.swing.JButton;
import fonction.*;
public class ButtonUppload extends JButton{
        String path;
        Empl empl;
        public ButtonUppload(Empl empl){
            super("Upload");
            this.empl=empl;
            addActionListener(_->{
                System.out.println("Save");
            });
        }
}
