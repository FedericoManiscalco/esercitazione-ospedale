package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.OptimisticLockingFailureException;
import org.springframework.stereotype.Service;

import com.entity.Richiesta;
import com.repository.RichiestaRepository;

@Service
public class RichiestaServiceImpl implements RichiestaService {

	@Autowired
	private RichiestaRepository rr;

	@Override
	public List<Richiesta> findAll() {
		return rr.findAll();
	}

	@Override
	public Richiesta post(Richiesta richiesta) {
		try {
			return rr.save(richiesta);
		} catch (IllegalArgumentException | OptimisticLockingFailureException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Richiesta update(Richiesta richiesta) {
		try {
			return rr.save(richiesta);
		} catch (IllegalArgumentException | OptimisticLockingFailureException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void delete(Integer id) {
		try {
			rr.deleteById(id);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}

	}

	@Override
	public Richiesta patchRichiesta(Richiesta richiesta) {
		try {
			return rr.save(richiesta);
		} catch (IllegalArgumentException | OptimisticLockingFailureException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
