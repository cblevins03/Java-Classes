//width = 500
import javax.swing.*;
import java.awt.*;

public class Namebox extends JApplet
{
	public void paint (Graphics g)
	{
		g.setColor(Color.red);
		g.setFont(new Font ("Broadway", Font.BOLD, 36));
		
		g.drawString("Carson Blevins", 60,100);
		
		g.drawRect( 25, 30, 390, 150);
		g.drawRect( 45, 50, 350, 90);
	}
		
}