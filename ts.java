/*I Tahreem Saleem do verify that the submitted code is my own effort and that I have not copied it from any peer or any internet source that has not been acknowledged. 
I also understand that if my submission fails the similarity detection, I would be awarded zero marks not only for this submission but the whole evaluation component
*/
//importing 
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.geom.*;

class myPanel extends JPanel implements MouseListener,MouseMotionListener{													
	public JTextField x = new JTextField(5);
	public JTextField y = new JTextField(5);
	int ex,ey,xpoint,ypoint;
 myPanel()	{
	
	JLabel x0 = new JLabel("x");
	JLabel y0 = new JLabel("y");
	JPanel p1 = new JPanel();
	p1.add(x0);
	p1.add(x);
	p1.add(y0);
	p1.add(y);
	addMouseListener(this);
	addMouseMotionListener(this);
	
	setLayout(new BorderLayout());
	add(p1,"South");
	}

	public void paintComponent(Graphics g) {																									//adding paintComponent
   
		Graphics2D g2d = (Graphics2D)g;
		this.setBackground(Color.cyan);																										//setting background
		//super.paintComponent(g);
		
		g2d.draw(new Line2D.Double(xpoint,ex,getY(),ypoint));
	
	try
		{
			Thread.sleep(5);
		}//ending try
		catch(Exception e){ }
		repaint(100);	
	
	
	}
	public void mouseClicked( MouseEvent me){}																								//overridding mouse listener events
	public void mousePressed( MouseEvent me){
	

			 xpoint=me.getX();
			ypoint=me.getY();
			String xx = Integer.toString(xpoint);
			String yy = Integer.toString(ypoint);
			x.setText(xx);
			y.setText(yy);
			
	}//ending mouse pressed
	
	
	public void mouseReleased( MouseEvent me){}
    public void mouseExited( MouseEvent me){}
	public void mouseEntered( MouseEvent me){}
	public void mouseMoved(MouseEvent me){}                  //overriding mouse motion listener events
	public void mouseDragged(MouseEvent me){
			 ex=me.getX();
			 ey=me.getY();
		
	}
  }//ending panel
  public class ts extends JFrame{																										
	
	public static void main(String[] args) {																								
		ts myframe = new ts() ;
		myPanel mypanel = new myPanel();
		myframe.add(mypanel);
		myframe.setSize(650, 400);
		myframe.setVisible(true);
   }//ending main
}//ending frame