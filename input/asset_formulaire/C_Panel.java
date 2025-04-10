package asset_formulaire;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class C_Panel extends JPanel{
    public C_Panel(String nom1,String nom2,JTextField t1,JTextField t2){
        super();
        JLabel label1=new JLabel(nom1);
      
        this.add(label1);
        this.add(t1);

        this.add(new JLabel("        "));

        JLabel label2=new JLabel(nom2);
       
        this.add(label2);
        this.add(t2);
    }   
}
