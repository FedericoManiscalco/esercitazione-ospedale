package com.service;

import java.util.List;

import com.entity.Appuntamento;

public interface AppuntamentoService {

	public List<Appuntamento> findAll();

	public List<Appuntamento> findByData(String data);

	public Appuntamento save(Appuntamento appuntamento);

	public void delete(Integer id);

}
