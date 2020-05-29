import javax.swing.*; // bouton
import java.awt.*;//positionnement
import java.awt.event.*;//écouteur (ActionListener)
import javax.swing.border.*; // bordure
public class Fenetre extends JFrame implements KeyListener, Runnable, ActionListener
{
	private Panneau pan;
	private Thread t;
	private boolean bas, haut, droite, gauche;
	private JLabel labelHero1, labelHero2, labelHero3, labelHero4,
					labelAttH1, labelAttH2, labelAttH3, labelAttH4,
					labelDefH1,labelDefH2, labelDefH3, labelDefH4,
					label1, label2, label3, label4;
	private Hero h;
	private JButton att;


	public Fenetre ()
	{
		super();


		this.setTitle("FinalFantasy I");
		this.setSize(new Dimension(800, 600));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		//ajouter un panneau
		pan = new Panneau();

		this.setContentPane(pan);

		pan.setLayout(null); //enlever positionnement auto du panneau
		pan.setBackground(Color.BLACK);

		//ajouter une zone de texte
		labelHero1 = new JLabel ("Hero 1: ");
		labelHero1.setBounds(500, 440, 150, 20); //pour positionner en x, y, largeur, hauteur
		labelHero1.setForeground(Color.white);
		pan.add(labelHero1);

		labelHero2 = new JLabel ("Hero 2: ");
		labelHero2.setBounds(500, 470, 150, 20); //pour positionner en x, y, largeur, hauteur
		labelHero2.setForeground(Color.white);
		pan.add(labelHero2);

		labelHero3 = new JLabel ("Hero 3: ");
		labelHero3.setBounds(500, 500, 150, 20); //pour positionner en x, y, largeur, hauteur
		labelHero3.setForeground(Color.white);
		pan.add(labelHero3);

		labelHero4 = new JLabel ("Hero 4: ");
		labelHero4.setBounds(500, 530, 150, 20); //pour positionner en x, y, largeur, hauteur
		labelHero4.setForeground(Color.white);
		pan.add(labelHero4);



		labelAttH1 = new JLabel ("...");
		labelAttH1.setBounds(590, 440, 150, 20); //pour positionner en x, y, largeur, hauteur
		labelAttH1.setForeground(Color.white);
		pan.add(labelAttH1);

		labelAttH2 = new JLabel ("...");
		labelAttH2.setBounds(590, 470, 150, 20); //pour positionner en x, y, largeur, hauteur
		labelAttH2.setForeground(Color.white);
		pan.add(labelAttH2);

		labelAttH3 = new JLabel ("...");
		labelAttH3.setBounds(590, 500, 150, 20); //pour positionner en x, y, largeur, hauteur
		labelAttH3.setForeground(Color.white);
		pan.add(labelAttH3);

		labelAttH4 = new JLabel ("...");
		labelAttH4.setBounds(590, 530, 150, 20); //pour positionner en x, y, largeur, hauteur
		labelAttH4.setForeground(Color.white);
		pan.add(labelAttH4);



		labelDefH1 = new JLabel ("...");
		labelDefH1.setBounds(660, 440, 150, 20); //pour positionner en x, y, largeur, hauteur
		labelDefH1.setForeground(Color.white);
		pan.add(labelDefH1);

		labelDefH2 = new JLabel ("...");
		labelDefH2.setBounds(660, 470, 150, 20); //pour positionner en x, y, largeur, hauteur
		labelDefH2.setForeground(Color.white);
		pan.add(labelDefH2);

		labelDefH3 = new JLabel ("...");
		labelDefH3.setBounds(660, 500, 150, 20); //pour positionner en x, y, largeur, hauteur
		labelDefH3.setForeground(Color.white);
		pan.add(labelDefH3);

		labelDefH4 = new JLabel ("...");
		labelDefH4.setBounds(660, 530, 150, 20); //pour positionner en x, y, largeur, hauteur
		labelDefH4.setForeground(Color.white);
		pan.add(labelDefH4);



		label1 = new JLabel ("...");
		label1.setBounds(730, 440, 150, 20); //pour positionner en x, y, largeur, hauteur
		label1.setForeground(Color.white);
		pan.add(label1);

		label2 = new JLabel ("...");
		label2.setBounds(730, 470, 150, 20); //pour positionner en x, y, largeur, hauteur
		label2.setForeground(Color.white);
		pan.add(label2);

		label3 = new JLabel ("...");
		label3.setBounds(730, 500, 150, 20); //pour positionner en x, y, largeur, hauteur
		label3.setForeground(Color.white);
		pan.add(label3);

		label4 = new JLabel ("...");
		label4.setBounds(730, 530, 150, 20); //pour positionner en x, y, largeur, hauteur
		label4.setForeground(Color.white);
		pan.add(label4);

		bas = false;
		haut = false;
		droite = false;
		gauche =false;

		this.addKeyListener(this);

		att = new JButton("Attaquer");
		att.setBounds(400,300,80,20);
		att.addActionListener(this);

		t = new Thread(this);
		t.start();
	}

