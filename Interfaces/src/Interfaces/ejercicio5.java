package Interfaces;

public class ejercicio5 {

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
		public ejercicio5() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 926, 587);
			getContentPane().setLayout(null);
			getContentPane().setLayout(null);
			ImageIcon imagenOriginal = new ImageIcon("C:\\Users\\crist\\Desktop\\repositorio\\Interfaces\\imagenes\\Captura de pantalla 2024-10-02 081712.png");

	        frame.setVisible(true);
		
			}
		}

}
