public class Level_Count {
	
	public void levelCount(Form1 pr)
	{ //процес зсуву нумерації поточних ігрових рівнів
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
//	mainTimer.setDelay(time-=50);
	}
}
