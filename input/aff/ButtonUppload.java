package aff;

import javax.swing.JButton;
import javax.swing.JTextField;

import fonction.*;
public class ButtonUppload extends JButton{
        String path;
        Empl empl;

        public ButtonUppload(Empl empl,JTextField a){
            super("Upload");
            this.empl=empl;
            addActionListener(_->{
                System.out.println("Save"+a.getText());
            });
        }
}
