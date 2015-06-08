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
		frame.getContentPane().setBackground(new Color(0, 128, 128));
		frame.getContentPane().setLayout(null);
		
		btnNewButton = new JButton("M. Yaremchuk game");
		btnNewButton.setForeground(new Color(152, 251, 152));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 99));
		btnNewButton.setBackground(new Color(0, 128, 128));
		btnNewButton.setBounds(108, 39, 1130, 123);
		frame.getContentPane().add(btnNewButton);
		
		button = new JButton("\u041E\u0431\u0435\u0440\u0456\u0442\u044C \u0440\u0435\u0436\u0438\u043C \u0433\u0440\u0438:");
		button.setBackground(new Color(102, 205, 170));
		button.setFont(new Font("Times New Roman", Font.BOLD, 45));
		button.setBounds(108, 178, 463, 88);
		frame.getContentPane().add(button);
		
		button_1 = new JButton("\u0417\u0431\u0456\u043B\u044C\u0448\u0435\u043D\u043D\u044F \u0448\u0432\u0438\u0434\u043A\u043E\u0441\u0442\u0456");
		
		
		button_1.setFont(new Font("Times New Roman", Font.BOLD, 45));
		button_1.setForeground(new Color(248, 248, 255));
		button_1.setBackground(new Color(0, 0, 205));
		button_1.setBounds(667, 173, 571, 109);
		frame.getContentPane().add(button_1);
		
		button_2 = new JButton(" 100 \u0440\u0456\u0432\u043D\u0456\u0432");
		button_2.setForeground(new Color(248, 248, 255));
		button_2.setFont(new Font("Times New Roman", Font.BOLD, 45));
		button_2.setBackground(new Color(0, 0, 205));
		button_2.setBounds(667, 321, 571, 109);
		frame.getContentPane().add(button_2);
		
		button_3 = new JButton("\u0420\u0435\u0437\u0443\u043B\u044C\u0442\u0430\u0442\u0438");
		button_3.setForeground(new Color(248, 248, 255));
		button_3.setFont(new Font("Times New Roman", Font.BOLD, 45));
		button_3.setBackground(new Color(0, 0, 205));
		button_3.setBounds(126, 277, 445, 77);
		frame.getContentPane().add(button_3);
		
		table = new JTable();
		MyConnect m = new MyConnect();
		m.openConn("Game");
		table.setModel(new javax.swing.table.DefaultTableModel(
	            m.arrayToObject(m.get()),
	            new String [] {
	               ""
	            }
	        ));
	        table.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
		table.setBounds(108, 362, 463, 339);
		frame.getContentPane().add(table);
		frame.setBounds(5, 0, 1355, 740);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
