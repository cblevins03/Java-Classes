import java.awt.BorderLayout;
import javax.swing.*;

public class Dice 
{
	public static int getRoll()
	{
		int j=0,
			k=0,
			r=0,
			r1=0,
			r2=0;
		
		ImageIcon d1 = new ImageIcon("die_01.gif");
		ImageIcon d2 = new ImageIcon("die_02.gif");
		ImageIcon d3 = new ImageIcon("die_03.gif");
		ImageIcon d4 = new ImageIcon("die_04.gif");
		ImageIcon d5 = new ImageIcon("die_05.gif");
		ImageIcon d6 = new ImageIcon("die_06.gif");
	
		JLabel[] dice = new JLabel[6];
	
		ImageIcon[] images = new ImageIcon[6];
	
		images[0] = (d1);
		images[1] = (d2);
		images[2] = (d3);
		images[3] = (d4);
		images[4] = (d5);
		images[5] = (d6);
	
		ImageIcon i1 = new ImageIcon("die_01.gif");
		ImageIcon i2 = new ImageIcon("die_02.gif");
		ImageIcon i3 = new ImageIcon("die_03.gif");
		ImageIcon i4 = new ImageIcon("die_04.gif");
		ImageIcon i5 = new ImageIcon("die_05.gif");
		ImageIcon i6 = new ImageIcon("die_06.gif");
	
		JLabel[] dice2 = new JLabel[6];
	
		ImageIcon[] images2 = new ImageIcon[6];
	
		images2[0] = (i1);
		images2[1] = (i2);
		images2[2] = (i3);
		images2[3] = (i4);
		images2[4] = (i5);
		images2[5] = (i6);
	
		for (int i=0; i < 6; i++)
		{
			JLabel q = new JLabel(images[i]);
			
			dice[i] = q;
		}
		
		for (int i=0; i < 6; i++)
		{
			JLabel z = new JLabel(images2[i]);
			
			dice2[i] = z;
		}

		j = (int)(0 + Math.random() * 5);
			
		k = (int)(0 + Math.random() * 5);

		r1 = j + 1;
	
		r2 = k + 1;
	
		r = r1 + r2;

		JFrame application = new JFrame();
	
		application.add(dice[j], BorderLayout.WEST);
	
		application.add(dice2[k], BorderLayout.EAST);
	
		application.setSize(600, 600);
	
		application.setVisible(true);
				
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	

		return r;
	}

