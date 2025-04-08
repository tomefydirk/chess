package fonction;


public class Empl {
    boolean[][] est_pris;
    public Empl(int rows,int column){
        est_pris=new boolean[rows][];
        for(int i=0;i<rows;i++){
            est_pris[i]=new boolean[column]; 
            for(int j=0;j<column;j++){
                est_pris[i][j]=false;
            }
        }
    }
    public void set_Empl(int rows,int column,boolean value){
        this.est_pris[rows][column]=value;
    }
    public boolean get_Empl(int rows,int column){
      return this.est_pris[rows][column];
    }
}
