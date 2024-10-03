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
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

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
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{129, 136, 136, 0};
		gbl_contentPane.rowHeights = new int[]{118, 116, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		btnNewButton_2 = new JButton("Uno");
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_2.gridx = 0;
		gbc_btnNewButton_2.gridy = 0;
		contentPane.add(btnNewButton_2, gbc_btnNewButton_2);
		
		btnNewButton_1 = new JButton("Dos");
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1.gridx = 1;
		gbc_btnNewButton_1.gridy = 0;
		contentPane.add(btnNewButton_1, gbc_btnNewButton_1);
		
		btnNewButton = new JButton("Tres");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.gridx = 2;
		gbc_btnNewButton.gridy = 0;
		contentPane.add(btnNewButton, gbc_btnNewButton);
		
		JButton btnNewButton_2_1 = new JButton("Cuatro");
		GridBagConstraints gbc_btnNewButton_2_1 = new GridBagConstraints();
		gbc_btnNewButton_2_1.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_2_1.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_2_1.gridx = 0;
		gbc_btnNewButton_2_1.gridy = 1;
		contentPane.add(btnNewButton_2_1, gbc_btnNewButton_2_1);
		
		JButton btnNewButton_2_1_1 = new JButton("Cinco");
		GridBagConstraints gbc_btnNewButton_2_1_1 = new GridBagConstraints();
		gbc_btnNewButton_2_1_1.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_2_1_1.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_2_1_1.gridx = 1;
		gbc_btnNewButton_2_1_1.gridy = 1;
		contentPane.add(btnNewButton_2_1_1, gbc_btnNewButton_2_1_1);
	}
}