	public static void main(String[] args) 
	{
		String bet,
			   line,
			   answer,
			   single,
			   double1,
			   sin,
			   doub,
			   sibet,
			   dobet,
			   alength;
		
		int p=0,
			p1=0,
			s=0,
			d=0,
			al=0;
		
		alength=JOptionPane.showInputDialog("How many players?");

		al = Integer.parseInt (alength);

		int[] pb = new int[al];

		int[] sb = new int[al];

		int[] db = new int[al];

		int[] sg = new int[al];

		int[] dg = new int[al];

		int[] b = new int[al];

		int[] a = new int[al];

		int[] l = new int[al];
		
		for (int i=0; i < al; i++)
		{
			pb[i]=1000;
		}
		
		for (int i=0; i < al; i++)
		{
			a[i]=1;
		}
		
		for (int i=0; i < al; i++)
		{
			if(a[i]==1 && pb[i]>0)
			{
				bet=JOptionPane.showInputDialog("How much will you bet Player " + (i+1) + "? \nBank: " + pb[i]);

				b[i] = Integer.parseInt (bet);

				single=JOptionPane.showInputDialog("Would you like to place a single side bet Player " + (i+1) + "? \n1 = Yes \n2 = No");

				s = Integer.parseInt (single);

				double1=JOptionPane.showInputDialog("Would you like to place a double side bet Player " + (i+1) + "? \n1 = Yes \n2 = No");

				d = Integer.parseInt (double1);

				if (s==1)
				{
					sin=JOptionPane.showInputDialog("What number will you bet on Player " + (i+1) + "?  \n3 or 11");
		
					sg[i] = Integer.parseInt (sin);
	
					sibet=JOptionPane.showInputDialog("How much will you bet Player " + (i+1) + "? \nBank: " + pb[i]);
		
					sb[i] = Integer.parseInt (sibet);
				}
					
				if (d==1)
				{
					doub=JOptionPane.showInputDialog("What doubles will you bet on Player " + (i+1) + "?  \n2  4  6  8  10  or  12");
		
					dg[i] = Integer.parseInt (doub);
			
					dobet=JOptionPane.showInputDialog("How much will you bet Player " + (i+1) + "? \nBank: " + pb[i]);
		
					db[i] = Integer.parseInt (dobet);
				}
			}
		}

		int r = Dice.getRoll();

		if (r==7 || r==11 || r==12)
		{
			for (int i=0; i < al; i++)
			{
				if (a[i]==1 && pb[i]>0)
				{
					JOptionPane.showMessageDialog(null, "Player " + (i + 1) + " Winner!!! \nRoll: " + r);
		
					pb[i] = b[i] + pb[i];
			
					if (sg[i]==11)
					{
						JOptionPane.showMessageDialog(null, "Player " + (i + 1) + " also win your side bet!!!");
		
						pb[i] = (sb[i] * 30) + pb[i];
					}
	
					if (dg[i]==12)
					{
						JOptionPane.showMessageDialog(null, "Player " + (i + 1) + " also win your side bet!!!");
	
						pb[i] = (db[i] * 15) + pb[i];
					}
						
					answer=JOptionPane.showInputDialog("Would you like to play again? \n1 = Yes \n2 = No");
			
					a[i] = Integer.parseInt (answer);
				}
					
				if(a[i]==2)
				{ 
					break;					
				}
			}
		}
		else
		{
			p1 = r;
	
			while (r!=p)
			{
				p = p1;

				r = Dice.getRoll();
				
				for (int i=0; i < al; i++)
				{
					if (a[i]==1 && pb[i]>0)
					{
						line=JOptionPane.showInputDialog("Player " + (i + 1) + ", which line will you place your bet? \nPass Line: 3 \nDon't Pass Line: 4 \nRoll: " + r);
	
						l[i] = Integer.parseInt (line);
							
						bet=JOptionPane.showInputDialog("Player " + (i + 1) + ", how much will you bet? \nBank: " + pb[i]);
		
						b[i] = Integer.parseInt (bet);
					}
				}
				for (int i=0; i < al; i++)
				{
					if (a[i]==1 && pb[i]>0)
					{
						single=JOptionPane.showInputDialog("Player " + (i + 1) + ", would you like to place a single side bet? \n1 = Yes \n2 = No");
	
						s = Integer.parseInt (single);	
		
						double1=JOptionPane.showInputDialog("Player " + (i + 1) + ", would you like to place a single side bet? \n1 = Yes \n2 = No");
	
						d = Integer.parseInt (double1);

						if (s==1)
						{
							sin=JOptionPane.showInputDialog("Player " + (i + 1) + ", what number will you bet on?  \n3 or 11");
	
							sg[i] = Integer.parseInt (sin);
			
							sibet=JOptionPane.showInputDialog("Player " + (i + 1) + ", ow much will you bet? \nBank: " + pb[i]);

							sb[i] = Integer.parseInt (sibet);
						}
				
						if (d==1)
						{
							doub=JOptionPane.showInputDialog("Player " + (i + 1) + ", what doubles will you bet on?  \n2  4  6  8  10  or  12");
		
							dg[i] = Integer.parseInt (doub);
	
							dobet=JOptionPane.showInputDialog("Player " + (i + 1) + ", how much will you bet? \nBank: " + pb[i]);
			
							db[i] = Integer.parseInt (dobet);
						}
					}
				}
				for (int i=0; i < al; i++)
				{
					if (a[i]==1 && pb[i]>0)
					{
						if (r!=7 || r<11)
						{
							if (l[i]==3)
							{
								JOptionPane.showMessageDialog(null, "Player " + (i + 1) + ", Winner!!!");
	
								pb[i] = b[i] + pb[i];
	
								if (r==sg[i])
								{
									JOptionPane.showMessageDialog(null, "Player " + (i + 1) + ", You also win your side bet!!!");
	
									pb[i] = (sb[i] * 30) + pb[i];
								}
	
								if (r==dg[i])
								{
									JOptionPane.showMessageDialog(null, "Player " + (i + 1) + ", You also win your side bet!!!");

									pb[i] = (db[i] * 15) + pb[i];
								}
					
								answer=JOptionPane.showInputDialog("Player " + (i + 1) + ", would you like to play again? \n1 = Yes \n2 = No");
	
								a[i] = Integer.parseInt (answer);
	
								if(a[i]==2)
								{ 
									break;
								}
							}
							else
							{
								JOptionPane.showMessageDialog(null, "Sorry, not this time Player " + (i + 1) + ".");
										
								pb[i] = pb[i] - b[i];
	
								if (r==sg[i])
								{
									JOptionPane.showMessageDialog(null, "Player " + (i + 1) + ", You win your side bet!!!");

									pb[i] = (sb[i] * 30) + pb[i];
								}

								if (r==dg[i])
								{
									JOptionPane.showMessageDialog(null, "Player " + (i + 1) + ", You win your side bet!!!");
	
									pb[i] = (db[i] * 15) + pb[i];
								}
									
								if (pb[i]>0 || a[i]==2)
								{
									answer=JOptionPane.showInputDialog("Player " + (i + 1) + ", would you like to play again? \n1 = Yes \n2 = No");
					
									a[i] = Integer.parseInt (answer);

									if(a[i]==2)
									{ 
										break;
									}
								}
								else
								{
									JOptionPane.showMessageDialog(null, "Sorry, your bank is empty.  Your game is over.");
					
									a[i] = 2;
								}
							}
						}
					}
					else
					{
						if (l[i]==4)
						{
							if (a[i]==1 && pb[i]>0)
							{
								JOptionPane.showMessageDialog(null, "Player " + (i + 1) + ", Winner!!!");
									
								pb[i] = b[i] + pb[i];

								if (r==sg[i])
								{
									JOptionPane.showMessageDialog(null, "Player " + (i + 1) + ", You also win your side bet!!!");
	
									pb[i] = (sb[i] * 30) + pb[i];
								}

								if (r==dg[i])
								{
									JOptionPane.showMessageDialog(null, "Player " + (i + 1) + ", You also win your side bet!!!");
	
									pb[i] = (db[i] * 15) + pb[i];
								}		

								answer=JOptionPane.showInputDialog("Player " + (i + 1) + ", would you like to play again? \n1 = Yes \n2 = No");

								a[i] = Integer.parseInt (answer);
	
								if(a[i]==2)
								{ 
									break;
								}
							}
							else
							{
								JOptionPane.showMessageDialog(null, "Sorry, not this time Player " + (i + 1) + ".");
								
								pb[i] = pb[i] - b[i];
	
								if (r==sg[i])
								{
									JOptionPane.showMessageDialog(null, "Player " + (i + 1) + ", You win your side bet!!!");
			
									pb[i] = (sb[i] * 30) + pb[i];
								}
	
								if (r==sg[i])
								{
									JOptionPane.showMessageDialog(null, "Player " + (i + 1) + ", You win your side bet!!!");
		
									pb[i] = (db[i] * 15) + pb[i];
								}
		
								if (pb[i]>0)
								{
									answer=JOptionPane.showInputDialog("Player " + (i + 1) + ", would you like to play again? \n1 = Yes \n2 = No");
			
									a[i] = Integer.parseInt (answer);
	
									if(a[i]==2)
									{ 
										break;
									}
								}
								else
								{
									JOptionPane.showMessageDialog(null, "Sorry, your bank is empty.  Your game is over.");
						
									a[i] = 2;
								}
							}
						}
					}
				}
			}
		}		
	}
}