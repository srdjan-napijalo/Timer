package timer;

import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class TimerTask
{

   
    public static void main(String[] args)
    {
       // System.out.println(System.currentTimeMillis());
        JFrame jf = new JFrame();
        JOptionPane jop = new JOptionPane();
        int opcija = jop.showOptionDialog(null, "Choose option", "Option dialog", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[] {"Settings", "Close"}, null);
        jf.add(jop);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         switch(opcija)
         {
          case JOptionPane.YES_OPTION:
                   Settings s = new Settings();
                   s.setLocation(600, 300);
                   s.setVisible(true);
          break;
          case JOptionPane.NO_OPTION:
                   System.exit(0);
 
          break;
        }
         

    }
   
}
