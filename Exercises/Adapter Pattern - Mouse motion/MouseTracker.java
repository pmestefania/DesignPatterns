import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseTracker extends JFrame implements MouseListener, MouseMotionListener {
    private JLabel statusBar;

    public MouseTracker() {
        super("Demonstrating Mouse Events");

        statusBar = new JLabel();
        getContentPane().add(statusBar, BorderLayout.SOUTH);

        addMouseListener(this);
        addMouseMotionListener(this);

        setSize(275,100);
        setVisible(true);
    }
    
    // MouseListener event handlers
    // handle event when mouse released immediately after press
    public void mouseClicked(MouseEvent event) {
        statusBar.setText( "Clicked at [" + event.getX() + ", " + event.getY() + "]" );
    }
    
    // handle event when mouse pressed
    public void mousePressed(MouseEvent event) {
        statusBar.setText( "Pressed at [" + event.getX() + ", " + event.getY() + "]" );
    }
    
    // handle event when mouse released after dragging
    public void mouseReleased(MouseEvent event) {
        statusBar.setText( "Released at [" + event.getX() + ", " + event.getY() + "]" );
    }
    
    // handle event when mouse enters area
    public void mouseEntered(MouseEvent event) {
        statusBar.setText( "Mouse entered at [" + event.getX() + ", " + event.getY() + "]" );
        getContentPane().setBackground( Color.GREEN );
    }
    
    // handle event when mouse exits area
    public void mouseExited(MouseEvent event) {
        statusBar.setText( "Mouse outside window" );
        getContentPane().setBackground( Color.WHITE );
    }
    
    // MouseMotionListener event handlers
    // handle event when user drags mouse with button pressed
    public void mouseDragged(MouseEvent event) {
        statusBar.setText( "Dragged at [" + event.getX() + ", " + event.getY() + "]" );
    }
    
    // handle event when user moves mouse
    public void mouseMoved(MouseEvent event) {
        statusBar.setText( "Moved at [" + event.getX() + ", " + event.getY() + "]" );
    }
    
    public static void main( String args[] ) { 
        MouseTracker application = new MouseTracker();
        application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    }
}