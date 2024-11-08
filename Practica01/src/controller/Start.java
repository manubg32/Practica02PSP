package controller;

import view.FrmMenuPrincipal;

public class Start {

	public static void main(String[] args) {
		//Creamos una nueva isntancia de la pantalla principal
		try {
			new FrmMenuPrincipal();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
