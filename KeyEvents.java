import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="KeyEvents" width=400 height=400></applet>*/
public class KeyEvents extends Applet implements KeyListener{
    String str = "";
    public void init(){
        addKeyListener(this);
        requestFocus();
    }
    public void keyTyped(KeyEvent e){
        str+=e.getKeyChar();
        repaint();
    }
    public void keyPressed(KeyEvent e){
        showStatus("Key Pressed");
    }
    public void keyReleased(KeyEvent e){
        showStatus("Key Released");
    }
    public void paint(Graphics g){
        g.drawString(str,15,15);
    }
}