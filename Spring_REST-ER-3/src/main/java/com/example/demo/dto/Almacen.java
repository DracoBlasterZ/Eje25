package com.example.demo.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "almacenes")
public class Almacen {

	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String lugar;

	private int capacidad;

	@OneToMany
	@JoinColumn(name = "FK_almacen")
	private List<Caja> cajas;

	public Almacen() {
	}

	public Almacen(Long id, String lugar, int capacidad) {
		this.id = id;
		this.lugar = lugar;
		this.capacidad = capacidad;
	}

	// Getters
	public Long getId() {
		return id;
	}

	public String getLugar() {
		return lugar;
	}

	public int getCapacidad() {
		return capacidad;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Articulo")
	public List<Caja> getCajas() {
		return cajas;
	}

	// Setters
	public void setId(Long id) {
		this.id = id;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public void setCajas(List<Caja> cajas) {
		this.cajas = cajas;
	}

}
