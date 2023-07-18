package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Paziente;
import com.repository.PazienteRepository;

@Service
public class PazienteServiceImpl implements PazienteService {

	@Autowired
	private PazienteRepository pr;

	@Override
	public List<Paziente> findAll() {
		return pr.findAll();
	}

	@Override
	public Paziente upsert(Paziente paziente) {
		return pr.save(paziente);
	}

	@Override
	public void delete(Integer id) {
		pr.deleteById(id);
	}

}
