package aff;

import java.awt.Dimension;
import java.awt.GridBagLayout;

import javax.swing.*;
public class Mafenetre extends JFrame{
    Table t;
    public Mafenetre(){
        this.setLayout(new GridBagLayout());
        this.setMinimumSize(new Dimension(1000,1000));
        this.setLocationRelativeTo(null);


        this.t=new Table();
        this.add(t);
        this.setVisible(true);

    }
}
