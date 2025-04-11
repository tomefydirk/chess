package asset_formulaire;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class My_Combobox extends JPanel{
    public My_Combobox(String nom,JComboBox c){
        super();
        this.add(new JLabel(nom));
        this.add(c);      
    }    
}
