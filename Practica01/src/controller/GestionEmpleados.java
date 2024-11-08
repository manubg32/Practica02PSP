package controller;

import java.awt.Color;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import model.Empleado;

public class GestionEmpleados {

	// Elementos globales que van a hacer falta (una lista y un numero de la
	// posicion en la que se esta)
	public static List<Empleado> empleados = new ArrayList<>();
	public static int pos = 0;

	public void InicializarLista() {
		// Creamos la lista con 5 empleados

		// Borrar y crear un showMessageDialog avisando de que no hay empleados (Primera
		// idea)
		Empleado e1 = new Empleado("Daniel Malagón Periánez", LocalDate.of(1999, 10, 1), 2500.0, 3000.0, "Profesor");
		Empleado e2 = new Empleado("Manuel Borrero Guerrero", LocalDate.of(2002, 9, 26), 1200.0, 2500.0, "Alumno");
		Empleado e3 = new Empleado("Cristina Sanchez Moreno", LocalDate.of(2000, 5, 24), 1800.0, 2000.0, "Alumno");
		Empleado e4 = new Empleado("Antonio Guerrero Pulgada", LocalDate.of(2001, 8, 21), 1600.0, 1800.0, "Conserje");
		Empleado e5 = new Empleado("Sebastian Exposito Ruiz", LocalDate.of(2003, 11, 15), 800.0, 1000.0, "Humorista");

		empleados.add(e1);
		empleados.add(e2);
		empleados.add(e3);
		empleados.add(e4);
		empleados.add(e5);

	}

	public void mostrarSiguiente(JTextField txtNombre, JTextField txtFechaNacimiento, JTextField txtSalario,
			JTextField txtOficio) {
		// Mientras que la posicion sea inferior al tamaño de la lista, la incrementamos
		if (pos < empleados.size()) {
			pos++;
		}

		// Si la posicion es menor al tamaño de la lista, mostramos el elemento
		// correspondiente a esa posicion
		if (pos < empleados.size()) {
			Empleado siguiente = empleados.get(pos);
			txtNombre.setText(siguiente.getNombre());
			txtFechaNacimiento.setText(siguiente.getFechaNacimiento().toString());
			txtSalario.setText(siguiente.getSalario().toString());
			txtOficio.setText(siguiente.getOficio());
		}

	}

	// Comprobamos los botones de la vista
	public void comprobarBotonesVista(int pos, JButton btnPrimero, JButton btnAnterior, JButton btnSiguiente,
			JButton btnUltimo) {

		// Si la posicion es mayor o igual al tamaño de la lista, el boton de siguiente
		// y ultimo se desactivan
		if (pos >= empleados.size() - 1) {
			btnSiguiente.setEnabled(false);
			btnUltimo.setEnabled(false);
		} else {
			// Si no el boton de siguiente y ultimo se activan
			btnSiguiente.setEnabled(true);
			btnUltimo.setEnabled(true);
		}

		// Si la posicion es menor o igual a cero, el boton anterior y primero se
		// desactivan, si no, se activan
		if (pos <= 0) {
			btnAnterior.setEnabled(false);
			btnPrimero.setEnabled(false);
		} else {
			btnAnterior.setEnabled(true);
			btnPrimero.setEnabled(true);
		}

	}

	public void mostrarPrimero(JTextField txtNombre, JTextField txtFechaNacimiento, JTextField txtSalario,
			JTextField txtOficio) {
		// Este metodo se llama al crear la interfaz por lo que la variable pos se pone
		// a 0, mostramos dicho elemento
		pos = 0;
		txtNombre.setText(empleados.get(pos).getNombre());
		txtFechaNacimiento.setText(empleados.get(pos).getFechaNacimiento().toString());
		txtSalario.setText(empleados.get(pos).getSalario().toString());
		txtOficio.setText(empleados.get(pos).getOficio());
	}

	public void mostrarAnterior(JTextField txtNombre, JTextField txtFechaNacimiento, JTextField txtSalario,
			JTextField txtOficio) {
		// si la posicio es mayor que 0 decrementamos la posicion y mostramos el
		// elemento correspondiente
		if (pos > 0) {
			pos--;
		}

		Empleado anterior = empleados.get(pos);
		txtNombre.setText(anterior.getNombre());
		txtFechaNacimiento.setText(anterior.getFechaNacimiento().toString());
		txtSalario.setText(anterior.getSalario().toString());
		txtOficio.setText(anterior.getOficio());

	}

