package fonction;

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
