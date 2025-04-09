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
    public void reset(){
        this.couleur="_";
        this.piece='_';
    }
    public void debug(){
        System.out.println("{");
        System.out.println("Couleur :"+couleur);
        System.out.println("Piece :"+piece);
        System.out.println("}");
    }
    
}
