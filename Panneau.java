import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;


public class Panneau extends JPanel
{
	// attributs

	private int affiche;
	private Decor monde[];
	private int mondeActuel;
	private Hero h, hMage;
	private int pnjActif, monstreActif;
	private boolean inventaireActif;



	//constructeur

	public Panneau()
	{
		affiche = 1;
		monde = new Decor[1];
		monde[0] = new Decor(1);

		mondeActuel = 0;

		h = new Hero();
		hMage = new Hero();
		monde[mondeActuel].setX(-h.getX()+400);
		monde[mondeActuel].setY(-h.getY()+300);


	}

	//méthode
	public void setInventaireActif(boolean b)
	{
		this.inventaireActif = b;
	}

	public boolean getInventaireActif()
	{
		return inventaireActif;
	}

	public Hero getH()
	{
		return h;
	}

	public Hero getHMage()
	{
		return hMage;
	}

	public Decor getMondeEnCours()
	{
		return monde[mondeActuel];
	}

	public void init()
	{
		affiche = 1;
	}

	public void stop()
	{
		affiche = 0;
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		//g.drawImage(Toolkit.getDefaultToolkit().getImage("image.png"), x, y, larg, haut, this);

		if (affiche == 1)
		{
			for (int l = 0; l < monde[mondeActuel].getNbLignes(); l++)
			{
				for (int c = 0; c < monde[mondeActuel].getNbColonnes(); c++)
				{
					g.drawImage(Toolkit.getDefaultToolkit().getImage(monde[mondeActuel].getTabE(l, c).getImage()), c * 20 + monde[mondeActuel].getX(), l * 20 + monde[mondeActuel].getY(), 20, 20, this);
					//g.setColor(Color.WHITE);
					//g.drawRect(c * 20 + monde[mondeActuel].getX(), l * 20 + monde[mondeActuel].getY(), 20, 20);
				}
			}

			//Affichage Monstre
			for (int i = 0; i < monde[mondeActuel].getNbMonstres(); i++)
			{
				g.drawImage(Toolkit.getDefaultToolkit().getImage(monde[mondeActuel].getM(i).getImage()), monde[mondeActuel].getM(i).getX() + monde[mondeActuel].getX(), monde[mondeActuel].getM(i).getY() + monde[mondeActuel].getY(), 20, 20, this);
			}

			//Affichage Pnj
			for (int i = 0; i < monde[mondeActuel].getNbPnj(); i++)
			{
				g.drawImage(Toolkit.getDefaultToolkit().getImage(monde[mondeActuel].getPnj(i).getImage()), monde[mondeActuel].getPnj(i).getX() + monde[mondeActuel].getX(), monde[mondeActuel].getPnj(i).getY() + monde[mondeActuel].getY(), 20, 20, this);
			}

			//Affichage Items
			for (int i = 0; i < monde[mondeActuel].getNbItems(); i++)
			{
				g.drawImage(Toolkit.getDefaultToolkit().getImage(monde[mondeActuel].getItem(i).getImage()), monde[mondeActuel].getItem(i).getX() + monde[mondeActuel].getX(), monde[mondeActuel].getItem(i).getY() + monde[mondeActuel].getY(), 20, 20, this);
			}

			g.drawImage(Toolkit.getDefaultToolkit().getImage(h.getImage()), h.getX() + monde[mondeActuel].getX(), h.getY() + monde[mondeActuel].getY(), 20, 20, this);

			afficherInventaire(g);
			}


		if (affiche == 2)
		{
			//Mode combat


			g.setColor(Color.WHITE);
			// Monstre
			g.drawImage(Toolkit.getDefaultToolkit().getImage(monde[mondeActuel].getM(monstreActif).getImage()), 100, 100, 60, 60, this);
			g.drawString("Points de vie : "+monde[mondeActuel].getM(monstreActif).getHp(),100,200);
			// Héro
			g.drawImage(Toolkit.getDefaultToolkit().getImage(h.getImage()), 300, 100, 60, 60, this);
			g.drawString("Points de vie : "+h.getPv(),300,200);


		}

		if (affiche == 3)
		{
			for (int l = 0; l < monde[mondeActuel].getNbLignes(); l++)
			{
				for (int c = 0; c < monde[mondeActuel].getNbColonnes(); c++)
				{
					g.drawImage(Toolkit.getDefaultToolkit().getImage(monde[mondeActuel].getTabE(l, c).getImage()), c * 20 + monde[mondeActuel].getX(), l * 20 + monde[mondeActuel].getY(), 20, 20, this);

				}
			}

			//Affichage Monstre
			for (int i = 0; i < monde[mondeActuel].getNbMonstres(); i++)
			{
				g.drawImage(Toolkit.getDefaultToolkit().getImage(monde[mondeActuel].getM(i).getImage()), monde[mondeActuel].getM(i).getX() + monde[mondeActuel].getX(), monde[mondeActuel].getM(i).getY() + monde[mondeActuel].getY(), 20, 20, this);

			}

			//Affichage Pnj
			for (int i = 0; i < monde[mondeActuel].getNbPnj(); i++)
			{ g.drawImage(Toolkit.getDefaultToolkit().getImage(monde[mondeActuel].getPnj(i).getImage()), monde[mondeActuel].getPnj(i).getX() + monde[mondeActuel].getX(), monde[mondeActuel].getPnj(i).getY() + monde[mondeActuel].getY(), 20, 20, this);
			}

			g.drawImage(Toolkit.getDefaultToolkit().getImage(h.getImage()), h.getX() + monde[mondeActuel].getX(), h.getY() + monde[mondeActuel].getY(), 20, 20, this);

			//Affichage Items
			for (int i = 0; i < monde[mondeActuel].getNbItems(); i++)
			{
				g.drawImage(Toolkit.getDefaultToolkit().getImage(monde[mondeActuel].getItem(i).getImage()), monde[mondeActuel].getItem(i).getX() + monde[mondeActuel].getX(), monde[mondeActuel].getItem(i).getY() + monde[mondeActuel].getY(), 20, 20, this);
			}

			g.drawImage(Toolkit.getDefaultToolkit().getImage(h.getImage()), h.getX() + monde[mondeActuel].getX(), h.getY() + monde[mondeActuel].getY(), 20, 20, this);


			//mode dialogue
			g.setColor(Color.BLUE);
			g.fillRect(70,70,400,60);
			g.setColor(Color.WHITE);
			g.drawRect(70,70,400,60);
			g.drawString(monde[mondeActuel].getPnj(pnjActif).getDialogue(),100,100);

			afficherInventaire(g);
		}


		//création rectangle
		g.setColor(Color.blue);
		g.fillRect(490, 440, 289, 115);

		//contour
		g.setColor(Color.white);
		g.drawRect(490,440,289,115);
	}

