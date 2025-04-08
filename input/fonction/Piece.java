package fonction;

public class Piece {
    char piece;
   
   
    String couleur;
    
   

    public Piece(char piece,String couleur){
        this.couleur=couleur;
        this.piece=piece;
    }

    public char getPiece() {
        return piece;
    }
    public String getCouleur() {
        return couleur;
    }

    public void setPiece(char piece) {
        this.piece = piece;
    }
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
    
}
