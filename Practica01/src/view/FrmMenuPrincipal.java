package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;

public class FrmMenuPrincipal extends JFrame {

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
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
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
		setName("FrmMenuPrincipal");
		setTitle("Menu Gestion");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		
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

		addListeners();
		setContentPane(contentPane);
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
	}
}
