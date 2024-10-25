package controller;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JTextField;

import model.Empleado;

public class GestionEmpleados {

	//Elementos globales que van a hacer falta (una lista y un numero de la posicion en la que se esta)
	public static List<Empleado> empleados = new ArrayList<>();
	public static int pos = 0;
	
	public void InicializarLista() {
		//Creamos la lista con 5 empleados
		Empleado e1 = new Empleado("Daniel Malagón Periánez", "31/07/1982", 2500.0);
		Empleado e2 = new Empleado("Manuel Borrero Guerrero", "26/09/2002", 1200.0);
		Empleado e3 = new Empleado("Cristina Sanchez Moreno", "24/05/2000", 1800.0);
		Empleado e4 = new Empleado("Antonio Guerrero Pulgada", "21/08/2001", 1600.0);
		Empleado e5 = new Empleado("Sebastian Exposito Ruiz", "15/11/2003", 800.0);
		
		empleados.add(e1);
		empleados.add(e2);
		empleados.add(e3);
		empleados.add(e4);
		empleados.add(e5);
		
	}

	public void mostrarSiguiente(JTextField txtNombre, JTextField txtFechaNacimiento, JTextField txtSalario) {
		//Mientras que la posicion sea inferior al tamaño de la lista, la incrementamos
		if (pos < empleados.size()) {
		        pos++;
		    }

		//Si la posicion es menor al tamaño de la lista, mostramos el elemento correspondiente a esa posicion
		 if (pos < empleados.size()) {
			 Empleado siguiente = empleados.get(pos);
			    txtNombre.setText(siguiente.getNombre());
			    txtFechaNacimiento.setText(siguiente.getFechaNacimiento());
			    txtSalario.setText(siguiente.getSalario().toString());
		 }
		    
		 //Si la posicion es igual al tamaño de la lista ponemos los campos de texto editables y vacios
		 if (pos == empleados.size()) {
			 txtNombre.setText("");
			 txtNombre.setEditable(true);
			 txtFechaNacimiento.setText("");
			 txtFechaNacimiento.setEditable(true);
			 txtSalario.setText("");
			 txtSalario.setEditable(true);
		 }
		    
		
		
	}

	public void comprobarBotones(int pos, JButton btnGuardar, JButton btnCancelar, JButton btnSiguiente, JButton btnAnterior) {
		
		//Si la posicion es mayor o igual al tamaño de la lista, el boton de guardar y cancelar se activan y el de siguiente se desactiva
		if (pos >= empleados.size()) {
			btnGuardar.setEnabled(true);
			btnCancelar.setEnabled(true);
			btnSiguiente.setEnabled(false);
		} else {
		//Si no el boton de guardar y cancelar se desactivan y el de siguiente se activa
			btnGuardar.setEnabled(false);
			btnCancelar.setEnabled(false);
			btnSiguiente.setEnabled(true);
		}
		
		//Si la posicion es menor o igual a cero, el boton anterior se desactiva, si no, se activa
		if (pos <= 0) {
			btnAnterior.setEnabled(false);
		} else {
			btnAnterior.setEnabled(true);
		}
		
	}

	public static void mostrarPrimero(JTextField txtNombre, JTextField txtFechaNacimiento, JTextField txtSalario) {
		//Este metodo se llama al crear la interfaz por lo que la variable pos es 0 por lo tanto mostramos dicho elemento
		txtNombre.setText(empleados.get(pos).getNombre());
		txtFechaNacimiento.setText(empleados.get(pos).getFechaNacimiento());
		txtSalario.setText(empleados.get(pos).getSalario().toString());
	}

	public void mostrarAnterior(JTextField txtNombre, JTextField txtFechaNacimiento, JTextField txtSalario) {
		//si la posicio es mayor que 0 decrementamos la posicion y mostramos el elemento correspondiente
		if (pos > 0) {
	        pos--;
	    }

	    Empleado anterior = empleados.get(pos);
	    txtNombre.setText(anterior.getNombre());
	    txtFechaNacimiento.setText(anterior.getFechaNacimiento());
	    txtSalario.setText(anterior.getSalario().toString());
		
	}

	public void guardar(JTextField txtNombre, JTextField txtFechaNacimiento, JTextField txtSalario) {
		//Si los campos no estan vacios creamos un nuevo elemento y lo agreagamos a la lista, la posicion pasa a ser la justo anterior y mostramos el siguiente (el recien creado)
		if (!txtNombre.getText().isEmpty() && !txtFechaNacimiento.getText().isEmpty() && !txtSalario.getText().isEmpty()) {
			empleados.add(new Empleado(txtNombre.getText(), txtFechaNacimiento.getText(), Double.parseDouble(txtSalario.getText())));
			pos = empleados.size()-2;
			mostrarSiguiente(txtNombre, txtFechaNacimiento, txtSalario);
		}
		
	}

	public void cancelar(JTextField txtNombre, JTextField txtFechaNacimiento, JTextField txtSalario) {
		//Si se pulsa cancelar se borran todos los campos
		txtNombre.setText("");
		txtFechaNacimiento.setText("");
		txtSalario.setText("");
		
	}

	
	
}
