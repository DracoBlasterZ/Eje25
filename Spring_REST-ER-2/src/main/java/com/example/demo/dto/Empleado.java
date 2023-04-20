package com.example.demo.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "empleados")
public class Empleado {

	// Attributes
	@Id
	private String dni;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "apellidos")
	private String apellido;

	@ManyToOne()
	@JoinColumn(name = "departamento")
	private Departamento departamento;

	// Constructors
	public Empleado() {
	}

	public Empleado(String dni, String nombre, String apellido, Departamento departamento) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.departamento = departamento;
	}

	// Getters
	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	// Setters
	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

}