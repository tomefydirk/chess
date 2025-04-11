package aff_button;


import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import fonction.Empl;
import aff.*;
public class ButtonReset extends JButton{
        JPanel make_panel_save(Empl e,Table t,int row,int col){
            JPanel p=new JPanel();
            JTextField text_field=new JTextField("default_save",10);
            p.add(text_field);
            p.add(new ButtonSave(e, text_field, row, col));
            return p;
        }
        void make_warning(Empl e,Table t,int row,int col){
         
       
        JPanel button = new JPanel();
        JButton ignore= new JButton("Ignorer");
        ignore.addActionListener(_->{
            e.reset();
            t.repaint();
        }
            
        );
        button.add(ignore);
        button.add(make_panel_save(e, t, row, col));
        JPanel textLabel = new JPanel();
        textLabel.add(new JLabel("N'oubliez pas de sauvegarder"));

        
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.LEFT));
    
        panel.add(textLabel);
        panel.add(button);

        
        JOptionPane.showMessageDialog(null, panel, "Attention !", JOptionPane.WARNING_MESSAGE);
        }
        //impl --->[constructor]{
        public ButtonReset(Empl e,Table t,int row,int col){
            super("Reset ☠️");
            addActionListener(_->{
                make_warning(e, t, row, col);
               
            });
        }
        // }
}
