package aff;
import java.awt.*;

import javax.swing.*;
public class Formulaire  extends JPanel{
    JTextField x,y;
    JComboBox type;
    
    public Formulaire(){
        String[] f={"caca","popo"};
        this.setLayout(new GridLayout(8, 9));
        makeComboBxp("Pièce",f);
        maketextfield("nom", x);
       

    } 
    void makeComboBxp(String nom,String[] f){
        JPanel combo_bar=new JPanel();
        type=new JComboBox<String>(f);
        combo_bar.add(type);
        add(new Label(nom));
        add(combo_bar);
    }      
    void maketextfield(String nom,JTextField t){
        JPanel text_Panel=new JPanel();
        t=new JTextField(nom, 3);
        text_Panel.add(t);
        add(text_Panel);

    }
}