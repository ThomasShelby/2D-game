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

/**
 * 
 * @author M.Yaremchuk
 *
 */
public class Form1 implements ActionListener{

	JFrame frmMYaremchukGame;
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
	JButton scoreFrameButton1 = new JButton();
	JButton scoreButton = new JButton();
	JButton button = new JButton();
	JButton redFrameButton1 = new JButton();
	JButton redFrameButton2 = new JButton();
	JButton redFrameButton3 = new JButton();
	JButton redFrameButton4 = new JButton();
	JButton timeButton = new JButton();
	JButton showTimeButton = new JButton();
	JButton levelFrame1 = new JButton();
	JButton levelFrame2 = new JButton();
	JButton levelFrame3 = new JButton();

	static Form1 window;
	
	public int level[] = new int[4]; //масив для Level
	public int field[][] = new int[5][8]; //масив для ігрового поля для рівня 5 (верхнього рядка)
    public int NCounter = 0; //Значення лічильника очків
    public int RndE; //Змінна для випадкових чисел	
    public int i;
    public int n;
    public int m; //Для підрахунку очків
    public int keyCode;
    public int vt;
    public int le[] = new int[5]; //Для нумерації рівнів Level
    
    public int time=200;
    public int a=0;
    
    Move_Point_Left mpl = new Move_Point_Left();
    Move_Point_Right mpr = new Move_Point_Right();
    
   Timer mainTimer = new Timer(time, this);
	
	public char c;
	
	public String cs = "",st = ""; //Рядок для роботи з button

	Color black = new Color(0x000000); //колір символів числових комірок, комірок "+500", "+100" та "-200"
	Color white = new Color(0xffffff); //колір символів комірок "Null" та "End"
	
	Color plus1 = new Color(0xfffacd); //Фон числових комірок
	Color plus500 = new Color(0x32cd32); //Фон виграшних комірок "+500"
	Color plus100 = new Color(0x7b68ee); //Фон виграшних комірок "+100"
	Color colourMin200 = new Color(0xffff00); //Фон виграшних комірок "-200"
	Color plusNull = new Color(0x000000); //Фон комірок "Null"
	Color plusEnd = new Color(0xff0000); //Фон комірок "End"
	Color blue = new Color(0x000FFF); //Фон для маркера
	
	Color lightPlus =new Color(0xfff999); 
	Color lightMinus =new Color(0xf5deb3); 
	
	Color dg; //Для передачі значень кольору фону
	Color dk; //Для передачі значень кольору символа

	public Color savecolor[] = new Color[8]; //масив для збереження кольорів нижнього рядка

    public int firstset; //Триггер - поставлений маркер = 1, якщо = 0, то не поставлений
    public int markersave; //Показує у якій комірці зараз стоїть маркер
	
	public int et; //у цю змінну будуть записані результати перерахунку значень масиву field[][]