	public boolean interactions()
	{

		boolean isMonstre = false;
		boolean isPnj = false;
		boolean isItem = false;
		for (int i = 0; i < monde[mondeActuel].getNbMonstres(); i++)
		{
			if ((h.getX() >= monde[mondeActuel].getM(i).getX() - 20) && (h.getX() <= monde[mondeActuel].getM(i).getX() + 20) &&
				(h.getY() >= monde[mondeActuel].getM(i).getY() - 20) && (h.getY() <= monde[mondeActuel].getM(i).getY() + 20))
			{
				isMonstre = true;
				monstreActif = i;
			}

		}

		for (int j = 0; j < monde[mondeActuel].getNbPnj(); j++)
		{
			if ((h.getX() >= monde[mondeActuel].getPnj(j).getX() - 20) && (h.getX() <= monde[mondeActuel].getPnj(j).getX() + 20) &&
				(h.getY() >= monde[mondeActuel].getPnj(j).getY() - 20) && (h.getY() <= monde[mondeActuel].getPnj(j).getY() + 20))
			{
				isPnj = true;
				pnjActif = j;
			}
		}

		for (int j = 0; j < monde[mondeActuel].getNbItems(); j++)
		{
			if ((h.getX() >= monde[mondeActuel].getItem(j).getX() - 20) && (h.getX() <= monde[mondeActuel].getItem(j).getX() + 20) &&
				(h.getY() >= monde[mondeActuel].getItem(j).getY() - 20) && (h.getY() <= monde[mondeActuel].getItem(j).getY() + 20))
			{
				isItem = true;
				if(monde[mondeActuel].getItem(j).getType() == 3)
				{
					if(h.getInv().clefPresente())
					{
						monde[mondeActuel].getItem(j).x(20000);
						monde[mondeActuel].getItem(j).y(20000);
					}
				}
				else
				{
					h.getInv().addItem(monde[mondeActuel].getItem(j));
					monde[mondeActuel].getItem(j).x(20000);
					monde[mondeActuel].getItem(j).y(20000);
				}


			}
		}


		if(isMonstre)
		{
			affiche=2;
		}
		else
		{
			if(isPnj)
			{
				affiche=3;
			}
			else
			{
				if(isItem)
				{
					affiche=4;
				}
				else
				{
					affiche = 1;
				}
			}
		}
		return isMonstre;
	}

