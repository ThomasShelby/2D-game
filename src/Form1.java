import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.Timer;


public class Form1 implements ActionListener{

	private JFrame frmMYaremchukGame;
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	JButton button5 = new JButton();
	JButton button6 = new JButton();
	JButton button7 = new JButton();
	JButton button8 = new JButton();
	JButton button9 = new JButton();
	JButton button10 = new JButton();
	JButton button11 = new JButton();
	JButton button12 = new JButton();
	JButton button13 = new JButton();
	JButton button14 = new JButton();
	JButton button15 = new JButton();
	JButton button16 = new JButton();
	JButton button17 = new JButton();
	JButton button18 = new JButton();
	JButton button19 = new JButton();
	JButton button20 = new JButton();
	JButton button21 = new JButton();
	JButton button22 = new JButton();
	JButton button23 = new JButton();
	JButton button24 = new JButton();
	JButton button25 = new JButton();
	JButton button26 = new JButton();
	JButton button27 = new JButton();
	JButton button28 = new JButton();
	JButton button29 = new JButton();
	JButton button30 = new JButton();
	JButton button31 = new JButton();
	JButton button32 = new JButton();
	JButton button33 = new JButton();
	JButton button34 = new JButton();
	JButton button35 = new JButton();
	JButton button36 = new JButton();
	JButton button37 = new JButton();
	JButton button38 = new JButton();
	JButton button39 = new JButton();
	JButton button40 = new JButton();
	JButton button41 = new JButton();
	JButton button42 = new JButton();
	JButton button43 = new JButton();
	JButton button44 = new JButton();
	JButton button45 = new JButton();
	JButton button46 = new JButton();
	JButton button47 = new JButton();
	JButton button48 = new JButton();
	JButton button49 = new JButton();
	JButton button50 = new JButton();
	JButton button51 = new JButton();
	JButton button52 = new JButton();
	JButton button53 = new JButton();
	JButton button54 = new JButton();
	JButton button55 = new JButton();
	JButton button56 = new JButton();
	
	public int level[] = new int[4]; //����� ��� Level
	public int field5[] = new int[8]; //����� ��� �������� ���� ��� ���� 5 (��������� �����)
	public int field4[] = new int[8]; //����� ��� �������� ���� ��� ���� 4
	public int field3[] = new int[8]; //����� ��� �������� ���� ��� ���� 3
	public int field2[] = new int[8]; //����� ��� �������� ���� ��� ���� 2
	public int field1[] = new int[8]; //����� ��� �������� ���� ��� ���� 1
    public int NCounter = 0; //�������� ��������� ����
    public int RndE; //����� ��� ���������� �����	
    public int i;
    public int n;
    public int m; //��� ��������� ����
    public int keyCode;
    public int vt;
    public int le[] = new int[5]; //��� ��������� ���� Level
    
    Timer mainTimer = new Timer(1000, this);
	
	public char c;
	
	public String cs = ""; //����� ��� ������ � button

	Color black = new Color(0x000000); //���� ������� �������� ������, ������ "T", "P" �� "B"
	Color white = new Color(0xffffff); //���� ������� ������ "Z" �� "End"
	
	Color plus1 = new Color(0xfffacd); //��� �������� ������
	Color plusT = new Color(0x32cd32); //��� ��������� ������ "T"
	Color plusP = new Color(0x7b68ee); //��� ��������� ������ "P"
	Color plusB = new Color(0xffff00); //��� ��������� ������ "B"
	Color plusZ = new Color(0x000000); //��� ������ "Z"
	Color plusEnd = new Color(0xff0000); //��� ������ "End"
	Color blue = new Color(0x0000FF); //��� ��� �������
	
	Color dg; //��� �������� ������� ������� ����
	Color dk; //��� �������� ������� ������� �������

	public Color savecolor[] = new Color[8]; //����� ��� ���������� ������� �������� �����

    public int firstset; //������� - ����������� ������ = 1, ���� = 0, �� �� �����������
    public int markersave; //������ � ��� ������ ����� ����� ������
	
	public int et; //� �� ����� ������ ������� ���������� ����������� ������� ������ field1[]

	
	public int i56;
	public String c56 = "";
	public int IndLent; //������� ������� ����������� ������� ����������
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form1 window = new Form1();
					window.frmMYaremchukGame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Form1() {
		initialize();
		
//		mainTimer.start();
		
        RndE = (int)(400*Math.random()); //������ ��������� ����� = 0 �� 400 ��� ����������� ������ �������
        NCounter = RndE; //��������� �������� �������
		firstset = 0; //������� - ������ �� �� �����������
		//���������� ������ ������ filed1 - filed5 ���������� ���������� ���������� �����
				for (int i=0; i<8; i++)
		{
					field1[i] = (int)(19*Math.random()); //������ ��������� ����� = 0 �� 19
					field2[i] = (int)(19*Math.random()); //������ ��������� ����� = 0 �� 19
					field3[i] = (int)(19*Math.random()); //������ ��������� ����� = 0 �� 19
					field4[i] = (int)(19*Math.random()); //������ ��������� ����� = 0 �� 19
					field5[i] = (int)(19*Math.random()); //������ ��������� ����� = 0 �� 19
		}
//			fdraw(); //���������� �������� ������ - ��� ������������
		Field_Fill(); //��������� ������ �������� ���� ����������
		IndLent = 0; //������� ������� ����������� ���������� �����������
		
		
		le[0] = 1; //�������� ��������� �������� ��� ���� Level
		le[1] = 2;
		le[2] = 3;
		le[3] = 4;
		le[4] = 5;
	}

    public void fdraw() 
	{ //���������� �������� ������ field1 - field5 � ������
	  //��� ��������������� ���������� ������
		cs = cs + field1[0];
		button15.setText(cs);
		cs = "";
		cs = cs + field1[1];
		button16.setText(cs);
		cs = "";
		cs = cs + field1[2];
		button17.setText(cs);
		cs = "";
		cs = cs + field1[3];
		button18.setText(cs);
		cs = "";
		cs = cs + field1[4];
		button19.setText(cs);
		cs = "";
		cs = cs + field1[5];
		button20.setText(cs);
		cs = "";
		cs = cs + field1[6];
		button21.setText(cs);
		cs = "";
		cs = cs + field1[7];
		button22.setText(cs);
	
	}
	
    public void Color_Chars(int i) 
	{ //�� ���������� �������� ������ field1 - field5 ��������� �������� �� ������
	  //������ �� �������� �� � button56

		if (field1[i] == 0) button56.setText("+1");
		if (field1[i] == 0) button56.setBackground(plus1);
		if (field1[i] == 0) button56.setForeground(black);
	
		if (field1[i] == 1) button56.setText("-1");
		if (field1[i] == 1) button56.setBackground(plus1);
		if (field1[i] == 1) button56.setForeground(black);
	
		if (field1[i] == 2) button56.setText("+5");
		if (field1[i] == 2) button56.setBackground(plus1);
		if (field1[i] == 2) button56.setForeground(black);
	
		if (field1[i] == 3) button56.setText("-5");
		if (field1[i] == 3) button56.setBackground(plus1);
		if (field1[i] == 3) button56.setForeground(black);
	
		if (field1[i] == 4) button56.setText("+10");
		if (field1[i] == 4) button56.setBackground(plus1);
		if (field1[i] == 4) button56.setForeground(black);
	
		if (field1[i] == 5) button56.setText("-10");
		if (field1[i] == 5) button56.setBackground(plus1);
		if (field1[i] == 5) button56.setForeground(black);
	
		if (field1[i] == 6) button56.setText("+15");
		if (field1[i] == 6) button56.setBackground(plus1);
		if (field1[i] == 6) button56.setForeground(black);
	
		if (field1[i] == 7) button56.setText("-15");
		if (field1[i] == 7) button56.setBackground(plus1);
		if (field1[i] == 7) button56.setForeground(black);
	
		if (field1[i] == 8) button56.setText("+25");
		if (field1[i] == 8) button56.setBackground(plus1);
		if (field1[i] == 8) button56.setForeground(black);
	
		if (field1[i] == 9) button56.setText("T");
		if (field1[i] == 9) button56.setBackground(plusT);
		if (field1[i] == 9) button56.setForeground(black);
	
		if (field1[i] == 10) button56.setText("P");
		if (field1[i] == 10) button56.setBackground(plusP);
		if (field1[i] == 10) button56.setForeground(black);

		if (field1[i] == 11) button56.setText("B");
		if (field1[i] == 11) button56.setBackground(plusB);
		if (field1[i] == 11) button56.setForeground(black);

		if (field1[i] == 12) button56.setText("Z");
		if (field1[i] == 12) button56.setBackground(plusZ);
		if (field1[i] == 12) button56.setForeground(white);
	
		if (field1[i] == 13) button56.setText("Z");
		if (field1[i] == 13) button56.setBackground(plusZ);
		if (field1[i] == 13) button56.setForeground(white);
	
		if (field1[i] == 14) button56.setText("End");
		if (field1[i] == 14) button56.setBackground(plusEnd);
		if (field1[i] == 14) button56.setForeground(white);
	
		if (field1[i] == 15) button56.setText("-10");
		if (field1[i] == 15) button56.setBackground(plus1);
		if (field1[i] == 15) button56.setForeground(black);

		if (field1[i] == 16) button56.setText("-5");
		if (field1[i] == 16) button56.setBackground(plus1);
		if (field1[i] == 16) button56.setForeground(black);

		if (field1[i] == 17) button56.setText("-1");
		if (field1[i] == 17) button56.setBackground(plus1);
		if (field1[i] == 17) button56.setForeground(black);

		if (field1[i] == 18) button56.setText("+1");
		if (field1[i] == 18) button56.setBackground(plus1);
		if (field1[i] == 18) button56.setForeground(black);
	
		if (field1[i] == 19) button56.setText("+5");
		if (field1[i] == 19) button56.setBackground(plus1);
		if (field1[i] == 19) button56.setForeground(black);
				

	}

