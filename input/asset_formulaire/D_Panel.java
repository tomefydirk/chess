package asset_formulaire;


import javax.swing.JPanel;


import aff.Formulaire;
import aff.Table;
import aff_button.ButtonAjouter;

public class D_Panel extends JPanel{
        public D_Panel(Formulaire f,Table t){
        super();
        this.add(new ButtonAjouter(f, t, this)); 
        }
}
