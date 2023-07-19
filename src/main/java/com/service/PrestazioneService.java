package com.service;

import java.util.List;

import com.entity.Prestazione;

public interface PrestazioneService {

	public List<Prestazione> findAll();

	public Prestazione postPrestazione(Prestazione prestazione);

	public Prestazione patchPrestazione(Prestazione prestazione);

	public void delete(Integer id);

}
