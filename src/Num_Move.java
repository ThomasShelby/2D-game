public class Num_Move {
	public void numMove(Form1 fr) 
	{ //процес для переписування номіналів комірок та кольорових атрибутів
	  //при зсуві комірок зверху вниз
			for (int i=0; i<8; i++)
		{
		fr.field[4][i] = fr.field[3][i];
		fr.field[3][i] = fr.field[2][i];
		fr.field[2][i] = fr.field[1][i];
		fr.field[1][i] = fr.field[0][i];
		}	
			
		//А масив комірок filed5 заповнимо новими значеннями генератора випадкових чисел
		upStrApp(fr);
				
		fr.Field_Fill();
	}
	

	public void upStrApp(Form1 fr) 
	{
		//А масив комірок filed5 заповнимо новими значеннями генератора випадкових чисел
			for (int j=0; j<8; j++)
		{
			fr.field[0][j] = (int)(19*Math.random()); //генерує випадкове число = 0 до 19
		}
	}

}