	public int i56;
	public String c56 = "";
	public int IndLent; //Визначає довжину кольорового лінійного індикатора
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		start();
	}
	
	public static void start() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new MyConnect().openConn("Game");
					StartForm start = new StartForm();
					start.frame.setVisible(true);
					Count.isEnd = true;
					start.button_1.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							window = new Form1();
							window.frmMYaremchukGame.setVisible(true);
							start.frame.setVisible(false);
						}
					});
					
					start.button_2.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							window = new Form1();
							window.frmMYaremchukGame.setVisible(true);
							start.frame.setVisible(false);
							Level_Count.increaseSpeed=false;
						}
					});
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 */
	public Form1() {
		initialize();
		
//		mainTimer.start();
		
        RndE = (int)(400*Math.random()); //Генерує випадкове число = 0 до 400 для початкового розміру РАХУНКУ
        NCounter = RndE; //Початкове значення рахунку
		firstset = 0; //Триггер - Маркер ще не поставлений
		//Заповнюємо масиви комірок filed1 - filed5 значеннями генератора випадкових чисел
		for(int j=0;j<5;j++){
			for (int i=0; i<8; i++){
					field[j][i] = (int)(19*Math.random()); //генерує випадкове число = 0 до 19
					}
		}
		Field_Fill();//Заповнити комірки ігрового поля значеннями
		IndLent = 0; //Довжина лінійного кольорового індикатора максимальна
		
		
		le[0] = 1; //Присвоїмо початкове значення для рівнів Level
		le[1] = 2;
		le[2] = 3;
		le[3] = 4;
		le[4] = 5;
	}

    public void colorChars(int r,int i) 
	{ //За значеннями елементів масивів field1 - field5 визначити атрибути та номінал
	  //комірок та записати їх
    			if (field[r][i] == 0){ 
    				cs ="+1";
    				dg = lightPlus;
    				dk = black;
    				}
    			if (field[r][i] == 1){
    				cs ="-1";
    				dg = lightMinus;
    				dk = black;
    				}
    			
    			if (field[r][i] == 2){
    				cs = "+5";
    				dg = lightPlus;
    				dk = black;
    				}

    			if (field[r][i] == 3){
    				cs = "-5";
    				dg = lightMinus;
    				dk = black;
    				}

    			if (field[r][i] == 4){
    				cs = "+10";
    				dg = lightPlus;
    				dk = black;
    				}

    			if (field[r][i] == 5){
    				cs = "-10";
    				dg = lightMinus;
    				dk = black;
    				}

    			if (field[r][i] == 6){
    				cs = "+15";
    				dg = lightPlus;
    				dk = black;
    				}

    			if (field[r][i] == 7){
    				cs = "-15";
    				dg = lightMinus;
    				dk = black;
    				}

    			if (field[r][i] == 8){
    				cs = "+25";
    				dg = lightPlus;
    				dk = black;
    				}

    			if (field[r][i] == 9){
    				cs = "+500";
    				dg = plus500;
    				dk = black;
    				}

    			if (field[r][i] == 10){
    				cs = "+100";
    				dg = plus100;
    				dk = black;
    				}

    			if (field[r][i] == 11){
    				cs = "-200";
    				dg = colourMin200;
    				dk = black;
    				}

    			if (field[r][i] == 12){
    				cs = "Null";
    				dg = plusNull;
    				dk = white;
    				}

    			if (field[r][i] == 13){
    				cs = "Null";
    				dg = plusNull;
    				dk = white;
    				}

    			if (field[r][i] == 14){
    				cs = "End";
    				dg = plusEnd;
    				dk = white;
    				}

    			if (field[r][i] == 15){
    				cs = "-10";
    				dg = lightMinus;
    				dk = black;
    				}

    			if (field[r][i] == 16){
    				cs = "-5";
    				dg = lightMinus;
    				dk = black;
    				}

    			if (field[r][i] == 17){
    				cs = "-1";
    				dg = lightMinus;
    				dk = black;
    				}

    			if (field[r][i] == 18){
    				cs = "+1";
    				dg = lightPlus;
    				dk = black;
    				}

    			if (field[r][i] == 19){
    				cs = "+5";
    				dg = lightPlus;
    				dk = black;
    				}
    			}

	public void Field_Fill() 
	{ 
						for (int i=0; i<8; i++)
		{
							colorChars(0,i); 
							if (i == 0){ 
								button39.setText(cs);
								button39.setBackground(dg);
								button39.setForeground(dk);
								}
							if (i == 1) {
								button40.setText(cs);
								button40.setBackground(dg);
								button40.setForeground(dk);
							}
							if (i == 2) {
								button41.setText(cs);
								button41.setBackground(dg);
								button41.setForeground(dk);
							}
							if (i == 3) {
								button42.setText(cs);
								button42.setBackground(dg);
								button42.setForeground(dk);
							}
							if (i == 4) {
								button43.setText(cs);
								button43.setBackground(dg);
								button43.setForeground(dk);
							}
							if (i == 5) {
								button44.setText(cs);
								button44.setBackground(dg);
								button44.setForeground(dk);
							}
							if (i == 6) {
								button45.setText(cs);
								button45.setBackground(dg);
								button45.setForeground(dk);
							}
							if (i == 7) {
								button46.setText(cs);
								button46.setBackground(dg);
								button46.setForeground(dk);
							}

							cs = "";							

							//------------------------------------------
							
							colorChars(1,i); 
							if (i == 0){ 
								button31.setText(cs);
								button31.setBackground(dg);
								button31.setForeground(dk);
								}
							if (i == 1) {
								button32.setText(cs);
								button32.setBackground(dg);
								button32.setForeground(dk);
							}
							if (i == 2) {
								button33.setText(cs);
								button33.setBackground(dg);
								button33.setForeground(dk);
							}
							if (i == 3) {
								button34.setText(cs);
								button34.setBackground(dg);
								button34.setForeground(dk);
							}
							if (i == 4) {
								button35.setText(cs);
								button35.setBackground(dg);
								button35.setForeground(dk);
							}
							if (i == 5) {
								button36.setText(cs);
								button36.setBackground(dg);
								button36.setForeground(dk);
							}
							if (i == 6) {
								button37.setText(cs);
								button37.setBackground(dg);
								button37.setForeground(dk);
							}
							if (i == 7) {
								button38.setText(cs);
								button38.setBackground(dg);
								button38.setForeground(dk);
							}
							
					cs = "";

					//------------------------------------------
					
					colorChars(2,i);
					if (i == 0){ 
						button23.setText(cs);
						button23.setBackground(dg);
						button23.setForeground(dk);
						}
					if (i == 1) {
						button24.setText(cs);
						button24.setBackground(dg);
						button24.setForeground(dk);
					}
					if (i == 2) {
						button25.setText(cs);
						button25.setBackground(dg);
						button25.setForeground(dk);
					}
					if (i == 3) {
						button26.setText(cs);
						button26.setBackground(dg);
						button26.setForeground(dk);
					}
					if (i == 4) {
						button27.setText(cs);
						button27.setBackground(dg);
						button27.setForeground(dk);
					}
					if (i == 5) {
						button28.setText(cs);
						button28.setBackground(dg);
						button28.setForeground(dk);
					}
					if (i == 6) {
						button29.setText(cs);
						button29.setBackground(dg);
						button29.setForeground(dk);
					}
					if (i == 7) {
						button30.setText(cs);
						button30.setBackground(dg);
						button30.setForeground(dk);
					}
					
			cs = "";
					
			//------------------------------------------
			
			colorChars(3,i); 
			if (i == 0){ 
				button15.setText(cs);
				button15.setBackground(dg);
				button15.setForeground(dk);
				}
			if (i == 1) {
				button16.setText(cs);
				button16.setBackground(dg);
				button16.setForeground(dk);
			}
			if (i == 2) {
				button17.setText(cs);
				button17.setBackground(dg);
				button17.setForeground(dk);
			}
			if (i == 3) {
				button18.setText(cs);
				button18.setBackground(dg);
				button18.setForeground(dk);
			}
			if (i == 4) {
				button19.setText(cs);
				button19.setBackground(dg);
				button19.setForeground(dk);
			}
			if (i == 5) {
				button20.setText(cs);
				button20.setBackground(dg);
				button20.setForeground(dk);
			}
			if (i == 6) {
				button21.setText(cs);
				button21.setBackground(dg);
				button21.setForeground(dk);
			}
			if (i == 7) {
				button22.setText(cs);
				button22.setBackground(dg);
				button22.setForeground(dk);
			}

	cs = "";					
							
			colorChars(4,i); 
			if (i == 0){ 
				button7.setText(cs);
				button7.setBackground(dg);
				button7.setForeground(dk);
				}
			if (i == 1) {
				button8.setText(cs);
				button8.setBackground(dg);
				button8.setForeground(dk);
			}
			if (i == 2) {
				button9.setText(cs);
				button9.setBackground(dg);
				button9.setForeground(dk);
			}
			if (i == 3) {
				button10.setText(cs);
				button10.setBackground(dg);
				button10.setForeground(dk);
			}
			if (i == 4) {
				button11.setText(cs);
				button11.setBackground(dg);
				button11.setForeground(dk);
			}
			if (i == 5) {
				button12.setText(cs);
				button12.setBackground(dg);
				button12.setForeground(dk);
			}
			if (i == 6) {
				button13.setText(cs);
				button13.setBackground(dg);
				button13.setForeground(dk);
			}
			if (i == 7) {
				button14.setText(cs);
				button14.setBackground(dg);
				button14.setForeground(dk);
			}

	cs = "";
	}
						}

	public void Print_Ind()
	{ //намалювати кольоровий лінійний індикатор
		if (IndLent == 1) button55.setVisible(false);
		if (IndLent == 2) button54.setVisible(false);
		if (IndLent == 3) button53.setVisible(false);
		if (IndLent == 4) button52.setVisible(false);
		if (IndLent == 5) button51.setVisible(false);
		if (IndLent == 6) button50.setVisible(false);
		if (IndLent == 7) button49.setVisible(false);
//		if (IndLent == 7) mainTimer.setInterval(100);\ //Зменшити інтервал, щоб індикатор
		                                           //відновлювався швидше
		if (IndLent == 0) {
			button55.setVisible(true); //намалювати всі елементи індикатора
			button54.setVisible(true); //намалювати всі елементи індикатора
			button53.setVisible(true); //намалювати всі елементи індикатора
			button52.setVisible(true); //намалювати всі елементи індикатора
			button51.setVisible(true); //намалювати всі елементи індикатора
			button50.setVisible(true); //намалювати всі елементи індикатора
			button49.setVisible(true); //намалювати всі елементи індикатора
			
		}
	}
		
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMYaremchukGame = new JFrame();
		frmMYaremchukGame.getContentPane().setBackground(new Color(0, 51, 51));
		frmMYaremchukGame.setBackground(Color.WHITE);
		frmMYaremchukGame.setForeground(new Color(0, 51, 51));
		frmMYaremchukGame.setFont(new Font("Times New Roman", Font.BOLD, 14));
		frmMYaremchukGame.setTitle("M. Yaremchuk game");
		frmMYaremchukGame.setBounds(0, 0, 1366, 740); //координати розміщення нашого вікна
										//(5; 0)-верхня точка розташування нашого вікна; 
										//1355-ширина вікна; 765- висота вікна
		frmMYaremchukGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMYaremchukGame.getContentPane().setLayout(null);
