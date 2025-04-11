package asset_formulaire;

import javax.swing.JComboBox;
import javax.swing.JPanel;

public class A_Panel extends JPanel{
        public A_Panel(JComboBox a){
            super();
            add(new My_Combobox("Pièce",a));
        }
}
