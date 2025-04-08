package fonction;

public class Piece {
    public int getKing() {
        return king;
    }
    int king=1;
    int queen=1;
    int tour=2;
    int cav=2;
    int pion=8;
    int fou=2;
    public int getQueen() {
        return queen;
    }
   
    public int getCav() {
        return cav;
    }
   
    public int getPion() {
        return pion;
    }
    
    public int getFou() {
        return fou;
    }

    public int getTour() {
        return tour;
    }

}