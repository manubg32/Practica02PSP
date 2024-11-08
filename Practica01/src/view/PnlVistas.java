package view;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class PnlVistas extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField txtOficio;

	/**
	 * Create the panel.
	 */
	public PnlVistas() {
		setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		add(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel pnlMostrar = new JPanel();
		contentPane.add(pnlMostrar, BorderLayout.CENTER);
		pnlMostrar.setLayout(new GridLayout(4, 2, 0, 0));
		
		JLabel lblNombre = new JLabel("Nombre");
		pnlMostrar.add(lblNombre);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		pnlMostrar.add(textField);
		
		JLabel lblFechaNacimiento = new JLabel("Fecha Nacimiento");
		pnlMostrar.add(lblFechaNacimiento);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		pnlMostrar.add(textField_1);
		
		JLabel lblSalario = new JLabel("Salario");
		pnlMostrar.add(lblSalario);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		pnlMostrar.add(textField_2);
		
		JLabel lblOficio = new JLabel("Oficio");
		pnlMostrar.add(lblOficio);
		
		txtOficio = new JTextField();
		txtOficio.setEditable(false);
		pnlMostrar.add(txtOficio);
		txtOficio.setColumns(10);
		
		JPanel pnlBotones = new JPanel();
		contentPane.add(pnlBotones, BorderLayout.SOUTH);
		pnlBotones.setLayout(new GridLayout(0, 4, 0, 0));
		
		JButton btnPrimero = new JButton("Primero");
		btnPrimero.setEnabled(false);
		pnlBotones.add(btnPrimero);
		
		JButton btnAnterior = new JButton("Anterior");
		pnlBotones.add(btnAnterior);
		
		JButton btnSiguiente = new JButton("Siguiente");
		pnlBotones.add(btnSiguiente);
		
		JButton btnUltimo = new JButton("Ultimo");
		btnUltimo.setEnabled(false);
		pnlBotones.add(btnUltimo);

	}

}
