package aff;


import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


import javax.swing.JTextField;

public class Ecoute implements MouseMotionListener,MouseListener{
    Table echequier;

    JTextField x_field;
    JTextField y_field;

    public Ecoute(Table t,JTextField x,JTextField y){
        echequier=t;
        t.addMouseListener(this);
        t.addMouseMotionListener(this);
        this.x_field=x;
        this.y_field=y;
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        int x = (int) ((e.getPoint().getX()-echequier.padding_x)/echequier.cell_size);   
        int y= (int) ((e.getPoint().getY()-echequier.padding_y)/echequier.cell_size); 
        Point pos=new Point(x, y);
        echequier.selected=pos;
        echequier.repaint();
        x_field.setText(""+x);
        y_field.setText(""+y);
     //   JOptionPane.showMessageDialog(null, "Souris !!!"+pos.toString());
    }
    public void succes_mesage(){
        
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
