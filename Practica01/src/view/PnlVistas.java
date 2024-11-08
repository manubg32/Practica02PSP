package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controller.GestionEmpleados;

public class PnlVistas extends JPanel {
	
	//Creamos una instancia de la clase GestionEmpleados para utilizar sus métodos más adelante
	private static GestionEmpleados ge = new GestionEmpleados();

	private static final long serialVersionUID = 1L;
	
	private static JPanel contentPane;
	private static JPanel pnlMostrar;
	
	
	private JTextField txtNombre;
	private JTextField txtFechaNacimiento;
	private JTextField txtSalario;
	private JTextField txtOficio;
	
	
	private static JButton btnPrimero;
	private static JButton btnAnterior;
	private static JButton btnSiguiente;
	private static JButton btnUltimo;

	/**
	 * Create the panel.
	 */
	public PnlVistas() {
		setLayout(new GridLayout(0, 1, 0, 0));
		
		initComponents();
		
		//Inicializamos la lista, mostramos el primero y comprobamos como deben estar los botones
		ge.mostrarPrimero(txtNombre, txtFechaNacimiento, txtSalario, txtOficio);
		ge.comprobarBotonesVista(GestionEmpleados.pos, btnPrimero, btnAnterior, btnSiguiente, btnUltimo);
				
		//Añadimos las acciones de los eventos
		addListeners();

	}

	private void addListeners() {
		
		//Añadimos funcionalidad al boton Primero
		btnPrimero.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ge.mostrarPrimero(txtNombre, txtFechaNacimiento, txtSalario, txtOficio);
				ge.comprobarBotonesVista(GestionEmpleados.pos, btnPrimero, btnAnterior, btnSiguiente, btnUltimo);
			}	
		});
		
		//Añadimos funcionalidad al boton Anterior
		btnAnterior.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ge.mostrarAnterior(txtNombre, txtFechaNacimiento, txtSalario, txtOficio);
				ge.comprobarBotonesVista(GestionEmpleados.pos, btnPrimero, btnAnterior, btnSiguiente, btnUltimo);
			}
		});
		
		//Añadimos funcionalidad al boton Siguiente
		btnSiguiente.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ge.mostrarSiguiente(txtNombre, txtFechaNacimiento, txtSalario, txtOficio);
				ge.comprobarBotonesVista(GestionEmpleados.pos, btnPrimero, btnAnterior, btnSiguiente, btnUltimo);
			}
		});
		
		//Añadimos funcionalidad al boton Ultimo
		btnUltimo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ge.mostrarUltimo(txtNombre, txtFechaNacimiento, txtSalario, txtOficio);
				ge.comprobarBotonesVista(GestionEmpleados.pos, btnPrimero, btnAnterior, btnSiguiente, btnUltimo);
			}
		});
		
	}

	private void initComponents() {
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		add(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		pnlMostrar = new JPanel();
		contentPane.add(pnlMostrar, BorderLayout.CENTER);
		pnlMostrar.setLayout(new GridLayout(4, 2, 0, 0));
		
		JLabel lblNombre = new JLabel("Nombre");
		pnlMostrar.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setEditable(false);
		txtNombre.setColumns(10);
		pnlMostrar.add(txtNombre);
		
		JLabel lblFechaNacimiento = new JLabel("Fecha Nacimiento");
		pnlMostrar.add(lblFechaNacimiento);
		
		txtFechaNacimiento = new JTextField();
		txtFechaNacimiento.setEditable(false);
		txtFechaNacimiento.setColumns(10);
		pnlMostrar.add(txtFechaNacimiento);
		
		JLabel lblSalario = new JLabel("Salario");
		pnlMostrar.add(lblSalario);
		
		txtSalario = new JTextField();
		txtSalario.setEditable(false);
		txtSalario.setColumns(10);
		pnlMostrar.add(txtSalario);
		
		JLabel lblOficio = new JLabel("Oficio");
		pnlMostrar.add(lblOficio);
		
		txtOficio = new JTextField();
		txtOficio.setEditable(false);
		pnlMostrar.add(txtOficio);
		txtOficio.setColumns(10);
		
		JPanel pnlBotones = new JPanel();
		contentPane.add(pnlBotones, BorderLayout.SOUTH);
		pnlBotones.setLayout(new GridLayout(0, 4, 0, 0));
		
		btnPrimero = new JButton("Primero");
		btnPrimero.setEnabled(false);
		pnlBotones.add(btnPrimero);
		
		btnAnterior = new JButton("Anterior");
		pnlBotones.add(btnAnterior);
		
		btnSiguiente = new JButton("Siguiente");
		pnlBotones.add(btnSiguiente);
		
		btnUltimo = new JButton("Ultimo");
		btnUltimo.setEnabled(false);
		pnlBotones.add(btnUltimo);
		
	}

}
