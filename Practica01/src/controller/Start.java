package controller;

import view.FrmPrincipal;

public class Start {

	public static void main(String[] args) {
		//Creamos una nueva isntancia de la pantalla principal
		try {
			FrmPrincipal frame = new FrmPrincipal();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
