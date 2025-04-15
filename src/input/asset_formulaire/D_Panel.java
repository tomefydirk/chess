package asset_formulaire;


import javax.swing.JPanel;


import aff.Formulaire;
import aff.Table;
import aff_button.ButtonAjouter;
import aff_button.ButtonDelete;
import aff_button.Button_deplacer;
import aff_button.Button_pointer;

public class D_Panel extends JPanel{
        public D_Panel(Formulaire f,Table t){
        super();
        this.add(new ButtonAjouter(f, t)); 
        this.add(new ButtonDelete(f, t));
        this.add(new Button_pointer(f, t));
        //this.add(new Button_deplacer());
        }
}
