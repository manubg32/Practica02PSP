package view;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class PnlAcercaDe extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public PnlAcercaDe() {
		setLayout(new GridLayout(2, 1, 0, 10));
		
		JLabel lblAcercaDe = new JLabel("Trabajo realizado por Manuel Borrero Guerrero y Antonio Guerrero Pulgada");
		lblAcercaDe.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblAcercaDe);
		
		JLabel imgLogo = new JLabel("New label");
		add(imgLogo);

	}

}
