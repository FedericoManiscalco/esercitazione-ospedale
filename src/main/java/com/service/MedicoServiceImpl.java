package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Medico;
import com.repository.MedicoRepository;

@Service
public class MedicoServiceImpl implements MedicoService {

	@Autowired
	private MedicoRepository mr;

	@Override
	public List<Medico> findAll() {
		return mr.findAll();
	}

	@Override
	public Medico save(Medico medico) {
		return mr.save(medico);
	}

	@Override
	public void delete(Integer id) {
		mr.deleteById(id);

	}

}
