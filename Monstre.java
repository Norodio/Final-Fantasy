public class Monstre extends Pnj
{ 
	private Stat stati;
	private int hp;

	// Constructeur
	public Monstre(int x, int y, int t)
	{
		super(x, y, t);
		if(t==3)
		{
			stati = new Stat(1);
		}
		else
		{
			if(t==5)
			{
				stati = new Stat(2);
			}
			// etc.
		}
		
	}

	//Accesseurs
	public Stat getStati()
	{
		return stati;
	}

	public int getHp()
	{
		return hp;
	}


	// Modifieurs
	public void setStati (Stat s)
	{
		stati = s;
	}

	public void  setHp(int p)
	{
		hp = p; 
	}
}