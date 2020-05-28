public class Item
{
	private int type;
	private String name;
	private String image;
	private boolean ramassable;
	private int x; // pourquoi Scroll sur notre diagramme UML ?
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
			image = "epee.jpg";
			ramassable = true; // ramassable
		}
		else
		{
			if(type==2)
			{
				image = "lance.jpg";
				ramassable = true; // ramassable
			}
			else
			{
				if(type==3)
				{
				image = "bouclier.jpg";
				ramassable = true; // ramassable
				}
				else
				{
					if(type==4)
					{
						image = "armure.jpg";
						ramassable = true; // ramassable
					}
					else
					{
						if(type==5)
						{
						image = "bottes.jpg";
						ramassable = true; // ramassable
						}
						else
							if(type==6)
							{
							image = "casque.jpg";
							ramassable = true; // ramassable
							}
							else
							{
								if(type==7)
								{
								image = "arc.jpg";
								ramassable = true; // ramassable
								}
								else
								{
									if(type==8)
									{
									image = "potion.jpg";
									ramassable = true; // ramassable
									}
									else
									{
										if(type==9)
										{
										image = "piece.jpg";
										ramassable = true; // ramassable
										}
										else
										{
											if(type==11)
											{
												image = "coffre.jpg";
												ramassable = true; // ramassable
											}
											else
											{
												if(type==12)
												{
													image = "crane.jpg";
													ramassable = true; // ramassable
												}
												else
												{
													if(type==13)
													{
														image = "fiole.jpg";
														ramassable = true; // ramassable
													}
													else
													{
														if(type==14)
														{
															image = "pain.jpg";
															ramassable = true; // ramassable
														}
														else
														{
															if(type==15)
															{
																image = "panier.jpg";
																ramassable = true; // ramassable
															}
															else
															{
																if(type==17)
																{
																	image = "branche.jpg";
																	ramassable = true; // ramassable
																}
																else
																{
																	if(type==18)
																	{
																		image = "fruit.jpg";
																		ramassable = true; // ramassable
																	}
																	else
																	{
																		if(type==20)
																		{
																			image = "sac.jpg";
																			ramassable = true; // ramassable
																		}
																		else
																		{
																			if(type==22)
																			{
																				image = "torche.jpg";
																				ramassable = true; // ramassable
																			}
																			else
																			{
																				if(type==23)
																				{
																					image = "canneapeche.jpg";
																					ramassable = true; // ramassable
																				}
																				else
																				{
																					if(type==24)
																					{
																						image = "poisson.jpg";
																						ramassable = true; // ramassable
																					}
																					else
																					{
																						if(type==25)
																						{
																							image = "viande.jpg";
																							ramassable = true; // ramassable
																						}
																						else
																						{
																							if(type==26)
																							{
																								image = "vetement.jpg";
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

	public void setName(int n)
	{
		name = n; 
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
