public class Level_Count {
	
	private boolean increaseSpeed=true;
	
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
	
	
	if(increaseSpeed){
		speed(pr);
	}
	
	System.out.println(pr.time);
	}
	
	public void speed(Form1 pr){
		if(pr.time>0){
			pr.mainTimer.setDelay(pr.time-=10);
			}else{
			pr.time=0;
			}
	}
}
