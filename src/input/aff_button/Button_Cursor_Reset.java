package aff_button;

import javax.swing.JButton;

import aff.Table;

public class Button_Cursor_Reset extends JButton{
        public Button_Cursor_Reset(Table t){
            super("Enlever cursor");
             this.addActionListener(_ -> {
                t.setSelected(null);
                t.repaint();
             });
        }
}
