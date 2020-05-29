public class Item
{
	private int type;
	private String name;
	private String image;
	private boolean ramassable;
	private int x;
	private int y;

	// Constructeur
	public Item(int x, int y, int t, String name)
	{
		this.x = x;
		this.y = y;
		type = t;
		this.name = name;
		if(type==1)
		{
			image = "images/item/sword.gif";
			ramassable = true; // ramassable
		}
		else
		{
			if(type==2)
			{
				image = "images/item/clef.png";
				ramassable = true; // ramassable
			}
			else
			{
				if(type==3)
				{
				//image = "images/item/bouclier.jpg";
				ramassable = true; // ramassable
				}
				else
				{
					if(type==4)
					{
					//	image = "images/item/armure.jpg";
						ramassable = true; // ramassable
					}
					else
					{
						if(type==5)
						{
					//	image = "images/item/bottes.jpg";
						ramassable = true; // ramassable
						}
						else
							if(type==6)
							{
						//	image = "images/item/casque.jpg";
							ramassable = true; // ramassable
							}
							else
							{
								if(type==7)
								{
							//	image = "images/item/arc.jpg";
								ramassable = true; // ramassable
								}
								else
								{
									if(type==8)
									{
									image = "images/item/potion.gif";
									ramassable = true; // ramassable
									}
									else
									{
										if(type==9)
										{
										image = "images/item/coin.gif";
										ramassable = true; // ramassable
										}
										else
										{
											if(type==11)
											{
												image = "images/item/coffre.jpg";
												ramassable = true; // ramassable
											}
											else
											{
												if(type==12)
												{
													image = "images/item/crane.png";
													ramassable = true; // ramassable
												}
												else
												{
													if(type==13)
													{
													//	image = "images/item/fiole.jpg";
														ramassable = true; // ramassable
													}
													else
													{
														if(type==14)
														{
															image = "images/item/pain.png";
															ramassable = true; // ramassable
														}
														else
														{
															if(type==15)
															{
															//	image = "images/item/panier.jpg";
																ramassable = true; // ramassable
															}
															else
															{
																if(type==17)
																{
																//	image = "images/item/branche.jpg";
																	ramassable = true; // ramassable
																}
																else
																{
																	if(type==18)
																	{
																	//	image = "images/item/fruit.jpg";
																		ramassable = true; // ramassable
																	}
																	else
																	{
																		if(type==20)
																		{
																		//	image = "images/item/sac.jpg";
																			ramassable = true; // ramassable
																		}
																		else
																		{
																			if(type==22)
																			{
																				image = "images/item/torche.jpg";
																				ramassable = true; // ramassable
																			}
																			else
																			{
																				if(type==23)
																				{
																				//	image = "images/item/canneapeche.jpg";
																					ramassable = true; // ramassable
																				}
																				else
																				{
																					if(type==24)
																					{
																					//	image = "images/item/poisson.jpg";
																						ramassable = true; // ramassable
																					}
																					else
																					{
																						if(type==25)
																						{
																						//	image = "images/item/viande.jpg";
																							ramassable = true; // ramassable
																						}
																						else
																						{
																							if(type==26)
																							{
																						//		image = "images/item/vetement.jpg";
																								ramassable = true; // ramassable
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}


	// Accesseurs et modifieurs

	public int getType()
	{
		return type;
	}

	public String getName()
	{
		return name;
	}

	public String getImage()
	{
		return image;
	}

	public boolean getRamassable()
	{
		return ramassable;
	}

	public int getX()
	{
		return x;
	}

	public int getY()
	{
		return y;
	}



	public void setType( int t)
	{
		type = t;
	}

	public void setName(String n)
	{
		this.name = n;
	}

	public void setImage(String i)
	{
		image = i;
	}

	public void setRamassable(boolean r)
	{
		ramassable = r;
	}

	public void x(int xbis)
	{
		x = xbis;
	}

	public void y(int ybis)
	{
		y = ybis;
	}
}
