package KdTree;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Rect extends JPanel 
{
	JFrame frame;
	Rectangle rec;
	
	public Rect()
	{
		rec = new Rectangle(100, 200, 50, 75);
	}
	
	public void drawRect()
	{
		frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(600, 600);;
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(this);
		
	}
	public void paintComponentCoordinates(Graphics g) 
	{
		super.paintComponent(g);
		
	}
	public void paintComponent (Graphics g)
	{
		super.paintComponent(g);
		
		/*Any time you want to change the color*/
		g.setColor(Color.blue);
		
		/*the following draws a rectangle at top 
		left corner 50, 50 width and a height of 400, 400*/
		g.drawRect(50,  50, 400, 400);
		
		
		/*The following is a circle with a radius of 10, 10 and coordinate 150, 150
		belongs to a rectangle top left coordinate of width 10 and height 10 encompassing the circle
		g.drawOval does not fill the circle*/
		
		/*Title*/
		g.setColor(Color.black);
		g.drawString("KDTree Partitions Visualization",160,500);
		
		
		/*coordinate 1: (50,80)*/
		g.setColor(Color.red);
		g.drawLine(242, 50, 242, 450); // vertical line passing through (50,80)
		g.setColor(Color.green);
		g.setColor(Color.black);
		g.fillOval(237, 105, 10,10);
		g.setColor(Color.red);
		g.drawString("(50,80)",245,105);
		
		/*coordinate 2: (25, 45)*/
		g.setColor(Color.red);
		//g.drawLine(140, 50, 140, 450); // vertical line passing through (25,45)
		g.setColor(Color.green);
		g.drawLine(50, 280, 450, 280); // horizontal line
		g.setColor(Color.black);
		g.fillOval(135, 275, 10,10);
		g.setColor(Color.red);
		g.drawString("(25,45)",147,275);
		
		/*coordinate 3: (70, 75)*/
		g.setColor(Color.red);
		//g.drawLine(315, 50, 315, 450); 
		g.setColor(Color.green);
		g.drawLine(242, 140, 450, 140); // horizontal line
		g.setColor(Color.black);
		g.fillOval(310, 135, 10,10);
		g.setColor(Color.red);
		g.drawString("(70,75)",320,130);

		/*coordinate 4: (55, 10)*/
		g.setColor(Color.red);
		g.drawLine(267, 280, 267, 450); // vertical line passing through (55,10)
		g.setColor(Color.green);
		g.drawLine(242, 280, 450, 280); 
		g.setColor(Color.black);
		g.fillOval(262, 400, 10,10);
		g.setColor(Color.red);
		g.drawString("(55,10)",270,400);
		
		/*coordinate 5: (60, 85)*/
		g.setColor(Color.red);
		g.drawLine(291, 50, 291, 140); // vertical line passing through (60,85)
		g.setColor(Color.green);
		g.drawLine(242, 280, 450, 280); 
		g.setColor(Color.black);
		g.fillOval(286, 90, 10,10);
		g.setColor(Color.red);
		g.drawString("(60,85)",295,90);

		
		/*labeling 100, 50, and 0 on the y-axis*/
		g.setColor(Color.black);
		g.setFont(new Font("Sanserif", Font.BOLD,18));
		g.drawString("100",10,60);
		g.drawString("50",22,250);
		g.drawString("0",32,450);
		
		/*labeling 100, 50, and 0 on the x-axis*/
		g.drawString("50",230,470);
		g.drawString("100",425,470);	
		
	}
	
}






