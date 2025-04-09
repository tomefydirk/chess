package lecture;

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
    public static void main(String[] args) {
        String[] a=extraireElements("{a,b}");
        for(int i=0;i<2;i++){
            System.out.println(a[i]);
        }
  }
    
}