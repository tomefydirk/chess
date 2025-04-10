package aff;


import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JOptionPane;

public class Ecoute implements MouseMotionListener,MouseListener{
    Table echequier;
    public Ecoute(Table t){
        echequier=t;
        t.addMouseListener(this);
        t.addMouseMotionListener(this);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        int x = (int) ((e.getPoint().getX()-echequier.padding_x)/echequier.cell_size);   
        int y= (int) ((e.getPoint().getY()-echequier.padding_y)/echequier.cell_size); 
        Point pos=new Point(x, y);
        echequier.selected=pos;
        echequier.repaint();
     //   JOptionPane.showMessageDialog(null, "Souris !!!"+pos.toString());
    }

    @Override
    public void mousePressed(MouseEvent e) {
       
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
      
    }

    @Override
    public void mouseExited(MouseEvent e) {
    
    }

    @Override
    public void mouseDragged(MouseEvent e) {
       
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        
    }

}
