package aff;

import javax.swing.JButton;
import javax.swing.JTextField;

import fonction.*;
import lecture.*;
public class ButtonUppload extends JButton{
        String path;
        Empl empl;

        public ButtonUppload(Empl empl,JTextField a,Table t){
            super("Upload");
            this.empl=empl;
            addActionListener(_->{
                String path=EmplLoader.path_saved(a.getText());
                EmplLoader.general_load(empl, path, 8, 8);
                System.out.println("Save"+a.getText());
                t.repaint();
            });
        }
}
