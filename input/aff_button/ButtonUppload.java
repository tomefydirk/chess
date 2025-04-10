package aff_button;

import javax.swing.JButton;
import javax.swing.JTextField;

import fonction.*;
import lecture.*;
import aff.*;
public class ButtonUppload extends JButton{
        String path;
        Empl empl;

        //impl --->[constructor]{
        public ButtonUppload(Empl empl,JTextField a,Table t){
            super("Upload");
            this.empl=empl;
            addActionListener(_->{
                String path=EmplLoader.path_saved(a.getText());
                EmplLoader.general_load(empl, path);
                System.out.println("Save"+a.getText());
                t.repaint();
            });
        }
        // }
}
