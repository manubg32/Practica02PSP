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
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					ge.InicializarLista();
					FrmMenuPrincipal frame = new FrmMenuPrincipal();
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
	public FrmMenuPrincipal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(FrmMenuPrincipal.class.getResource("/view/icon.png")));
		setName("FrmMenuPrincipal");
		setTitle("Gestión Empleados");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		setLocationRelativeTo(null);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnuPaneles = new JMenu("Paneles");
		menuBar.add(mnuPaneles);
		
		mniMenu = new JMenuItem("Menú Principal");
		mniMenu.setHorizontalAlignment(SwingConstants.CENTER);
		mnuPaneles.add(mniMenu);
		
		mniVer = new JMenuItem("Ver");
		mniVer.setHorizontalTextPosition(SwingConstants.CENTER);
		mniVer.setHorizontalAlignment(SwingConstants.CENTER);
		mnuPaneles.add(mniVer);
		
		mniAltas = new JMenuItem("Altas");
		mniAltas.setHorizontalAlignment(SwingConstants.CENTER);
		mnuPaneles.add(mniAltas);
		
		separator = new JSeparator();
		mnuPaneles.add(separator);
		
		mniAcercaDe = new JMenuItem("Acerca de");
		mniAcercaDe.setHorizontalAlignment(SwingConstants.CENTER);
		mnuPaneles.add(mniAcercaDe);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		pnlVistas = new PnlVistas();
		pnlAltas = new PnlAltas();
		pnlAcercaDe = new PnlAcercaDe();
		
		addListeners();
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		Image tmp = new ImageIcon("view/icon.png").getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
		imagen = new ImageIcon(tmp);
		lblImagen = new JLabel(imagen); 
		contentPane.add(lblImagen, BorderLayout.CENTER);
	}
	private void addListeners() {


		mniVer.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setContentPane(pnlVistas);
				revalidate();
				repaint();
			}
		});
		mniAltas.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setContentPane(pnlAltas);
				revalidate();
				repaint();
			}
		});
		mniAcercaDe.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setContentPane(pnlAcercaDe);
				revalidate();
				repaint();
			}
		});
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
