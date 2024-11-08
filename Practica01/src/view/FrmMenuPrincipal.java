package view;

import java.awt.EventQueue;

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
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnuPaneles = new JMenu("Paneles");
		menuBar.add(mnuPaneles);
		
		JMenuItem mniMenu = new JMenuItem("Menú Principal");
		mniMenu.setHorizontalAlignment(SwingConstants.CENTER);
		mnuPaneles.add(mniMenu);
		
		JMenuItem mniVer = new JMenuItem("Ver");
		mniVer.setHorizontalTextPosition(SwingConstants.CENTER);
		mniVer.setHorizontalAlignment(SwingConstants.CENTER);
		mnuPaneles.add(mniVer);
		
		JMenuItem mniAltas = new JMenuItem("Altas");
		mniAltas.setHorizontalAlignment(SwingConstants.CENTER);
		mnuPaneles.add(mniAltas);
		
		JSeparator separator = new JSeparator();
		mnuPaneles.add(separator);
		
		JMenuItem mniAcercaDe = new JMenuItem("Acerca de");
		mniAcercaDe.setHorizontalAlignment(SwingConstants.CENTER);
		mnuPaneles.add(mniAcercaDe);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	}

}
