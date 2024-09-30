package Interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class ejercicio2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio2 frame = new ejercicio2();
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
	public ejercicio2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		btnNewButton_2 = new JButton("Uno");
		
		btnNewButton_1 = new JButton("Dos");
		
		btnNewButton = new JButton("Tres");
		
		JButton btnNewButton_2_1 = new JButton("Cuatro");
		
		JButton btnNewButton_2_1_1 = new JButton("Cinco");
		contentPane.setLayout(new GridLayout(0, 5, 0, 0));
		contentPane.add(btnNewButton_2);
		contentPane.add(btnNewButton_1);
		contentPane.add(btnNewButton);
		contentPane.add(btnNewButton_2_1);
		contentPane.add(btnNewButton_2_1_1);
	}
}
