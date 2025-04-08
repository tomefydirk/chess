package aff;

import java.awt.*;

import javax.swing.*;

public class Table extends JPanel{
    public int cell_size=85;
    
    int cols = 8;
    int rows = 8;

    public Table(){
       
        this.setPreferredSize(new Dimension(cols*cell_size,rows*cell_size));
      
    }

    public void paint(Graphics g ){
        Graphics2D g2D = (Graphics2D) g;
        for(int r=0;r<rows;r++){
            for(int c=0;c<cols;c++){
                if((c+r) %2==0){
                    g2D.setColor(new Color(227,198,181));
                }else{
                    g2D.setColor(new Color(2,3,5,200));
                }
                g2D.fillRect(c*cell_size, r*cell_size, cell_size, cell_size);
            }
        }
    }
}
