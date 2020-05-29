public class Decor

{
	private int type; // grote --> g plaine --> p
	private int x;
	private int y;
	private int nbLignes;
	private int nbColonnes;
	private ElementDecor[][] tabE;
	private Monstre[] tabM;
	private Item[] tabI;
	private Pnj [] tabPnj;

	// Constructeur
	public Decor(int t)
	{
		type = t;
		if(type==1)
		{
			this.x = 0;
			this.y = 0;
			nbColonnes = 100;
			nbLignes = 100;
			tabE = new ElementDecor[nbLignes][nbColonnes];
			for(int i=0;i<nbLignes;i++)
			{
				for(int j=0;j<nbColonnes;j++)
				{
					tabE[i][j] = new ElementDecor(2); // herbe partout
				}
			}
			//décor
			tabE[5][9].setType(1); // Un buisson

			//tabE[1-46][47-48].setType(3); // chemin (sentier prairies)
			for (int l = 1; l < 47; l++)
			{
				for (int c = 47; c < 49; c++)
				{
					tabE[l][c].setType(3);
				}
			}

			//tabE[58-98][46-49].setType(3); // chemin (entier royal)
			for (int l = 58; l < 99; l++)
			{
				for (int c = 46; c < 50; c++)
				{
					tabE[l][c].setType(19);
				}
			}
			//tabE[53][37-2].setType(3); // chemin (sentier marais)
			for (int c = 2; c < 38; c++)
			{
				tabE[53][c].setType(18);
			}

			//tabE[48][53-75].setType(3); // chemin (sentier voisin)
			for (int c = 53; c < 76; c++)
			{
				tabE[48][c].setType(18);
			}

			//tabE[1-48][75].setType(3); // chemin (sentier voisin)
			for (int l = 1; l < 49; l++)
			{
				for (int c = 47; c < 49; c++)
				{
					tabE[l][c].setType(3);
				}
			}

			tabE[5][10].setType(4); // Un rocher
			tabE[40][36].setType(5); // arbre
			tabE[35][37].setType(5); // arbre
			//tabE[20-34][10-37].setType(5); //  arbres
			for (int l = 20; l < 35; l++)
			{
				for (int c = 10; c < 38; c++)
				{
					tabE[l][c].setType(5);
				}
			}

			//tabE[50-75][80-95].setType(5); //  arbres
			for (int l = 50; l < 76; l++)
			{
				for (int c = 80; c < 96; c++)
				{
					tabE[l][c].setType(5);
				}
			}
			//tabE[46-52][40-53].setType(9); // pavés
			for (int l = 46; l < 53; l++)
			{
				for (int c = 40; c < 54; c++)
				{
					tabE[l][c].setType(6);
				}
			}
			//tabE[52-57][38-61].setType(9); // pavés
			for (int l = 52; l < 58; l++)
			{
				for (int c = 38; c < 62; c++)
				{
					tabE[l][c].setType(6);
				}
			}
			//tabE[53-100][1-2].setType(4); // eau
			for (int l = 53; l < 100; l++)
			{
				for (int c = 1; c < 3; c++)
				{
					tabE[l][c].setType(7);
				}
			}
			//tabE[98-100][1-100].setType(4); // eaux
			for (int l = 98; l < 100; l++)
			{
				for (int c = 1; c < 100; c++)
				{
					tabE[l][c].setType(7);
				}
			}
			tabE[50][50].setType(8); // fontaine

			//tabE[53][1-2].setType(9); // pont
				for (int c = 1; c < 3; c++)
				{
					tabE[53][c].setType(9);
				}


			//batiments


			tabE[51][47].setType(39); // maison
			tabE[51][48].setType(40); // maison

			tabE[47][48].setType(39); // maison
			tabE[47][49].setType(40); // maison

			tabE[54][38].setType(39); // maison
			tabE[54][39].setType(40); // maison

			tabE[56][46].setType(39); // maison
			tabE[56][47].setType(40); // maison

			tabE[55][60].setType(39); // maison
			tabE[55][61].setType(40); // maison



			tabE[47][51].setType(35); // armurerie
			tabE[47][52].setType(36); // armurerie
			tabE[48][51].setType(37); // armurerie
			tabE[48][52].setType(38); // armurerie




			tabE[53][51].setType(27); // taverne
			tabE[53][52].setType(28); // taverne
			tabE[54][51].setType(29); // taverne
			tabE[54][52].setType(30); // taverne

			tabE[56][48].setType(12); // statue

			// elle veut pas s'afficher
			tabE[54][57].setType(31); // mairie
			tabE[54][58].setType(32); // mairie
			tabE[55][57].setType(33); // mairie
			tabE[55][58].setType(34); // mairie




			tabE[37][37].setType(23);// grotte
			tabE[37][38].setType(24);// grotte
			tabE[38][37].setType(25);// grotte
			tabE[38][38].setType(26);// grotte



			//PNJ
			tabPnj = new Pnj [9];
			tabPnj[0] = new Pnj (300, 300, 1); //bakerman
			tabPnj[1] = new Pnj (310, 310, 2); //maire, roi ?
			tabPnj[2] = new Pnj (880, 940, 11); // homme haut gauche
			tabPnj[3] = new Pnj (940, 1000, 11); // homme
			tabPnj[4] = new Pnj (880, 1000, 12); //femme
			tabPnj[5] = new Pnj (860, 1000, 13); //homme musclé
			tabPnj[6] = new Pnj (1000, 940, 13); //homme musclé haut droite
			tabPnj[7] = new Pnj (800, 1120, 13); //homme musclé bas gauche
			tabPnj[8] = new Pnj (1200, 1120, 2); //maire roi ?



			// Monstre

			tabM = new Monstre [1];
			tabM[0] = new Monstre (200, 200, 3);

			//Items
			tabI = new Item [7];
			tabI[0] = new Item (250, 250, 2, "clef");
			tabI[1] = new Item (1220, 1120, 1, "sword");
			tabI[2] = new Item (270, 270, 8, "potion");
			tabI[3] = new Item (300, 300, 9, "coin");
			tabI[4] = new Item (400, 300, 11, "coffreFerme");
			tabI[5] = new Item (450, 300, 12, "crane");
			tabI[6] = new Item (500, 300, 22, "torche");
		}

		if(type==2)
		{
			this.x = 0;
			this.y = 0;
			nbColonnes = 100;
			nbLignes = 100;
			tabE = new ElementDecor[nbLignes][nbColonnes];
			for(int i=0;i<nbLignes;i++)
			{
				for(int j=0;j<nbColonnes;j++)
				{
					tabE[i][j] = new ElementDecor(2); // herbe partout
				}
			}
			//decor
			tabE[5][9].setType(1); // Un buisson

			tabE[5][10].setType(4); // Un rocher
			tabE[40][36].setType(5); // arbre
			tabE[35][37].setType(5); // arbre
			/*
			//tabE[20-34][10-37].setType(5); //  arbres
			for (int l = 20; l < 35; l++)
			{
				for (int c = 10; c < 38; c++)
				{
					tabE[l][c].setType(5);
				}
			}
			*/
		}


		if(type==3)
		{
			this.x = 0;
			this.y = 0;
			nbColonnes = 10;
			nbLignes = 10;
			tabE = new ElementDecor[nbLignes][nbColonnes];
			for(int i=0;i<nbLignes;i++)
			{
				for(int j=0;j<nbColonnes;j++)
				{
					tabE[i][j] = new ElementDecor(20); // roche partout
				}
			}
			tabE[5][5].setType(21); //coffre fermé
		}
	}
	/*public DecorPnj(int t)
	{
		this.x = 0;
		this.y = 0;
		nbColonnes = 100;
		nbLignes = 100;
		tabP = new Personnage[nbLignes][nbColonnes];

		//PNJ
			tabP[3][7].setType(2); // pnj qui acceuil le héro

	}*/

	private void CreerPnj(ElementDecor[][] tabE, int x, int y, int t, int numPnj)
	{
		tabPnj = new Pnj [1];
		tabPnj[numPnj] = new Pnj (x, y, t);
	}


		//accesseurs
	public int getType()
	{
		return type;
	}

	public int getX()
	{
		return x;
	}

	public int getY()
	{
		return y;
	}

	public int getNbLignes()
	{
		return nbLignes;
	}

	public int getNbColonnes()
	{
		return nbColonnes;
	}

	public ElementDecor getTabE(int x, int y)
	{
		return tabE[x][y];
	}

	public int getNbPnj()
	{
		return tabPnj.length;
	}

	public Pnj getPnj (int i)
	{
		return tabPnj[i];
	}

	public int getNbMonstres()
	{
		return tabM.length;
	}

	public Monstre getM (int i)
	{
		return tabM[i];
	}

	public int getNbItems()
	{
		return tabI.length;
	}

	public Item getItem (int i)
	{
		return tabI[i];
	}

	//modifieurs

	public void setType(int t)
	{
		type = t;
	}

	public void setX(int xbis)
	{
		x = xbis;
	}

	public void setY(int ybis)
	{
		y = ybis;
	}

	public void setNbLignes(int l)
	{
		nbLignes = l;
	}

	public void setNbColonnes(int c)
	{
		nbColonnes = c;
	}

	public void setTabE (int x, int y, ElementDecor t)
	{
		tabE[x][y] = t;
	}
}
