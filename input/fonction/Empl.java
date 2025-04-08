package fonction;


public class Empl {
    boolean[][] est_pris;
    char [][] piece;

    public Empl(int rows,int column){
        est_pris=new boolean[rows][];
        piece=new char[rows][];
        for(int i=0;i<rows;i++){
            est_pris[i]=new boolean[column]; 
            piece[i]=new char[column];
            for(int j=0;j<column;j++){
                est_pris[i][j]=false;
                piece[i][j]='_';
            }
        }
    }
    public void set_Empl(int rows,int column,boolean est_pris,char piece){
        this.est_pris[rows][column]=est_pris;
        this.piece[rows][column]=piece;
    }
    public boolean get_Empl(int rows,int column){
      return this.est_pris[rows][column];
    }
}
