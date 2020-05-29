public class ElementDecor
{
	private int type;
	private String image;
	private boolean traverse;

	//  Constructeur
	public ElementDecor(int t)
	{
		type = t;
		if(type == 1)
		{
			image = "images/decor/buisson.png";
			traverse = false;
		}
		else
		{
			if(type == 2)
			{
				image = "images/decor/herbe.png";
				traverse = true;
			}
			else
			{
				if(type == 3)
				{
				image = "images/decor/chemin.png";
				traverse = true;
				}
				else
					{
					if(type == 4)
					{
					image = "images/decor/rocher.jpg";
					traverse = false;
					}
					else
						{
						if(type == 5)
						{
						image = "images/decor/arbre.gif";
						traverse = false;
						}
						else
						{
							if(type == 6)
							{
								image = "images/decor/pave.jpg";
								traverse = true;
							}
							else
							{
								if(type == 7)
								{
									image = "images/decor/eau.png";
									traverse = false;
								}
								else
								{
									if(type == 8)
									{
										image = "images/decor/fontaine.gif";
										traverse = false;
									}
									else
									{
										if(type == 9)
										{
											image = "images/decor/pont.gif";
											traverse = true;
										}
										else
										{
											if(type == 10)
											{
												image = "image/decor/batiment.png";
												traverse = false;
											}
											else
											{
												if(type == 11)
												{
													image = "images/decor/taverne.png";
													traverse = false;
												}
												else
												{
													if(type == 12)
													{
														image = "images/decor/statue.gif";
														traverse = false;
													}
													else
													{
														if(type == 13)
														{
															image = "images/decor/mairie.png";
															traverse = false;
														}
														else
														{
															if(type == 14)
															{
																image = "images/perso/PNJ/homme.gif";
																traverse = false;
															}
															else
															{
																if(type == 15)
																{
																	image = "images/perso/PNJ/femme.gif";
																	traverse = false;
																}
																else
																{
																	if(type == 16)
																	{
																		image = "images/perso/PNJ/oracle.png";
																		traverse = false;
																	}
																	else
																	{
																		if(type == 17)
																		{
																			image = "images/perso/PNJ/homme2.gif";
																			traverse = false;
																		}
																		else
																		{
																			if(type == 18)
																			{
																				image = "images/decor/chemin-horizontal.png";
																				traverse = true;
																			}
																			else
																			{
																				if(type == 19)
																				{
																					image = "images/decor/boue.jpg";
																					traverse = true;
																				}
																				else
																				{
																					if(type == 20)
																					{
																						image = "images/decor/sol-roche.png";
																						traverse = true;
																					}
																					else
																					{
																						if(type == 21)
																						{
																							image = "images/item/coffre-ouvert.jpg";
																							traverse = false;
																						}
																						else
																						{
																							if(type == 22)
																							{
																								image = "images/item/coffre-ferme.jpg";
																								traverse = false;
																							}
																							else
																							{
																								if(type == 23)
																								{
																									image = "images/decor/grotte-coingh.png";
																									traverse = false;
																								}
																								else
																								{
																									if(type == 24)
																									{
																										image = "images/decor/grotte-coindh.png";
																										traverse = false;
																									}

																									else
																									{
																										if(type == 25)
																										{
																											image = "images/decor/grotte-coingb.png";
																											traverse = false;
																										}
																										else
																										{
																											if(type == 26)
																											{
																												image = "images/decor/grotte-coindb.png";
																												traverse = false;
																											}
																											else
																											{
																												if(type == 27)
																												{
																													image = "images/decor/taverne-coingh.png";
																													traverse = false;
																												}
																												else
																												{
																													if(type == 28)
																													{
																														image = "images/decor/taverne-coindh.png";
																														traverse = false;
																													}

																													else
																													{
																														if(type == 29)
																														{
																															image = "images/decor/taverne-coingb.png";
																															traverse = false;
																														}
																														else
																														{
																															if(type == 30)
																															{
																																image = "images/decor/taverne-coindb.png";
																																traverse = false;
																															}
																															else
																															{
																																if(type == 31)
																																{
																																	image = "images/decor/mairie-coingh.png";
																																	traverse = false;
																																}
																																else
																																{
																																	if(type == 32)
																																	{
																																		image = "images/decor/mairie-coindh.png";
																																		traverse = false;
																																	}
																																	else
																																	{
																																		if(type == 33)
																																		{
																																			image = "images/decor/mairie-coingb.png";
																																			traverse = false;
																																		}
																																		else
																																		{
																																			if(type == 34)
																																			{
																																				image = "images/decor/mairie-coindb.png";
																																				traverse = false;

																																			}
																																			else
																																			{
																																				if(type == 35)
																																				{
																																					image = "images/decor/armurie-coingh.png";
																																					traverse = false;
																																				}
																																				else
																																				{
																																					if(type == 36)
																																					{
																																						image = "images/decor/armurie-coindh.png";
																																						traverse = false;
																																					}
																																					else
																																					{
																																						if(type == 37)
																																						{
																																							image = "images/decor/armurie-coingb.png";
																																							traverse = false;
																																						}
																																						else
																																						{
																																							if(type == 38)
																																							{
																																								image = "images/decor/armurie-coindb.png";
																																								traverse = false;
																																							}
																																							else
																																							{
																																								if(type == 39)
																																								{
																																									image = "images/decor/maisong.png";
																																									traverse = false;
																																								}
																																								else
																																								{
																																									if(type == 40)
																																									{
																																										image = "images/decor/maisond.png";
																																										traverse = false;
																																									}
																																									else
																																									{
																																										if(type == 41)
																																										{
																																											image = "images/decor/porteFermee.png";
																																											traverse = false;
																																										}
																																										else
																																										{
																																											if(type == 42)
																																											{
																																												image = "images/decor/porteOuverte.png";
																																												traverse = false;
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

	// Accesseurs

	public int getType()
	{
		return type;
	}

	public String getImage()
	{
		return image;
	}

	public boolean getTraverse()
	{
		return traverse;
	}

	//modifieurs

	public void setType(int t)
	{
		type = t;
		if(type == 1)
		{
			image = "images/decor/buisson.png";
			traverse = false;
		}
		else
		{
			if(type == 2)
			{
				image = "images/decor/herbe.png";
				traverse = true;
			}
			else
			{
				if(type == 3)
				{
				image = "images/decor/chemin.png";
				traverse = true;
				}
				else
					{
					if(type == 4)
					{
					image = "images/decor/rocher.jpg";
					traverse = false;
					}
					else
						{
						if(type == 5)
						{
						image = "images/decor/arbre.gif";
						traverse = false;
						}
						else
						{
							if(type == 6)
							{
								image = "images/decor/pave.jpg";
								traverse = true;
							}
							else
							{
								if(type == 7)
								{
									image = "images/decor/eau.png";
									traverse = false;
								}
								else
								{
									if(type == 8)
									{
										image = "images/decor/fontaine.gif";
										traverse = false;
									}
									else
									{
										if(type == 9)
										{
											image = "images/decor/pont.gif";
											traverse = true;
										}
										else
										{
											if(type == 10)
											{
												image = "image/decor/batiment.png";
												traverse = false;
											}
											else
											{
												if(type == 11)
												{
													image = "images/decor/taverne.png";
													traverse = false;
												}
												else
												{
													if(type == 12)
													{
														image = "images/decor/statue.gif";
														traverse = false;
													}
													else
													{
														if(type == 13)
														{
															image = "images/decor/mairie.png";
															traverse = false;
														}
														else
														{
															if(type == 14)
															{
																image = "images/perso/PNJ/homme.gif";
																traverse = false;
															}
															else
															{
																if(type == 15)
																{
																	image = "images/perso/PNJ/femme.gif";
																	traverse = false;
																}
																else
																{
																	if(type == 16)
																	{
																		image = "images/perso/PNJ/oracle.png";
																		traverse = false;
																	}
																	else
																	{
																		if(type == 17)
																		{
																			image = "images/perso/PNJ/homme2.gif";
																			traverse = false;
																		}
																		else
																		{
																			if(type == 18)
																			{
																				image = "images/decor/chemin-horizontal.png";
																				traverse = true;
																			}
																			else
																			{
																				if(type == 19)
																				{
																					image = "images/decor/boue.jpg";
																					traverse = true;
																				}
																				else
																				{
																					if(type == 20)
																					{
																						image = "images/decor/sol-roche.png";
																						traverse = true;
																					}
																					else
																					{
																						if(type == 21)
																						{
																							image = "images/item/coffre-ouvert.jpg";
																							traverse = false;
																						}
																						else
																						{
																							if(type == 22)
																							{
																								image = "images/item/coffre-ferme.jpg";
																								traverse = false;
																							}
																							else
																							{
																								if(type == 23)
																								{
																									image = "images/decor/grotte-coingh.png";
																									traverse = false;
																								}
																								else
																								{
																									if(type == 24)
																									{
																										image = "images/decor/grotte-coindh.png";
																										traverse = false;
																									}

																									else
																									{
																										if(type == 25)
																										{
																											image = "images/decor/grotte-coingb.png";
																											traverse = false;
																										}
																										else
																										{
																											if(type == 26)
																											{
																												image = "images/decor/grotte-coindb.png";
																												traverse = false;
																											}
																											else
																											{
																												if(type == 27)
																												{
																													image = "images/decor/taverne-coingh.png";
																													traverse = false;
																												}
																												else
																												{
																													if(type == 28)
																													{
																														image = "images/decor/taverne-coindh.png";
																														traverse = false;
																													}
																													else
																													{
																														if(type == 29)
																														{
																															image = "images/decor/taverne-coingb.png";
																															traverse = false;
																														}
																														else
																														{
																															if(type == 30)
																															{
																																image = "images/decor/taverne-coindb.png";
																																traverse = false;
																															}
																															else
																															{
																																if(type == 31)
																																{
																																	image = "images/decor/mairie-coingh.png";
																																	traverse = false;
																																}
																																else
																																{
																																	if(type == 32)
																																	{
																																		image = "images/decor/mairie-coindh.png";
																																		traverse = false;
																																	}
																																	else
																																	{
																																		if(type == 33)
																																		{
																																			image = "images/decor/mairie-coingb.png";
																																			traverse = false;
																																		}
																																		else
																																		{
																																			if(type == 34)
																																			{
																																				image = "images/decor/mairie-coindb.png";
																																				traverse = false;
																																			}
																																			else
																																			{
																																				if(type == 35)
																																				{
																																					image = "images/decor/armurie-coingh.png";
																																					traverse = false;
																																				}
																																				else
																																				{
																																					if(type == 36)
																																					{
																																						image = "images/decor/armurie-coindh.png";
																																						traverse = false;
																																					}
																																					else
																																					{
																																						if(type == 37)
																																						{
																																							image = "images/decor/armurie-coingb.png";
																																							traverse = false;
																																						}
																																						else
																																						{
																																							if(type == 38)
																																							{
																																								image = "images/decor/armurie-coindb.png";
																																								traverse = false;
																																							}
																																							else
																																							{
																																								if(type == 39)
																																								{
																																									image = "images/decor/maisong.png";
																																									traverse = false;
																																								}
																																								else
																																								{
																																									if(type == 40)
																																									{
																																										image = "images/decor/maisond.png";
																																										traverse = false;
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



	public void setImage(String i)
	{
		image = i;
	}

	public void setTraverse (boolean trav)
	{
		traverse = trav;
	}
}