	public void actionPerformed(ActionEvent ae)
	{

	}

	public Hero getH()
	{
		return h;
	}

	public void run()
	{
		while(true)
		{
			try
			{
				if(bas==true)
				{
					int lPerso = pan.getH().getY() / 20;
					int cPerso = pan.getH().getX() / 20;
					if(pan.getH().getY()<1980  )
					{
						if (pan.getH().getX() % 20 == 0)
						{
							if (pan.getH().getY() % 20 == 0)
							{
								if (pan.getMondeEnCours().getTabE(lPerso, cPerso + 1).getTraverse() == true)
								{
									pan.getH().setY(pan.getH().getY()+1);
									if(pan.getH().getY()>300 && pan.getH().getY()<1740)
									{
										pan.getMondeEnCours().setY(pan.getMondeEnCours().getY()-1);
									}
								}
							}
							else
							{
								pan.getH().setY(pan.getH().getY()+1);
								if(pan.getH().getY()>300 && pan.getH().getY()<1740)
								{
									pan.getMondeEnCours().setY(pan.getMondeEnCours().getY()-1);
								}
							}
						}
						else
						{
							if (pan.getMondeEnCours().getTabE(lPerso + 1, cPerso ).getTraverse() == true && pan.getMondeEnCours().getTabE(lPerso + 1, cPerso + 1).getTraverse() == true )
							{
								pan.getH().setY(pan.getH().getY()+1);
								if(pan.getH().getY()>300 && pan.getH().getY()<1740)
								{
									pan.getMondeEnCours().setY(pan.getMondeEnCours().getY()-1);
								}
							}
						}
					}
				}

				if(haut==true)
				{
					int lPerso = pan.getH().getY() / 20;
					int cPerso = pan.getH().getX() / 20;

					if(pan.getH().getY()>0)
					{
						if (pan.getH().getY() % 20 == 0)
						{
							if (pan.getH().getX() % 20 == 0)
							{
								if (pan.getMondeEnCours().getTabE(lPerso - 1, cPerso).getTraverse() == true)
								{
									pan.getH().setY(pan.getH().getY()-1);
									if(pan.getH().getY()>300  && pan.getH().getY()<1740)
									{
										pan.getMondeEnCours().setY(pan.getMondeEnCours().getY()+1);
									}
								}
							}
							else
							{
								if (pan.getMondeEnCours().getTabE(lPerso - 1, cPerso + 1).getTraverse() == true && pan.getMondeEnCours().getTabE(lPerso - 1, cPerso + 1).getTraverse() == true )
								{
									pan.getH().setY(pan.getH().getY()-1);
									if(pan.getH().getY()>300  && pan.getH().getY()<1740)
									{
										pan.getMondeEnCours().setY(pan.getMondeEnCours().getY()+1);
									}
								}
							}
						}
						else
						{
							if (pan.getMondeEnCours().getTabE(lPerso + 1, cPerso ).getTraverse() == true && pan.getMondeEnCours().getTabE(lPerso + 1, cPerso + 1).getTraverse() == true )
							{
								pan.getH().setY(pan.getH().getY()-1);
								if(pan.getH().getY()>300 && pan.getH().getY()<1740)
								{
									pan.getMondeEnCours().setY(pan.getMondeEnCours().getY()+1);
								}
							}
						}
					}
				}
				if(gauche==true)
				{
					if(pan.getH().getX()<2000)
					{
						int lPerso = pan.getH().getY() / 20;
						int cPerso = pan.getH().getX() / 20;

						if (pan.getH().getX() > 0)
						{
							if (pan.getH().getX() % 20 == 0)
							{
								if (pan.getH().getY() % 20 == 0)
								{
									if (pan.getMondeEnCours().getTabE(lPerso, cPerso - 1).getTraverse() == true)
									{
										pan.getH().setX(pan.getH().getX()-1);
										if(pan.getH().getX()>400 && pan.getH().getX()<1620 )
										{
											pan.getMondeEnCours().setX(pan.getMondeEnCours().getX()+1);
										}
									}
								}
								else
								{
									if (pan.getMondeEnCours().getTabE(lPerso, cPerso - 1).getTraverse() == true && pan.getMondeEnCours().getTabE(lPerso  + 1, cPerso - 1).getTraverse() == true )
									{
										pan.getH().setX(pan.getH().getX()-1);
										if(pan.getH().getX()>400 && pan.getH().getX()<1620)
										{
											pan.getMondeEnCours().setX(pan.getMondeEnCours().getX()+1);
										}
									}
								}
							}
							else
							{
								pan.getH().setX(pan.getH().getX()-1);
								if(pan.getH().getX()>400 && pan.getH().getX()<1620)
								{
									pan.getMondeEnCours().setX(pan.getMondeEnCours().getX()+1);
								}
							}
						}
						else
						{
							pan.getH().setX(pan.getH().getX()-1);
							if(pan.getH().getX()>400 && pan.getH().getX()<1620)
							{
								pan.getMondeEnCours().setX(pan.getMondeEnCours().getX()+1);
							}
						}
					}
				}

				if(droite==true)
				{
					int lPerso = pan.getH().getY() / 20;
					int cPerso = pan.getH().getX() / 20;

					if(pan.getH().getX()<2000 )
					{
						if (pan.getH().getX() % 20 == 0)
						{
							if (pan.getH().getY() % 20 == 0)
							{
								if (pan.getMondeEnCours().getTabE(lPerso, cPerso + 1).getTraverse() == true)
								{
									pan.getH().setX(pan.getH().getX()+1);
									if(pan.getH().getX()>400 && pan.getH().getX()<1620)
									{
										pan.getMondeEnCours().setX(pan.getMondeEnCours().getX()-1);
									}
								}
							}
							else
							{
								if (pan.getMondeEnCours().getTabE(lPerso, cPerso + 1).getTraverse() == true && pan.getMondeEnCours().getTabE(lPerso + 1, cPerso + 1).getTraverse() == true )
								{
									pan.getH().setX(pan.getH().getX()+1);
									if(pan.getH().getX()>400 && pan.getH().getX()<1620)
									{
										pan.getMondeEnCours().setX(pan.getMondeEnCours().getX()-1);
									}
								}
							}
						}
						else
						{
							pan.getH().setX(pan.getH().getX()+1);
							if(pan.getH().getX()>400 && pan.getH().getX()<1620)
							{
								pan.getMondeEnCours().setX(pan.getMondeEnCours().getX()-1);
							}
						}
					}
				}
			if(pan.interactions()==true)
			{
				pan.add(att);
			}
			else
			{
				pan.remove(att);
			}
			pan.repaint();
			t.sleep(10);
			}catch(Exception e){}
		}
	}

