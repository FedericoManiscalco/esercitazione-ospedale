package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.OptimisticLockingFailureException;
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
	public Appuntamento patch(Appuntamento appuntamento) {
		try {
			ar.save(appuntamento);
		} catch (IllegalArgumentException | OptimisticLockingFailureException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Appuntamento post(Appuntamento appuntamento) {
		try {

			ar.save(appuntamento);
		} catch (IllegalArgumentException | OptimisticLockingFailureException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void delete(Integer id) {
		try {
			ar.deleteById(id);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}

}
