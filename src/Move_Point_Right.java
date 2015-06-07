public class Move_Point_Right {
	public void movePointRight(Form1 fr)
	{ //Перемщение маркера праворуч
		
	  if (fr.markersave == 0) {  //Якщо крайня ліва комірка нижнього рядка
		  fr.markersave = 1;     //Перемістити праворуч (т.к. Значення > на 1)
		  fr.firstset = 0;       //Тимчасово дозволити малювання маркера
		  fr.button7.setBackground(fr.savecolor[0]); //'Відновити колір фона комірки, де БУВ маркер
		  //Копия fr.button8_click(); 'Перемістити маркер праворуч
		  		if (fr.firstset == 0) new Save_Color().saveColor(fr); //Запам'ятати кольори комірок нижнього рядка
				if (fr.firstset == 0) fr.button8.setBackground(fr.blue);
				if (fr.firstset == 0) fr.markersave = 1; //Маркер в комірці, відповідній  savecolor(1)
				if (fr.firstset == 0) fr.firstset = 1; //Більше не опрацьовувати
				new Count().markerCount(fr); //Підрахувати очки при встановленні маркера
				fr.vt = fr.markersave;
		  fr.markersave = 10;    //Значення 10 не відповідає ніякій комірці
	  }

	  if (fr.markersave == 1) {  //Якщо крайня ліва комірка нижнього рядка
		  fr.markersave = 2;     //Перемістити праворуч (т.к. Значення > на 1)
		  fr.firstset = 0;       //Тимчасово дозволити малювання маркера
		  fr.button8.setBackground(fr.savecolor[1]); //'Відновити колір фона комірки, де БУВ маркер
		  //Копия fr.button9_click(); 'Перемістити маркер праворуч
		  		if (fr.firstset == 0) new Save_Color().saveColor(fr); //Запам'ятати кольори комірок нижнього рядка
				if (fr.firstset == 0) fr.button9.setBackground(fr.blue);
				if (fr.firstset == 0) fr.markersave = 2; //Маркер в комірці, відповідній  savecolor(1)
				if (fr.firstset == 0) fr.firstset = 1; //Більше не опрацьовувати
				new Count().markerCount(fr); //Підрахувати очки при встановленні маркера
				fr.vt = fr.markersave;
		  fr.markersave = 10;    //Значення 10 не відповідає ніякій комірці
	  }

	  if (fr.markersave == 2) {  //Якщо крайня ліва комірка нижнього рядка
		  fr.markersave = 3;     //Перемістити праворуч (т.к. Значення > на 1)
		  fr.firstset = 0;       //Тимчасово дозволити малювання маркера
		  fr.button9.setBackground(fr.savecolor[2]); //'Відновити колір фона комірки, де БУВ маркер
		  //Копия fr.button10_click(); 'Перемістити маркер праворуч
		  		if (fr.firstset == 0) new Save_Color().saveColor(fr); //Запам'ятати кольори комірок нижнього рядка
				if (fr.firstset == 0) fr.button10.setBackground(fr.blue);
				if (fr.firstset == 0) fr.markersave = 3; //Маркер в комірці, відповідній  savecolor(1)
				if (fr.firstset == 0) fr.firstset = 1; //Більше не опрацьовувати
				new Count().markerCount(fr); //Підрахувати очки при встановленні маркера
				fr.vt = fr.markersave;
		  fr.markersave = 10;    //Значення 10 не відповідає ніякій комірці
	  }

	  if (fr.markersave == 3) {  //Якщо крайня ліва комірка нижнього рядка
		  fr.markersave = 4;     //Перемістити праворуч (т.к. Значення > на 1)
		  fr.firstset = 0;       //Тимчасово дозволити малювання маркера
		  fr.button10.setBackground(fr.savecolor[3]); //'Відновити колір фона комірки, де БУВ маркер
		  //Копия fr.button11_click(); 'Перемістити маркер праворуч
		  		if (fr.firstset == 0) new Save_Color().saveColor(fr); //Запам'ятати кольори комірок нижнього рядка
				if (fr.firstset == 0) fr.button11.setBackground(fr.blue);
				if (fr.firstset == 0) fr.markersave = 4; //Маркер в комірці, відповідній  savecolor(1)
				if (fr.firstset == 0) fr.firstset = 1; //Більше не опрацьовувати
				new Count().markerCount(fr); //Підрахувати очки при встановленні маркера
				fr.vt = fr.markersave;
		  fr.markersave = 10;    //Значення 10 не відповідає ніякій комірці
	  }

	  if (fr.markersave == 4) {  //Якщо крайня ліва комірка нижнього рядка
		  fr.markersave = 5;     //Перемістити праворуч (т.к. Значення > на 1)
		  fr.firstset = 0;       //Тимчасово дозволити малювання маркера
		  fr.button11.setBackground(fr.savecolor[4]); //'Відновити колір фона комірки, де БУВ маркер
		  //Копия fr.button12_click(); 'Перемістити маркер праворуч
		  		if (fr.firstset == 0) new Save_Color().saveColor(fr); //Запам'ятати кольори комірок нижнього рядка
				if (fr.firstset == 0) fr.button12.setBackground(fr.blue);
				if (fr.firstset == 0) fr.markersave = 5; //Маркер в комірці, відповідній  savecolor(1)
				if (fr.firstset == 0) fr.firstset = 1; //Більше не опрацьовувати
				new Count().markerCount(fr); //Підрахувати очки при встановленні маркера
				fr.vt = fr.markersave;
		  fr.markersave = 10;    //Значення 10 не відповідає ніякій комірці
	  }

	  if (fr.markersave == 5) {  //Якщо крайня ліва комірка нижнього рядка
		  fr.markersave = 6;     //Перемістити праворуч (т.к. Значення > на 1)
		  fr.firstset = 0;       //Тимчасово дозволити малювання маркера
		  fr.button12.setBackground(fr.savecolor[5]); //'Відновити колір фона комірки, де БУВ маркер
		  //Копия fr.button13_click(); 'Перемістити маркер праворуч
		  		if (fr.firstset == 0) new Save_Color().saveColor(fr); //Запам'ятати кольори комірок нижнього рядка
				if (fr.firstset == 0) fr.button13.setBackground(fr.blue);
				if (fr.firstset == 0) fr.markersave = 6; //Маркер в комірці, відповідній  savecolor(1)
				if (fr.firstset == 0) fr.firstset = 1; //Більше не опрацьовувати
				new Count().markerCount(fr); //Підрахувати очки при встановленні маркера
				fr.vt = fr.markersave;
		  fr.markersave = 10;    //Значення 10 не відповідає ніякій комірці
	  }

	  if (fr.markersave == 6) {  //Якщо крайня ліва комірка нижнього рядка
		  fr.markersave = 7;     //Перемістити праворуч (т.к. Значення > на 1)
		  fr.firstset = 0;       //Тимчасово дозволити малювання маркера
		  fr.button13.setBackground(fr.savecolor[6]); //'Відновити колір фона комірки, де БУВ маркер
		  //Копия fr.button14_click(); 'Перемістити маркер праворуч
		  		if (fr.firstset == 0) new Save_Color().saveColor(fr); //Запам'ятати кольори комірок нижнього рядка
				if (fr.firstset == 0) fr.button14.setBackground(fr.blue);
				if (fr.firstset == 0) fr.markersave = 7; //Маркер в комірці, відповідній  savecolor(1)
				if (fr.firstset == 0) fr.firstset = 1; //Більше не опрацьовувати
				new Count().markerCount(fr); //Підрахувати очки при встановленні маркера
				fr.vt = fr.markersave;
		  fr.markersave = 10;    //Значення 10 не відповідає ніякій комірці
	  }

	  if (fr.markersave == 7) {  //Якщо крайня ліва комірка нижнього рядка
		  fr.markersave = 0;     //Перемістити праворуч (т.к. Значення > на 1)
		  fr.firstset = 0;       //Тимчасово дозволити малювання маркера
		  fr.button14.setBackground(fr.savecolor[7]); //'Відновити колір фону комірки, де БУВ маркер
		  //Копия fr.button7_click(); 'Перемістити маркер праворуч
		  		if (fr.firstset == 0) new Save_Color().saveColor(fr); //Запам'ятати кольори комірок нижнього рядка
				if (fr.firstset == 0) fr.button7.setBackground(fr.blue);
				if (fr.firstset == 0) fr.markersave = 0; //Маркер в комірці, відповідній  savecolor(1)
				if (fr.firstset == 0) fr.firstset = 1; //Більше не опрацьовувати
				new Count().markerCount(fr); //Підрахувати очки при встановленні маркера
				fr.vt = fr.markersave;
		  fr.markersave = 10;    //Значення 10 не відповідає ніякій комірці
	  }
		
	fr.markersave = fr.vt;
	fr.n = 0;
	new Count().markerCount(fr);
	}
	

}
