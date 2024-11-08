package controller;

import view.FrmMenuPrincipal;

public class Start {

	public static void main(String[] args) {
		//Creamos una nueva isntancia de la pantalla principal
		try {
			FrmMenuPrincipal frame = new FrmMenuPrincipal();
			frame.setVisible(true);//Cambio
			//Cambio Manuel
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