    public void Color_Chars2(int i) 
	{ //�� ���������� �������� ������ field1 - field5 ��������� �������� �� ������
  	  //������ �� �������� �� � button56

		if (field2[i] == 0) button56.setText("+1");
		if (field2[i] == 0) button56.setBackground(plus1);
		if (field2[i] == 0) button56.setForeground(black);
	
		if (field2[i] == 1) button56.setText("-1");
		if (field2[i] == 1) button56.setBackground(plus1);
		if (field2[i] == 1) button56.setForeground(black);
	
		if (field2[i] == 2) button56.setText("+5");
		if (field2[i] == 2) button56.setBackground(plus1);
		if (field2[i] == 2) button56.setForeground(black);
	
		if (field2[i] == 3) button56.setText("-5");
		if (field2[i] == 3) button56.setBackground(plus1);
		if (field2[i] == 3) button56.setForeground(black);
	
		if (field2[i] == 4) button56.setText("+10");
		if (field2[i] == 4) button56.setBackground(plus1);
		if (field2[i] == 4) button56.setForeground(black);
	
		if (field2[i] == 5) button56.setText("-10");
		if (field2[i] == 5) button56.setBackground(plus1);
		if (field2[i] == 5) button56.setForeground(black);
	
		if (field2[i] == 6) button56.setText("+15");
		if (field2[i] == 6) button56.setBackground(plus1);
		if (field2[i] == 6) button56.setForeground(black);
	
		if (field2[i] == 7) button56.setText("-15");
		if (field2[i] == 7) button56.setBackground(plus1);
		if (field2[i] == 7) button56.setForeground(black);
	
		if (field2[i] == 8) button56.setText("+25");
		if (field2[i] == 8) button56.setBackground(plus1);
		if (field2[i] == 8) button56.setForeground(black);
	
		if (field2[i] == 9) button56.setText("T");
		if (field2[i] == 9) button56.setBackground(plusT);
		if (field2[i] == 9) button56.setForeground(black);
	
		if (field2[i] == 10) button56.setText("P");
		if (field2[i] == 10) button56.setBackground(plusP);
		if (field2[i] == 10) button56.setForeground(black);

		if (field2[i] == 11) button56.setText("B");
		if (field2[i] == 11) button56.setBackground(plusB);
		if (field2[i] == 11) button56.setForeground(black);

		if (field2[i] == 12) button56.setText("Z");
		if (field2[i] == 12) button56.setBackground(plusZ);
		if (field2[i] == 12) button56.setForeground(white);
	
		if (field2[i] == 13) button56.setText("Z");
		if (field2[i] == 13) button56.setBackground(plusZ);
		if (field2[i] == 13) button56.setForeground(white);
	
		if (field2[i] == 14) button56.setText("End");
		if (field2[i] == 14) button56.setBackground(plusEnd);
		if (field2[i] == 14) button56.setForeground(white);
	
		if (field2[i] == 15) button56.setText("-10");
		if (field2[i] == 15) button56.setBackground(plus1);
		if (field2[i] == 15) button56.setForeground(black);

		if (field2[i] == 16) button56.setText("-5");
		if (field2[i] == 16) button56.setBackground(plus1);
		if (field2[i] == 16) button56.setForeground(black);

		if (field2[i] == 17) button56.setText("-1");
		if (field2[i] == 17) button56.setBackground(plus1);
		if (field2[i] == 17) button56.setForeground(black);

		if (field2[i] == 18) button56.setText("+1");
		if (field2[i] == 18) button56.setBackground(plus1);
		if (field2[i] == 18) button56.setForeground(black);
	
		if (field2[i] == 19) button56.setText("+5");
		if (field2[i] == 19) button56.setBackground(plus1);
		if (field2[i] == 19) button56.setForeground(black);
				

	}


    public void Color_Chars3(int i) 
	{ //�� ���������� �������� ������ field1 - field5 ��������� �������� �� ������
  	  //������ �� �������� �� � button56

		if (field3[i] == 0) button56.setText("+1");
		if (field3[i] == 0) button56.setBackground(plus1);
		if (field3[i] == 0) button56.setForeground(black);
	
		if (field3[i] == 1) button56.setText("-1");
		if (field3[i] == 1) button56.setBackground(plus1);
		if (field3[i] == 1) button56.setForeground(black);
	
		if (field3[i] == 2) button56.setText("+5");
		if (field3[i] == 2) button56.setBackground(plus1);
		if (field3[i] == 2) button56.setForeground(black);
	
		if (field3[i] == 3) button56.setText("-5");
		if (field3[i] == 3) button56.setBackground(plus1);
		if (field3[i] == 3) button56.setForeground(black);
	
		if (field3[i] == 4) button56.setText("+10");
		if (field3[i] == 4) button56.setBackground(plus1);
		if (field3[i] == 4) button56.setForeground(black);
	
		if (field3[i] == 5) button56.setText("-10");
		if (field3[i] == 5) button56.setBackground(plus1);
		if (field3[i] == 5) button56.setForeground(black);
	
		if (field3[i] == 6) button56.setText("+15");
		if (field3[i] == 6) button56.setBackground(plus1);
		if (field3[i] == 6) button56.setForeground(black);
	
		if (field3[i] == 7) button56.setText("-15");
		if (field3[i] == 7) button56.setBackground(plus1);
		if (field3[i] == 7) button56.setForeground(black);
	
		if (field3[i] == 8) button56.setText("+25");
		if (field3[i] == 8) button56.setBackground(plus1);
		if (field3[i] == 8) button56.setForeground(black);
	
		if (field3[i] == 9) button56.setText("T");
		if (field3[i] == 9) button56.setBackground(plusT);
		if (field3[i] == 9) button56.setForeground(black);
	
		if (field3[i] == 10) button56.setText("P");
		if (field3[i] == 10) button56.setBackground(plusP);
		if (field3[i] == 10) button56.setForeground(black);

		if (field3[i] == 11) button56.setText("B");
		if (field3[i] == 11) button56.setBackground(plusB);
		if (field3[i] == 11) button56.setForeground(black);

		if (field3[i] == 12) button56.setText("Z");
		if (field3[i] == 12) button56.setBackground(plusZ);
		if (field3[i] == 12) button56.setForeground(white);
	
		if (field3[i] == 13) button56.setText("Z");
		if (field3[i] == 13) button56.setBackground(plusZ);
		if (field3[i] == 13) button56.setForeground(white);
	
		if (field3[i] == 14) button56.setText("End");
		if (field3[i] == 14) button56.setBackground(plusEnd);
		if (field3[i] == 14) button56.setForeground(white);
	
		if (field3[i] == 15) button56.setText("-10");
		if (field3[i] == 15) button56.setBackground(plus1);
		if (field3[i] == 15) button56.setForeground(black);

		if (field3[i] == 16) button56.setText("-5");
		if (field3[i] == 16) button56.setBackground(plus1);
		if (field3[i] == 16) button56.setForeground(black);

		if (field3[i] == 17) button56.setText("-1");
		if (field3[i] == 17) button56.setBackground(plus1);
		if (field3[i] == 17) button56.setForeground(black);

		if (field3[i] == 18) button56.setText("+1");
		if (field3[i] == 18) button56.setBackground(plus1);
		if (field3[i] == 18) button56.setForeground(black);
	
		if (field3[i] == 19) button56.setText("+5");
		if (field3[i] == 19) button56.setBackground(plus1);
		if (field3[i] == 19) button56.setForeground(black);
				

	}


