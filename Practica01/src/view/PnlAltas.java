package view;

import controller.GestionEmpleados;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Component;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PnlAltas extends JPanel {
	private static GestionEmpleados ge = new GestionEmpleados();


	private static final long serialVersionUID = 1L;

	private JTextField txtNombre;
	private JTextField txtFechaNacimiento;
	private JTextField txtSalario;
	private JTextField txtSueldoMaximo;
	private JTextField txtOficio;

	private JButton btnGuardar;
	private JButton btnBorrar;


	/**
	 * Create the panel.
	 */
	public PnlAltas() {

		setLayout(new GridLayout(6, 2, 5, 5));

		initComponents();
		addListeners();
	}
	private void addListeners() {
		btnGuardar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ge.guardar(txtNombre,txtFechaNacimiento,txtSalario,txtSueldoMaximo,txtOficio);
			}
		});

		btnBorrar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ge.cancelar(txtNombre,txtFechaNacimiento,txtSalario,txtSueldoMaximo,txtOficio);
			}
		});
	}


	private void initComponents() {
		JLabel lblNombre = new JLabel("Nombre: ");
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNombre);

		txtNombre = new JTextField();
		add(txtNombre);
		txtNombre.setColumns(10);

		JLabel lblFechaNacimiento = new JLabel("Fecha Nacimiento (yyyy-MM-dd):");
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

		 btnBorrar = new JButton("Borrar");
		add(btnBorrar);

		 btnGuardar = new JButton("Guardar");

		add(btnGuardar);
		setVisible(true);
	}
}
