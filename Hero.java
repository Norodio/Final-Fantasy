public class Hero extends Monstre
{

	private int xp;
	private int niveau;
	private Inventaire inv;
	private int pv;

	// Constructeur
	public Hero ()
	{
		super(40,40,10);
		xp = 0;
		niveau = 1;
		inv = new Inventaire();
		pv = 30;
	}

		//accesseurs 
	public int getXp()
	{
		return xp;
	}

	public int getPv()
	{
		return pv;
	}

	public int getNiveau()
	{
		return niveau;
	}

	public Inventaire getInv()
	{
		return inv;
	}

	//modifieurs

	public void setXp( int xpbis)
	{
		xp = xpbis;
	}

	public void setNiveau( int n)
	{
		niveau = n;
	}

	public void setPV( int v)
	{
		pv = v;
	}
}
