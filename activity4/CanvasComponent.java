
/**
 * GUI
 * 
 * @laurel Woods 
 * @A2
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class CanvasComponent extends JComponent implements MouseListener, MouseMotionListener
{
    int rectX;
    int rectY;
    int rectWidth;
    int rectHeight;
    int mouseFromX;
    int mouseFromY;
    boolean shapeSelected = false;

    public CanvasComponent(int w, int h){
        setSize(w, h);
        rectWidth = w;
        rectHeight = h;
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }

    protected void paintComponent(Graphics g){
        g.setColor(Color.blue);
        g.fillRect(rectX, rectY, rectWidth, rectHeight);
    }
    
    public void mouseClicked(MouseEvent e){
    }
    public void mousePressed(MouseEvent e){
        shapeSelected = false;
        mouseFromX = e.getX();
        mouseFromY = e.getY();
        if(mouseFromX >= rectX && mouseFromX <= rectWidth + rectX && mouseFromY >= rectY && mouseFromY <= rectY + rectHeight){
            shapeSelected = true;
        }
    }
    public void mouseReleased(MouseEvent e){
        
    }
    public void mouseEntered(MouseEvent e){
    }
    public void mouseExited(MouseEvent e){
    }
    public void mouseDragged(MouseEvent e){
        if(shapeSelected){
            int mouseToX = e.getX();
            int mouseToY = e.getY();
            rectX = rectX + (mouseToX - mouseFromX);
            rectY += mouseToY - mouseFromY;
            mouseFromX = e.getX();
            mouseFromY = e.getY();
            repaint();
        }
    }
    public void mouseMoved(MouseEvent e){
    }
}
