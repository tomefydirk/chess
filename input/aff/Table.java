package aff;

import java.awt.*;

import javax.swing.*;

import fonction.Empl;

public class Table extends JPanel{
    int cell_size=85;
    
  
    int cols = 8;
    int rows = 8;

    int padding_y=100;
   
    int padding_x=30;
    
    int decal=20;
    Empl empl;
    Ecoute e;
    public Point selected;
    //impl --->[constructor]{
    public Table(){
        
       this.setLayout(new GridBagLayout());
        this.setPreferredSize(new Dimension(cols*cell_size,rows*cell_size));
        this.empl=new Empl(rows,cols);
        e=new Ecoute(this);
    }
    public Table(int rows,int cols){
        this.cols=cols;
        this.rows=rows;
        
        this.setLayout(new GridBagLayout());
        this.setPreferredSize(new Dimension(cols*cell_size,rows*cell_size));
        this.empl=new Empl(rows,cols);
        e=new Ecoute(this);
    }
    // }
   
    //impl --->[Display]{
    public void afficher_repere(Graphics2D g){
        
    for (int c = 0; c < cols; c++) {
    g.setColor(Color.black);
    g.drawString(Integer.toString(c), 
        padding_x + c * cell_size + cell_size / 2 - 5,
        padding_y - 10); 
    }


    for (int r = 0; r < rows; r++) {
    g.setColor(Color.black);
    g.drawString(Integer.toString(r), 
        padding_x - 20, 
        padding_y + r * cell_size + cell_size / 2 + 5); 
    }

    }
    public void paintComponent(Graphics g ){
        Graphics2D g2D = (Graphics2D) g;
        super.paintComponent(g);
        for(int r=0;r<rows;r++){
            for(int c=0;c<cols;c++){
             
                if((c+r) %2==0){
                    g2D.setColor(new Color(227,198,181));
                }else{
                    g2D.setColor(new Color(2,3,51,180));
                }
                if(selected!=null){
                    if(selected.x==c && selected.y==r){
                        g2D.setColor(new Color(245,0,0,100));
                    }
                   
                }
                g2D.fillRect(c*cell_size+padding_x, r*cell_size+padding_y, cell_size, cell_size);
                if(empl.get_est_pris(r, c)){
                    String img_path="/home/tomefy/Documents/prog/java/chess/img/"+empl.getP(r, c).getCouleur()+"/"+empl.getP(r, c).getPiece()+".png";

                    Image image = new ImageIcon(img_path).getImage();
                    g.drawImage(image,c*cell_size+padding_x, r*cell_size+padding_y, cell_size, cell_size,null);
                }
            }
        }
        afficher_repere(g2D);
    }
    // }
    //impl --->[get_field]{
        public int getCell_size() {
            return cell_size;
        }
        public int getPadding_x() {
            return padding_x;
        }
        public int getPadding_y() {
            return padding_y;
        }
    // }
}
