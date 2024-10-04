package Ejercicios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class Interfaces extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaces frame = new Interfaces();
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
	public Interfaces() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("usuario");
		lblNewLabel.setBounds(137, 13, 49, 14);
		contentPane.add(lblNewLabel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(195, 41, 104, 20);
		contentPane.add(passwordField);
		
		textField = new JTextField();
		textField.setBounds(196, 10, 103, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("contraseña");
		lblNewLabel_1.setBounds(137, 47, 49, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("confirmar");
		btnNewButton.setBounds(195, 87, 89, 23);
		contentPane.add(btnNewButton);
	}
}
