package fonction;
import java.awt.Point;
public class Piece {
    char piece;
   
   
    String couleur;
    
   
    //impl --->[constructor]{
    public Piece(char piece,String couleur){
        this.couleur=couleur;
        this.piece=piece;
    }
    // }

    //impl --->[get_piece]{
    public char getPiece() {
        return piece;
    }
    public String getCouleur() {
        return couleur;
    }
    // }

    //impl --->[mut_field]{
    public void setPiece(char piece) {
        this.piece = piece;
    }
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
    //impl --->[reset_field]{
    public void reset(){
        this.couleur="_";
        this.piece='_';
    }
    public static boolean dans_le_champ(Point reine,Point autre_piece){
        if (reine.y == autre_piece.y) {
            return true;
        }

        if (reine.x == autre_piece.x) {
            return true;
        }

        if (Math.abs(reine.x - autre_piece.x) == Math.abs(reine.y - autre_piece.y)) {
            return true;
        }

        return false;
    }
    // }
    
    // }

    //impl --->[debug]{
    public void debug(){
        System.out.println("{");
        System.out.println("Couleur :"+couleur);
        System.out.println("Piece :"+piece);
        System.out.println("}");
    }
    // }
    
}
