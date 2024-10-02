package Interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;
import javax.swing.SwingConstants;

public class ejercicio5 extends JFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio5 frame = new ejercicio5();
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
	public ejercicio5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 926, 587);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		ImageIcon imagenOriginal = new ImageIcon("C:\\Users\\crist\\Desktop\\repositorio\\Interfaces\\imagenes\\Captura de pantalla 2024-10-02 081712.png");

        frame.setVisible(true);
	
		}
	}