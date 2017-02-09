import javax.swing.*;
import java.awt.*;

public class Lines3 extends JApplet
{
	public void paint (Graphics g)
	{
		String line1bx,
			   line1ex,
			   line2bx,
			   line2ex,
			   line3bx,
			   line3ex,
			   line1by,
			   line1ey,
			   line2by,
			   line2ey,
			   line3by,
			   line3ey;
		int l1bx,
			l1ex,
			l2bx,
			l2ex,
			l3bx,
			l3ex,
			l1by,
			l1ey,
			l2by,
			l2ey,
			l3by,
			l3ey;
		
		line1bx=JOptionPane.showInputDialog("Where would you like your first line to begin? X value");
		line1ex=JOptionPane.showInputDialog("Where would you like your first line to end? X value");
		line2bx=JOptionPane.showInputDialog("Where would you like your second line to begin? X value");
		line2ex=JOptionPane.showInputDialog("Where would you like your second line to end? X value");
		line3bx=JOptionPane.showInputDialog("Where would you like your third line to begin? X value");
		line3ex=JOptionPane.showInputDialog("Where would you like your third line to end? X value");
		line1by=JOptionPane.showInputDialog("Where would you like your first line to begin? Y value");
		line1ey=JOptionPane.showInputDialog("Where would you like your first line to end? Y value");
		line2by=JOptionPane.showInputDialog("Where would you like your second line to begin? Y value");
		line2ey=JOptionPane.showInputDialog("Where would you like your second line to end? Y value");
		line3by=JOptionPane.showInputDialog("Where would you like your third line to begin? Y value");
		line3ey=JOptionPane.showInputDialog("Where would you like your third line to end? Y value");


		l1bx = Integer.parseInt (line1bx);
		l1ex = Integer.parseInt (line1ex);
		l2bx = Integer.parseInt (line2bx);
		l2ex = Integer.parseInt (line2ex);
		l3bx = Integer.parseInt (line3bx);
		l3ex = Integer.parseInt (line3ex);
		l1by = Integer.parseInt (line1by);
		l1ey = Integer.parseInt (line1ey);
		l2by = Integer.parseInt (line2by);
		l2ey = Integer.parseInt (line2ey);
		l3by = Integer.parseInt (line3by);
		l3ey = Integer.parseInt (line3ey);
		
		g.drawLine(l1bx, l1by, l1ex, l1ey);
		g.drawLine(l2bx, l2by, l2ex, l2ey);
		g.drawLine(l3bx, l3by, l3ex, l3ey);
	}
		
}