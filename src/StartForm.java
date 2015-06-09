import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.Color;

import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JTextArea;


public class StartForm {

	public JFrame frame;
	Form1 fr;
	static StartForm window;
	
	JButton button_1 ;
	JButton btnNewButton ;
	JButton button_2;
	JButton button;
	public JButton button_3;
	private JTable table;
	private JTextArea textArea_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window = new StartForm();
					window.frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StartForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(25, 25, 112));
		frame.getContentPane().setLayout(null);
		
		btnNewButton = new JButton("M. Yaremchuk game");
		btnNewButton.setForeground(new Color(152, 251, 152));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 99));
		btnNewButton.setBackground(new Color(25, 25, 112));
		btnNewButton.setBounds(108, 11, 1130, 123);
		frame.getContentPane().add(btnNewButton);
		
		button = new JButton("\u041E\u0431\u0435\u0440\u0456\u0442\u044C \u0440\u0435\u0436\u0438\u043C \u0433\u0440\u0438:");
		button.setBackground(new Color(192, 192, 192));
		button.setFont(new Font("Times New Roman", Font.BOLD, 45));
		button.setBounds(52, 135, 463, 88);
		frame.getContentPane().add(button);
		
		button_1 = new JButton("\u0417\u0431\u0456\u043B\u044C\u0448\u0435\u043D\u043D\u044F \u0448\u0432\u0438\u0434\u043A\u043E\u0441\u0442\u0456");
		
		
		button_1.setFont(new Font("Times New Roman", Font.BOLD, 45));
		button_1.setForeground(new Color(248, 248, 255));
		button_1.setBackground(new Color(0, 0, 205));
		button_1.setBounds(52, 243, 571, 77);
		frame.getContentPane().add(button_1);
		
		button_2 = new JButton(" 100 \u0440\u0456\u0432\u043D\u0456\u0432");
		button_2.setForeground(new Color(248, 248, 255));
		button_2.setFont(new Font("Times New Roman", Font.BOLD, 45));
		button_2.setBackground(new Color(0, 0, 205));
		button_2.setBounds(52, 472, 571, 82);
		frame.getContentPane().add(button_2);
		
		button_3 = new JButton("\u0420\u0435\u0437\u0443\u043B\u044C\u0442\u0430\u0442\u0438");
		button_3.setForeground(new Color(248, 248, 255));
		button_3.setFont(new Font("Times New Roman", Font.BOLD, 45));
		button_3.setBackground(new Color(46, 139, 87));
		button_3.setBounds(896, 134, 341, 77);
		frame.getContentPane().add(button_3);
		
		table = new JTable();
		MyConnect m = new MyConnect();
		m.openConn("Game");
		table.setModel(new javax.swing.table.DefaultTableModel(
	            m.arrayToObject(m.get()),
	            new String [] {
	               "jhjhhh","fff","adsf","asdfsa"
	            }
	        ));
		
	        table.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
		table.setBounds(802, 209, 515, 464);
		frame.getContentPane().add(table);
		
		JTextArea textArea = new JTextArea();
		textArea.setForeground(Color.BLACK);
		textArea.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		textArea.setText("     \u0423 \u0446\u044C\u043E\u043C\u0443 \u0440\u0435\u0436\u0438\u043C\u0456 \u0433\u0440\u0430 \u0442\u0440\u0438\u0432\u0430\u0442\u0438\u043C\u0435 \u043B\u0438\u0448\u0435 100 \u0440\u0456\u0432\u043D\u0456\u0432.\r\n     \u0412\u0430\u0448\u0435 \u0437\u0430\u0432\u0434\u0430\u043D\u043D\u044F - \u043D\u0430\u0431\u0435\u0440\u0456\u0442\u044C \u043C\u0430\u043A\u0441\u0438\u043C\u0430\u043B\u044C\u043D\u0443 \u043A\u0456\u043B\u044C\u043A\u0456\u0441\u0442\u044C \u043E\u0447\u043E\u043A.\r\n\u0428\u0432\u0438\u0434\u043A\u0456\u0441\u0442\u044C \u0441\u043F\u0443\u0441\u043A\u0430\u043D\u043D\u044F \u043A\u043E\u043C\u0456\u0440\u043E\u043A \u043E\u0434\u043D\u0430\u043A\u043E\u0432\u0430 \u0432\u043F\u0440\u043E\u0434\u043E\u0432\u0436 \u0432\u0441\u044C\u043E\u0433\u043E \u0456\u043D\u0442\u0435\u0440\u0432\u0430\u043B\u0443.\r\n     \u0423\u0441\u043F\u0456\u0445\u0456\u0432! ");
		textArea.setBackground(Color.ORANGE);
		textArea.setBounds(23, 553, 748, 120);
		frame.getContentPane().add(textArea);
		
		textArea_1 = new JTextArea();
		textArea_1.setText("     \u0423 \u0446\u044C\u043E\u043C\u0443 \u0440\u0435\u0436\u0438\u043C\u0456 \u0433\u0440\u0438 \u0448\u0432\u0438\u0434\u043A\u0456\u0441\u0442\u044C \u0441\u043F\u0443\u0441\u043A\u0430\u043D\u043D\u044F \u043A\u043E\u043C\u0456\u0440\u043E\u043A \u0437 \u043A\u043E\u0436\u043D\u0438\u043C \r\n\u043D\u043E\u0432\u0438\u043C \u0440\u0456\u0432\u043D\u0435\u043C \u0437\u0431\u0456\u043B\u044C\u0448\u0443\u0432\u0430\u0442\u0438\u043C\u0435\u0442\u044C\u0441\u044F.\r\n     \u0412\u0430\u0448\u0435 \u0437\u0430\u0432\u0434\u0430\u043D\u043D\u044F - \u043D\u0430\u0431\u0435\u0440\u0456\u0442\u044C \u043C\u0430\u043A\u0441\u0438\u043C\u0430\u043B\u044C\u043D\u0443 \u043A\u0456\u043B\u044C\u043A\u0456\u0441\u0442\u044C \u043E\u0447\u043E\u043A.\r\n     \u041F\u043E\u0440\u0430\u0434\u0430 : \u043E\u0441\u0442\u0435\u0440\u0456\u0433\u0430\u0439\u0442\u0435\u0441\u044C \u043A\u043E\u043C\u0456\u0440\u043E\u043A \u0437 \u043D\u0430\u043F\u0438\u0441\u043E\u043C \"End\" .  \u0423\u0441\u043F\u0456\u0445\u0456\u0432! ");
		textArea_1.setForeground(Color.BLACK);
		textArea_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		textArea_1.setBackground(Color.ORANGE);
		textArea_1.setBounds(23, 319, 748, 120);
		frame.getContentPane().add(textArea_1);
		frame.setBounds(5, 0, 1355, 740);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