	public void keyPressed(KeyEvent ke)
	{
		h = new Hero();

		if(ke.getKeyCode()==KeyEvent.VK_DOWN)
		{
			bas = true;
			getH().setType(10);

			//Changement image déplacement
			pan.getH().setImage("images/perso/hero/fighter-front.gif");

		}
		else
		{
			if(ke.getKeyCode()==KeyEvent.VK_UP)
			{
				haut = true;

				//Changement image déplacement
				pan.getH().setImage("images/perso/hero/fighter-back.gif");

			}
			else
			{
				if(ke.getKeyCode()==KeyEvent.VK_LEFT)
				{
					gauche = true;

					//Changement image déplacement
					pan.getH().setImage("images/perso/hero/fighter-left.gif");

				}
				else
				{
					if(ke.getKeyCode()==KeyEvent.VK_RIGHT)
					{
						droite = true;

						//Changement image déplacement
						pan.getH().setImage("images/perso/hero/fighter-right.gif");

					}
					else
					{
						if(ke.getKeyCode()==KeyEvent.VK_I)
						{
							pan.setInventaireActif(!pan.getInventaireActif());

						}
					}
				}
			}
		}
	}

	public void keyReleased(KeyEvent ke)
	{
		if(ke.getKeyCode()==KeyEvent.VK_DOWN)
		{
			bas = false;

		}
		else
		{
			if(ke.getKeyCode()==KeyEvent.VK_UP)
			{
				haut = false;
			}
			else
			{
				if(ke.getKeyCode()==KeyEvent.VK_LEFT)
				{
					gauche = false;
				}
				else
				{
					if(ke.getKeyCode()==KeyEvent.VK_RIGHT)
					{
						droite = false;
					}
				}
			}
		}
	}

	public void keyTyped(KeyEvent ke)
	{

	}
}
