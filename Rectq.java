import javax.swing.*;
import java.awt.*;

public class Rectq extends JPanel
{
	public void paintComponent (Graphics g)
	{
		super.paintComponent(g);
		
		for (int i=1; i<=10; i++)
		{
			g.drawRect(10+(i*10), 10+(i*10), 50+(i*10), 50+(i*10));
		}
	}

	public static void main(String[] args)
	{
		Rectq panel = new Rectq();
		JFrame application = new JFrame();

		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(300,300);
		application.setVisible(true);
	}	
}