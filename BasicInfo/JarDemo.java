import java.awt.*;
import java.awt.event.*;
public class JarDemo{
 public static void main(String [] args){
 Frame f = new Frame();
 f.addWindowListener(new WindowAdapter() {
 public void windowClosing(WindowEvent e){
 for(int i = 0; i<10 ;i++)
 System.out.println("Hello , I am Closing the window");
 System.exit(0);
 }
 }
 );
 f.add(new Label("I can create Executable Jar File!!!"));
 f.setSize(500,500);
 f.setVisible(true);
 }
}
