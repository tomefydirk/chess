package fonction;

public class Piece {
    int king=1;
    int queen=1;
    int tour=2;
    int cav=2;
    int pion=8;
    int fou=2;

    //impl --->#[set_field]{
    public void setQueen(int queen) {
        this.queen = queen;
    }

   
    public void setTour(int tour) {
        this.tour = tour;
    }

    
    public void setCav(int cav) {
        this.cav = cav;
    }

    
    public void setPion(int pion) {
        this.pion = pion;
    }


    public void setFou(int fou) {
        this.fou = fou;
    }


    public void setKing(int king) {
        this.king = king;
    }
    // }
   
    //impl --->--->#[mut_field]{
    public int getKing() {
        return king;
    }
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
    // }

}