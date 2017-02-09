import javax.swing.*;
import java.awt.*;

public class Linerect extends JApplet
{
	public void paint (Graphics g)
	{
		String an,
			   linebx,
			   lineby,
			   lineex,
			   lineey,
			   rectbx,
			   rectby,
			   rectex,
			   rectey;
		int a,
			lbx,
			lby,
			lex,
			ley,
			rbx,
			rby,
			rex,
			rey;
		
		an=JOptionPane.showInputDialog("Would you like to draw a line or a rectangle?  1 = Line, 2 = Rectangle");
		a = Integer.parseInt (an);

		if (a == 1)
		{
			linebx=JOptionPane.showInputDialog("Where would you like your line to begin? X value");
			lineby=JOptionPane.showInputDialog("Where would you like your line to begin? Y value");
			lineex=JOptionPane.showInputDialog("Where would you like your line to end? X value");
			lineey=JOptionPane.showInputDialog("Where would you like your line to end? Y value");
			lbx = Integer.parseInt (linebx);
			lby = Integer.parseInt (lineby);
			lex = Integer.parseInt (lineex);
			ley = Integer.parseInt (lineey);

			g.drawLine(lbx, lby, lex, ley);
		}
		else 
		{
			rectbx=JOptionPane.showInputDialog("Where would you like your rectangle to begin? X value");
			rectby=JOptionPane.showInputDialog("Where would you like your rectangle to begin? Y value");
			rectex=JOptionPane.showInputDialog("Where would you like your rectangle to end? X value");
			rectey=JOptionPane.showInputDialog("Where would you like your rectangle to end? Y value");

			rbx = Integer.parseInt (rectbx);
			rby = Integer.parseInt (rectby);
			rex = Integer.parseInt (rectex);
			rey = Integer.parseInt (rectey);
		
			g.drawRect(rbx, rby, rex, rey);
	}
		
}