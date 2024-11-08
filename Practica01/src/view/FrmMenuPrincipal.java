package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import controller.GestionEmpleados;

public class FrmMenuPrincipal extends JFrame {

	private static GestionEmpleados ge = new GestionEmpleados();

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	private JMenuBar menuBar;
	private JMenu mnuPaneles;
	private JMenuItem mniMenu;
	private JMenuItem mniVer;
	private JMenuItem mniAltas;
	private JSeparator separator;
	private JMenuItem mniAcercaDe;
	private JPanel pnlVistas;
	private JPanel pnlAltas;
	private JPanel pnlAcercaDe;

	private ImageIcon imagen;
	private JLabel lblImagen;


	public FrmMenuPrincipal() {

		// Ponemos los atributos del JFrame y del JPanel
		setIconImage(Toolkit.getDefaultToolkit().getImage(FrmMenuPrincipal.class.getResource("/view/icon.png")));
		setName("FrmMenuPrincipal");
		setTitle("Gestión Empleados");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		setLocationRelativeTo(null);
		
		// Inicializamos los componentes
		initComponents();

		//Creamos el contentPane por defecto
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		Image tmp = new ImageIcon("view/icon.png").getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
		imagen = new ImageIcon(tmp);
		lblImagen = new JLabel(imagen);
		contentPane.add(lblImagen, BorderLayout.CENTER);

		

		// Añadimos los eventos
		addListeners();

		setVisible(true);
	}

	private void initComponents() {
		
		//Barra de menu
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		//Menu paneles
		mnuPaneles = new JMenu("Paneles");
		menuBar.add(mnuPaneles);

		//Item menuPrincipal
		mniMenu = new JMenuItem("Menú Principal");
		mniMenu.setHorizontalAlignment(SwingConstants.CENTER);
		mnuPaneles.add(mniMenu);

		//Item menu ver
		mniVer = new JMenuItem("Ver");
		mniVer.setHorizontalTextPosition(SwingConstants.CENTER);
		mniVer.setHorizontalAlignment(SwingConstants.CENTER);
		mnuPaneles.add(mniVer);

		//Item menu altas
		mniAltas = new JMenuItem("Altas");
		mniAltas.setHorizontalAlignment(SwingConstants.CENTER);
		mnuPaneles.add(mniAltas);

		//Un separador para que quede mas bonito
		separator = new JSeparator();
		mnuPaneles.add(separator);

		//Item menu acerca de
		mniAcercaDe = new JMenuItem("Acerca de");
		mniAcercaDe.setHorizontalAlignment(SwingConstants.CENTER);
		mnuPaneles.add(mniAcercaDe);

		//Panel por defecto
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		//Instanciamos las llamadas a las clases correspondientes
		pnlVistas = new PnlVistas();
		pnlAltas = new PnlAltas();
		pnlAcercaDe = new PnlAcercaDe();

	}

	private void addListeners() {

		// Al pulsar en el menu item de ver, ponemos el panel de vista en el JFrame
		mniVer.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setContentPane(pnlVistas);
				revalidate();
				repaint();
			}
		});

		// Al pulsar en el menu item de altas, ponemos el panel de altas en el JFrame
		mniAltas.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setContentPane(pnlAltas);
				revalidate();
				repaint();
			}
		});

		// Al pulsar en el menu item de acerca de, ponemos el panel de acerca de en el
		// JFrame
		mniAcercaDe.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setContentPane(pnlAcercaDe);
				revalidate();
				repaint();
			}
		});

		// Al pulsar en el menu item de menu principal, ponemos el contentpane en el
		// JFrame
		mniMenu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setContentPane(contentPane);
				revalidate();
				repaint();
			}
		});
	}
}