//		frmMYaremchukGame.add(new Engine());
		
		button1 = new JButton("\u0420\u0456\u0432\u0435\u043D\u044C");
		button1.setForeground(Color.BLACK);
		button1.setFont(new Font("Times New Roman", Font.BOLD, 45));
		button1.setHorizontalAlignment(SwingConstants.CENTER);
		button1.setBackground(new Color(51, 153, 102));
		button1.setBounds(10, 10, 180, 55);
		frmMYaremchukGame.getContentPane().add(button1);
		
		button2 = new JButton("5");
		button2.setForeground(Color.DARK_GRAY);
		button2.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button2.setHorizontalAlignment(SwingConstants.CENTER);
		button2.setBackground(new Color(51, 153, 102));
		button2.setBounds(10, 76, 124, 100);
		frmMYaremchukGame.getContentPane().add(button2);
		
		button3 = new JButton("4");
		button3.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button3.setHorizontalAlignment(SwingConstants.CENTER);
		button3.setBackground(new Color(51, 153, 102));
		button3.setBounds(10, 187, 124, 100);
		frmMYaremchukGame.getContentPane().add(button3);
		
		button4 = new JButton("3");
		button4.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button4.setHorizontalAlignment(SwingConstants.CENTER);
		button4.setBackground(new Color(51, 153, 102));
		button4.setBounds(10, 298, 124, 100);
		frmMYaremchukGame.getContentPane().add(button4);
		
		button5 = new JButton("2");
		button5.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button5.setHorizontalAlignment(SwingConstants.CENTER);
		button5.setBackground(new Color(51, 153, 102));
		button5.setBounds(10, 409, 124, 100);
		frmMYaremchukGame.getContentPane().add(button5);
		
		button6 = new JButton("1");
		button6.setForeground(Color.BLACK);
		button6.setFont(new Font("Times New Roman", Font.BOLD, 50));
		button6.setHorizontalAlignment(SwingConstants.CENTER);
		button6.setBackground(new Color(51, 153, 102));
		button6.setBounds(10, 544, 124, 100);
		frmMYaremchukGame.getContentPane().add(button6);
		
		button7 = new JButton("+1");
		button7.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			  	keyCode = e.getKeyCode();
				if (keyCode == 37) mpl.movePointLeft(window); //Перемістити ліворуч
				if (keyCode == 39) mpr.movePointRight(window); //Перемістити праворуч
				
			  	cs="";
				cs = cs + keyCode;
			       	 button1.setText(cs);

			}
		});
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (firstset == 0) {
					new Save_Color().saveColor(window); //Запам'ятати кольори комірок нижнього рядка
					button7.setBackground(blue);
					markersave = 0; //Маркер у комірці, відповідній  savecolor(0)
					firstset = 1; //Більше не опрацьовувати
				}
				new Count().markerCount(window); //Підрахувати очки при встановленні маркера
				mainTimer.restart();
			}
		});
		button7.setHorizontalAlignment(SwingConstants.CENTER);
		button7.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button7.setBackground(new Color(255, 250, 205));
		button7.setBounds(180, 544, 132, 100);
		frmMYaremchukGame.getContentPane().add(button7);
		
		button8 = new JButton("-15");
		button8.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			  	keyCode = e.getKeyCode();
				if (keyCode == 37) new Move_Point_Left().movePointLeft(window); //Перемістити ліворуч
				if (keyCode == 39) new Move_Point_Right().movePointRight(window); //Перемістити праворуч
				
			  	cs="";
				cs = cs + keyCode;
			}
		});

		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (firstset == 0) {
					new Save_Color().saveColor(window); //Запам'ятати кольори комірок нижнього рядка
					button8.setBackground(blue);
					markersave = 1; //Маркер у комірці, відповідній  savecolor(1)
					firstset = 1; //Більше не опрацьовувати
				}
				new Count().markerCount(window); //Підрахувати очки при встановленні маркера
				mainTimer.restart();
			}
		});
		button8.setHorizontalAlignment(SwingConstants.CENTER);
		button8.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button8.setBackground(new Color(255, 250, 205));
		button8.setBounds(322, 544, 132, 100);
		frmMYaremchukGame.getContentPane().add(button8);
		
		button9 = new JButton("+15");
		button9.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			  	keyCode = e.getKeyCode();
				if (keyCode == 37) new Move_Point_Left().movePointLeft(window); //Перемістити ліворуч
				if (keyCode == 39) new Move_Point_Right().movePointRight(window); //Перемістити праворуч
				
			  	cs="";
				cs = cs + keyCode;
			}
		});

		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (firstset == 0) {
					new Save_Color().saveColor(window); //Запам'ятати кольори комірок нижнього рядка
					button9.setBackground(blue);
					markersave = 2; //Маркер у комірці, відповідній  savecolor(2)
					firstset = 1; //Більше не опрацьовувати
				}
				new Count().markerCount(window); //Підрахувати очки при встановленні маркера
				mainTimer.restart();
			}
		});
		button9.setHorizontalAlignment(SwingConstants.CENTER);
		button9.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button9.setBackground(new Color(255, 250, 205));
		button9.setBounds(464, 544, 132, 100);
		frmMYaremchukGame.getContentPane().add(button9);
		
		button10 = new JButton(" +100 ");
		button10.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			  	keyCode = e.getKeyCode();
				if (keyCode == 37) new Move_Point_Left().movePointLeft(window); //Перемістити ліворуч
				if (keyCode == 39) new Move_Point_Right().movePointRight(window); //Перемістити праворуч
				
			  	cs="";
				cs = cs + keyCode;
			}
		});

		button10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (firstset == 0) {
					new Save_Color().saveColor(window); //Запам'ятати кольори комірок нижнього рядка
					button10.setBackground(blue);
					markersave = 3; //Маркер у комірці, відповідній  savecolor(3)
					firstset = 1; //Більше не опрацьовувати
				}
				new Count().markerCount(window); //Підрахувати очки при встановленні маркера
				mainTimer.restart();
			}
		});
		button10.setHorizontalAlignment(SwingConstants.CENTER);
		button10.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button10.setBackground(new Color(123, 104, 238));
		button10.setBounds(606, 544, 132, 100);
		frmMYaremchukGame.getContentPane().add(button10);
		
		button11 = new JButton("+10");
		button11.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			  	keyCode = e.getKeyCode();
				if (keyCode == 37) new Move_Point_Left().movePointLeft(window); //Перемістити ліворуч
				if (keyCode == 39) new Move_Point_Right().movePointRight(window); //Перемістити праворуч
				
			  	cs="";
				cs = cs + keyCode;
			}
		});

		button11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (firstset == 0) {
					new Save_Color().saveColor(window); //Запам'ятати кольори комірок нижнього рядка
					button11.setBackground(blue);
					markersave = 4; //Маркер у комірці, відповідній  savecolor(4)
					firstset = 1; //Більше не опрацьовувати
				}
				new Count().markerCount(window); //Підрахувати очки при встановленні маркера
				mainTimer.restart();
			}
		});
		button11.setHorizontalAlignment(SwingConstants.CENTER);
		button11.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button11.setBackground(new Color(255, 250, 205));
		button11.setBounds(748, 544, 132, 100);
		frmMYaremchukGame.getContentPane().add(button11);
		
		button12 = new JButton("-25");
		button12.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			  	keyCode = e.getKeyCode();
				if (keyCode == 37) new Move_Point_Left().movePointLeft(window); //Перемістити ліворуч
				if (keyCode == 39) new Move_Point_Right().movePointRight(window); //Перемістити праворуч
				
			  	cs="";
				cs = cs + keyCode;
			}
		});

		button12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (firstset == 0) {
					new Save_Color().saveColor(window); //Запам'ятати кольори комірок нижнього рядка
					button12.setBackground(blue);
					markersave = 5; //Маркер у комірці, відповідній  savecolor(5)
					firstset = 1; //Більше не опрацьовувати
				}
				new Count().markerCount(window); //Підрахувати очки при встановленні маркера
				mainTimer.restart();
			}
		});
		button12.setHorizontalAlignment(SwingConstants.CENTER);
		button12.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button12.setBackground(new Color(255, 250, 205));
		button12.setBounds(890, 544, 132, 100);
		frmMYaremchukGame.getContentPane().add(button12);
		
		button13 = new JButton("+15");
		button13.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			  	keyCode = e.getKeyCode();
				if (keyCode == 37) new Move_Point_Left().movePointLeft(window); //Перемістити ліворуч
				if (keyCode == 39) new Move_Point_Right().movePointRight(window); //Перемістити праворуч
				
			  	cs="";
				cs = cs + keyCode;
			}
		});

		button13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (firstset == 0) {
					new Save_Color().saveColor(window); //Запам'ятати кольори комірок нижнього рядка
					button13.setBackground(blue);
					markersave = 6; //Маркер у комірці, відповідній  savecolor(6)
					firstset = 1; //Більше не опрацьовувати
				}
				new Count().markerCount(window); //Підрахувати очки при встановленні маркера
				mainTimer.restart();
			}
		});
		button13.setHorizontalAlignment(SwingConstants.CENTER);
		button13.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button13.setBackground(new Color(255, 250, 205));
		button13.setBounds(1032, 544, 132, 100);
		frmMYaremchukGame.getContentPane().add(button13);
		
		button14 = new JButton("-25");
		button14.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			  	keyCode = e.getKeyCode();
				if (keyCode == 37) new Move_Point_Left().movePointLeft(window); //Перемістити ліворуч
				if (keyCode == 39) new Move_Point_Right().movePointRight(window); //Перемістити праворуч
				
			  	cs="";
				cs = cs + keyCode;
			}
		});

		button14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (firstset == 0) {
					new Save_Color().saveColor(window); //Запам'ятати кольори комірок нижнього рядка
					button14.setBackground(blue);
					markersave = 7; //Маркер у комірці, відповідній  savecolor(7)
					firstset = 1; //Більше не опрацьовувати
				}
				new Count().markerCount(window); //Підрахувати очки при встановленні маркера
				mainTimer.restart();
			}
		});
		button14.setHorizontalAlignment(SwingConstants.CENTER);
		button14.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button14.setBackground(new Color(255, 250, 205));
		button14.setBounds(1174, 544, 132, 100);
		frmMYaremchukGame.getContentPane().add(button14);
		
		button15 = new JButton("-200");
		button15.setHorizontalAlignment(SwingConstants.CENTER);
		button15.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button15.setBackground(Color.YELLOW);
		button15.setBounds(180, 409, 132, 100);
		frmMYaremchukGame.getContentPane().add(button15);
		
		button16 = new JButton("Null");
		button16.setForeground(Color.WHITE);
		button16.setHorizontalAlignment(SwingConstants.CENTER);
		button16.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button16.setBackground(Color.BLACK);
		button16.setBounds(322, 409, 132, 100);
		frmMYaremchukGame.getContentPane().add(button16);
		
		button17 = new JButton("-10");
		button17.setHorizontalAlignment(SwingConstants.CENTER);
		button17.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button17.setBackground(new Color(255, 250, 205));
		button17.setBounds(464, 409, 132, 100);
		frmMYaremchukGame.getContentPane().add(button17);
		
		button18 = new JButton("-200");
		button18.setHorizontalAlignment(SwingConstants.CENTER);
		button18.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button18.setBackground(Color.YELLOW);
		button18.setBounds(606, 409, 132, 100);
		frmMYaremchukGame.getContentPane().add(button18);
		
		button19 = new JButton("+500");
		button19.setHorizontalAlignment(SwingConstants.CENTER);
		button19.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button19.setBackground(new Color(204, 255, 153));
		button19.setBounds(748, 409, 132, 100);
		frmMYaremchukGame.getContentPane().add(button19);
		
		button20 = new JButton("+5");
		button20.setHorizontalAlignment(SwingConstants.CENTER);
		button20.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button20.setBackground(new Color(255, 250, 205));
		button20.setBounds(890, 409, 132, 100);
		frmMYaremchukGame.getContentPane().add(button20);
		
		button21 = new JButton("+1");
		button21.setHorizontalAlignment(SwingConstants.CENTER);
		button21.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button21.setBackground(new Color(255, 250, 205));
		button21.setBounds(1032, 409, 132, 100);
		frmMYaremchukGame.getContentPane().add(button21);
		
		button22 = new JButton("-200");
		button22.setHorizontalAlignment(SwingConstants.CENTER);
		button22.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button22.setBackground(Color.YELLOW);
		button22.setBounds(1174, 409, 132, 100);
		frmMYaremchukGame.getContentPane().add(button22);
		
		button23 = new JButton("-25");
		button23.setHorizontalAlignment(SwingConstants.CENTER);
		button23.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button23.setBackground(new Color(255, 250, 205));
		button23.setBounds(180, 298, 132, 100);
		frmMYaremchukGame.getContentPane().add(button23);
		
		button24 = new JButton("+5");
		button24.setHorizontalAlignment(SwingConstants.CENTER);
		button24.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button24.setBackground(new Color(255, 250, 205));
		button24.setBounds(322, 298, 132, 100);
		frmMYaremchukGame.getContentPane().add(button24);
		
		button25 = new JButton("End");
		button25.setForeground(Color.WHITE);
		button25.setHorizontalAlignment(SwingConstants.CENTER);
		button25.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button25.setBackground(Color.RED);
		button25.setBounds(464, 298, 132, 100);
		frmMYaremchukGame.getContentPane().add(button25);
		
		button26 = new JButton("+15");
		button26.setHorizontalAlignment(SwingConstants.CENTER);
		button26.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button26.setBackground(new Color(255, 250, 205));
		button26.setBounds(606, 298, 132, 100);
		frmMYaremchukGame.getContentPane().add(button26);
		
		button27 = new JButton("-25");
		button27.setHorizontalAlignment(SwingConstants.CENTER);
		button27.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button27.setBackground(new Color(255, 250, 205));
		button27.setBounds(748, 298, 132, 100);
		frmMYaremchukGame.getContentPane().add(button27);
		
		button28 = new JButton("-200");
		button28.setHorizontalAlignment(SwingConstants.CENTER);
		button28.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button28.setBackground(Color.YELLOW);
		button28.setBounds(890, 298, 132, 100);
		frmMYaremchukGame.getContentPane().add(button28);
		
		button29 = new JButton("Null");
		button29.setForeground(Color.WHITE);
		button29.setHorizontalAlignment(SwingConstants.CENTER);
		button29.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button29.setBackground(Color.BLACK);
		button29.setBounds(1032, 298, 132, 100);
		frmMYaremchukGame.getContentPane().add(button29);
		
		button30 = new JButton("+500");
		button30.setHorizontalAlignment(SwingConstants.CENTER);
		button30.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button30.setBackground(new Color(204, 255, 153));
		button30.setBounds(1174, 298, 132, 100);
		frmMYaremchukGame.getContentPane().add(button30);
		
		button31 = new JButton("+500");
		button31.setHorizontalAlignment(SwingConstants.CENTER);
		button31.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button31.setBackground(new Color(204, 255, 153));
		button31.setBounds(180, 187, 132, 100);
		frmMYaremchukGame.getContentPane().add(button31);
		
		button32 = new JButton("+10");
		button32.setHorizontalAlignment(SwingConstants.CENTER);
		button32.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button32.setBackground(new Color(255, 250, 205));
		button32.setBounds(322, 187, 132, 100);
		frmMYaremchukGame.getContentPane().add(button32);
		
		button33 = new JButton("-200");
		button33.setHorizontalAlignment(SwingConstants.CENTER);
		button33.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button33.setBackground(Color.YELLOW);
		button33.setBounds(464, 187, 132, 100);
		frmMYaremchukGame.getContentPane().add(button33);
		
		button34 = new JButton("-25");
		button34.setHorizontalAlignment(SwingConstants.CENTER);
		button34.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button34.setBackground(new Color(255, 250, 205));
		button34.setBounds(606, 187, 132, 100);
		frmMYaremchukGame.getContentPane().add(button34);
		
		button35 = new JButton("Null");
		button35.setForeground(Color.WHITE);
		button35.setHorizontalAlignment(SwingConstants.CENTER);
		button35.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button35.setBackground(Color.BLACK);
		button35.setBounds(748, 187, 132, 100);
		frmMYaremchukGame.getContentPane().add(button35);
		
		button36 = new JButton("+15");
		button36.setHorizontalAlignment(SwingConstants.CENTER);
		button36.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button36.setBackground(new Color(255, 250, 205));
		button36.setBounds(890, 187, 132, 100);
		frmMYaremchukGame.getContentPane().add(button36);
		
		button37 = new JButton("+10");
		button37.setHorizontalAlignment(SwingConstants.CENTER);
		button37.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button37.setBackground(new Color(255, 250, 205));
		button37.setBounds(1032, 187, 132, 100);
		frmMYaremchukGame.getContentPane().add(button37);
		
		button38 = new JButton("-25");
		button38.setHorizontalAlignment(SwingConstants.CENTER);
		button38.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button38.setBackground(new Color(255, 250, 205));
		button38.setBounds(1174, 187, 132, 100);
		frmMYaremchukGame.getContentPane().add(button38);
		
		button39 = new JButton("+15");
		button39.setForeground(Color.DARK_GRAY);
		button39.setHorizontalAlignment(SwingConstants.CENTER);
		button39.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button39.setBackground(new Color(153, 255, 153));
		button39.setBounds(180, 76, 132, 100);
		frmMYaremchukGame.getContentPane().add(button39);
		
		button40 = new JButton("-25");
		button40.setForeground(Color.DARK_GRAY);
		button40.setHorizontalAlignment(SwingConstants.CENTER);
		button40.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button40.setBackground(new Color(255, 250, 205));
		button40.setBounds(322, 76, 132, 100);
		frmMYaremchukGame.getContentPane().add(button40);
		
		button41 = new JButton("+500");
		button41.setForeground(Color.DARK_GRAY);
		button41.setHorizontalAlignment(SwingConstants.CENTER);
		button41.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button41.setBackground(new Color(50, 205, 50));
		button41.setBounds(464, 76, 132, 100);
		frmMYaremchukGame.getContentPane().add(button41);
		
		button42 = new JButton("+10");
		button42.setForeground(Color.DARK_GRAY);
		button42.setHorizontalAlignment(SwingConstants.CENTER);
		button42.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button42.setBackground(new Color(255, 250, 205));
		button42.setBounds(606, 76, 132, 100);
		frmMYaremchukGame.getContentPane().add(button42);
		
		button43 = new JButton("-1");
		button43.setForeground(Color.DARK_GRAY);
		button43.setHorizontalAlignment(SwingConstants.CENTER);
		button43.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button43.setBackground(new Color(255, 250, 205));
		button43.setBounds(748, 76, 132, 100);
		frmMYaremchukGame.getContentPane().add(button43);
		
		button44 = new JButton("-200");
		button44.setForeground(Color.DARK_GRAY);
		button44.setHorizontalAlignment(SwingConstants.CENTER);
		button44.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button44.setBackground(Color.YELLOW);
		button44.setBounds(890, 76, 132, 100);
		frmMYaremchukGame.getContentPane().add(button44);
		
		button45 = new JButton("+100");
		button45.setForeground(Color.DARK_GRAY);
		button45.setHorizontalAlignment(SwingConstants.CENTER);
		button45.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button45.setBackground(new Color(204, 255, 255));
		button45.setBounds(1032, 76, 132, 100);
		frmMYaremchukGame.getContentPane().add(button45);
		
		button46 = new JButton("+10");
		button46.setForeground(Color.DARK_GRAY);
		button46.setHorizontalAlignment(SwingConstants.CENTER);
		button46.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button46.setBackground(new Color(255, 250, 205));
		button46.setBounds(1174, 76, 132, 100);
		frmMYaremchukGame.getContentPane().add(button46);
		
		button48 = new JButton(" 0 ");
		button48.setHorizontalAlignment(SwingConstants.CENTER);
		button48.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button48.setBackground(new Color(255, 250, 205));
		button48.setBounds(590, 10, 180, 55);
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
		
		scoreButton = new JButton("\u0420\u0430\u0445\u0443\u043D\u043E\u043A:");
		scoreButton.setBackground(Color.ORANGE);
		scoreButton.setForeground(Color.BLACK);
		scoreButton.setFont(new Font("Times New Roman", Font.BOLD, 45));
		scoreButton.setBounds(226, 10, 260, 55);
		frmMYaremchukGame.getContentPane().add(scoreButton);
		
		scoreFrameButton1 = new JButton(">>>");
		scoreFrameButton1.setFont(new Font("Times New Roman", Font.BOLD, 40));
		scoreFrameButton1.setBackground(Color.ORANGE);
		scoreFrameButton1.setBounds(479, 10, 115, 55);
		frmMYaremchukGame.getContentPane().add(scoreFrameButton1);
		
		button = new JButton("<<<");
		button.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button.setBackground(Color.ORANGE);
		button.setBounds(768, 10, 115, 55);
		frmMYaremchukGame.getContentPane().add(button);
		
		redFrameButton2 = new JButton("");
		redFrameButton2.setBackground(new Color(255, 0, 0));
		redFrameButton2.setBounds(155, 520, 1175, 13);
		frmMYaremchukGame.getContentPane().add(redFrameButton2);
		
		redFrameButton3 = new JButton("");
		redFrameButton3.setBackground(Color.RED);
		redFrameButton3.setBounds(155, 657, 1175, 13);
		frmMYaremchukGame.getContentPane().add(redFrameButton3);
		
		redFrameButton1 = new JButton("");
		redFrameButton1.setBackground(new Color(255, 0, 0));
		redFrameButton1.setBounds(155, 520, 14, 150);
		frmMYaremchukGame.getContentPane().add(redFrameButton1);
		
		redFrameButton4 = new JButton("");
		redFrameButton4.setBackground(Color.RED);
		redFrameButton4.setBounds(1316, 520, 14, 150);
		frmMYaremchukGame.getContentPane().add(redFrameButton4);
		
		timeButton = new JButton("\u0427\u0430\u0441 :");
		timeButton.setForeground(Color.BLACK);
		timeButton.setBackground(new Color(0, 191, 255));
		timeButton.setFont(new Font("Times New Roman", Font.BOLD, 45));
		timeButton.setBounds(940, 10, 200, 55);
		frmMYaremchukGame.getContentPane().add(timeButton);
		
		showTimeButton = new JButton("");
		showTimeButton.setBackground(new Color(224, 255, 255));
		showTimeButton.setText(""+a);
		showTimeButton.setFont(new Font("Times New Roman", Font.BOLD, 40));
		showTimeButton.setBounds(1150, 10, 180, 55);
		frmMYaremchukGame.getContentPane().add(showTimeButton);
		
		levelFrame1 = new JButton("");
		levelFrame1.setBackground(new Color(0, 250, 154));
		levelFrame1.setBounds(0, 520, 155, 13);
		frmMYaremchukGame.getContentPane().add(levelFrame1);
		
		levelFrame2 = new JButton("");
		levelFrame2.setBackground(new Color(0, 250, 154));
		levelFrame2.setBounds(0, 657, 155, 13);
		frmMYaremchukGame.getContentPane().add(levelFrame2);
		
		levelFrame3 = new JButton("New button");
		levelFrame3.setBackground(new Color(0, 250, 154));
		levelFrame3.setBounds(139, 76, 14, 594);
		frmMYaremchukGame.getContentPane().add(levelFrame3);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
			a+=1;
			showTimeButton.setText((a/5)+" сек");
			IndLent = IndLent + 1; //Погасити ще один елемент кольорового індикатора
			if (IndLent == 9) mainTimer.restart(); //Відновити інтервал роботи індикатора
			if (IndLent == 9) {	
			new Num_Move().numMove(window);
			new Save_Color().markerReset(window);; //Відновити колір комірки с маркером
			System.out.println(Count.isEnd);
			if(Count.isEnd)
				new Count().dnCount(window); //Підрахувати очки при зсуві зверху вниз
			}
			if (IndLent == 9) IndLent = 0; //Повний розмір індикатора
			Print_Ind();   //Намалюємо індикатор
		
		}
}
