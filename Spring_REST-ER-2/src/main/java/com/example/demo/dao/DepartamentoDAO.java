package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Departamento;

public interface DepartamentoDAO extends JpaRepository<Departamento, Long> {

}