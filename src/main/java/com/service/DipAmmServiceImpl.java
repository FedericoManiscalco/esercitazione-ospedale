package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.DipendenteAmministrativo;
import com.repository.DipAmmRepository;

@Service
public class DipAmmServiceImpl implements DipAmmService {

	@Autowired
	private DipAmmRepository dar;

	@Override
	public List<DipendenteAmministrativo> findAll() {
		return dar.findAll();
	}

	@Override
	public DipendenteAmministrativo save(DipendenteAmministrativo dipendenteAmministrativo) {
		return dar.save(dipendenteAmministrativo);
	}

	@Override
	public void delete(Integer id) {
		dar.deleteById(id);

	}

}
