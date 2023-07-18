package com.service;

import java.util.List;

import com.entity.Richiesta;

public interface RichiestaService {

	public List<Richiesta> findAll();

	public Richiesta save();

	public void delete(Integer id);

}
