package asset_formulaire;

import javax.swing.JComboBox;
import javax.swing.JPanel;

public class B_Panel extends JPanel{
        public B_Panel(JComboBox b){
            super();
            add(new My_Combobox("couleur",b));   
        }
}