    public void Color_Chars4(int i) 
	{ //�� ���������� �������� ������ field1 - field5 ��������� �������� �� ������
  	  //������ �� �������� �� � button56

		if (field4[i] == 0) button56.setText("+1");
		if (field4[i] == 0) button56.setBackground(plus1);
		if (field4[i] == 0) button56.setForeground(black);
	
		if (field4[i] == 1) button56.setText("-1");
		if (field4[i] == 1) button56.setBackground(plus1);
		if (field4[i] == 1) button56.setForeground(black);
	
		if (field4[i] == 2) button56.setText("+5");
		if (field4[i] == 2) button56.setBackground(plus1);
		if (field4[i] == 2) button56.setForeground(black);
	
		if (field4[i] == 3) button56.setText("-5");
		if (field4[i] == 3) button56.setBackground(plus1);
		if (field4[i] == 3) button56.setForeground(black);
	
		if (field4[i] == 4) button56.setText("+10");
		if (field4[i] == 4) button56.setBackground(plus1);
		if (field4[i] == 4) button56.setForeground(black);
	
		if (field4[i] == 5) button56.setText("-10");
		if (field4[i] == 5) button56.setBackground(plus1);
		if (field4[i] == 5) button56.setForeground(black);
	
		if (field4[i] == 6) button56.setText("+15");
		if (field4[i] == 6) button56.setBackground(plus1);
		if (field4[i] == 6) button56.setForeground(black);
	
		if (field4[i] == 7) button56.setText("-15");
		if (field4[i] == 7) button56.setBackground(plus1);
		if (field4[i] == 7) button56.setForeground(black);
	
		if (field4[i] == 8) button56.setText("+25");
		if (field4[i] == 8) button56.setBackground(plus1);
		if (field4[i] == 8) button56.setForeground(black);
	
		if (field4[i] == 9) button56.setText("T");
		if (field4[i] == 9) button56.setBackground(plusT);
		if (field4[i] == 9) button56.setForeground(black);
	
		if (field4[i] == 10) button56.setText("P");
		if (field4[i] == 10) button56.setBackground(plusP);
		if (field4[i] == 10) button56.setForeground(black);

		if (field4[i] == 11) button56.setText("B");
		if (field4[i] == 11) button56.setBackground(plusB);
		if (field4[i] == 11) button56.setForeground(black);

		if (field4[i] == 12) button56.setText("Z");
		if (field4[i] == 12) button56.setBackground(plusZ);
		if (field4[i] == 12) button56.setForeground(white);
	
		if (field4[i] == 13) button56.setText("Z");
		if (field4[i] == 13) button56.setBackground(plusZ);
		if (field4[i] == 13) button56.setForeground(white);
	
		if (field4[i] == 14) button56.setText("End");
		if (field4[i] == 14) button56.setBackground(plusEnd);
		if (field4[i] == 14) button56.setForeground(white);
	
		if (field4[i] == 15) button56.setText("-10");
		if (field4[i] == 15) button56.setBackground(plus1);
		if (field4[i] == 15) button56.setForeground(black);

		if (field4[i] == 16) button56.setText("-5");
		if (field4[i] == 16) button56.setBackground(plus1);
		if (field4[i] == 16) button56.setForeground(black);

		if (field4[i] == 17) button56.setText("-1");
		if (field4[i] == 17) button56.setBackground(plus1);
		if (field4[i] == 17) button56.setForeground(black);

		if (field4[i] == 18) button56.setText("+1");
		if (field4[i] == 18) button56.setBackground(plus1);
		if (field4[i] == 18) button56.setForeground(black);
	
		if (field4[i] == 19) button56.setText("+5");
		if (field4[i] == 19) button56.setBackground(plus1);
		if (field4[i] == 19) button56.setForeground(black);
				

	}


    public void Color_Chars5(int i) 
	{ //�� ���������� �������� ������ field1 - field5 ��������� �������� �� ������
  	  //������ �� �������� �� � button56

		if (field5[i] == 0) button56.setText("+1");
		if (field5[i] == 0) button56.setBackground(plus1);
		if (field5[i] == 0) button56.setForeground(black);
	
		if (field5[i] == 1) button56.setText("-1");
		if (field5[i] == 1) button56.setBackground(plus1);
		if (field5[i] == 1) button56.setForeground(black);
	
		if (field5[i] == 2) button56.setText("+5");
		if (field5[i] == 2) button56.setBackground(plus1);
		if (field5[i] == 2) button56.setForeground(black);
	
		if (field5[i] == 3) button56.setText("-5");
		if (field5[i] == 3) button56.setBackground(plus1);
		if (field5[i] == 3) button56.setForeground(black);
	
		if (field5[i] == 4) button56.setText("+10");
		if (field5[i] == 4) button56.setBackground(plus1);
		if (field5[i] == 4) button56.setForeground(black);
	
		if (field5[i] == 5) button56.setText("-10");
		if (field5[i] == 5) button56.setBackground(plus1);
		if (field5[i] == 5) button56.setForeground(black);
	
		if (field5[i] == 6) button56.setText("+15");
		if (field5[i] == 6) button56.setBackground(plus1);
		if (field5[i] == 6) button56.setForeground(black);
	
		if (field5[i] == 7) button56.setText("-15");
		if (field5[i] == 7) button56.setBackground(plus1);
		if (field5[i] == 7) button56.setForeground(black);
	
		if (field5[i] == 8) button56.setText("+25");
		if (field5[i] == 8) button56.setBackground(plus1);
		if (field5[i] == 8) button56.setForeground(black);
	
		if (field5[i] == 9) button56.setText("T");
		if (field5[i] == 9) button56.setBackground(plusT);
		if (field5[i] == 9) button56.setForeground(black);
	
		if (field5[i] == 10) button56.setText("P");
		if (field5[i] == 10) button56.setBackground(plusP);
		if (field5[i] == 10) button56.setForeground(black);

		if (field5[i] == 11) button56.setText("B");
		if (field5[i] == 11) button56.setBackground(plusB);
		if (field5[i] == 11) button56.setForeground(black);

		if (field5[i] == 12) button56.setText("Z");
		if (field5[i] == 12) button56.setBackground(plusZ);
		if (field5[i] == 12) button56.setForeground(white);
	
		if (field5[i] == 13) button56.setText("Z");
		if (field5[i] == 13) button56.setBackground(plusZ);
		if (field5[i] == 13) button56.setForeground(white);
	
		if (field5[i] == 14) button56.setText("End");
		if (field5[i] == 14) button56.setBackground(plusEnd);
		if (field5[i] == 14) button56.setForeground(white);
	
		if (field5[i] == 15) button56.setText("-10");
		if (field5[i] == 15) button56.setBackground(plus1);
		if (field5[i] == 15) button56.setForeground(black);

		if (field5[i] == 16) button56.setText("-5");
		if (field5[i] == 16) button56.setBackground(plus1);
		if (field5[i] == 16) button56.setForeground(black);

		if (field5[i] == 17) button56.setText("-1");
		if (field5[i] == 17) button56.setBackground(plus1);
		if (field5[i] == 17) button56.setForeground(black);

		if (field5[i] == 18) button56.setText("+1");
		if (field5[i] == 18) button56.setBackground(plus1);
		if (field5[i] == 18) button56.setForeground(black);
	
		if (field5[i] == 19) button56.setText("+5");
		if (field5[i] == 19) button56.setBackground(plus1);
		if (field5[i] == 19) button56.setForeground(black);
				

	}


