public class Move_Point_Right {
	public void movePointRight(Form1 fr)
	{ //���������� ������� ��������
		
	  if (fr.markersave == 0) {  //���� ������ ��� ������ �������� �����
		  fr.markersave = 1;     //���������� �������� (�.�. �������� > �� 1)
		  fr.firstset = 0;       //��������� ��������� ��������� �������
		  fr.button7.setBackground(fr.savecolor[0]); //'³������� ���� ���� ������, �� ��� ������
		  //����� fr.button8_click(); '���������� ������ ��������
		  		if (fr.firstset == 0) new Save_Color().saveColor(fr); //�����'����� ������� ������ �������� �����
				if (fr.firstset == 0) fr.button8.setBackground(fr.blue);
				if (fr.firstset == 0) fr.markersave = 1; //������ � ������, ���������  savecolor(1)
				if (fr.firstset == 0) fr.firstset = 1; //������ �� �������������
				new Count().markerCount(fr); //ϳ��������� ���� ��� ������������ �������
				fr.vt = fr.markersave;
		  fr.markersave = 10;    //�������� 10 �� ������� ����� ������
	  }

	  if (fr.markersave == 1) {  //���� ������ ��� ������ �������� �����
		  fr.markersave = 2;     //���������� �������� (�.�. �������� > �� 1)
		  fr.firstset = 0;       //��������� ��������� ��������� �������
		  fr.button8.setBackground(fr.savecolor[1]); //'³������� ���� ���� ������, �� ��� ������
		  //����� fr.button9_click(); '���������� ������ ��������
		  		if (fr.firstset == 0) new Save_Color().saveColor(fr); //�����'����� ������� ������ �������� �����
				if (fr.firstset == 0) fr.button9.setBackground(fr.blue);
				if (fr.firstset == 0) fr.markersave = 2; //������ � ������, ���������  savecolor(1)
				if (fr.firstset == 0) fr.firstset = 1; //������ �� �������������
				new Count().markerCount(fr); //ϳ��������� ���� ��� ������������ �������
				fr.vt = fr.markersave;
		  fr.markersave = 10;    //�������� 10 �� ������� ����� ������
	  }

	  if (fr.markersave == 2) {  //���� ������ ��� ������ �������� �����
		  fr.markersave = 3;     //���������� �������� (�.�. �������� > �� 1)
		  fr.firstset = 0;       //��������� ��������� ��������� �������
		  fr.button9.setBackground(fr.savecolor[2]); //'³������� ���� ���� ������, �� ��� ������
		  //����� fr.button10_click(); '���������� ������ ��������
		  		if (fr.firstset == 0) new Save_Color().saveColor(fr); //�����'����� ������� ������ �������� �����
				if (fr.firstset == 0) fr.button10.setBackground(fr.blue);
				if (fr.firstset == 0) fr.markersave = 3; //������ � ������, ���������  savecolor(1)
				if (fr.firstset == 0) fr.firstset = 1; //������ �� �������������
				new Count().markerCount(fr); //ϳ��������� ���� ��� ������������ �������
				fr.vt = fr.markersave;
		  fr.markersave = 10;    //�������� 10 �� ������� ����� ������
	  }

	  if (fr.markersave == 3) {  //���� ������ ��� ������ �������� �����
		  fr.markersave = 4;     //���������� �������� (�.�. �������� > �� 1)
		  fr.firstset = 0;       //��������� ��������� ��������� �������
		  fr.button10.setBackground(fr.savecolor[3]); //'³������� ���� ���� ������, �� ��� ������
		  //����� fr.button11_click(); '���������� ������ ��������
		  		if (fr.firstset == 0) new Save_Color().saveColor(fr); //�����'����� ������� ������ �������� �����
				if (fr.firstset == 0) fr.button11.setBackground(fr.blue);
				if (fr.firstset == 0) fr.markersave = 4; //������ � ������, ���������  savecolor(1)
				if (fr.firstset == 0) fr.firstset = 1; //������ �� �������������
				new Count().markerCount(fr); //ϳ��������� ���� ��� ������������ �������
				fr.vt = fr.markersave;
		  fr.markersave = 10;    //�������� 10 �� ������� ����� ������
	  }

	  if (fr.markersave == 4) {  //���� ������ ��� ������ �������� �����
		  fr.markersave = 5;     //���������� �������� (�.�. �������� > �� 1)
		  fr.firstset = 0;       //��������� ��������� ��������� �������
		  fr.button11.setBackground(fr.savecolor[4]); //'³������� ���� ���� ������, �� ��� ������
		  //����� fr.button12_click(); '���������� ������ ��������
		  		if (fr.firstset == 0) new Save_Color().saveColor(fr); //�����'����� ������� ������ �������� �����
				if (fr.firstset == 0) fr.button12.setBackground(fr.blue);
				if (fr.firstset == 0) fr.markersave = 5; //������ � ������, ���������  savecolor(1)
				if (fr.firstset == 0) fr.firstset = 1; //������ �� �������������
				new Count().markerCount(fr); //ϳ��������� ���� ��� ������������ �������
				fr.vt = fr.markersave;
		  fr.markersave = 10;    //�������� 10 �� ������� ����� ������
	  }

	  if (fr.markersave == 5) {  //���� ������ ��� ������ �������� �����
		  fr.markersave = 6;     //���������� �������� (�.�. �������� > �� 1)
		  fr.firstset = 0;       //��������� ��������� ��������� �������
		  fr.button12.setBackground(fr.savecolor[5]); //'³������� ���� ���� ������, �� ��� ������
		  //����� fr.button13_click(); '���������� ������ ��������
		  		if (fr.firstset == 0) new Save_Color().saveColor(fr); //�����'����� ������� ������ �������� �����
				if (fr.firstset == 0) fr.button13.setBackground(fr.blue);
				if (fr.firstset == 0) fr.markersave = 6; //������ � ������, ���������  savecolor(1)
				if (fr.firstset == 0) fr.firstset = 1; //������ �� �������������
				new Count().markerCount(fr); //ϳ��������� ���� ��� ������������ �������
				fr.vt = fr.markersave;
		  fr.markersave = 10;    //�������� 10 �� ������� ����� ������
	  }

	  if (fr.markersave == 6) {  //���� ������ ��� ������ �������� �����
		  fr.markersave = 7;     //���������� �������� (�.�. �������� > �� 1)
		  fr.firstset = 0;       //��������� ��������� ��������� �������
		  fr.button13.setBackground(fr.savecolor[6]); //'³������� ���� ���� ������, �� ��� ������
		  //����� fr.button14_click(); '���������� ������ ��������
		  		if (fr.firstset == 0) new Save_Color().saveColor(fr); //�����'����� ������� ������ �������� �����
				if (fr.firstset == 0) fr.button14.setBackground(fr.blue);
				if (fr.firstset == 0) fr.markersave = 7; //������ � ������, ���������  savecolor(1)
				if (fr.firstset == 0) fr.firstset = 1; //������ �� �������������
				new Count().markerCount(fr); //ϳ��������� ���� ��� ������������ �������
				fr.vt = fr.markersave;
		  fr.markersave = 10;    //�������� 10 �� ������� ����� ������
	  }

	  if (fr.markersave == 7) {  //���� ������ ��� ������ �������� �����
		  fr.markersave = 0;     //���������� �������� (�.�. �������� > �� 1)
		  fr.firstset = 0;       //��������� ��������� ��������� �������
		  fr.button14.setBackground(fr.savecolor[7]); //'³������� ���� ���� ������, �� ��� ������
		  //����� fr.button7_click(); '���������� ������ ��������
		  		if (fr.firstset == 0) new Save_Color().saveColor(fr); //�����'����� ������� ������ �������� �����
				if (fr.firstset == 0) fr.button7.setBackground(fr.blue);
				if (fr.firstset == 0) fr.markersave = 0; //������ � ������, ���������  savecolor(1)
				if (fr.firstset == 0) fr.firstset = 1; //������ �� �������������
				new Count().markerCount(fr); //ϳ��������� ���� ��� ������������ �������
				fr.vt = fr.markersave;
		  fr.markersave = 10;    //�������� 10 �� ������� ����� ������
	  }
		
	fr.markersave = fr.vt;
	fr.n = 0;
	new Count().markerCount(fr);
	}
	

}
