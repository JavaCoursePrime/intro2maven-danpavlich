package intro;

import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;
import lombok.ToString;


public class HelloJava {

	public static void main( String[] args )
	{ 
		JFrame frame = new JFrame( "HelloJava2" );
		frame.add( new HelloComponent("Hello, Java!") );
		frame.setDefaultCloseOperation(
				JFrame.EXIT_ON_CLOSE );
		frame.setSize( 500, 400 );
		frame.setVisible( true ); 
	}
}

@ToString
class HelloComponent extends JComponent implements MouseMotionListener
{
	@ToString.Exclude
	String theMessage;

	int messageX = 125, messageY = 95; 

	public HelloComponent( String message ) { 
		//theMessage = message;
		theMessage=this.toString(); 
		addMouseMotionListener(this);
	}

	public void paintComponent( Graphics g ) {
		//g.drawString( theMessage, messageX, messageY);	
		g.drawString(this.toString(), messageX, messageY);
	}


	public void mouseDragged(MouseEvent e) {
		messageX = e.getX();
		messageY = e.getY();
		repaint();
	}
	public void mouseMoved(MouseEvent e) { }
}




/*
   public class HelloJava 
   {
   public static void main( String[] args )
   {
   System.out.println( "Hello World!" );
   }
   }
   */
