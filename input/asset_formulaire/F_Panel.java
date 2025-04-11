package asset_formulaire;

import javax.swing.JPanel;
import aff_button.ButtonReset;
import aff_button.Button_Cursor_Reset;
import aff.Table;

public class F_Panel extends JPanel{
    public F_Panel(Table t,int row,int col){
            super();
            add(new ButtonReset(t.getEmpl(), t,row,col));
            add(new Button_Cursor_Reset(t));
            
    }
}
