package com.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.entity.Paziente;

public interface PazienteService {

	public List<Paziente> findAll();

	public Paziente findById(Integer id);

	public Paziente upsert(Paziente paziente);

	public void delete(Integer id);

	public Paziente patchPaziente(Paziente paziente);

	public ResponseEntity<Paziente> findByEmail(String email);

}
