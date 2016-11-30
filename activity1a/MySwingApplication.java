
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
    public static void main(){
        MySwingApplication msa = new MySwingApplication();
        javax.swing.SwingUtilities.invokeLater(msa);
    }
    public void run(){
        jFrame = new JFrame("Christmas!");
    }
}
