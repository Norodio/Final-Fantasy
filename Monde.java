public class Monde 
{ 
	private int nbLignes;
	private int nbColonnes;
	private Monde[][] leMonde;

	// Constructeur 

	public Monde(int x, int y)
	{
		nbLignes = x;
		nbColonnes = y;
		// allocation mémoire
		leMonde = new Monde[nbLignes][nbColonnes]; 
	}

	//Accesseur

	public int getNbLignes()
	{
		return nbLignes;
	}

	public int getNbColonnes()
	{
		return nbColonnes;
	}

	public Monde getTabMonde(int x, int y)
	{
		return leMonde[x][y];
	}

	//modifieurs
	public void setNbLignes( int l)
	{
		nbLignes = l;
	}

	public void setNbColonnes(int c)
	{
		nbColonnes = c;
	}
}