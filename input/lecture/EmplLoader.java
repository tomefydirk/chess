package lecture;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import fonction.*;
public class EmplLoader {
    int cols=8;
    int rows=8;
    public static String[] decomp_block(String phrase,String regex){
        String[] s=phrase.split(regex);
        for(int i=0;i<s.length;i++){
            s[i]=s[i].trim();
            s[i]=s[i].replaceAll("\n", "");
        }
        return s;
    }
    public static String enlever(String phrase,String regex){
        return phrase.replaceAll(regex,"");
    }
    public static String[] extraireElements(String input) {
        input = input.substring(1, input.length() - 1); 
        System.out.println(input);
        String[] parts = input.split(",", 2);
        for(int i=0;i<2;i++){
            parts[i]=parts[i].trim();
        } 
        return parts; 
    }
    public static int[] extraireNombres(String input){
        String[] p=extraireElements(input);
        int [] retour=new int[2];
        for(int i=0;i<2;i++){
            retour[i]=Integer.parseInt(p[i]);
        }
        return retour;
    }
    public static String piece_as_string(String value){
        return value.replaceAll("Piece :","").trim();
    }
    public static String position_as_string(String value){
        return value.replaceAll("Position :","").trim();
    }
    public static String[] element_piece(String value){
        String p_as_string=piece_as_string(value);
        return extraireElements(p_as_string);
    } 
    public static int[] element_position(String value){
        String p_as_string=position_as_string(value);
        return extraireNombres(p_as_string);
    }
    public static String[] main_separator(String input){
       String[] block=decomp_block(input.trim(),"-->");
       return block;
    }
    public static String[] separation_par_break(String input){
       String[] block=decomp_block(input.trim(),"break;");
       for(int i=0;i<block.length;i++){
        block[i]=block[i].trim();
       }
       return block;
    }
     public static Piece block_into_piece(String input){
        String[] value=input.split(";");

        String[] value_piece=element_piece(value[1]);

        return (new Piece(value_piece[0].charAt(0),value_piece[1]));
    }
    public static int[] coordonne_into_piece(String input){
        String[] value=input.split(";");

        int[] value_piece=element_position(value[0]);

        return value_piece;
    }
    public static void  general_load(Empl empl,String input,int rows,int cols){
        empl.reset();
        String[] a=main_separator(input);
        String[] b=separation_par_break(a[0]);
        for(int i=0;i<b.length;i++){
            int[] p =coordonne_into_piece(b[i]);
            Piece piece=block_into_piece(b[i]);
            empl.set_Empl(p[1],p[0], true, piece);
        }
        
    }
    public static String path_saved(String a){
        String contenu="";
        try {
             contenu = Files.readString(Path.of("/home/tomefy/Documents/prog/java/chess/save/"+a+".txt"));
            System.out.println(contenu);
            return contenu;
        } catch (IOException e) {
            e.printStackTrace();
        }
      
        return "/home/tomefy/Documents/prog/java/chess/save/default_save.txt";
    }
    public static void main(String[] args) {
        String [] a=separation_par_break("jamfja break; cazemfje break; ");
        for(int i=0;i<a.length;i++){
            System.out.println("on a :"+ a[i]);
        }
        Piece p=block_into_piece("Position :{0,0};\n" + //
                                "Piece :{k,noir} ;");
        p.debug();

        Empl b=new Empl(8, 8);
                try {
            String contenu = Files.readString(Path.of("/home/tomefy/Documents/prog/java/chess/save/default_save.txt"));
            System.out.println(contenu);
            general_load(b, contenu, 8, 8);
        } catch (IOException e) {
            e.printStackTrace();
        }
  }
    
}