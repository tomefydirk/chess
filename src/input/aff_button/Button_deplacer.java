package aff_button;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Button_deplacer extends JButton{
        JPanel make_panel_text(){
            JPanel main=new JPanel();
            JLabel label_x=new JLabel("x");
            JTextField text_field_x =new JTextField("x",10);
            JLabel espace=new JLabel("      ");
            JLabel label_y=new JLabel("y");
            JTextField text_field_y =new JTextField("y",10);
            main.add(label_x);
            main.add(text_field_x);
            main.add(espace);
            main.add(label_y);
            main.add(text_field_y);
            return main;
        }
        JPanel make_bouton_approuver(){
            JPanel main=new JPanel();
            JButton valider=new JButton("Valider");
            main.add(valider);
            return main;
        }
        JPanel make_formulaire(){
            JPanel main=new JPanel();
            main.setLayout(new GridLayout(2,1));
            main.add(make_panel_text());
            main.add(make_bouton_approuver());
            return main;
        }
        JPanel make_img(){
            JPanel main=new JPanel();
            ImageIcon icon = new ImageIcon(getClass().getResource("/img/util/move.png"));
            main.add(new JLabel(icon));
            return main;
        }
        void make_second_output(){
            JPanel main_panel=new JPanel();
            main_panel.add(make_formulaire());
            main_panel.add(make_img());
            main_panel.setLayout(new GridLayout(1,2));
            
           JOptionPane.showMessageDialog(null, main_panel, "Tapez les nouveaux coordonées", JOptionPane.PLAIN_MESSAGE);
        }
        public Button_deplacer(){
           super("Déplacer");
           addActionListener(_->{
                make_second_output();
           });
        }
}
