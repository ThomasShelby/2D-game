public class Count {
	public void markerCount(Form1 fr)
	{//ϳ�������� ���� ��� ������������ �������
	
		if (fr.n == 0) {
			if (fr.markersave == 0) fr.et = fr.field[4][0]; //������ � ��� ������ ������
			if (fr.markersave == 1) fr.et = fr.field[4][1];
			if (fr.markersave == 2) fr.et = fr.field[4][2];
			if (fr.markersave == 3) fr.et = fr.field[4][3];
			if (fr.markersave == 4) fr.et = fr.field[4][4];
			if (fr.markersave == 5) fr.et = fr.field[4][5];
			if (fr.markersave == 6) fr.et = fr.field[4][6];
			if (fr.markersave == 7) fr.et = fr.field[4][7]; //������ � ����� ������ ������
			
			//�������� �������
			fr.cs = "";
			if (fr.et == 0) fr.m = fr.m + 1;
			if (fr.et == 1) fr.m = fr.m - 1;
			if (fr.et == 2) fr.m = fr.m + 5;
			if (fr.et == 3) fr.m = fr.m - 5;
			if (fr.et == 4) fr.m = fr.m + 10;
			if (fr.et == 5) fr.m = fr.m - 10;
			if (fr.et == 6) fr.m = fr.m + 15;
			if (fr.et == 7) fr.m = fr.m - 15;
			if (fr.et == 8) fr.m = fr.m + 25;
			if (fr.et == 9) fr.m = fr.m + 500;
			if (fr.et == 10) fr.m = fr.m + 100;
			if (fr.et == 11) fr.m = fr.m - 200;
			if (fr.et == 12) fr.m = 0;
			if (fr.et == 13) fr.m = 0;
			if (fr.et == 14) System.exit(0);
			if (fr.et == 15) fr.m = fr.m - 10;
			if (fr.et == 16) fr.m = fr.m - 5;
			if (fr.et == 17) fr.m = fr.m - 1;
			if (fr.et == 18) fr.m = fr.m + 1;
			if (fr.et == 19) fr.m = fr.m + 50;
			if (fr.et == 20) fr.m = fr.m - 25;
			fr.cs = fr.cs + fr.m;
			fr.button48.setText(fr.cs);
			fr.n = 1; //������ �� �������������
		}
		fr.mainTimer.start(); //��������� ������ ������� �� ������� ����������
	}
	
	public void dnCount(Form1 fr)
	{ //ϳ�������� ���� ��� ���� ����� �������� ���� ������ ����
		fr.n = 0;  //��������� ��������� ������ ������� Set_Marker_Count
	markerCount(fr); //������ ��������� ���� ��� ����������� �������
	new Level_Count().levelCount(fr); //������� ��������� ���� Level
	}

}
