
/**
 * GUI
 * 
 * @Laurel Woods
 * @activity1a
 */
import javax.swing.*;
public class MySwingApplication implements Runnable
{
    JFrame jFrame;
    CanvasComponent canvasComponent;
    public static void main(){
        MySwingApplication msa = new MySwingApplication();
        javax.swing.SwingUtilities.invokeLater(msa);
    }
    public void run(){
        jFrame = new JFrame("Christmas!");
        jFrame.setSize(400, 400);
        canvasComponent = new CanvasComponent(200, 200);
        jFrame.add(canvasComponent);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
