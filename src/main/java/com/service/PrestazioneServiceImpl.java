package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.OptimisticLockingFailureException;
import org.springframework.stereotype.Service;

import com.entity.Prestazione;
import com.repository.PrestazioneRepository;

@Service
public class PrestazioneServiceImpl implements PrestazioneService {

	@Autowired
	private PrestazioneRepository pr;

	@Override
	public List<Prestazione> findAll() {
		return pr.findAll();
	}

	@Override
	public Prestazione postPrestazione(Prestazione prestazione) {
		try {
			return pr.save(prestazione);
		} catch (IllegalArgumentException | OptimisticLockingFailureException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Prestazione patchPrestazione(Prestazione prestazione) {
		try {
			return pr.save(prestazione);
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

}
