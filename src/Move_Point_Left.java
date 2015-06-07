public class Move_Point_Left {
	  public void movePointLeft(Form1 fr)
		{ //Перемістити маркер ліворуч
		  if (fr.markersave == 0) {  //Якщо крайня ліва комірка нижнього рядка
			  fr.markersave = 7;     //Лівіше крайньої лівої комірки – крайня ПРАВА (циклічний перехід)
			  fr.firstset = 0;       //Тимчасово дозволити малювання маркера
			  fr.button7.setBackground(fr.savecolor[0]); //'Відновити колір фону комірки, де БУВ маркер
			  //Копия fr.button14_click(); 'Перемістити маркер (крайня права комірка!)
			  		if (fr.firstset == 0) {
			  			new Save_Color().saveColor(fr); //Заповнити кольори комірок нижнього рядка
			  			fr.button14.setBackground(fr.blue);
			  			fr.markersave = 7; //Маркер у комірці, відповідній  savecolor(7)
			  			fr.firstset = 1; //Більше не опрацьовувати
			  		}
					new Count().markerCount(fr); //Підрахувати очки при встановленні маркера
					fr.vt = fr.markersave;
			  fr.markersave = 10;    //Значення 10 не відповідає ніякій комірці
		  }

		  if (fr.markersave == 1) {  
			  fr.markersave = 0;     //Помістити лівіше
			  fr.firstset = 0;       //Тимчасово дозволити малювання маркера
			  fr.button8.setBackground(fr.savecolor[1]); //'Відновити колір фона комірки, де БУВ маркер
			  //Копия fr.button7_click(); 'Перемістити маркер (крайня права комірка!)
				if (fr.firstset == 0) {
					new Save_Color().saveColor(fr); //Запам'ятати кольори комірок нижнього рядка
					fr.button7.setBackground(fr.blue);
					fr.markersave = 0; //Маркер у комірці, відповідній  savecolor(0)
					fr.firstset = 1; //Більше не опрацьовувати
				}
				new Count().markerCount(fr); //Підрахувати очки при встановленні маркера
				fr.vt = fr.markersave;
			  fr.markersave = 10;    //Значення 10 не відповідає ніякій комірці
		  }

		  if (fr.markersave == 2) {  
			  fr.markersave = 1;     //Помістити лівіше
			  fr.firstset = 0;       //Тимчасово дозволити малювання маркера
			  fr.button9.setBackground(fr.savecolor[2]); //'Відновити колір фона комірки, де БУВ маркер
			  //Копия fr.button8_click(); 'Перемістити маркер (крайня правая комірка!)
				if (fr.firstset == 0) {
					new Save_Color().saveColor(fr); //Запам'ятати кольори комірок нижнього рядка
					fr.button8.setBackground(fr.blue);
					fr.markersave = 1; //Маркер в комірці, відповідній  savecolor(1)
					fr.firstset = 1; //Більше не опрацьовувати
				}
				new Count().markerCount(fr); //Підрахувати очки при встановленні маркера
				fr.vt = fr.markersave;
			  fr.markersave = 10;    //Значення 10 не відповідає ніякій комірці
		  }

		  if (fr.markersave == 3) {  
			  fr.markersave = 2;     //Помістити лівіше
			  fr.firstset = 0;       //Тимчасово дозволити малювання маркера
			  fr.button10.setBackground(fr.savecolor[3]); //'Відновити колір фона комірки, де БУВ маркер
			  //Копия fr.button9_click(); 'Перемістити маркер (крайня правая комірка!)
				if (fr.firstset == 0) {
					new Save_Color().saveColor(fr); //Запам'ятати кольори комірок нижнього рядка
					fr.button9.setBackground(fr.blue);
					fr.markersave = 2; //Маркер в комірці, відповідній  savecolor(2)
					fr.firstset = 1; //Більше не опрацьовувати
				}
				new Count().markerCount(fr); //Підрахувати очки при встановленні маркера
				fr.vt = fr.markersave;
			  fr.markersave = 10;    //Значення 10 не відповідає ніякій комірці
		  }

		  if (fr.markersave == 4) {  
			  fr.markersave = 3;     //Помістити лівіше
			  fr.firstset = 0;       //Тимчасово дозволити малювання маркера
			  fr.button11.setBackground(fr.savecolor[4]); //'Відновити колір фона комірки, де БУВ маркер
			  //Копия fr.button10_click(); 'Перемістити маркер (крайня правая комірка!)
				if (fr.firstset == 0) {
					new Save_Color().saveColor(fr); //Запам'ятати кольори комірок нижнього рядка
					fr.button10.setBackground(fr.blue);
					fr.markersave = 3; //Маркер в комірці, відповідній  savecolor(3)
					fr.firstset = 1; //Більше не опрацьовувати
				}
				new Count().markerCount(fr); //Підрахувати очки при встановленні маркера
				fr.vt = fr.markersave;
			  fr.markersave = 10;    //Значення 10 не відповідає ніякій комірці
		  }

		  if (fr.markersave == 5) {  
			  fr.markersave = 4;     //Помістити лівіше
			  fr.firstset = 0;       //Тимчасово дозволити малювання маркера
			  fr.button12.setBackground(fr.savecolor[5]); //'Відновити колір фона комірки, де БУВ маркер
			  //Копия fr.button11_click(); 'Перемістити маркер (крайня правая комірка!)
				if (fr.firstset == 0) {
					new Save_Color().saveColor(fr); //Запам'ятати кольори комірок нижнього рядка
					fr.button11.setBackground(fr.blue);
					fr.markersave = 4; //Маркер в комірці, відповідній  savecolor(4)
					fr.firstset = 1; //Більше не опрацьовувати
				}
				new Count().markerCount(fr); //Підрахувати очки при встановленні маркера
				fr.vt = fr.markersave;
			  fr.markersave = 10;    //Значення 10 не відповідає ніякій комірці
		  }

	 	  if (fr.markersave == 6) {  
			  fr.markersave = 5;     //Помістити лівіше
			  fr.firstset = 0;       //Тимчасово дозволити малювання маркера
			  fr.button13.setBackground(fr.savecolor[6]); //'Відновити колір фона комірки, де БУВ маркер
			  //Копия fr.button12_click(); 'Перемістити маркер (крайня правая комірка!)
				if (fr.firstset == 0) {
					new Save_Color().saveColor(fr); //Запам'ятати кольори комірок нижнього рядка
					fr.button12.setBackground(fr.blue);
					fr.markersave = 5; //Маркер в комірці, відповідній  savecolor(5)
					fr.firstset = 1; //Більше не опрацьовувати
				}
				new Count().markerCount(fr); //Підрахувати очки при встановленні маркера
				fr.vt = fr.markersave;
			  fr.markersave = 10;    //Значення 10 не відповідає ніякій комірці
		  }

	  	  if (fr.markersave == 7) {  
			  fr.markersave = 6;     //Помістити лівіше
			  fr.firstset = 0;       //Тимчасово дозволити малювання маркера
			  fr.button14.setBackground(fr.savecolor[7]); //'Відновити колір фона комірки, де БУВ маркер
			  //Копия fr.button13_click(); 'Перемістити маркер (крайня правая комірка!)
				if (fr.firstset == 0) {
					new Save_Color().saveColor(fr); //Запам'ятати кольори комірок нижнього рядка
					fr.button13.setBackground(fr.blue);
					fr.markersave = 6; //Маркер в комірці, відповідній  savecolor(6)
					fr.firstset = 1; //Більше не опрацьовувати
				}
				new Count().markerCount(fr); //Підрахувати очки при встановленні маркера
				fr.vt = fr.markersave;
			  fr.markersave = 10;    //Значення 10 не відповідає ніякій комірці
		  }
		fr.markersave = fr.vt;
		fr.n = 0;
		new Count().markerCount(fr);
	 }

}
