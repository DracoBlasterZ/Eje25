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
@Table(name = "peliculas")
public class Pelicula {

	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nombre;

	private int edad_minima;

	@OneToMany
	@JoinColumn(name = "FK_pelicula")
	private List<Sala> salas;

	// Constructors
	public Pelicula() {
	}

	public Pelicula(Long id, String nombre, int edad_minima) {
		this.id = id;
		this.nombre = nombre;
		this.edad_minima = edad_minima;
	}

	// Getters
	public Long getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad_minima() {
		return edad_minima;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Sala")
	public List<Sala> getSalas() {
		return salas;
	}

	// Setters
	public void setId(Long id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad_minima(int edad_minima) {
		this.edad_minima = edad_minima;
	}

	public void setSalas(List<Sala> salas) {
		this.salas = salas;
	}

}
