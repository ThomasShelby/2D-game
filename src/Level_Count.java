public class Level_Count {
	
	public void levelCount(Form1 pr)
	{ //������ ����� ��������� �������� ������� ����
	pr.cs = "";
	pr.le[0] += 1;
	pr.cs = pr.cs + pr.le[0];
	pr.button6.setText(pr.cs);

	pr.cs = "";
	pr.le[1] += 1;
	pr.cs = pr.cs + pr.le[1];
	pr.button5.setText(pr.cs);

	pr.cs = "";
	pr.le[2] += 1;
	pr.cs = pr.cs + pr.le[2];
	pr.button4.setText(pr.cs);

	pr.cs = "";
	pr.le[3] += 1;
	pr.cs = pr.cs + pr.le[3];
	pr.button3.setText(pr.cs);

	pr.cs = "";
	pr.le[4] += 1;
	pr.cs = pr.cs + pr.le[4];
	pr.button2.setText(pr.cs);
	
/*	if(pr.time>0){
	pr.mainTimer.setDelay(pr.time-=50);
	}else{
	pr.time=0;
	}
	System.out.println(pr.time);
*/	}
}