	public void Field_Fill() 
	{ //������ ��������� ������� �� �������� � "�������" button56
	  //� ������ �������� ���� button7 - button46
						for (int i=0; i<8; i++)
		{
			Color_Chars(i); //�������� ������ �� �������� ������ � button56
			cs = button56.getText(); //�������� ������ � button56 � ����� cs
			if (i == 0) button7.setText(cs);
			if (i == 1) button8.setText(cs);
			if (i == 2) button9.setText(cs);
			if (i == 3) button10.setText(cs);
			if (i == 4) button11.setText(cs);
			if (i == 5) button12.setText(cs);
			if (i == 6) button13.setText(cs);
			if (i == 7) button14.setText(cs);
			
			dg = button56.getBackground(); //�������� BackColor � button56 � ����� dg
			if (i == 0) button7.setBackground(dg);
			if (i == 1) button8.setBackground(dg);
			if (i == 2) button9.setBackground(dg);
			if (i == 3) button10.setBackground(dg);
			if (i == 4) button11.setBackground(dg);
			if (i == 5) button12.setBackground(dg);
			if (i == 6) button13.setBackground(dg);
			if (i == 7) button14.setBackground(dg);

			dk = button56.getForeground(); //�������� ForeColor � button56 � ����� dk
			if (i == 0) button7.setForeground(dk);
			if (i == 1) button8.setForeground(dk);
			if (i == 2) button9.setForeground(dk);
			if (i == 3) button10.setForeground(dk);
			if (i == 4) button11.setForeground(dk);
			if (i == 5) button12.setForeground(dk);
			if (i == 6) button13.setForeground(dk);
			if (i == 7) button14.setForeground(dk);

	cs = "";

	//------------------------------------------
	
			Color_Chars2(i); //�������� ������ �� �������� ������ � button56
			cs = button56.getText(); //�������� ������ � button56 � ����� cs
			if (i == 0) button15.setText(cs);
			if (i == 1) button16.setText(cs);
			if (i == 2) button17.setText(cs);
			if (i == 3) button18.setText(cs);
			if (i == 4) button19.setText(cs);
			if (i == 5) button20.setText(cs);
			if (i == 6) button21.setText(cs);
			if (i == 7) button22.setText(cs);
			
			dg = button56.getBackground(); //�������� BackColor � button56 � ����� dg
			if (i == 0) button15.setBackground(dg);
			if (i == 1) button16.setBackground(dg);
			if (i == 2) button17.setBackground(dg);
			if (i == 3) button18.setBackground(dg);
			if (i == 4) button19.setBackground(dg);
			if (i == 5) button20.setBackground(dg);
			if (i == 6) button21.setBackground(dg);
			if (i == 7) button22.setBackground(dg);

			dk = button56.getForeground(); //�������� ForeColor � button56 � ����� dk
			if (i == 0) button15.setForeground(dk);
			if (i == 1) button16.setForeground(dk);
			if (i == 2) button17.setForeground(dk);
			if (i == 3) button18.setForeground(dk);
			if (i == 4) button19.setForeground(dk);
			if (i == 5) button20.setForeground(dk);
			if (i == 6) button21.setForeground(dk);
			if (i == 7) button22.setForeground(dk);

	cs = "";

	//------------------------------------------
	
			Color_Chars3(i); //�������� ������ �� �������� ������ � button56
			cs = button56.getText(); //�������� ������ � button56 � ����� cs
			if (i == 0) button23.setText(cs);
			if (i == 1) button24.setText(cs);
			if (i == 2) button25.setText(cs);
			if (i == 3) button26.setText(cs);
			if (i == 4) button27.setText(cs);
			if (i == 5) button28.setText(cs);
			if (i == 6) button29.setText(cs);
			if (i == 7) button30.setText(cs);
			
			dg = button56.getBackground(); //�������� BackColor � button56 � ����� dg
			if (i == 0) button23.setBackground(dg);
			if (i == 1) button24.setBackground(dg);
			if (i == 2) button25.setBackground(dg);
			if (i == 3) button26.setBackground(dg);
			if (i == 4) button27.setBackground(dg);
			if (i == 5) button28.setBackground(dg);
			if (i == 6) button29.setBackground(dg);
			if (i == 7) button30.setBackground(dg);

			dk = button56.getForeground(); //�������� ForeColor � button56 � ����� dk
			if (i == 0) button23.setForeground(dk);
			if (i == 1) button24.setForeground(dk);
			if (i == 2) button25.setForeground(dk);
			if (i == 3) button26.setForeground(dk);
			if (i == 4) button27.setForeground(dk);
			if (i == 5) button28.setForeground(dk);
			if (i == 6) button29.setForeground(dk);
			if (i == 7) button30.setForeground(dk);

	cs = "";

	//------------------------------------------
	
			Color_Chars4(i); //�������� ������ �� �������� ������ � button56
			cs = button56.getText(); //�������� ������ � button56 � ����� cs
			if (i == 0) button31.setText(cs);
			if (i == 1) button32.setText(cs);
			if (i == 2) button33.setText(cs);
			if (i == 3) button34.setText(cs);
			if (i == 4) button35.setText(cs);
			if (i == 5) button36.setText(cs);
			if (i == 6) button37.setText(cs);
			if (i == 7) button38.setText(cs);
			
			dg = button56.getBackground(); //�������� BackColor � button56 � ����� dg
			if (i == 0) button31.setBackground(dg);
			if (i == 1) button32.setBackground(dg);
			if (i == 2) button33.setBackground(dg);
			if (i == 3) button34.setBackground(dg);
			if (i == 4) button35.setBackground(dg);
			if (i == 5) button36.setBackground(dg);
			if (i == 6) button37.setBackground(dg);
			if (i == 7) button38.setBackground(dg);

			dk = button56.getForeground(); //�������� ForeColor � button56 � ����� dk
			if (i == 0) button31.setForeground(dk);
			if (i == 1) button32.setForeground(dk);
			if (i == 2) button33.setForeground(dk);
			if (i == 3) button34.setForeground(dk);
			if (i == 4) button35.setForeground(dk);
			if (i == 5) button36.setForeground(dk);
			if (i == 6) button37.setForeground(dk);
			if (i == 7) button38.setForeground(dk);

	cs = "";

	//------------------------------------------
	
			Color_Chars5(i); //�������� ������ �� �������� ������ � button56
			cs = button56.getText(); //�������� ������ � button56 � ����� cs
			if (i == 0) button39.setText(cs);
			if (i == 1) button40.setText(cs);
			if (i == 2) button41.setText(cs);
			if (i == 3) button42.setText(cs);
			if (i == 4) button43.setText(cs);
			if (i == 5) button44.setText(cs);
			if (i == 6) button45.setText(cs);
			if (i == 7) button46.setText(cs);
			
			dg = button56.getBackground(); //�������� BackColor � button56 � ����� dg
			if (i == 0) button39.setBackground(dg);
			if (i == 1) button40.setBackground(dg);
			if (i == 2) button41.setBackground(dg);
			if (i == 3) button42.setBackground(dg);
			if (i == 4) button43.setBackground(dg);
			if (i == 5) button44.setBackground(dg);
			if (i == 6) button45.setBackground(dg);
			if (i == 7) button46.setBackground(dg);

			dk = button56.getForeground(); //�������� ForeColor � button56 � ����� dk
			if (i == 0) button39.setForeground(dk);
			if (i == 1) button40.setForeground(dk);
			if (i == 2) button41.setForeground(dk);
			if (i == 3) button42.setForeground(dk);
			if (i == 4) button43.setForeground(dk);
			if (i == 5) button44.setForeground(dk);
			if (i == 6) button45.setForeground(dk);
			if (i == 7) button46.setForeground(dk);

	cs = "";

			}
	}

	public void Num_Move() 
	{ //������ ��� ������������� ������� ������ �� ���������� ��������
	  //��� ���� ������ ������ ����
			for (int i=0; i<8; i++)
		{
		field1[i] = field2[i];
		field2[i] = field3[i];
		field3[i] = field4[i];
		field4[i] = field5[i];
		}	
			
		//� ����� ������ filed5 ��������� ������ ���������� ���������� ���������� �����
		Up_Str_App();
				
		
		Field_Fill(); //���������� �� ����� ������� �� �������� �������� ������

	}

	public void Up_Str_App() 
	{
		//� ����� ������ filed5 ��������� ������ ���������� ���������� ���������� �����
			for (int j=0; j<8; j++)
		{
			field5[j] = (int)(19*Math.random()); //������ ��������� ����� = 0 �� 19
		}
	}

	
	public void Save_Color() 
	{
		//���������� ���������� �������� ��� ������ �������� ����� 

		savecolor[0] = button7.getBackground();
		savecolor[1] = button8.getBackground();
		savecolor[2] = button9.getBackground();
		savecolor[3] = button10.getBackground();
		savecolor[4] = button11.getBackground();
		savecolor[5] = button12.getBackground();
		savecolor[6] = button13.getBackground();
		savecolor[7] = button14.getBackground();
	
	}
	
	public void Marker_Reset()
	{ //³��������� ������� ������� ���� ������� ������ �������� ���� ������-����
		
	if (markersave == 0) button7.setBackground(blue); //³������� ���� ���� ������
	if (markersave == 1) button8.setBackground(blue);	
	if (markersave == 2) button9.setBackground(blue);	
	if (markersave == 3) button10.setBackground(blue);	
	if (markersave == 4) button11.setBackground(blue);	
	if (markersave == 5) button12.setBackground(blue);	
	if (markersave == 6) button13.setBackground(blue);	
	if (markersave == 7) button14.setBackground(blue);	
	}
	
	public void Marker_Count()
	{//ϳ�������� ���� ��� ������������ �������
	
		if (n == 0) {
			if (markersave == 0) et = field1[0]; //������ � ��� ������ ������
			if (markersave == 1) et = field1[1];
			if (markersave == 2) et = field1[2];
			if (markersave == 3) et = field1[3];
			if (markersave == 4) et = field1[4];
			if (markersave == 5) et = field1[5];
			if (markersave == 6) et = field1[6];
			if (markersave == 7) et = field1[7]; //������ � ����� ������ ������
			
			//�������� �������
			cs = "";
			if (et == 0) m = m + 1;
			if (et == 1) m = m - 1;
			if (et == 2) m = m + 5;
			if (et == 3) m = m - 5;
			if (et == 4) m = m + 10;
			if (et == 5) m = m - 10;
			if (et == 6) m = m + 15;
			if (et == 7) m = m - 15;
			if (et == 8) m = m + 25;
			if (et == 9) m = m + 500;
			if (et == 10) m = m + 100;
			if (et == 11) m = m - 200;
			if (et == 12) m = 0;
			if (et == 13) m = 0;
			if (et == 14) System.exit(0);
			if (et == 15) m = m - 10;
			if (et == 16) m = m - 5;
			if (et == 17) m = m - 1;
			if (et == 18) m = m + 1;
			if (et == 19) m = m + 50;
			if (et == 20) m = m - 25;
			cs = cs + m;
			button48.setText(cs);
			n = 1; //������ �� �������������
		}
		mainTimer.start(); //��������� ������ ������� �� ������� ����������
	}
	
	public void Dn_Count()
	{ //ϳ�������� ���� ��� ���� ����� �������� ���� ������ ����
	n = 0;  //��������� ��������� ������ ������� Set_Marker_Count
	Marker_Count(); //������ ��������� ���� ��� ����������� �������
	Level_Count(); //������� ��������� ���� Level
	}

	public void Print_Ind()
	{ //���������� ���������� ������ ���������
		if (IndLent == 1) button55.setVisible(false);
		if (IndLent == 2) button54.setVisible(false);
		if (IndLent == 3) button53.setVisible(false);
		if (IndLent == 4) button52.setVisible(false);
		if (IndLent == 5) button51.setVisible(false);
		if (IndLent == 6) button50.setVisible(false);
		if (IndLent == 7) button49.setVisible(false);

		if (IndLent == 0) {
			button55.setVisible(true); //���������� �� �������� ����������
			button54.setVisible(true); //���������� �� �������� ����������
			button53.setVisible(true); //���������� �� �������� ����������
			button52.setVisible(true); //���������� �� �������� ����������
			button51.setVisible(true); //���������� �� �������� ����������
			button50.setVisible(true); //���������� �� �������� ����������
			button49.setVisible(true); //���������� �� �������� ����������
			
		}
	}
	

