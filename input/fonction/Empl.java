package fonction;


public class Empl {
    boolean[][] est_pris;
    Piece[][] p;

  
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
    }
    public void set_Empl(int rows,int column,boolean est_pris,Piece p){
        this.est_pris[rows][column]=est_pris;
        this.p[rows][column]=p;
    }
    public boolean get_est_pris(int rows,int column){
      return this.est_pris[rows][column];
    }
    public Piece getP(int rows,int column) {
        return p[rows][column];
    }
}
