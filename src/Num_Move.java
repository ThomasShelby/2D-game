public class Num_Move {
	public void numMove(Form1 fr) 
	{ //������ ��� ������������� ������� ������ �� ���������� ��������
	  //��� ���� ������ ������ ����
			for (int i=0; i<8; i++)
		{
		fr.field[4][i] = fr.field[3][i];
		fr.field[3][i] = fr.field[2][i];
		fr.field[2][i] = fr.field[1][i];
		fr.field[1][i] = fr.field[0][i];
		}	
			
		//� ����� ������ filed5 ��������� ������ ���������� ���������� ���������� �����
		upStrApp(fr);
				
		fr.Field_Fill();
	}
	

	public void upStrApp(Form1 fr) 
	{
		//� ����� ������ filed5 ��������� ������ ���������� ���������� ���������� �����
			for (int j=0; j<8; j++)
		{
			fr.field[0][j] = (int)(19*Math.random()); //������ ��������� ����� = 0 �� 19
		}
	}

}
