package model;

public class Empleado {
	
	private String nombre;
	private String fechaNacimiento;
	private Double salario;
	
		
	public Empleado(String nombre, String fechaNacimiento, Double salario) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.salario = salario;
	}
	
	
	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}
	public String getFechaNacimiento() {return fechaNacimiento;}
	public void setFechaNacimiento(String fechaNacimiento) {this.fechaNacimiento = fechaNacimiento;}
	public Double getSalario() {return salario;}
	public void setSalario(Double salario) {this.salario = salario;}


	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", salario=" + salario + "]";
	}
	
	
	
	
	
}
