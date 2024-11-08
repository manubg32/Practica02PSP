package view;

import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
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

		Image tmp = new ImageIcon("view/icon.png").getImage().getScaledInstance(75, 75, Image.SCALE_SMOOTH);
		ImageIcon imagen = new ImageIcon(tmp);
		JLabel imgLogo = new JLabel(imagen);
		add(imgLogo);

	}

}