  public void Move_Point_Left()
	{ //���������� ������ ������
	  if (markersave == 0) {  //���� ������ ��� ������ �������� �����
		  markersave = 7;     //˳��� ������� ��� ������ � ������ ����� (�������� �������)
		  firstset = 0;       //��������� ��������� ��������� �������
		  button7.setBackground(savecolor[0]); //'³������� ���� ���� ������, �� ��� ������
		  //����� button14_click(); '���������� ������ (������ ����� ������!)
		  		if (firstset == 0) Save_Color(); //��������� ������� ������ �������� �����
				if (firstset == 0) button14.setBackground(blue);
				if (firstset == 0) markersave = 7; //������ � ������, ��������  savecolor(7)
				if (firstset == 0) firstset = 1; //������ �� �������������
				Marker_Count(); //ϳ��������� ���� ��� ����������� �������
		  vt = markersave;
		  markersave = 10;    //�������� 10 �� ������� ���� ������
	  }

	  if (markersave == 1) {  
		  markersave = 0;     //�������� ����
		  firstset = 0;       //��������� ��������� ��������� �������
		  button8.setBackground(savecolor[1]); //'³������� ���� ���� ������, �� ��� ������
		  //����� button7_click(); '���������� ������ (������ ����� ������!)
			if (firstset == 0) Save_Color(); //�����'����� ������� ������ �������� �����
			if (firstset == 0) button7.setBackground(blue);
			if (firstset == 0) markersave = 0; //������ � ������, ��������  savecolor(0)
			if (firstset == 0) firstset = 1; //������ �� �������������
			Marker_Count(); //ϳ��������� ���� ��� ����������� �������
		  vt = markersave;
		  markersave = 10;    //�������� 10 �� ������� ���� ������
	  }

	  if (markersave == 2) {  
		  markersave = 1;     //�������� ����
		  firstset = 0;       //��������� ��������� ��������� �������
		  button9.setBackground(savecolor[2]); //'³������� ���� ���� ������, �� ��� ������
		  //����� button8_click(); '���������� ������ (������ ������ ������!)
			if (firstset == 0) Save_Color(); //�����'����� ������� ������ �������� �����
			if (firstset == 0) button8.setBackground(blue);
			if (firstset == 0) markersave = 1; //������ � ������, ��������  savecolor(1)
			if (firstset == 0) firstset = 1; //������ �� �������������
			Marker_Count(); //ϳ��������� ���� ��� ����������� �������
		  vt = markersave;
		  markersave = 10;    //�������� 10 �� ������� ���� ������
	  }

	  if (markersave == 3) {  
		  markersave = 2;     //�������� ����
		  firstset = 0;       //��������� ��������� ��������� �������
		  button10.setBackground(savecolor[3]); //'³������� ���� ���� ������, �� ��� ������
		  //����� button9_click(); '���������� ������ (������ ������ ������!)
			if (firstset == 0) Save_Color(); //�����'����� ������� ������ �������� �����
			if (firstset == 0) button9.setBackground(blue);
			if (firstset == 0) markersave = 2; //������ � ������, ��������  savecolor(2)
			if (firstset == 0) firstset = 1; //������ �� �������������
			Marker_Count(); //ϳ��������� ���� ��� ����������� �������
		  vt = markersave;
		  markersave = 10;    //�������� 10 �� ������� ���� ������
	  }

	  if (markersave == 4) {  
		  markersave = 3;     //�������� ����
		  firstset = 0;       //��������� ��������� ��������� �������
		  button11.setBackground(savecolor[4]); //'³������� ���� ���� ������, �� ��� ������
		  //����� button10_click(); '���������� ������ (������ ������ ������!)
			if (firstset == 0) Save_Color(); //�����'����� ������� ������ �������� �����
			if (firstset == 0) button10.setBackground(blue);
			if (firstset == 0) markersave = 3; //������ � ������, ��������  savecolor(3)
			if (firstset == 0) firstset = 1; //������ �� �������������
			Marker_Count(); //ϳ��������� ���� ��� ����������� �������
		  vt = markersave;
		  markersave = 10;    //�������� 10 �� ������� ���� ������
	  }

	  if (markersave == 5) {  
		  markersave = 4;     //�������� ����
		  firstset = 0;       //��������� ��������� ��������� �������
		  button12.setBackground(savecolor[5]); //'³������� ���� ���� ������, �� ��� ������
		  //����� button11_click(); '���������� ������ (������ ������ ������!)
			if (firstset == 0) Save_Color(); //�����'����� ������� ������ �������� �����
			if (firstset == 0) button11.setBackground(blue);
			if (firstset == 0) markersave = 4; //������ � ������, ��������  savecolor(4)
			if (firstset == 0) firstset = 1; //������ �� �������������
			Marker_Count(); //ϳ��������� ���� ��� ����������� �������
		  vt = markersave;
		  markersave = 10;    //�������� 10 �� ������� ���� ������
	  }

 	  if (markersave == 6) {  
		  markersave = 5;     //�������� ����
		  firstset = 0;       //��������� ��������� ��������� �������
		  button13.setBackground(savecolor[6]); //'³������� ���� ���� ������, �� ��� ������
		  //����� button12_click(); '���������� ������ (������ ������ ������!)
			if (firstset == 0) Save_Color(); //�����'����� ������� ������ �������� �����
			if (firstset == 0) button12.setBackground(blue);
			if (firstset == 0) markersave = 5; //������ � ������, ��������  savecolor(5)
			if (firstset == 0) firstset = 1; //������ �� �������������
			Marker_Count(); //ϳ��������� ���� ��� ����������� �������
		  vt = markersave;
		  markersave = 10;    //�������� 10 �� ������� ���� ������
	  }

  	  if (markersave == 7) {  
		  markersave = 6;     //�������� ����
		  firstset = 0;       //��������� ��������� ��������� �������
		  button14.setBackground(savecolor[7]); //'³������� ���� ���� ������, �� ��� ������
		  //����� button13_click(); '���������� ������ (������ ������ ������!)
			if (firstset == 0) Save_Color(); //�����'����� ������� ������ �������� �����
			if (firstset == 0) button13.setBackground(blue);
			if (firstset == 0) markersave = 6; //������ � ������, ��������  savecolor(6)
			if (firstset == 0) firstset = 1; //������ �� �������������
			Marker_Count(); //ϳ��������� ���� ��� ����������� �������
		  vt = markersave;
		  markersave = 10;    //�������� 10 �� ������� ���� ������
	  }
	markersave = vt;
	n = 0;
	Marker_Count();
 }

