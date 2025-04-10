package aff;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JTextField;

import fonction.*;
import lecture.*;
public class ButtonSave extends JButton{
    String val="";
    Empl empl;

    int cols=8;
    int row=8;

    
    
    //impl --->[constructor]{
    public ButtonSave(Empl empl,JTextField path,int rows,int column){
        super("Save");
        this.row=rows;
        this.cols=column;

        addActionListener(_->{
            val="";
            val+=EmplSaver.init_empl_val(empl,this.row,this.cols); 
            val+=EmplSaver.init_qt_val(empl.getQ_blanc(), "blanc");
            val+="-->\n";
            val+=EmplSaver.init_qt_val(empl.getQ_noire(), "noir");         
            System.out.println("Saved");

            try (BufferedWriter writer = new BufferedWriter(new FileWriter("/home/tomefy/Documents/prog/java/chess/save/"+path.getText()+".txt"))) {
            writer.write(val);
            System.out.println("Le fichier a été sauvegardé avec succès.");
            } catch (IOException e) {
            System.err.println("Erreur lors de la sauvegarde du fichier : " + e.getMessage());
            }
          
        });  
    }
    // }
}
