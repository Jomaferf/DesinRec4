package desin;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaRepaso {

	private JFrame frame;
	private JTextField tf_texto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaRepaso window = new VentanaRepaso();
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
	public VentanaRepaso() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Desin");
		//frame.setIconImage(null);
		
		tf_texto = new JTextField();
		tf_texto.setText("Selecciona un color");
		tf_texto.setBounds(92, 48, 255, 20);
		frame.getContentPane().add(tf_texto);
		tf_texto.setColumns(10);
		
		JComboBox cb_colores = new JComboBox();
		cb_colores.setModel(new DefaultComboBoxModel(new String[] {"Azul", "Verde", "Rojo", "Negro"}));
		cb_colores.setBounds(92, 114, 91, 22);
		frame.getContentPane().add(cb_colores);
		
		JButton btn_cambiaColor = new JButton("Cambiar color");
		btn_cambiaColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Color colorTexto = new Color(0);
				String colorSelec = (String) cb_colores.getSelectedItem();
				
				switch (colorSelec) {
				case "Azul":
					colorTexto = Color.blue;
					break;
					
				case "Rojo":
					colorTexto = Color.red;
					break;
					
				case "Verde":
					colorTexto = Color.green;
					break;
					
				case "Negro":
					colorTexto = Color.black;
					break;
				}
				
				
				tf_texto.setForeground(colorTexto);
				tf_texto.setText("Ahora mi color es " + colorSelec);
			}
		});
		btn_cambiaColor.setBounds(223, 114, 124, 23);
		frame.getContentPane().add(btn_cambiaColor);
	}
}
