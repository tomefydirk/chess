package fonction;

import java.awt.Point;
import java.util.Vector;

public class Empl {
    int rows=8;
    int column=8;

    boolean[][] est_pris;
    Piece[][] p;
    Quantite q_noire;
    Quantite q_blanc;

    Point reine;
    String couleur;
    Vector<Piece> manger;
    public Vector<Piece> getManger() {
        return manger;
    }
    //impl --->[get_field]{
    public Quantite getQ_noire() {
        return q_noire;
    }
    public Point getReine() {
        return reine;
    }
    public Quantite getQ_blanc() {
        return q_blanc;
    }
    public boolean get_est_pris(int rows,int column){
        return this.est_pris[rows][column];
    }
      public Piece getP(int rows,int column) {
          return p[rows][column];
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
    // }
    public Empl(int rows,int column){
        this.rows=rows;
        this.column=column;
        
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
        this.manger=new Vector<Piece>();
    }
    //impl --->[mut_field]{
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
    public void retire_q(Piece p){
        switch (p.couleur) {
            case "noir":
                q_noire.general_add(p.piece);
                break;
               
            case "blanc":
                q_blanc.general_add(p.piece);
                break;
            default:
                break;
        }
    }
    public void set_Empl(int rows,int column,boolean est_pris,Piece p){
        if(reine!=null){
            if(Piece.dans_le_champ(reine, new Point(column,rows)) && !p.couleur.equalsIgnoreCase(couleur)){
                delete_Empl(reine.y, reine.x,new Piece('q', this.couleur) );
                this.manger.add(p);
                this.set_q(p);
                reine=new Point(column,rows);
                delete_Empl(rows, column, p);
                System.out.println(" "+reine.y+" "+reine.x);
               
                set_Empl(rows, column, true,new Piece('q', this.couleur) );
                return;  
            }
        }
        if(reine==null && p.piece=='q'){
          reine=new Point(column,rows);  
          this.couleur=p.couleur;
          
        }       
        this.est_pris[rows][column]=est_pris;
        this.p[rows][column]=p;
        this.set_q(p);
      
    }
    public boolean dans_le_champ_reine(Point p){
        if(this.reine==null){
            return false;
        }
        if(Piece.dans_le_champ(reine,p)){
            return true;
        }else{
            return false;
        }
    }
    public void delete_Empl(int rows,int column,Piece p){
        this.est_pris[rows][column]=false;
        this.p[rows][column]=new Piece('_', "_");
        this.retire_q(p);
    }
    //impl --->[reset_field]{
        public void reset(){
            for(int i=0;i<rows;i++){
                for(int j=0;j<column;j++){
                    est_pris[i][j]=false;
                    p[i][j].reset();
                }
            }
            q_blanc.reset();
            q_noire.reset();
            reine=null;
            manger=new Vector<Piece>();
        }  
    //}
  
    public void set_q(int rows,int column,Piece value){
        this.p[rows][column]=value;
    }
    public void set_est_pris(int rows,int column,boolean value){
        this.est_pris[rows][column]=value;
    }
    // }

   
}
