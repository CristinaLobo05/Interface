package Interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ej extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ej frame = new ej();
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
	public ej() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		import java.util.Scanner;

		public class DNIValidator {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        String dni;
		        boolean dniValido = false;

		        while (!dniValido) {
		            System.out.print("Introduce tu DNI (8 números y 1 letra): ");
		            dni = scanner.nextLine().trim();

		            // Verifica si la longitud del DNI es 9
		            if (dni.length() != 9) {
		                System.out.println("Error: El DNI debe tener 8 números y 1 letra.");
		                continue;
		            }

		            String numeros = dni.substring(0, 8);
		            char letra = dni.charAt(8);

		           
		            if (!numeros.matches("[0-9]{8}")) {
		                System.out.println("Error: Los primeros 8 caracteres deben ser números.");
		                continue;
		            }

		          
		            if (!Character.isLetter(letra)) {
		                System.out.println("Error: El último carácter debe ser una letra.");
		                continue;
		            }

		            
		            dniValido = true;
		            System.out.println("DNI válido: " + dni);
		        }

		        scanner.close();
		    }
		}

		
		
		
	}

}
