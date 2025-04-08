package aff;

import java.awt.*;

import javax.swing.*;

import fonction.Empl;

public class Table extends JPanel{
    public int cell_size=85;
    
    int cols = 8;
    int rows = 8;

    Empl empl;
    public Table(){
       this.setLayout(new GridBagLayout());
        this.setPreferredSize(new Dimension(cols*cell_size,rows*cell_size));
        this.empl=new Empl(rows,cols);
    }

    public void paintComponent(Graphics g ){
        Graphics2D g2D = (Graphics2D) g;
        for(int r=0;r<rows;r++){
            for(int c=0;c<cols;c++){
                if((c+r) %2==0){
                    g2D.setColor(new Color(227,198,181));
                }else{
                    g2D.setColor(new Color(2,3,51,180));
                }
                g2D.fillRect(c*cell_size, r*cell_size, cell_size, cell_size);
                if(empl.get_est_pris(r, c)){
                    String img_path="/home/tomefy/Documents/prog/java/chess/img/"+empl.getP(r, c).getCouleur()+"/"+empl.getP(r, c).getPiece()+".png";
                    System.out.println(img_path);
                    Image image = new ImageIcon(img_path).getImage();
                    g.drawImage(image,c*cell_size, r*cell_size, cell_size, cell_size,this);
                }
            }
        }
    }
}
