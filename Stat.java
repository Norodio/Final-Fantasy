public class Stat
{
	private int profil;
	private int pv;
	private int att;
	private int def;
	private int pm;

	public Stat(int p)
	{
		profil = p;
		if(profil==1) // Montre 1
		{
			pv = 10;
			att = 2;
			def = 1;
			pm = 0;
		}
		else
		{
			if(profil==2) // Monstre 2
			{
				pv = 20;
				att = 15;
				def = 1;
				pm = 2;
			}
			else
			{
				if(profil==3) // boss
				{
				pv = 100;
				att = 10;
				def = 2;
				pm = 5;
				}
			}
		}
	}

	//Accesseurs
	public int getPv()
	{
		return pv;
	}

	public int getAtt()
	{
		return att;
	}

	public int getDef()
	{
		return def;
	}

	public int getPm()
	{
		return pm;
	}

	// Modifieurs
	public void setPv (int ptVie)
	{
		pv = ptVie;
	}

	public void setAtt (int ptAtt)
	{
		att = ptAtt;
	}

	public void setDef (int ptDef)
	{
		def = ptDef;
	}

	public void setPm (int ptMag)
	{
		pm = ptMag;
	}
}