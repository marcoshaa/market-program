package mmj;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.JComboBox;

@SuppressWarnings("unused")
public class ViewLogin extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewLogin frame = new ViewLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ViewLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 524, 370);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("CADASTRAR");
		btnNewButton.setBounds(158, 205, 113, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewCad telaDeCad = new ViewCad();
				telaDeCad.setVisible(true);
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(209, 166, -93, 23);
		contentPane.add(scrollPane);
		
		JButton button_ent = new JButton("ENTRAR");
		button_ent.setBounds(158, 171, 113, 23);
		button_ent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bEntrar acaoEntrar = new bEntrar();
				acaoEntrar.actionPerformed(e);
			}
		});
		contentPane.add(button_ent);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(158, 109, 113, 20);
		contentPane.add(passwordField);
		
		textField = new JTextField();
		textField.setBounds(158, 54, 113, 20);
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("USUARIO:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setForeground(SystemColor.text);
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setBounds(158, 27, 86, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("SENHA:");
		lblNewLabel_1.setBackground(SystemColor.windowText);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1.setForeground(SystemColor.text);
		lblNewLabel_1.setBounds(158, 85, 72, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(0, 0, 508, 331);
		lblNewLabel_2.setIcon(new ImageIcon(ViewLogin.class.getResource("/mmj_imagens/instalacoes-para-mercado.jpg")));
		contentPane.add(lblNewLabel_2);
	}
}
