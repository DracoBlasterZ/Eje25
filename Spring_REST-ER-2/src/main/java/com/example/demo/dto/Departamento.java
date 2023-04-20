package com.example.demo.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "departamentos")
public class Departamento {

	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "presupuesto")
	private int presupuesto;

	@OneToMany
	@JoinColumn(name = "FK_departamento")
	private List<Empleado> empleado;

	// Constructors

	public Departamento() {
	}

	public Departamento(Long codigo, String nombre, int presupuesto) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.presupuesto = presupuesto;
	}

	// Getters
	public Long getCodigo() {
		return codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public int getPresupuesto() {
		return presupuesto;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Empleado")
	public List<Empleado> getEmpleado() {
		return empleado;
	}

	// Setters
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPresupuesto(int presupuesto) {
		this.presupuesto = presupuesto;
	}

	public void setEmpleado(List<Empleado> empleado) {
		this.empleado = empleado;
	}

}