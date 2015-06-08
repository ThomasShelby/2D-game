import javax.swing.JOptionPane;

public class Count {
	static boolean isEnd=true;
	
	public void markerCount(Form1 fr)
	{//Підрахунок очків при перестановці маркера
	
		if (fr.n == 0) {
			if (fr.markersave == 0) fr.et = fr.field[4][0]; //Маркер у лівій крайній комірці
			if (fr.markersave == 1) fr.et = fr.field[4][1];
			if (fr.markersave == 2) fr.et = fr.field[4][2];
			if (fr.markersave == 3) fr.et = fr.field[4][3];
			if (fr.markersave == 4) fr.et = fr.field[4][4];
			if (fr.markersave == 5) fr.et = fr.field[4][5];
			if (fr.markersave == 6) fr.et = fr.field[4][6];
			if (fr.markersave == 7) fr.et = fr.field[4][7]; //Маркер у правій крайній комірці
			
			//Написати рахунок
			fr.cs = "";
			if (fr.et == 0 ) fr.m = fr.m + 1;
			if (fr.et == 1 ) fr.m = fr.m - 1;
			if (fr.et == 2 ) fr.m = fr.m + 5;
			if (fr.et == 3 ) fr.m = fr.m - 5;
			if (fr.et == 4 ) fr.m = fr.m + 10;
			if (fr.et == 5 ) fr.m = fr.m - 10;
			if (fr.et == 6 ) fr.m = fr.m + 15;
			if (fr.et == 7 ) fr.m = fr.m - 15;
			if (fr.et == 8 ) fr.m = fr.m + 25;
			if (fr.et == 9 ) fr.m = fr.m + 500;
			if (fr.et == 10) fr.m = fr.m + 100;
			if (fr.et == 11) fr.m = fr.m - 200;
			if (fr.et == 12) fr.m = 0;
			if (fr.et == 13) fr.m = 0;
			//JOptionPane.showConfirmDialog (null, “key pressed”);
			if (fr.et == 14) {
				fr.mainTimer.stop();
				JOptionPane.showMessageDialog (null, "Ви програли!");
				Form1.start();
				Form1.window.frmMYaremchukGame.setVisible(false);
				 isEnd=false;
			}
			if (fr.et == 15 && isEnd) fr.m = fr.m - 10;
			if (fr.et == 16 && isEnd) fr.m = fr.m - 5;
			if (fr.et == 17 && isEnd) fr.m = fr.m - 1;
			if (fr.et == 18 && isEnd) fr.m = fr.m + 1;
			if (fr.et == 19 && isEnd) fr.m = fr.m + 50;
			if (fr.et == 20 && isEnd) fr.m = fr.m - 25;
			fr.cs = fr.cs + fr.m;
			fr.button48.setText(fr.cs);
			fr.n = 1; //Більше не опрацьовувати
		}
//		fr.mainTimer.start(); //Дозволити роботу таймера та лінійного індикатора
	}
	
	public void dnCount(Form1 fr)
	{ //Підрахунок очків при зсуві рядків ігрового поля зверху вниз
		fr.n = 0;  //Тимчасово дозволити роботу процесу Set_Marker_Count
	markerCount(fr); //процес підрахунку очків при встановленні маркера
	new Level_Count().levelCount(fr); //Зсунути нумерацію рівнів Level
	}

}
