package lecture;
import fonction.*;
public class EmplLoader {
    public static String[] decomp_block(String phrase,String regex){
        String[] s=phrase.split(regex,3);
        for(int i=0;i<3;i++){
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
        return vlaue.replaceAll("Position :","").trim();
    }
    public static String[] element_piece(String value){
        String p_as_string=piece_as_string(value);
        return extraireElements(p_as_string);
    } 
    public static int[] element_position(String value){
        String p_as_string=position_as_string(value);
        return extraireNombres(value);
    }
    public static String[] main_separation(){
        
    }
    public static String[] separation_par_break(){

    }
   /*  public static Piece block_into_piece(String input){
        String[] value=input.split(";");
        String value_piece=value[1].replaceAll("Piece","");
        
        return (new Piece('n',"famfj"));
    }*/
    public static void main(String[] args) {
        String [] a=element_piece("Piece :{k,noir}");
        for(int i=0;i<2;i++){
            System.out.println("on a :"+ a[i]);
        }
  }
    
}