package fonction;

public class Quantite {
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

    public void general_set(char indicator){
        switch (indicator) {
            case 'k':
                king--;
                break;
            case  'q':
                queen--;
                break;
            case 'c':
                cav--;
                 break;
            case 'p':
                pion--;
                break;
            case 'f':
                fou--;
                break;
            case 't':
                tour--;
                break; 
            default:
                break;
        }
    }
    public int general_get(char indicator){
        switch (indicator) {
            case 'k':
                return king;
                
            case  'q':
                return queen;
                
            case 'c':
                return cav;
                
            case 'p':
                return pion;
               
            case 'f':
                return fou;
               
            case 't':
                return tour;
                
            default:
                return -1;
        }   
    }

    public String into_string(){
        String val="";
        val+="k : "+king+";\n";
        val+="q : "+queen+";\n";
        val+="c : "+cav+";\n";
        val+="p :"+pion+";\n";
        val+="f :"+fou+";\n";
        val+="t :"+tour+";\n";
        return val;
    }
}