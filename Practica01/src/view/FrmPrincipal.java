package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controller.GestionEmpleados;

public class FrmPrincipal extends JFrame {
	//Declaramos los elementos que vayamos a utilizar en las llamadas a los métodos como privados y estáticos
	private static final long serialVersionUID = 1L;
	private static JPanel contentPane;
	private static JTextField txtNombre;
	private static JTextField txtFechaNacimiento;
	private static JTextField txtSalario;
	private static JButton btnGuardar;
	private static JButton btnCancelar;
	private static JButton btnSiguiente;
	private static JButton btnAnterior;
	
	//Creamos una instancia de la clase GestionEmpleados para utilizar sus métodos más adelante
	private static GestionEmpleados ge = new GestionEmpleados();


	

	/**
	 * Lanzamos la aplicacion
	 */
	


	/**
	 * Creamos el Frame
	 */
	public FrmPrincipal() {
		//Propiedades Frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		//Instanciamos y damos propiedades a los distintos parámetros que forman la interfaz
		JPanel pnlMostrar = new JPanel();
		contentPane.add(pnlMostrar, BorderLayout.CENTER);
		pnlMostrar.setLayout(new GridLayout(3, 2, 0, 0));
		
		JLabel lblNombre = new JLabel("Nombre");
		pnlMostrar.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setEditable(false);
		pnlMostrar.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblFechaNacimiento = new JLabel("Fecha Nacimiento");
		pnlMostrar.add(lblFechaNacimiento);
		
		txtFechaNacimiento = new JTextField();
		txtFechaNacimiento.setEditable(false);
		pnlMostrar.add(txtFechaNacimiento);
		txtFechaNacimiento.setColumns(10);
		
		JLabel lblSalario = new JLabel("Salario");
		pnlMostrar.add(lblSalario);
		
		txtSalario = new JTextField();
		txtSalario.setEditable(false);
		pnlMostrar.add(txtSalario);
		txtSalario.setColumns(10);
		
		JPanel pnlBotones = new JPanel();
		contentPane.add(pnlBotones, BorderLayout.SOUTH);
		pnlBotones.setLayout(new GridLayout(0, 4, 0, 0));
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setEnabled(false);
		
		pnlBotones.add(btnGuardar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setEnabled(false);
		pnlBotones.add(btnCancelar);
		
		btnAnterior = new JButton("Anterior");
		pnlBotones.add(btnAnterior);
		
		btnSiguiente = new JButton("Siguiente");
		pnlBotones.add(btnSiguiente);
		
		
		//Inicializamos la lista, mostramos el primero y comprobamos como deben estar los botones
		ge.InicializarLista();
		GestionEmpleados.mostrarPrimero(txtNombre, txtFechaNacimiento, txtSalario);
		ge.comprobarBotones(GestionEmpleados.pos, btnGuardar, btnCancelar, btnSiguiente, btnAnterior);
		
		//Añadimos las acciones de los eventos
		addListeners();
	}
	
	public void addListeners() {
		
		//Acciones de los eventos en los botones
		btnSiguiente.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ge.mostrarSiguiente(txtNombre, txtFechaNacimiento, txtSalario);
				ge.comprobarBotones(GestionEmpleados.pos, btnGuardar, btnCancelar, btnSiguiente, btnAnterior);
			}
		});
		
		btnAnterior.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ge.mostrarAnterior(txtNombre, txtFechaNacimiento, txtSalario);
				ge.comprobarBotones(GestionEmpleados.pos, btnGuardar, btnCancelar, btnSiguiente, btnAnterior);
			}
		});
		
		btnGuardar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ge.guardar(txtNombre, txtFechaNacimiento, txtSalario);	
				ge.comprobarBotones(GestionEmpleados.pos, btnGuardar, btnCancelar, btnSiguiente, btnAnterior);
			}
		});

		btnCancelar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ge.cancelar(txtNombre, txtFechaNacimiento, txtSalario);				
			}
		});


		//Pruebas detectar cuando borro texto
		txtFechaNacimiento.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(txtFechaNacimiento.getText().isEmpty()){
					txtFechaNacimiento.setForeground(Color.black);
				}
			}
		});

		txtSalario.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(txtSalario.getText().isEmpty()){
					txtSalario.setForeground(Color.black);
				}
			}
		});

	}

}
