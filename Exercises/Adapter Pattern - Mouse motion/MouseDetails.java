// Fig. 13.20: MouseDetails.java
// Demonstrating mouse clicks and distinguishing between mouse buttons.     
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseDetails extends JFrame {
    private int xPos, yPos;
      
    // set title bar String; register mouse listener; size and show window
    public MouseDetails(){
        super("Mouse clicks and buttons");    

        addMouseListener( new MouseClickHandler() ); 
    
        setSize(350, 150);
        setVisible(true);
    }
    
    // draw String at location where mouse was clicked
    public void paint(Graphics g) {
        // call superclass paint method
        super.paint(g);
        g.drawString("Clicked @ [" + xPos + ", " + yPos + "]", xPos, yPos);
    }
    
    public static void main(String args[]) {
        MouseDetails application = new MouseDetails();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    // inner class to handle mouse events
    private class MouseClickHandler extends MouseAdapter {
        // handle mouse click event and determine which button was pressed
        public void mouseClicked(MouseEvent event){
            xPos = event.getX();
            yPos = event.getY();

            String title = "Clicked " + event.getClickCount() + " time(s)";
        
            if (event.isMetaDown())  // right mouse button   
                title += " with right mouse button";
            else if (event.isAltDown())  // middle mouse button
                title += " with center mouse button";
            else  // left mouse button                       
                title += " with left mouse button";
    
            setTitle(title);  // set title bar of window
            repaint();
        } // end method mouseClicked
    } // end private inner class MouseClickHandler
} // end class MouseDetails







   