package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Appuntamento;
import com.repository.AppuntamentoRepository;

@Service
public class AppuntamentoServiceImpl implements AppuntamentoService {

	@Autowired
	private AppuntamentoRepository ar;

	@Override
	public List<Appuntamento> findAll() {
		return ar.findAll();
	}

	@Override
	public List<Appuntamento> findByData(String data) {
		return ar.findByData(data);
	}

	@Override
	public Appuntamento save(Appuntamento appuntamento) {
		return ar.save(appuntamento);
	}

	@Override
	public void delete(Integer id) {
		ar.deleteById(id);
	}

}
