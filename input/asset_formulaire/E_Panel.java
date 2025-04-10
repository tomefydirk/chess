package asset_formulaire;

import java.awt.Label;


import javax.swing.JPanel;
import javax.swing.JTextField;

import aff.Formulaire;
import aff.Table;
import aff_button.ButtonSave;
import aff_button.ButtonUppload;

public class E_Panel extends JPanel{
    public E_Panel(Formulaire f,Table t,int row, int cols){
        JPanel bouton_panel=new JPanel();
        f.setSave(new JTextField("default_save",10));
        bouton_panel.add(f.getSave());

        f.setUpload(new JTextField("default_save",10));
      

        bouton_panel.add(new ButtonSave(t.getEmpl(),f.getSave(),row,cols));
        bouton_panel.add(new Label("       "));

        bouton_panel.add(f.getUpload());
        bouton_panel.add(new ButtonUppload(t.getEmpl(),f.getUpload(),t));
        add(bouton_panel);
    }
}