	public void Move_Point_Right()
	{ //���������� ������� ��������
		
	  if (markersave == 0) {  //���� ������ ��� ������ �������� �����
		  markersave = 1;     //���������� �������� (�.�. �������� > �� 1)
		  firstset = 0;       //��������� ��������� ��������� �������
		  button7.setBackground(savecolor[0]); //'³������� ���� ���� ������, �� ��� ������
		  //����� button8_click(); '���������� ������ ��������
		  		if (firstset == 0) Save_Color(); //�����'����� ������� ������ �������� �����
				if (firstset == 0) button8.setBackground(blue);
				if (firstset == 0) markersave = 1; //������ � ������, ��������  savecolor(1)
				if (firstset == 0) firstset = 1; //������ �� �������������
				Marker_Count(); //ϳ��������� ���� ��� ����������� �������
		  vt = markersave;
		  markersave = 10;    //�������� 10 �� ������� ���� ������
	  }

	  if (markersave == 1) {  //���� ������ ��� ������ �������� �����
		  markersave = 2;     //���������� �������� (�.�. �������� > �� 1)
		  firstset = 0;       //��������� ��������� ��������� �������
		  button8.setBackground(savecolor[1]); //'³������� ���� ���� ������, �� ��� ������
		  //����� button9_click(); '���������� ������ ��������
		  		if (firstset == 0) Save_Color(); //�����'����� ������� ������ �������� �����
				if (firstset == 0) button9.setBackground(blue);
				if (firstset == 0) markersave = 2; //������ � ������, ��������  savecolor(1)
				if (firstset == 0) firstset = 1; //������ �� �������������
				Marker_Count(); //ϳ��������� ���� ��� ����������� �������
		  vt = markersave;
		  markersave = 10;    //�������� 10 �� ������� ���� ������
	  }

	  if (markersave == 2) {  //���� ������ ��� ������ �������� �����
		  markersave = 3;     //���������� �������� (�.�. �������� > �� 1)
		  firstset = 0;       //��������� ��������� ��������� �������
		  button9.setBackground(savecolor[2]); //'³������� ���� ���� ������, �� ��� ������
		  //����� button10_click(); '���������� ������ ��������
		  		if (firstset == 0) Save_Color(); //�����'����� ������� ������ �������� �����
				if (firstset == 0) button10.setBackground(blue);
				if (firstset == 0) markersave = 3; //������ � ������, ��������  savecolor(1)
				if (firstset == 0) firstset = 1; //������ �� �������������
				Marker_Count(); //ϳ��������� ���� ��� ����������� �������
		  vt = markersave;
		  markersave = 10;    //�������� 10 �� ������� ���� ������
	  }

	  if (markersave == 3) {  //���� ������ ��� ������ �������� �����
		  markersave = 4;     //���������� �������� (�.�. �������� > �� 1)
		  firstset = 0;       //��������� ��������� ��������� �������
		  button10.setBackground(savecolor[3]); //'³������� ���� ���� ������, �� ��� ������
		  //����� button11_click(); '���������� ������ ��������
		  		if (firstset == 0) Save_Color(); //�����'����� ������� ������ �������� �����
				if (firstset == 0) button11.setBackground(blue);
				if (firstset == 0) markersave = 4; //������ � ������, ��������  savecolor(1)
				if (firstset == 0) firstset = 1; //������ �� �������������
				Marker_Count(); //ϳ��������� ���� ��� ����������� �������
		  vt = markersave;
		  markersave = 10;    //�������� 10 �� ������� ���� ������
	  }

	  if (markersave == 4) {  //���� ������ ��� ������ �������� �����
		  markersave = 5;     //���������� �������� (�.�. �������� > �� 1)
		  firstset = 0;       //��������� ��������� ��������� �������
		  button11.setBackground(savecolor[4]); //'³������� ���� ���� ������, �� ��� ������
		  //����� button12_click(); '���������� ������ ��������
		  		if (firstset == 0) Save_Color(); //�����'����� ������� ������ �������� �����
				if (firstset == 0) button12.setBackground(blue);
				if (firstset == 0) markersave = 5; //������ � ������, ��������  savecolor(1)
				if (firstset == 0) firstset = 1; //������ �� �������������
				Marker_Count(); //ϳ��������� ���� ��� ����������� �������
		  vt = markersave;
		  markersave = 10;    //�������� 10 �� ������� ���� ������
	  }

	  if (markersave == 5) {  //���� ������ ��� ������ �������� �����
		  markersave = 6;     //���������� �������� (�.�. �������� > �� 1)
		  firstset = 0;       //��������� ��������� ��������� �������
		  button12.setBackground(savecolor[5]); //'³������� ���� ���� ������, �� ��� ������
		  //����� button13_click(); '���������� ������ ��������
		  		if (firstset == 0) Save_Color(); //�����'����� ������� ������ �������� �����
				if (firstset == 0) button13.setBackground(blue);
				if (firstset == 0) markersave = 6; //������ � ������, ��������  savecolor(1)
				if (firstset == 0) firstset = 1; //������ �� �������������
				Marker_Count(); //ϳ��������� ���� ��� ����������� �������
		  vt = markersave;
		  markersave = 10;    //�������� 10 �� ������� ���� ������
	  }

	  if (markersave == 6) {  //���� ������ ��� ������ �������� �����
		  markersave = 7;     //���������� �������� (�.�. �������� > �� 1)
		  firstset = 0;       //��������� ��������� ��������� �������
		  button13.setBackground(savecolor[6]); //'³������� ���� ���� ������, �� ��� ������
		  //����� button14_click(); '���������� ������ ��������
		  		if (firstset == 0) Save_Color(); //�����'����� ������� ������ �������� �����
				if (firstset == 0) button14.setBackground(blue);
				if (firstset == 0) markersave = 7; //������ � ������, ��������  savecolor(1)
				if (firstset == 0) firstset = 1; //������ �� �������������
				Marker_Count(); //ϳ��������� ���� ��� ����������� �������
		  vt = markersave;
		  markersave = 10;    //�������� 10 �� ������� ���� ������
	  }

	  if (markersave == 7) {  //���� ������ ��� ������ �������� �����
		  markersave = 0;     //���������� �������� (�.�. �������� > �� 1)
		  firstset = 0;       //��������� ��������� ��������� �������
		  button14.setBackground(savecolor[7]); //'³������� ���� ���� ������, �� ��� ������
		  //����� button7_click(); '���������� ������ ��������
		  		if (firstset == 0) Save_Color(); //�����'����� ������� ������ �������� �����
				if (firstset == 0) button7.setBackground(blue);
				if (firstset == 0) markersave = 0; //������ � ������, ��������  savecolor(1)
				if (firstset == 0) firstset = 1; //������ �� �������������
				Marker_Count(); //ϳ��������� ���� ��� ����������� �������
		  vt = markersave;
		  markersave = 10;    //�������� 10 �� ������� ���� ������
	  }

		
		
	markersave = vt;
	n = 0;
	Marker_Count();
	}

