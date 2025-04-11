package aff_button;

import javax.swing.JButton;

import aff.Table;

public class Button_select_all extends JButton{
        public Button_select_all(Table t){
            super("Selectioner tous");
            addActionListener(
                _->{
                    if(t.isAll_selected()){
                        setText("Sélectioner tous");
                        t.setAll_selected(false);
                        t.repaint();
                    }else{
                        setText("Déselectioner tous");
                        t.setAll_selected(true);
                        t.repaint();
                    }
                }
            );
        }
}
