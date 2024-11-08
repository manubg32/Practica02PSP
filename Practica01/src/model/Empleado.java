package model;

import java.time.LocalDate;
import java.util.Date;

public class Empleado {

	private static int cont;
	
	private Integer idEmpleado;
	private String nombre;
	private LocalDate fechaNacimiento;
	private Double salario;
	private Double sueldoMax;
	private String oficio;

	
		
	public Empleado(String nombre, LocalDate fechaNacimiento, Double salario, Double sueldoMax, String oficio) {
		//La id empleado es la variable contador y que incremente en uno al asignarlo
		idEmpleado = cont++;
		setNombre(nombre);
		setFechaNacimiento(fechaNacimiento);
		setSueldoMax(sueldoMax);
		setSalario(salario);
		setOficio(oficio);
		
	}
	
	
	public Integer getIdEmpleado() {return idEmpleado;}
	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}
	public LocalDate getFechaNacimiento() {return fechaNacimiento;}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {this.fechaNacimiento = fechaNacimiento;}
	public Double getSalario() {return salario;}
	public void setSalario(Double salario) {this.salario = salario;}
	public Double getSueldoMax() {return sueldoMax;}
	public void setSueldoMax(Double sm) {this.sueldoMax = sm;}
	public String getOficio() {return this.oficio;}
	public void setOficio(String oficio) {this.oficio = oficio;}


	@Override
	public String toString() {
		return "Empleado [id=" + idEmpleado + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", salario=" + salario + ", sueldo maximo=" + sueldoMax + ", oficio=" + oficio  + "]";
	}
	
	
	
	
	
}
