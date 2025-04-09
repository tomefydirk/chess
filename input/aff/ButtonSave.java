package aff;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JTextField;

import fonction.*;
public class ButtonSave extends JButton{
    String val="";
    Empl empl;

    int cols=8;
    int row=8;
    public void init_empl_val(Empl empl){
        for(int r=0;r<row;r++){
            for(int c=0;c<row;c++){
              
                if(empl.get_est_pris(r, c)){
                    Piece p=empl.getP(r, c);
                    val+="Position :"+"{"+c+" "+r+"};\n";
                    val+="Piece"+"{"+p.getPiece()+","+p.getCouleur()+"} ;\n";
                    val+="break;\n\n";
                }
             
            
            }
        }
        val+="-->\n";
    }
    public void init_qt_val(Quantite q,String nom){
        val+=nom+"\n";
        val+=q.into_string();
    }
    public ButtonSave(Empl empl,JTextField path){
        super("Save");
        addActionListener(_->{
            val="";
            init_empl_val(empl); 
            init_qt_val(empl.getQ_blanc(), "blanc");
            val+="-->\n";
            init_qt_val(empl.getQ_noire(), "noir");         
            System.out.println(val);
            System.out.println("Saved");

            try (BufferedWriter writer = new BufferedWriter(new FileWriter("/home/tomefy/Documents/prog/java/chess/save/"+path.getText()+".txt"))) {
            writer.write(val);
            System.out.println("Le fichier a été sauvegardé avec succès.");
            } catch (IOException e) {
            System.err.println("Erreur lors de la sauvegarde du fichier : " + e.getMessage());
            }
        });  
    }
}
