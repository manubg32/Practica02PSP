package model;

import java.time.LocalDate;
import java.util.Date;

public class Empleado {

	private static int idEmpleado;
	private String nombre;
	private LocalDate fechaNacimiento;
	private Double salario;
	private Double sueldoMax;
	private String oficio;

	
		
	public Empleado(String nombre, LocalDate fechaNacimiento, Double salario) {
		//La id empleado la pongo a 1 para que cuando cree el primer objeto le ponga la id 1
		idEmpleado = 1;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.salario = salario;
		// Y aqui le sumo a la variable para que la siguiente sea la id 2
		idEmpleado++;
	}
	
	
	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}
	public LocalDate getFechaNacimiento() {return fechaNacimiento;}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {this.fechaNacimiento = fechaNacimiento;}
	public Double getSalario() {return salario;}
	public void setSalario(Double salario) {this.salario = salario;}


	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", salario=" + salario + "]";
	}
	
	
	
	
	
}
