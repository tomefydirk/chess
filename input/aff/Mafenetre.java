package aff;

import java.awt.*;

import javax.swing.*;

import fonction.Piece;
public class Mafenetre extends JFrame{
    Table t;
    Formulaire f;
    public Mafenetre(){
        this.setLayout(new GridLayout(1, 2));
        this.setMinimumSize(new Dimension(1000,1000));
        this.setLocationRelativeTo(null);

      
        this.t=new Table();
        this.f=new Formulaire();
        this.t.empl.set_Empl(6, 6,true, new Piece('p', "blanc"));
        this.t.empl.set_Empl(0, 6,true, new Piece('q', "noir"));
      this.add(f);
      this.add(t);
        this.setVisible(true);

    }
}
