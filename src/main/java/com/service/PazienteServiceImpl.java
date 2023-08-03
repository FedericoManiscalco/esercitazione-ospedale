package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.OptimisticLockingFailureException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

	public ResponseEntity<Paziente> findByEmail(String email) {
		try {
			Paziente p = pr.findByEmail(email);
			if (p != null) {
				return new ResponseEntity<>(p, HttpStatus.OK);
			} else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public Paziente findById(Integer Id) {
		return pr.findById(Id).get();
	}

	@Override
	public Paziente upsert(Paziente paziente) {
		try {
			return pr.save(paziente);
		} catch (IllegalArgumentException | OptimisticLockingFailureException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void delete(Integer id) {
		try {
			pr.deleteById(id);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Paziente patchPaziente(Paziente paziente) {
		try {
			return pr.save(paziente);
		} catch (IllegalArgumentException | OptimisticLockingFailureException e) {
			e.printStackTrace();
		}
		return null;
	}

}
