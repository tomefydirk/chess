package lecture;

import fonction.Empl;
import fonction.Piece;
import fonction.Quantite;

public class EmplSaver {
    public static String init_empl_val(Empl empl,int row,int cols){
        String val="";
        for(int r=0;r<row;r++){
            for(int c=0;c<cols;c++){
              
                if(empl.get_est_pris(r, c)){
                    Piece p=empl.getP(r, c);
                    val+="Position :"+"{"+c+","+r+"};\n";
                    val+="Piece :"+"{"+p.getPiece()+","+p.getCouleur()+"} ;\n";
                    val+="break;\n\n";
                }
             
            
            }
        }
        val+="-->\n";
       
        return val;
    }
    public static String  init_qt_val(Quantite q,String nom){
        String val="";
        val+=nom+"\n";
        val+=q.into_string();
        return val;
    }
}
