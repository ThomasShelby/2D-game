public class Save_Color{

	public void savecolor(Form1 fr) 
	{
		//Збереження кольорових атрибутів всіх комірок нижнього рядка 

		fr.savecolor[0] = fr.button7.getBackground();
		fr.savecolor[1] = fr.button8.getBackground();
		fr.savecolor[2] = fr.button9.getBackground();
		fr.savecolor[3] = fr.button10.getBackground();
		fr.savecolor[4] = fr.button11.getBackground();
		fr.savecolor[5] = fr.button12.getBackground();
		fr.savecolor[6] = fr.button13.getBackground();
		fr.savecolor[7] = fr.button14.getBackground();
	}
	public void markerReset(Form1 fr)
	{ //Відновлення кольору маркера після зміщення комірок ігрового поля зверху-вниз
		
	if (fr.markersave == 0) fr.button7.setBackground(fr.blue); //Відновити синій колір комірки
	if (fr.markersave == 1) fr.button8.setBackground(fr.blue);	
	if (fr.markersave == 2) fr.button9.setBackground(fr.blue);	
	if (fr.markersave == 3) fr.button10.setBackground(fr.blue);	
	if (fr.markersave == 4) fr.button11.setBackground(fr.blue);	
	if (fr.markersave == 5) fr.button12.setBackground(fr.blue);	
	if (fr.markersave == 6) fr.button13.setBackground(fr.blue);	
	if (fr.markersave == 7) fr.button14.setBackground(fr.blue);	
	}
}
