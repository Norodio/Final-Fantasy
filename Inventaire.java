import java.util.ArrayList;

public class Inventaire
{
	private ArrayList<Item> inv ;

	public Inventaire()
	{
		inv = new ArrayList<Item>() ;

		/*
		Item item = new Item(10, 10, 2, "Clef");
		addItem(item);
		System.out.println(clefPresente());
		*/
	}

	public ArrayList<Item> getInv()
	{
		return inv;
	}

	public void addItem(Item i)
	{
		this.inv.add(i);
	}
	public void removeItem(int i) // supprime l'objet à l'index i
	{
		this.inv.remove(i);
	}

	public int getSizeInv() //taille actuel
	{
		return this.inv.size();
	}

	public boolean clefPresente() //taille actuel
	{
		boolean objetPresent = false;
		for(int i = 0;i<this.inv.size();i++)
		{
			if(inv.get(i).getType()==2)
			{
				objetPresent = true;
			}
		}
		return objetPresent;
	}

	public String printInv()
	{
		String text = "";
		for(int i = 0;i<this.inv.size();i++)
		{
			text += inv.get(i).getName();
		}
		return text;
	}
}
