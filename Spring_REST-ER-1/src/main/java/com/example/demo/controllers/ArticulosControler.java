package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dto.Articulos;
import com.example.demo.service.ArticulosServiceImpl;

@RestController
@RequestMapping("/api")
public class ArticulosControler {
	
	@Autowired
	ArticulosServiceImpl ArticulosServideImpl;
	
	@GetMapping("/Articuloss")
	public List<Articulos> listarArticuloss(){
		return ArticulosServideImpl.listarArticuloss();
	}
	
	//listar Articuloss por campo nombre
	@GetMapping("/Articuloss/nombre/{nombre}")
	public List<Articulos> listarArticulosNombre(@PathVariable(name="nombre") String nombre) {
	    return ArticulosServideImpl.listarArticulosNomnbre(nombre);
	}
	
	
	@PostMapping("/Articuloss")
	public Articulos salvarArticulos(@RequestBody Articulos Articulos) {
		
		return ArticulosServideImpl.guardarArticulos(Articulos);
	}
	
	
	@GetMapping("/Articuloss/{id}")
	public Articulos ArticulosXID(@PathVariable(name="id") Long id) {
		
		Articulos Articulos_xid= new Articulos();
		
		Articulos_xid=ArticulosServideImpl.ArticulosXID(id);
		
		System.out.println("Articulos XID: "+Articulos_xid);
		
		return Articulos_xid;
	}
	
	@PutMapping("/Articuloss/{id}")
	public Articulos actualizarArticulos(@PathVariable(name="id")Long id,@RequestBody Articulos Articulos) {
		
		Articulos Articulos_seleccionado= new Articulos();
		Articulos Articulos_actualizado= new Articulos();
		
		Articulos_seleccionado= ArticulosServideImpl.ArticulosXID(id);
		
		Articulos_seleccionado.setNombre(Articulos.getNombre());
		Articulos_seleccionado.setPrecio(Articulos.getPrecio());
		Articulos_seleccionado.setFabricantes(Articulos.getFabricantes());
		
		Articulos_actualizado = ArticulosServideImpl.actualizarArticulos(Articulos_seleccionado);
		
		System.out.println("El Articulos actualizado es: "+ Articulos_actualizado);
		
		return Articulos_actualizado;
	}
	
	@DeleteMapping("/Articuloss/{id}")
	public void eleiminarArticulos(@PathVariable(name="id")Long id) {
		ArticulosServideImpl.eliminarArticulos(id);
	}
	
	
}

