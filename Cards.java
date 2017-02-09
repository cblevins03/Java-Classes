import java.awt.BorderLayout;
import javax.swing.*;

public class Cards 
{
	public static void main(String[] args) 
	{
		ImageIcon c1 = new ImageIcon("c1.gif");
		ImageIcon c2 = new ImageIcon("c2.gif");
		ImageIcon c3 = new ImageIcon("c3.gif");
		ImageIcon c4 = new ImageIcon("c4.gif");
		ImageIcon c5 = new ImageIcon("c5.gif");
		ImageIcon c6 = new ImageIcon("c6.gif");
		ImageIcon c7 = new ImageIcon("c7.gif");
		ImageIcon c8 = new ImageIcon("c8.gif");
		ImageIcon c9 = new ImageIcon("c9.gif");
		ImageIcon c10 = new ImageIcon("c10.gif");
		ImageIcon cj = new ImageIcon("cj.gif");
		ImageIcon ck = new ImageIcon("ck.gif");
		ImageIcon cq = new ImageIcon("cq.gif");
		ImageIcon d1 = new ImageIcon("d1.gif");
		ImageIcon d2 = new ImageIcon("d2.gif");
		ImageIcon d3 = new ImageIcon("d3.gif");
		ImageIcon d4 = new ImageIcon("d4.gif");
		ImageIcon d5 = new ImageIcon("d5.gif");
		ImageIcon d6 = new ImageIcon("d6.gif");
		ImageIcon d7 = new ImageIcon("d7.gif");
		ImageIcon d8 = new ImageIcon("d8.gif");
		ImageIcon d9 = new ImageIcon("d9.gif");
		ImageIcon d10 = new ImageIcon("d10.gif");
		ImageIcon dj = new ImageIcon("dj.gif");
		ImageIcon dk = new ImageIcon("dk.gif");
		ImageIcon dq = new ImageIcon("dq.gif");
		ImageIcon h1 = new ImageIcon("h1.gif");
		ImageIcon h2 = new ImageIcon("h2.gif");
		ImageIcon h3 = new ImageIcon("h3.gif");
		ImageIcon h4 = new ImageIcon("h4.gif");
		ImageIcon h5 = new ImageIcon("h5.gif");
		ImageIcon h6 = new ImageIcon("h6.gif");
		ImageIcon h7 = new ImageIcon("h7.gif");
		ImageIcon h8 = new ImageIcon("h8.gif");
		ImageIcon h9 = new ImageIcon("h9.gif");
		ImageIcon h10 = new ImageIcon("h10.gif");
		ImageIcon hj = new ImageIcon("hj.gif");
		ImageIcon hk = new ImageIcon("hk.gif");
		ImageIcon hq = new ImageIcon("hq.gif");
		ImageIcon s1 = new ImageIcon("s1.gif");
		ImageIcon s2 = new ImageIcon("s2.gif");
		ImageIcon s3 = new ImageIcon("s3.gif");
		ImageIcon s4 = new ImageIcon("s4.gif");
		ImageIcon s5 = new ImageIcon("s5.gif");
		ImageIcon s6 = new ImageIcon("s6.gif");
		ImageIcon s7 = new ImageIcon("s7.gif");
		ImageIcon s8 = new ImageIcon("s8.gif");
		ImageIcon s9 = new ImageIcon("s9.gif");
		ImageIcon s10 = new ImageIcon("s10.gif");
		ImageIcon sj = new ImageIcon("sj.gif");
		ImageIcon sk = new ImageIcon("sk.gif");
		ImageIcon sq = new ImageIcon("sq.gif");

		JLabel[] deck = new JLabel[52];

		ImageIcon[] images = new ImageIcon[52];

		images[0] = (c1);
		images[1] = (c2);
		images[2] = (c3);
		images[3] = (c4);
		images[4] = (c5);
		images[5] = (c6);
		images[6] = (c7);
		images[7] = (c8);
		images[8] = (c9);
		images[9] = (c10);
		images[10] = (cj);
		images[11] = (ck);
		images[12] = (cq);
		images[13] = (d1);
		images[14] = (d2);
		images[15] = (d3);
		images[16] = (d4);
		images[17] = (d5);
		images[18] = (d6);
		images[19] = (d7);
		images[20] = (d8);
		images[21] = (d9);
		images[22] = (d10);
		images[23] = (dj);
		images[24] = (dk);
		images[25] = (dq);
		images[26] = (h1);
		images[27] = (h2);
		images[28] = (h3);
		images[29] = (h4);
		images[30] = (h5);
		images[31] = (h6);
		images[32] = (h7);
		images[33] = (h8);
		images[34] = (h9);
		images[35] = (h10);
		images[36] = (hj);
		images[37] = (hk);
		images[38] = (hq);
		images[39] = (s1);
		images[40] = (s2);
		images[41] = (s3);
		images[42] = (s4);
		images[43] = (s5);
		images[44] = (s6);
		images[45] = (s7);
		images[46] = (s8);
		images[47] = (s9);
		images[48] = (s10);
		images[49] = (sj);
		images[50] = (sk);
		images[51] = (sq);

		for (int i=0; i < 52; i++)
		{
			JLabel q = new JLabel(images[i]);
			
			deck[i] = q;
		}
		
		for (int i=0; i < 52; i++)
		{
			JFrame application = new JFrame();
			
			application.add(deck[i], BorderLayout.CENTER);

			application.setSize(300, 300);

			application.setVisible(true);
			
			application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}	
	}
}