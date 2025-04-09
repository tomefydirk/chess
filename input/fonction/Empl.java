package fonction;


public class Empl {
    boolean[][] est_pris;
    Piece[][] p;
    Quantite q_noire;
    public Quantite getQ_noire() {
        return q_noire;
    }
    Quantite q_blanc;
  
   
    public Quantite getQ_blanc() {
        return q_blanc;
    }
    public Empl(int rows,int column){
        est_pris=new boolean[rows][];
        p=new Piece[rows][];
        for(int i=0;i<rows;i++){
            est_pris[i]=new boolean[column]; 
            p[i]=new Piece[column];
            for(int j=0;j<column;j++){
                est_pris[i][j]=false;
                p[i][j]=new Piece('_', "_");
            }
        }
        q_blanc=new Quantite();
        q_noire=new Quantite();
    }
    public Quantite get_q(String couleur){
        switch (couleur) {
            case "noir":
                return q_noire;
               
            case "blanc":
                return q_blanc;
            default:
                return new Quantite();
        }
    }
    public void set_q(String couleur,char piece_indicator){
        switch (couleur) {
            case "noir":
                q_noire.general_set(piece_indicator);
                break;
               
            case "blanc":
                q_blanc.general_set(piece_indicator);
                break;
            default:
                break;
        }
    }
    public void set_q(Piece p){
        switch (p.couleur) {
            case "noir":
                q_noire.general_set(p.piece);
                break;
               
            case "blanc":
                q_blanc.general_set(p.piece);
                break;
            default:
                break;
        }
    }
    public void set_Empl(int rows,int column,boolean est_pris,Piece p){
        this.est_pris[rows][column]=est_pris;
        this.p[rows][column]=p;
        this.set_q(p);
    }
    public boolean get_est_pris(int rows,int column){
      return this.est_pris[rows][column];
    }
    public Piece getP(int rows,int column) {
        return p[rows][column];
    }

}
