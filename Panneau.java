import java.awt.*;
import javax.swing.*;


public class Panneau extends JPanel
{
	// attributs

	private int affiche;
	private Decor monde[];
	private int mondeActuel;
	private Hero h, hMage;
	private int pnjActif, monstreActif;



	//constructeur

	public Panneau()
	{
		affiche = 1;
		monde = new Decor[1];
		monde[0] = new Decor(1);

		mondeActuel = 0;

		h = new Hero();
		hMage = new Hero();


	}

	//méthode

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
			{ g.drawImage(Toolkit.getDefaultToolkit().getImage(monde[mondeActuel].getPnj(i).getImage()), monde[mondeActuel].getPnj(i).getX() + monde[mondeActuel].getX(), monde[mondeActuel].getPnj(i).getY() + monde[mondeActuel].getY(), 20, 20, this);
			}

			g.drawImage(Toolkit.getDefaultToolkit().getImage(h.getImage()), h.getX() + monde[mondeActuel].getX(), h.getY() + monde[mondeActuel].getY(), 20, 20, this);

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


			//mode dialogue
			g.setColor(Color.BLUE);
			g.fillRect(70,70,180,60);
			g.setColor(Color.WHITE);
			g.drawRect(70,70,180,60);
			g.drawString(monde[mondeActuel].getPnj(pnjActif).getDialogue(),100,100);
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
				h.getInv().addItem(monde[mondeActuel].getItem(j));
				monde[mondeActuel].getItem(j);
				monde[mondeActuel].getItem(j);

				System.out.println(h.getInv().printInv());
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