	public void mostrarUltimo(JTextField txtNombre, JTextField txtFechaNacimiento, JTextField txtSalario,
			JTextField txtOficio) {
		// ponemos la posicion en el ultimo elemento de la lista
		pos = empleados.size() - 1;
		txtNombre.setText(empleados.get(pos).getNombre());
		txtFechaNacimiento.setText(empleados.get(pos).getFechaNacimiento().toString());
		txtSalario.setText(empleados.get(pos).getSalario().toString());
		txtOficio.setText(empleados.get(pos).getOficio());
	}

	public void guardar(JTextField txtNombre, JTextField txtFechaNacimiento, JTextField txtSalario,
			JTextField txtSueldoMaximo, JTextField txtOficio) {
		// Si los campos no estan vacios creamos un nuevo elemento y lo agreagamos a la
		// lista, la posicion pasa a ser la justo anterior y mostramos el siguiente (el
		// recien creado)
		if (!txtNombre.getText().isEmpty() && !txtFechaNacimiento.getText().isEmpty()
				&& !txtSalario.getText().isEmpty()) {
			// Creamos un formatter para la fecha de nacimiento.
			DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			// Usamos un bloque try-catch por si acaso el parse del JTextField da error.
			try {
				// Hacemos el parseo a LocalDate pasandole el JTextField y el DateFormatter
				LocalDate localDate = LocalDate.parse(txtFechaNacimiento.getText(), dateFormatter);
				// Comprobamos la fecha
				if (localDate.getYear() >= 1900 && localDate.getYear() <= 2015) {
					txtFechaNacimiento.setForeground(Color.black);
					// Si el salario es un double
					if (esDouble(txtSalario.getText())) {
						Double salario = Double.parseDouble(txtSalario.getText());
						Double sueldoMax = Double.parseDouble(txtSueldoMaximo.getText());
						// Comprobamos si el salario es inferior al sueldoMax
						if (salario < sueldoMax) {
							// Si todo es correcto lo añadimos a la lista
							empleados.add(new Empleado(txtNombre.getText(), localDate, salario, sueldoMax,
									txtOficio.getText()));

							// Si se ha dado de alta al empleado correctamente se le indica al usuario
							JOptionPane.showMessageDialog(null, "Empleado dado de alta correctamente", "Correcto",
									JOptionPane.INFORMATION_MESSAGE);
							
							

							// Y se vacían los campos
							txtNombre.setText("");
							txtFechaNacimiento.setText("");
							txtSalario.setText("");
							txtSueldoMaximo.setText("");
							txtOficio.setText("");
						} else {
							// Si el sueldo no es correcto se pone rojo y se le indica al usuario
							txtSalario.setForeground(Color.red);
							JOptionPane.showMessageDialog(null, "El salario debe ser inferior al salario maximo",
									"Error", JOptionPane.ERROR_MESSAGE);
						}
					}
				}
			} catch (DateTimeParseException e) {
				// Si la fecha no es correcta o no tiene el formato valido se pone el texto en
				// rojo y se le indica al usuario
				txtFechaNacimiento.setForeground(Color.red);
				JOptionPane.showMessageDialog(null, "La fecha debe ser en el formato yyy-MM-dd", "Error",
						JOptionPane.ERROR_MESSAGE);
			} catch (Exception e) {
				System.out.println("Error: Excepcion encontrada" + e.getMessage());
			}

		}

	}

	public void cancelar(JTextField txtNombre, JTextField txtFechaNacimiento, JTextField txtSalario,
			JTextField txtSueldoMaximo, JTextField txtOficio) {
		// Si se pulsa cancelar se borran todos los campos
		txtNombre.setText("");
		txtFechaNacimiento.setText("");
		txtSalario.setText("");
		txtSueldoMaximo.setText("");
		txtOficio.setText("");

	}

	public boolean esDouble(String valor) {
		// Comprobamos que el valor del sueldo sea un double
		try {
			Double.parseDouble(valor);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