	public void Level_Count()
	{ //������ ����� ��������� �������� ������� ����
	cs = "";
	le[0] += 1;
	cs = cs + le[0];
	button6.setText(cs);

	cs = "";
	le[1] += 1;
	cs = cs + le[1];
	button5.setText(cs);

	cs = "";
	le[2] += 1;
	cs = cs + le[2];
	button4.setText(cs);

	cs = "";
	le[3] += 1;
	cs = cs + le[3];
	button3.setText(cs);

	cs = "";
	le[4] += 1;
	cs = cs + le[4];
	button2.setText(cs);
	
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMYaremchukGame = new JFrame();
		frmMYaremchukGame.setBackground(Color.WHITE);
		frmMYaremchukGame.setForeground(new Color(0, 51, 51));
		frmMYaremchukGame.setFont(new Font("Times New Roman", Font.BOLD, 14));
		frmMYaremchukGame.setTitle("M. Yaremchuk game");
		frmMYaremchukGame.setBounds(5, 0, 1355, 740); //���������� ��������� ������ ����
										//(5; 0)-������ ����� ������������ ������ ����; 
										//1355-������ ����; 765- ������ ����
		frmMYaremchukGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMYaremchukGame.getContentPane().setLayout(null);
		
		button1 = new JButton("Level");
		button1.setFont(new Font("Times New Roman", Font.BOLD, 60));
		button1.setHorizontalAlignment(SwingConstants.CENTER);
		button1.setBackground(new Color(51, 153, 102));
		button1.setBounds(10, 10, 180, 100);
		frmMYaremchukGame.getContentPane().add(button1);
		
		button2 = new JButton("5");
		button2.setForeground(new Color(0, 0, 0));
		button2.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button2.setHorizontalAlignment(SwingConstants.CENTER);
		button2.setBackground(new Color(51, 153, 102));
		button2.setBounds(10, 121, 160, 100);
		frmMYaremchukGame.getContentPane().add(button2);
		
		button3 = new JButton("4");
		button3.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button3.setHorizontalAlignment(SwingConstants.CENTER);
		button3.setBackground(new Color(51, 153, 102));
		button3.setBounds(10, 232, 160, 100);
		frmMYaremchukGame.getContentPane().add(button3);
		
		button4 = new JButton("3");
		button4.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button4.setHorizontalAlignment(SwingConstants.CENTER);
		button4.setBackground(new Color(51, 153, 102));
		button4.setBounds(10, 343, 160, 100);
		frmMYaremchukGame.getContentPane().add(button4);
		
		button5 = new JButton("2");
		button5.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button5.setHorizontalAlignment(SwingConstants.CENTER);
		button5.setBackground(new Color(51, 153, 102));
		button5.setBounds(10, 454, 160, 100);
		frmMYaremchukGame.getContentPane().add(button5);
		
		button6 = new JButton("1");
		button6.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button6.setHorizontalAlignment(SwingConstants.CENTER);
		button6.setBackground(new Color(51, 153, 102));
		button6.setBounds(10, 565, 160, 100);
		frmMYaremchukGame.getContentPane().add(button6);
		
		button7 = new JButton("+1");
		button7.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			  	keyCode = e.getKeyCode();
				if (keyCode == 37) Move_Point_Left(); //���������� ������
				if (keyCode == 39) Move_Point_Right(); //���������� ��������
				
			  	cs="";
				cs = cs + keyCode;
			       	 button1.setText(cs);

			}
		});
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (firstset == 0) Save_Color(); //�����'����� ������� ������ �������� �����
				if (firstset == 0) button7.setBackground(blue);
				if (firstset == 0) markersave = 0; //������ � ������, ��������  savecolor(0)
				if (firstset == 0) firstset = 1; //������ �� �������������
				Marker_Count(); //ϳ��������� ���� ��� ����������� �������
			}
		});
		button7.setHorizontalAlignment(SwingConstants.CENTER);
		button7.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button7.setBackground(new Color(255, 250, 205));
		button7.setBounds(180, 565, 135, 100);
		frmMYaremchukGame.getContentPane().add(button7);
		
		button8 = new JButton("-15");
		button8.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			  	keyCode = e.getKeyCode();
				if (keyCode == 37) Move_Point_Left(); //���������� ������
				if (keyCode == 39) Move_Point_Right(); //���������� ��������
				
			  	cs="";
				cs = cs + keyCode;
			}
		});

		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (firstset == 0) Save_Color(); //�����'����� ������� ������ �������� �����
				if (firstset == 0) button8.setBackground(blue);
				if (firstset == 0) markersave = 1; //������ � ������, ��������  savecolor(1)
				if (firstset == 0) firstset = 1; //������ �� �������������
				Marker_Count(); //ϳ��������� ���� ��� ����������� �������
			
			}
		});
		button8.setHorizontalAlignment(SwingConstants.CENTER);
		button8.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button8.setBackground(new Color(255, 250, 205));
		button8.setBounds(325, 565, 135, 100);
		frmMYaremchukGame.getContentPane().add(button8);
		
		button9 = new JButton("+15");
		button9.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			  	keyCode = e.getKeyCode();
				if (keyCode == 37) Move_Point_Left(); //���������� ������
				if (keyCode == 39) Move_Point_Right(); //���������� ��������
				
			  	cs="";
				cs = cs + keyCode;
			}
		});

		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (firstset == 0) Save_Color(); //�����'����� ������� ������ �������� �����
				if (firstset == 0) button9.setBackground(blue);
				if (firstset == 0) markersave = 2; //������ � ������, ��������  savecolor(2)
				if (firstset == 0) firstset = 1; //������ �� �������������
				Marker_Count(); //ϳ��������� ���� ��� ����������� �������
			}
		});
		button9.setHorizontalAlignment(SwingConstants.CENTER);
		button9.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button9.setBackground(new Color(255, 250, 205));
		button9.setBounds(470, 565, 135, 100);
		frmMYaremchukGame.getContentPane().add(button9);
		
		button10 = new JButton(" P ");
		button10.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			  	keyCode = e.getKeyCode();
				if (keyCode == 37) Move_Point_Left(); //���������� ������
				if (keyCode == 39) Move_Point_Right(); //���������� ��������
				
			  	cs="";
				cs = cs + keyCode;
			}
		});

		button10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (firstset == 0) Save_Color(); //�����'����� ������� ������ �������� �����
				if (firstset == 0) button10.setBackground(blue);
				if (firstset == 0) markersave = 3; //������ � ������, ��������  savecolor(3)
				if (firstset == 0) firstset = 1; //������ �� �������������
				Marker_Count(); //ϳ��������� ���� ��� ����������� �������
			}
		});
		button10.setHorizontalAlignment(SwingConstants.CENTER);
		button10.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button10.setBackground(new Color(123, 104, 238));
		button10.setBounds(615, 565, 135, 100);
		frmMYaremchukGame.getContentPane().add(button10);
		
		button11 = new JButton("+10");
		button11.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			  	keyCode = e.getKeyCode();
				if (keyCode == 37) Move_Point_Left(); //���������� ������
				if (keyCode == 39) Move_Point_Right(); //���������� ��������
				
			  	cs="";
				cs = cs + keyCode;
			}
		});

		button11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (firstset == 0) Save_Color(); //�����'����� ������� ������ �������� �����
				if (firstset == 0) button11.setBackground(blue);
				if (firstset == 0) markersave = 4; //������ � ������, ��������  savecolor(4)
				if (firstset == 0) firstset = 1; //������ �� �������������
				Marker_Count(); //ϳ��������� ���� ��� ����������� �������
			}
		});
		button11.setHorizontalAlignment(SwingConstants.CENTER);
		button11.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button11.setBackground(new Color(255, 250, 205));
		button11.setBounds(760, 565, 135, 100);
		frmMYaremchukGame.getContentPane().add(button11);
		
		button12 = new JButton("-25");
		button12.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			  	keyCode = e.getKeyCode();
				if (keyCode == 37) Move_Point_Left(); //���������� ������
				if (keyCode == 39) Move_Point_Right(); //���������� ��������
				
			  	cs="";
				cs = cs + keyCode;
			}
		});

		button12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (firstset == 0) Save_Color(); //�����'����� ������� ������ �������� �����
				if (firstset == 0) button12.setBackground(blue);
				if (firstset == 0) markersave = 5; //������ � ������, ��������  savecolor(5)
				if (firstset == 0) firstset = 1; //������ �� �������������
				Marker_Count(); //ϳ��������� ���� ��� ����������� �������
			}
		});
		button12.setHorizontalAlignment(SwingConstants.CENTER);
		button12.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button12.setBackground(new Color(255, 250, 205));
		button12.setBounds(905, 565, 135, 100);
		frmMYaremchukGame.getContentPane().add(button12);
		
		button13 = new JButton("+15");
		button13.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			  	keyCode = e.getKeyCode();
				if (keyCode == 37) Move_Point_Left(); //���������� ������
				if (keyCode == 39) Move_Point_Right(); //���������� ��������
				
			  	cs="";
				cs = cs + keyCode;
			}
		});

		button13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (firstset == 0) Save_Color(); //�����'����� ������� ������ �������� �����
				if (firstset == 0) button13.setBackground(blue);
				if (firstset == 0) markersave = 6; //������ � ������, ��������  savecolor(6)
				if (firstset == 0) firstset = 1; //������ �� �������������
				Marker_Count(); //ϳ��������� ���� ��� ����������� �������
			}
		});
		button13.setHorizontalAlignment(SwingConstants.CENTER);
		button13.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button13.setBackground(new Color(255, 250, 205));
		button13.setBounds(1050, 565, 135, 100);
		frmMYaremchukGame.getContentPane().add(button13);
		
		button14 = new JButton("-25");
		button14.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			  	keyCode = e.getKeyCode();
				if (keyCode == 37) Move_Point_Left(); //���������� ������
				if (keyCode == 39) Move_Point_Right(); //���������� ��������
				
			  	cs="";
				cs = cs + keyCode;
			}
		});

		button14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (firstset == 0) Save_Color(); //�����'����� ������� ������ �������� �����
				if (firstset == 0) button14.setBackground(blue);
				if (firstset == 0) markersave = 7; //������ � ������, ��������  savecolor(7)
				if (firstset == 0) firstset = 1; //������ �� �������������
				Marker_Count(); //ϳ��������� ���� ��� ����������� �������
			}
		});
		button14.setHorizontalAlignment(SwingConstants.CENTER);
		button14.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button14.setBackground(new Color(255, 250, 205));
		button14.setBounds(1195, 565, 135, 100);
		frmMYaremchukGame.getContentPane().add(button14);
		
		button15 = new JButton("B");
		button15.setHorizontalAlignment(SwingConstants.CENTER);
		button15.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button15.setBackground(Color.YELLOW);
		button15.setBounds(180, 454, 135, 100);
		frmMYaremchukGame.getContentPane().add(button15);
		
		button16 = new JButton("Z");
		button16.setForeground(Color.WHITE);
		button16.setHorizontalAlignment(SwingConstants.CENTER);
		button16.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button16.setBackground(Color.BLACK);
		button16.setBounds(325, 454, 135, 100);
		frmMYaremchukGame.getContentPane().add(button16);
		
		button17 = new JButton("-10");
		button17.setHorizontalAlignment(SwingConstants.CENTER);
		button17.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button17.setBackground(new Color(255, 250, 205));
		button17.setBounds(470, 454, 135, 100);
		frmMYaremchukGame.getContentPane().add(button17);
		
		button18 = new JButton("B");
		button18.setHorizontalAlignment(SwingConstants.CENTER);
		button18.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button18.setBackground(Color.YELLOW);
		button18.setBounds(615, 454, 135, 100);
		frmMYaremchukGame.getContentPane().add(button18);
		
		button19 = new JButton("T");
		button19.setHorizontalAlignment(SwingConstants.CENTER);
		button19.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button19.setBackground(new Color(204, 255, 153));
		button19.setBounds(760, 454, 135, 100);
		frmMYaremchukGame.getContentPane().add(button19);
		
		button20 = new JButton("+5");
		button20.setHorizontalAlignment(SwingConstants.CENTER);
		button20.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button20.setBackground(new Color(255, 250, 205));
		button20.setBounds(905, 454, 135, 100);
		frmMYaremchukGame.getContentPane().add(button20);
		
		button21 = new JButton("+1");
		button21.setHorizontalAlignment(SwingConstants.CENTER);
		button21.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button21.setBackground(new Color(255, 250, 205));
		button21.setBounds(1050, 454, 135, 100);
		frmMYaremchukGame.getContentPane().add(button21);
		
		button22 = new JButton("B");
		button22.setHorizontalAlignment(SwingConstants.CENTER);
		button22.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button22.setBackground(Color.YELLOW);
		button22.setBounds(1195, 454, 135, 100);
		frmMYaremchukGame.getContentPane().add(button22);
		
		button23 = new JButton("-25");
		button23.setHorizontalAlignment(SwingConstants.CENTER);
		button23.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button23.setBackground(new Color(255, 250, 205));
		button23.setBounds(180, 343, 135, 100);
		frmMYaremchukGame.getContentPane().add(button23);
		
		button24 = new JButton("+5");
		button24.setHorizontalAlignment(SwingConstants.CENTER);
		button24.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button24.setBackground(new Color(255, 250, 205));
		button24.setBounds(325, 343, 135, 100);
		frmMYaremchukGame.getContentPane().add(button24);
		
		button25 = new JButton("End");
		button25.setForeground(Color.WHITE);
		button25.setHorizontalAlignment(SwingConstants.CENTER);
		button25.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button25.setBackground(Color.RED);
		button25.setBounds(470, 343, 135, 100);
		frmMYaremchukGame.getContentPane().add(button25);
		
		button26 = new JButton("+15");
		button26.setHorizontalAlignment(SwingConstants.CENTER);
		button26.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button26.setBackground(new Color(255, 250, 205));
		button26.setBounds(615, 343, 135, 100);
		frmMYaremchukGame.getContentPane().add(button26);
		
		button27 = new JButton("-25");
		button27.setHorizontalAlignment(SwingConstants.CENTER);
		button27.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button27.setBackground(new Color(255, 250, 205));
		button27.setBounds(760, 343, 135, 100);
		frmMYaremchukGame.getContentPane().add(button27);
		
		button28 = new JButton("B");
		button28.setHorizontalAlignment(SwingConstants.CENTER);
		button28.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button28.setBackground(Color.YELLOW);
		button28.setBounds(905, 343, 135, 100);
		frmMYaremchukGame.getContentPane().add(button28);
		
		button29 = new JButton("Z");
		button29.setForeground(Color.WHITE);
		button29.setHorizontalAlignment(SwingConstants.CENTER);
		button29.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button29.setBackground(Color.BLACK);
		button29.setBounds(1050, 343, 135, 100);
		frmMYaremchukGame.getContentPane().add(button29);
		
		button30 = new JButton("T");
		button30.setHorizontalAlignment(SwingConstants.CENTER);
		button30.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button30.setBackground(new Color(204, 255, 153));
		button30.setBounds(1195, 343, 135, 100);
		frmMYaremchukGame.getContentPane().add(button30);
		
		button31 = new JButton("T");
		button31.setHorizontalAlignment(SwingConstants.CENTER);
		button31.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button31.setBackground(new Color(204, 255, 153));
		button31.setBounds(180, 232, 135, 100);
		frmMYaremchukGame.getContentPane().add(button31);
		
		button32 = new JButton("+10");
		button32.setHorizontalAlignment(SwingConstants.CENTER);
		button32.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button32.setBackground(new Color(255, 250, 205));
		button32.setBounds(325, 232, 135, 100);
		frmMYaremchukGame.getContentPane().add(button32);
		
		button33 = new JButton("B");
		button33.setHorizontalAlignment(SwingConstants.CENTER);
		button33.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button33.setBackground(Color.YELLOW);
		button33.setBounds(470, 232, 135, 100);
		frmMYaremchukGame.getContentPane().add(button33);
		
		button34 = new JButton("-25");
		button34.setHorizontalAlignment(SwingConstants.CENTER);
		button34.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button34.setBackground(new Color(255, 250, 205));
		button34.setBounds(615, 232, 135, 100);
		frmMYaremchukGame.getContentPane().add(button34);
		
		button35 = new JButton("Z");
		button35.setForeground(Color.WHITE);
		button35.setHorizontalAlignment(SwingConstants.CENTER);
		button35.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button35.setBackground(Color.BLACK);
		button35.setBounds(760, 232, 135, 100);
		frmMYaremchukGame.getContentPane().add(button35);
		
		button36 = new JButton("+15");
		button36.setHorizontalAlignment(SwingConstants.CENTER);
		button36.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button36.setBackground(new Color(255, 250, 205));
		button36.setBounds(905, 232, 135, 100);
		frmMYaremchukGame.getContentPane().add(button36);
		
		button37 = new JButton("+10");
		button37.setHorizontalAlignment(SwingConstants.CENTER);
		button37.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button37.setBackground(new Color(255, 250, 205));
		button37.setBounds(1050, 232, 135, 100);
		frmMYaremchukGame.getContentPane().add(button37);
		
		button38 = new JButton("-25");
		button38.setHorizontalAlignment(SwingConstants.CENTER);
		button38.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button38.setBackground(new Color(255, 250, 205));
		button38.setBounds(1195, 232, 135, 100);
		frmMYaremchukGame.getContentPane().add(button38);
		
		button39 = new JButton("+15");
		button39.setHorizontalAlignment(SwingConstants.CENTER);
		button39.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button39.setBackground(new Color(255, 250, 205));
		button39.setBounds(180, 121, 135, 100);
		frmMYaremchukGame.getContentPane().add(button39);
		
		button40 = new JButton("-25");
		button40.setHorizontalAlignment(SwingConstants.CENTER);
		button40.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button40.setBackground(new Color(255, 250, 205));
		button40.setBounds(325, 121, 135, 100);
		frmMYaremchukGame.getContentPane().add(button40);
		
		button41 = new JButton("T");
		button41.setHorizontalAlignment(SwingConstants.CENTER);
		button41.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button41.setBackground(new Color(50, 205, 50));
		button41.setBounds(470, 121, 135, 100);
		frmMYaremchukGame.getContentPane().add(button41);
		
		button42 = new JButton("+10");
		button42.setHorizontalAlignment(SwingConstants.CENTER);
		button42.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button42.setBackground(new Color(255, 250, 205));
		button42.setBounds(615, 121, 135, 100);
		frmMYaremchukGame.getContentPane().add(button42);
		
		button43 = new JButton("-1");
		button43.setHorizontalAlignment(SwingConstants.CENTER);
		button43.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button43.setBackground(new Color(255, 250, 205));
		button43.setBounds(760, 121, 135, 100);
		frmMYaremchukGame.getContentPane().add(button43);
		
		button44 = new JButton("B");
		button44.setHorizontalAlignment(SwingConstants.CENTER);
		button44.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button44.setBackground(Color.YELLOW);
		button44.setBounds(905, 121, 135, 100);
		frmMYaremchukGame.getContentPane().add(button44);
		
		button45 = new JButton("P");
		button45.setHorizontalAlignment(SwingConstants.CENTER);
		button45.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button45.setBackground(new Color(204, 255, 255));
		button45.setBounds(1050, 121, 135, 100);
		frmMYaremchukGame.getContentPane().add(button45);
		
		button46 = new JButton("+10");
		button46.setHorizontalAlignment(SwingConstants.CENTER);
		button46.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button46.setBackground(new Color(255, 250, 205));
		button46.setBounds(1195, 121, 135, 100);
		frmMYaremchukGame.getContentPane().add(button46);
		
		button47 = new JButton("M. Yaremchuk Game");
		button47.setBackground(new Color(204, 102, 204));
		button47.setFont(new Font("Times New Roman", Font.BOLD, 60));
		button47.setBounds(200, 10, 719, 100);
		frmMYaremchukGame.getContentPane().add(button47);
		
		button48 = new JButton(" 1000 ");
		button48.setHorizontalAlignment(SwingConstants.CENTER);
		button48.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button48.setBackground(new Color(255, 250, 205));
		button48.setBounds(929, 10, 401, 100);
		frmMYaremchukGame.getContentPane().add(button48);
		
		button49 = new JButton("");
		button49.setHorizontalAlignment(SwingConstants.CENTER);
		button49.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button49.setBackground(new Color(220, 20, 60));
		button49.setBounds(180, 676, 145, 20);
		frmMYaremchukGame.getContentPane().add(button49);
		
		button50 = new JButton("");
		button50.setHorizontalAlignment(SwingConstants.CENTER);
		button50.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button50.setBackground(new Color(220, 20, 60));
		button50.setBounds(325, 676, 145, 20);
		frmMYaremchukGame.getContentPane().add(button50);
		
		button51 = new JButton("");
		button51.setHorizontalAlignment(SwingConstants.CENTER);
		button51.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button51.setBackground(new Color(220, 20, 60));
		button51.setBounds(470, 676, 145, 20);
		frmMYaremchukGame.getContentPane().add(button51);
		
		button52 = new JButton("");
		button52.setHorizontalAlignment(SwingConstants.CENTER);
		button52.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button52.setBackground(new Color(220, 20, 60));
		button52.setBounds(615, 676, 145, 20);
		frmMYaremchukGame.getContentPane().add(button52);
		
		button53 = new JButton("");
		button53.setHorizontalAlignment(SwingConstants.CENTER);
		button53.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button53.setBackground(new Color(220, 20, 60));
		button53.setBounds(760, 676, 145, 20);
		frmMYaremchukGame.getContentPane().add(button53);
		
		button54 = new JButton("");
		button54.setHorizontalAlignment(SwingConstants.CENTER);
		button54.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button54.setBackground(new Color(220, 20, 60));
		button54.setBounds(905, 676, 145, 20);
		frmMYaremchukGame.getContentPane().add(button54);
		
		button55 = new JButton("");
		button55.setHorizontalAlignment(SwingConstants.CENTER);
		button55.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button55.setBackground(new Color(220, 20, 60));
		button55.setBounds(1040, 676, 145, 20);
		frmMYaremchukGame.getContentPane().add(button55);
		
		button56 = new JButton("");
		button56.setHorizontalAlignment(SwingConstants.CENTER);
		button56.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button56.setBackground(new Color(255, 255, 51));
		button56.setBounds(1234, 667, 95, 48);
		frmMYaremchukGame.getContentPane().add(button56);
		
	}



	@Override
	public void actionPerformed(ActionEvent e) {

			IndLent = IndLent + 1; //�������� �� ���� ������� ����������� ����������
			if (IndLent == 9) mainTimer.restart(); //³������� �������� ������ ����������
			if (IndLent == 9) {		
				Num_Move();
			Marker_Reset(); //³������� ���� ������ � ��������
			Dn_Count(); //ϳ��������� ���� ��� ���� ������ ����
			}
			if (IndLent == 9) IndLent = 0; //������ ����� ����������
			Print_Ind();   //��������� ���������
		
		}
}
