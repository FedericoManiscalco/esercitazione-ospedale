package com.service;

import java.util.List;

import com.entity.DipendenteAmministrativo;

public interface DipAmmService {

	public List<DipendenteAmministrativo> findAll();

	public DipendenteAmministrativo save(DipendenteAmministrativo dipendenteAmministrativo);

	public void delete(Integer id);

}
