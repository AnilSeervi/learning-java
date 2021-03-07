import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="MouseEvents" width=400 height=400></applet>*/
public class MouseEvents extends Applet implements MouseListener, MouseMotionListener{
    String str = "";
    public void init(){
        addMouseListener(this);
        addMouseMotionListener(this);
    }
    public void paint(Graphics g){
        g.drawString(str,20,20);
    }
    public void mouseClicked(MouseEvent me){
        str="Mouse Clicked";
        repaint();
    }
    public void mousePressed(MouseEvent me){
        str="Mouse Pressed";
        repaint();
    }
    public void mouseReleased(MouseEvent me){
        str="Mouse Released";
        repaint();
    }
    public void mouseMoved(MouseEvent me){
        str="Mouse Moved";
        repaint();
    }
    public void mouseDragged(MouseEvent me){
        str="Mouse Dragged";
        repaint();
    }
    public void mouseDropped(MouseEvent me){
        str="Mouse Dropped";
        repaint();
    }
    public void mouseEntered(MouseEvent me){
        str="Mouse Entered";
        repaint();
    }
    public void mouseExited(MouseEvent me){
        str="Mouse Exited";
        repaint();
    }
}