	public void afficherInventaire(Graphics g)
	{
		if(inventaireActif)
		{
			ArrayList<Item> inventory = h.getInv().getInv();
			int tailleInv = h.getInv().getSizeInv();

			g.setColor(new Color(64,64,64));
			g.fillRect(500,70,190,210);
			g.setColor(Color.GRAY);
			g.fillRect(508,90,175,183);
			g.setColor(Color.WHITE);
			g.drawRect(500,70,190,210);
			g.drawString("Inventaire", 570, 86);

			for(int i = 0;i<tailleInv;i++)
			{
				switch(tailleInv)
				{
					case 0:
						break;

					case 1:
						g.drawString(inventory.get(0).getName(),510, 150);
						g.drawImage(Toolkit.getDefaultToolkit().getImage(inventory.get(0).getImage()), 520, 100, 30, 30, this);
						break;

					case 2:
						g.drawString(inventory.get(0).getName(),510, 150);
						g.drawImage(Toolkit.getDefaultToolkit().getImage(inventory.get(0).getImage()), 520, 100, 30, 30, this);
						g.drawString(inventory.get(1).getName(),570, 150);
						g.drawImage(Toolkit.getDefaultToolkit().getImage(inventory.get(1).getImage()), 580, 100, 30, 30, this);
						break;

				  case 3:
						g.drawString(inventory.get(0).getName(),510, 150);
						g.drawImage(Toolkit.getDefaultToolkit().getImage(inventory.get(0).getImage()), 520, 100, 30, 30, this);
						g.drawString(inventory.get(1).getName(),570, 150);
						g.drawImage(Toolkit.getDefaultToolkit().getImage(inventory.get(1).getImage()), 580, 100, 30, 30, this);
						g.drawString(inventory.get(2).getName(),630, 150);
						g.drawImage(Toolkit.getDefaultToolkit().getImage(inventory.get(2).getImage()), 640, 100, 30, 30, this);
					  break;

					case 4:
						g.drawString(inventory.get(0).getName(),510, 150);
						g.drawImage(Toolkit.getDefaultToolkit().getImage(inventory.get(0).getImage()), 520, 100, 30, 30, this);
						g.drawString(inventory.get(1).getName(),570, 150);
						g.drawImage(Toolkit.getDefaultToolkit().getImage(inventory.get(1).getImage()), 580, 100, 30, 30, this);
						g.drawString(inventory.get(2).getName(),630, 150);
						g.drawImage(Toolkit.getDefaultToolkit().getImage(inventory.get(2).getImage()), 640, 100, 30, 30, this);
						g.drawString(inventory.get(3).getName(),510, 210);
						g.drawImage(Toolkit.getDefaultToolkit().getImage(inventory.get(3).getImage()), 520, 160, 30, 30, this);
						break;

					case 5:
						g.drawString(inventory.get(0).getName(),510, 150);
						g.drawImage(Toolkit.getDefaultToolkit().getImage(inventory.get(0).getImage()), 520, 100, 30, 30, this);
						g.drawString(inventory.get(1).getName(),570, 150);
						g.drawImage(Toolkit.getDefaultToolkit().getImage(inventory.get(1).getImage()), 580, 100, 30, 30, this);
						g.drawString(inventory.get(2).getName(),630, 150);
						g.drawImage(Toolkit.getDefaultToolkit().getImage(inventory.get(2).getImage()), 640, 100, 30, 30, this);
						g.drawString(inventory.get(3).getName(),510, 210);
						g.drawImage(Toolkit.getDefaultToolkit().getImage(inventory.get(3).getImage()), 520, 160, 30, 30, this);
						g.drawString(inventory.get(4).getName(),570, 210);
						g.drawImage(Toolkit.getDefaultToolkit().getImage(inventory.get(4).getImage()), 580, 160, 30, 30, this);
						break;

					case 6:
						g.drawString(inventory.get(0).getName(),510, 150);
						g.drawImage(Toolkit.getDefaultToolkit().getImage(inventory.get(0).getImage()), 520, 100, 30, 30, this);
						g.drawString(inventory.get(1).getName(),570, 150);
						g.drawImage(Toolkit.getDefaultToolkit().getImage(inventory.get(1).getImage()), 580, 100, 30, 30, this);
						g.drawString(inventory.get(2).getName(),630, 150);
						g.drawImage(Toolkit.getDefaultToolkit().getImage(inventory.get(2).getImage()), 640, 100, 30, 30, this);
						g.drawString(inventory.get(3).getName(),510, 210);
						g.drawImage(Toolkit.getDefaultToolkit().getImage(inventory.get(3).getImage()), 520, 160, 30, 30, this);
						g.drawString(inventory.get(4).getName(),570, 210);
						g.drawImage(Toolkit.getDefaultToolkit().getImage(inventory.get(4).getImage()), 580, 160, 30, 30, this);
						g.drawString(inventory.get(5).getName(),630, 210);
						g.drawImage(Toolkit.getDefaultToolkit().getImage(inventory.get(5).getImage()), 640, 160, 30, 30, this);
						break;

					case 7:
						g.drawString(inventory.get(0).getName(),510, 150);
						g.drawImage(Toolkit.getDefaultToolkit().getImage(inventory.get(0).getImage()), 520, 100, 30, 30, this);
						g.drawString(inventory.get(1).getName(),570, 150);
						g.drawImage(Toolkit.getDefaultToolkit().getImage(inventory.get(1).getImage()), 580, 100, 30, 30, this);
						g.drawString(inventory.get(2).getName(),630, 150);
						g.drawImage(Toolkit.getDefaultToolkit().getImage(inventory.get(2).getImage()), 640, 100, 30, 30, this);
						g.drawString(inventory.get(3).getName(),510, 210);
						g.drawImage(Toolkit.getDefaultToolkit().getImage(inventory.get(3).getImage()), 520, 160, 30, 30, this);
						g.drawString(inventory.get(4).getName(),570, 210);
						g.drawImage(Toolkit.getDefaultToolkit().getImage(inventory.get(4).getImage()), 580, 160, 30, 30, this);
						g.drawString(inventory.get(5).getName(),630, 210);
						g.drawImage(Toolkit.getDefaultToolkit().getImage(inventory.get(5).getImage()), 640, 160, 30, 30, this);
						g.drawString(inventory.get(6).getName(),510, 270);
						g.drawImage(Toolkit.getDefaultToolkit().getImage(inventory.get(6).getImage()), 520, 220, 30, 30, this);
						break;

					case 8:
						g.drawString(inventory.get(0).getName(),510, 150);
						g.drawImage(Toolkit.getDefaultToolkit().getImage(inventory.get(0).getImage()), 520, 100, 30, 30, this);
						g.drawString(inventory.get(1).getName(),570, 150);
						g.drawImage(Toolkit.getDefaultToolkit().getImage(inventory.get(1).getImage()), 580, 100, 30, 30, this);
						g.drawString(inventory.get(2).getName(),630, 150);
						g.drawImage(Toolkit.getDefaultToolkit().getImage(inventory.get(2).getImage()), 640, 100, 30, 30, this);
						g.drawString(inventory.get(3).getName(),510, 210);
						g.drawImage(Toolkit.getDefaultToolkit().getImage(inventory.get(3).getImage()), 520, 160, 30, 30, this);
						g.drawString(inventory.get(4).getName(),570, 210);
						g.drawImage(Toolkit.getDefaultToolkit().getImage(inventory.get(4).getImage()), 580, 160, 30, 30, this);
						g.drawString(inventory.get(5).getName(),630, 210);
						g.drawImage(Toolkit.getDefaultToolkit().getImage(inventory.get(5).getImage()), 640, 160, 30, 30, this);
						g.drawString(inventory.get(6).getName(),510, 270);
						g.drawImage(Toolkit.getDefaultToolkit().getImage(inventory.get(6).getImage()), 520, 220, 30, 30, this);
						g.drawString(inventory.get(7).getName(),570, 270);
						g.drawImage(Toolkit.getDefaultToolkit().getImage(inventory.get(7).getImage()), 580, 220, 30, 30, this);
						break;

					case 9:
						g.drawString(inventory.get(0).getName(),510, 150);
						g.drawImage(Toolkit.getDefaultToolkit().getImage(inventory.get(0).getImage()), 520, 100, 30, 30, this);
						g.drawString(inventory.get(1).getName(),570, 150);
						g.drawImage(Toolkit.getDefaultToolkit().getImage(inventory.get(1).getImage()), 580, 100, 30, 30, this);
						g.drawString(inventory.get(2).getName(),630, 150);
						g.drawImage(Toolkit.getDefaultToolkit().getImage(inventory.get(2).getImage()), 640, 100, 30, 30, this);
						g.drawString(inventory.get(3).getName(),510, 210);
						g.drawImage(Toolkit.getDefaultToolkit().getImage(inventory.get(3).getImage()), 520, 160, 30, 30, this);
						g.drawString(inventory.get(4).getName(),570, 210);
						g.drawImage(Toolkit.getDefaultToolkit().getImage(inventory.get(4).getImage()), 580, 160, 30, 30, this);
						g.drawString(inventory.get(5).getName(),630, 210);
						g.drawImage(Toolkit.getDefaultToolkit().getImage(inventory.get(5).getImage()), 640, 160, 30, 30, this);
						g.drawString(inventory.get(6).getName(),510, 270);
						g.drawImage(Toolkit.getDefaultToolkit().getImage(inventory.get(6).getImage()), 520, 220, 30, 30, this);
						g.drawString(inventory.get(7).getName(),570, 270);
						g.drawImage(Toolkit.getDefaultToolkit().getImage(inventory.get(7).getImage()), 580, 220, 30, 30, this);
						g.drawString(inventory.get(8).getName(),630, 270);
						g.drawImage(Toolkit.getDefaultToolkit().getImage(inventory.get(8).getImage()), 640, 220, 30, 30, this);
						break;

					default:
						g.drawString(inventory.get(0).getName(),510, 150);
						g.drawImage(Toolkit.getDefaultToolkit().getImage(inventory.get(0).getImage()), 520, 100, 30, 30, this);
						g.drawString(inventory.get(1).getName(),570, 150);
						g.drawImage(Toolkit.getDefaultToolkit().getImage(inventory.get(1).getImage()), 580, 100, 30, 30, this);
						g.drawString(inventory.get(2).getName(),630, 150);
						g.drawImage(Toolkit.getDefaultToolkit().getImage(inventory.get(2).getImage()), 640, 100, 30, 30, this);
						g.drawString(inventory.get(3).getName(),510, 210);
						g.drawImage(Toolkit.getDefaultToolkit().getImage(inventory.get(3).getImage()), 520, 160, 30, 30, this);
						g.drawString(inventory.get(4).getName(),570, 210);
						g.drawImage(Toolkit.getDefaultToolkit().getImage(inventory.get(4).getImage()), 580, 160, 30, 30, this);
						g.drawString(inventory.get(5).getName(),630, 210);
						g.drawImage(Toolkit.getDefaultToolkit().getImage(inventory.get(5).getImage()), 640, 160, 30, 30, this);
						g.drawString(inventory.get(6).getName(),510, 270);
						g.drawImage(Toolkit.getDefaultToolkit().getImage(inventory.get(6).getImage()), 520, 220, 30, 30, this);
						g.drawString(inventory.get(7).getName(),570, 270);
						g.drawImage(Toolkit.getDefaultToolkit().getImage(inventory.get(7).getImage()), 580, 220, 30, 30, this);
						g.drawString(inventory.get(8).getName(),630, 270);
						g.drawImage(Toolkit.getDefaultToolkit().getImage(inventory.get(8).getImage()), 640, 220, 30, 30, this);
						break;
				}
			}
		}
	}


	/*public void interactionpnj()
	{
		for (int i = 0; i < monde[mondeActuel].getNbPNJ(); i++)
		{
			if ((h.getX() >= monde[mondeActuel].getM(i).getX() - 20) && (h.getX() <= monde[mondeActuel].getM(i).getX() + 40) &&
				(h.getY() >= monde[mondeActuel].getM(i).getY() - 20) && (h.getY() <= monde[mondeActuel].getM(i).getY() + 40))
			{
				affiche = 2;
			}
			else
			{
				affiche = 1;
			}
		}
	}
	public void interactionobjet()
	{
		for (int i = 0; i < monde[mondeActuel].getNbobjets(); i++)
		{
			if ((h.getX() >= monde[mondeActuel].getM(i).getX() - 20) && (h.getX() <= monde[mondeActuel].getM(i).getX() + 40) &&
				(h.getY() >= monde[mondeActuel].getM(i).getY() - 20) && (h.getY() <= monde[mondeActuel].getM(i).getY() + 40))
			{
				affiche = 2;
			}
			else
			{
				affiche = 1;
			}
		}
	}

}
*/

}
