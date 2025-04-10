package asset_formulaire;

import javax.swing.JPanel;
import aff_button.ButtonReset;
import aff_button.Button_Cursor_Reset;
import aff.Table;

public class F_Panel extends JPanel{
    public F_Panel(Table t){
            super();
            add(new ButtonReset(t.getEmpl(), t));
            add(new Button_Cursor_Reset(t));
            
    }
}
