public class Pnj
{
	// Attributs
	private boolean vivant;
	private int x;
	private int y;
	private int type;
	private String dialogue;
	private String image;
	private Item objet;

	// Constructeur
	public Pnj(int x,int y, int t)
	{
		vivant = true;
		this.x = x;
		this.y = y;
		type = t;
		switch (type)
		{
			// PNJ

			case 1:
				dialogue = "Tu veux du pain ?!?";
				image = "images/perso/PNJ/bakerman.gif";
				objet = new Item(x-10,y,2, "clef");
				break;


			case 2:
				this.dialogue="Bienvenue jeune hero, prends cette epee et protege notre village !";
				image = "images/perso/PNJ/maire.gif";

				break;


			case 7:
			dialogue = "Que puis je pour toi ?";
			image = "apoticaire.jpg";

			break;

			case 5:
				this.dialogue = "Je suis le boss";
				image = "images/perso/PNJ/boss.gif";

				break;

			case 6:
				dialogue = "Besoin d'équipement ?";
				image = "images/perso/PNJ/weaponshop.jpg";

				break;

		//  Héro

			case 4:
				this.dialogue = "...";
				image = "images/perso/hero/fighter-left.gif";

				break;

			case 8:
				this.dialogue = "...";
				image = "images/perso/hero/fighter-right.gif";

				break;

			case 9:
				this.dialogue = "...";
				image = "images/perso/hero/fighter-back.gif";

				break;

			case 10:
				this.dialogue = "...";
				image = "images/perso/hero/fighter-front.gif";

				break;

			case 11:
				this.dialogue = "N'hesite pas à venir nous voir !";
				image = "images/perso/PNJ/homme.gif";

				break;

			case 12:
				this.dialogue = "Prends un peu de temps pour te reposer...";
				image = "images/perso/PNJ/femme.gif";

				break;

			case 13:
				this.dialogue = "Heuresement que tu es la pour proteger le village !";
				image = "images/perso/PNJ/homme2.gif";

				break;

			// Monstre

			case 3:
				this.dialogue = "Viens te battre héros !!";
				image = "images/perso/PNJ/monstre.gif";

				break;

			case 14:
				this.dialogue = " Au combat !!";
				//image
				break;

			case 15:
				this.dialogue="Tu n'iras pas plus loin !";
				//image
				break;

			case 16:
				this.dialogue = " Que crois-tu pouvoir faire face à moi ?!";
				//image
				break;

			case 17:
				this.dialogue = " ";
				//image
				break;

			case 18:
				this.dialogue="Attaquez-le !";
				//image



			default:
				this.dialogue="Salut !";
				image = "images/perso/PNJ/homme.jpg" ;
		}
	}


	//Accesseurs
	public boolean getVivant()
	{
		return vivant;
	}

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

	public String getImage()
	{
		return image;
	}

	public void setImage(String image)
	{
		this.image = image;
	}

	public String getDialogue()
	{
		return dialogue;
	}

	//Modifieurs

	public void setVivant( boolean v)
	{
		vivant = v;
	}

	public void setType(int t)
	{
		type = t;
	}

	public void setX(int x)
	{
		this.x = x;
	}

	public void setY(int y)
	{
		this.y = y;
	}

	public void setDialogue(String d)
	{
		dialogue = d;
	}


}
