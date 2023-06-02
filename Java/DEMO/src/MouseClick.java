import java.awt.*;  
import java.awt.event.*;  
public class MouseClick extends Frame implements MouseListener{
      Label l;
      TextField t;
      MouseClick(){
          addMouseListener(this);
        
	l=new Label();
    t=new TextField();
        l.setBounds(130,50,100,20);
        t.setBounds(130,150,100,20);
        add(l);
        add(t);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

    }  


    public void mouseClicked(MouseEvent e) {  
        l.setText("Mouse Clicked");  
    }  

    public void mouseEntered(MouseEvent e) {

    	l.setText("Mouse Entered");  
    }  

    public void mouseExited(MouseEvent e) {  
        l.setText("Mouse Exited"); 
        setVisible(true);
    }  

    public void mousePressed(MouseEvent e) {  
        l.setText("Mouse Pressed");
        t.setText(String.valueOf(e.getX())+" "+String.valueOf(e.getY()));
    }  

    public void mouseReleased(MouseEvent e) {  
        l.setText("Mouse Released");  
    }  

public static void main(String[] args) {  
    MouseClick m1= new MouseClick();  
}  

}  
