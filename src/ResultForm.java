import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class ResultForm {

	public JFrame frame;
	public JButton btnNewButton ;
	public JButton button_3;
	public JTextField textField;
	public JButton  button_2;
	public JButton button;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ResultForm window = new ResultForm();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public ResultForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(400, 150, 565, 379);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		button = new JButton("\u0417\u0431\u0435\u0440\u0435\u0433\u0442\u0438 \u0440\u0435\u0437\u0443\u043B\u044C\u0442\u0430\u0442\u0438?");
		button.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button.setBounds(34, 26, 483, 63);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("\u0422\u0430\u043A");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setVisible(true);
				btnNewButton.setVisible(true);
				button_3.setVisible(true);
			}
		});
		button_1.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button_1.setBounds(74, 144, 140, 63);
		frame.getContentPane().add(button_1);
		
	 button_2 = new JButton("\u041D\u0456");
		button_2.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button_2.setBounds(326, 144, 140, 63);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		frame.getContentPane().add(button_2);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.BOLD, 30));
		textField.setBounds(266, 239, 200, 50);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		button_3 = new JButton("\u0412\u0432\u0435\u0434\u0456\u0442\u044C \u0456\u043C'\u044F:");
		button_3.setFont(new Font("Times New Roman", Font.BOLD, 25));
		button_3.setBounds(34, 242, 200, 44);
		frame.getContentPane().add(button_3);
		
		btnNewButton = new JButton("\u0413\u043E\u0442\u043E\u0432\u043E!");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 35));
		btnNewButton.setBounds(276, 300, 181, 40);
		frame.getContentPane().add(btnNewButton);
		button_3.setVisible(false);
		textField.setVisible(false);
		btnNewButton.setVisible(false);
	}
}
