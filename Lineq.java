import javax.swing.*;
import java.awt.*;

public class Lineq extends JPanel
{
	public void paintComponent (Graphics g)
	{
		super.paintComponent(g);
		
		g.drawLine(1, 1, 250, 10);
		g.drawLine(1, 1, 240, 30);
		g.drawLine(1, 1, 230, 50);
		g.drawLine(1, 1, 220, 70);
		g.drawLine(1, 1, 200, 90);
		g.drawLine(1, 1, 180, 110);
		g.drawLine(1, 1, 170, 130);
		g.drawLine(1, 1, 160, 150);
		g.drawLine(1, 1, 150, 170);
		g.drawLine(1, 1, 140, 190);
		g.drawLine(1, 1, 130, 210);
		g.drawLine(1, 1, 120, 230);
		g.drawLine(1, 1, 110, 250);
		g.drawLine(1, 1, 90, 270);
		g.drawLine(1, 1, 70, 290);
		g.drawLine(1, 1, 50, 310);
		g.drawLine(1, 1, 30, 330);
		g.drawLine(1, 1, 10, 350);
	}

	public static void main(String[] args)
	{
		Lineq panel = new Lineq();
		JFrame application = new JFrame();

		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(500,500);
		application.setVisible(true);
	}	
}