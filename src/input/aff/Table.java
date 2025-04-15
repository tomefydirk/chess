package aff;

import java.awt.*;
import java.net.URL;

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
    boolean all_selected=false;

    Point selected;
    //impl --->[constructor]{
    public Table(int rows,int cols){
        this.cols=cols;
        this.rows=rows;
        
        this.setLayout(new GridBagLayout());
        this.setPreferredSize(new Dimension(cols*cell_size,rows*cell_size));
        this.empl=new Empl(rows,cols);
        
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
    public void color_all_selected(Graphics2D g2D,int r,int c){
        if(empl.get_est_pris(r, c) && all_selected){
            if((c+r) %2==0){
                g2D.setColor(new Color(0,245,0,100));
            }else{
                g2D.setColor(new Color(0,127,16,255));
            }
                

        }
    }
    public void color_case(Graphics2D g2D,int r,int c){
        if((c+r) %2==0){
            g2D.setColor(new Color(227,198,181));
        }else{
            g2D.setColor(new Color(2,3,51,180));
        }
    }
    public void color_selected_point(Graphics2D g2D,int r,int c){
        if(selected!=null){
            if(selected.x==c && selected.y==r){
                g2D.setColor(new Color(245,0,0,100));
            }
           
        }
    }
    public void arranger_territoire_reine(Graphics2D g2D,int r,int c){
        if(empl.getReine()!=null){
            if(empl.dans_le_champ_reine(new Point(c,r))){
                if((c+r) %2==0){
                    g2D.setColor(new Color(245,0,0,100));
                }else{
                    g2D.setColor(new Color(0,245,0,100));
                }
             
            }
        }
    }
    public void paintComponent(Graphics g ){
        Graphics2D g2D = (Graphics2D) g;
        super.paintComponent(g);
        for(int r=0;r<rows;r++){
            for(int c=0;c<cols;c++){
             
                color_case(g2D, r, c);
                color_selected_point(g2D, r, c);
                color_all_selected(g2D, r, c);
                arranger_territoire_reine(g2D, r, c);
                g2D.fillRect(c*cell_size+padding_x, r*cell_size+padding_y, cell_size, cell_size);
                if(empl.get_est_pris(r, c)){
                    String img_current_path="../img/"+empl.getP(r, c).getCouleur()+"/"+empl.getP(r, c).getPiece()+".png";
                    URL img_path=getClass().getResource(img_current_path);
                    Image image = new ImageIcon(img_path).getImage();
                    g.drawImage(image,c*cell_size+padding_x, r*cell_size+padding_y, cell_size, cell_size,null);
                }
            }
        }
        for(int i=0;i<empl.getManger().size();i++){
            String img_current_path="../img/"+empl.getManger().elementAt(i).getCouleur()+"/"+empl.getManger().elementAt(i).getPiece()+".png";
            URL img_path=getClass().getResource(img_current_path);
            Image image = new ImageIcon(img_path).getImage();
            g.drawImage(image,rows*cell_size+padding_x, i*cell_size/2+padding_y, cell_size/2, cell_size/2,null);
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
        public Empl getEmpl() {
            return empl;
        }
        public boolean isAll_selected() {
            return all_selected;
        }
        public Point getSelected() {
            return selected;
        }
    // }
     public void rajouter_case(String cheminImage) {
        ImageIcon originalIcon = new ImageIcon(cheminImage);
        Image imageRedimensionnee = originalIcon.getImage().getScaledInstance(85, 85, Image.SCALE_SMOOTH);
        ImageIcon iconRedimensionne = new ImageIcon(imageRedimensionnee);

        JLabel label = new JLabel(iconRedimensionne);
        label.setAlignmentX(Component.CENTER_ALIGNMENT);

        this.add(label);
        this.revalidate();  
        this.repaint();
    }
    //impl --->[mut_field]{
        public void setAll_selected(boolean all_selected) {
            this.all_selected = all_selected;
        }
        public void setSelected(Point selected) {
            this.selected = selected;
        }
    //}
}
