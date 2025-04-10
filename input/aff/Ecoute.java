package aff;


import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JOptionPane;

public class Ecoute implements MouseMotionListener,MouseListener{

    public Ecoute(Table t){
        t.addMouseListener(this);
        t.addMouseMotionListener(this);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        Point pos =e.getPoint();
        JOptionPane.showMessageDialog(null, "Souris !!!"+pos.toString());
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
