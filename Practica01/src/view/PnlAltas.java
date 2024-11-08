package view;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Component;
import java.awt.Rectangle;

public class PnlAltas extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtNombre;
	private JTextField txtFechaNacimiento;
	private JTextField txtSalario;
	private JTextField txtSueldoMaximo;
	private JTextField txtOficio;

	/**
	 * Create the panel.
	 */
	public PnlAltas() {
		
		
		initComponents();
		setLayout(new GridLayout(6, 2, 5, 5));
		
		JLabel lblNombre = new JLabel("Nombre: ");
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNombre);
		
		txtNombre = new JTextField();
		add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblFechaNacimiento = new JLabel("Fecha Nacimiento:");
		lblFechaNacimiento.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblFechaNacimiento);
		
		txtFechaNacimiento = new JTextField();
		add(txtFechaNacimiento);
		txtFechaNacimiento.setColumns(10);
		
		JLabel lblSalario = new JLabel("Salario:");
		lblSalario.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblSalario);
		
		txtSalario = new JTextField();
		add(txtSalario);
		txtSalario.setColumns(10);
		
		JLabel lblSueldoMax = new JLabel("Sueldo máximo");
		lblSueldoMax.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblSueldoMax);
		
		txtSueldoMaximo = new JTextField();
		add(txtSueldoMaximo);
		txtSueldoMaximo.setColumns(10);
		
		JLabel lblOficio = new JLabel("Oficio:");
		lblOficio.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblOficio);
		
		txtOficio = new JTextField();
		add(txtOficio);
		txtOficio.setColumns(10);
		
		JButton btnBorrar = new JButton("Borrar");
		add(btnBorrar);
		
		JButton btnGuardar = new JButton("Guardar");
		add(btnGuardar);

	}

}
