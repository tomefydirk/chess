package aff;
import java.awt.*;

import javax.swing.*;
public class Formulaire  extends JPanel{
    JTextField x,y;
    JComboBox type;
    
    public Formulaire(){
        String[] f={"caca","popo"};
        type=new JComboBox<String>(f);
        
        add(type);

    } 
    void makeComboBxp(String nom){

    }      
}