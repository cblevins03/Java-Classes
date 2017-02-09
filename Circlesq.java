import javax.swing.*;
import java.awt.*;

public class Circlesq extends JPanel
{
	public void paintComponent (Graphics g)
	{
		super.paintComponent(g);
		
		for (int i=1; i<=10; i++)
		{
			g.drawOval(10, 10, (i*10), (i*10));
		}
	}

	public static void main(String[] args)
	{
		Circlesq panel = new Circlesq();
		JFrame application = new JFrame();

		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(200,200);
		application.setVisible(true);
	}	
}