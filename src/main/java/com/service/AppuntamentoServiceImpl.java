package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.OptimisticLockingFailureException;
import org.springframework.stereotype.Service;

import com.dto.AppuntamentoDTO;
import com.entity.Appuntamento;
import com.repository.AppuntamentoRepository;
import com.repository.PazienteRepository;
import com.repository.PrestazioneRepository;
import com.repository.RichiestaRepository;

@Service
public class AppuntamentoServiceImpl implements AppuntamentoService {

	@Autowired
	private AppuntamentoRepository ar;

	@Autowired
	private PazienteRepository pr;

	@Autowired
	private PrestazioneRepository prr;

	private RichiestaRepository rr;

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
	public Appuntamento post(AppuntamentoDTO appuntamentoDTO) {
		try {
			Appuntamento a = toEntity(appuntamentoDTO);
			return ar.save(a);
		} catch (OptimisticLockingFailureException | IllegalArgumentException e) {
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

	private Appuntamento toEntity(AppuntamentoDTO appuntamentoDTO) {
		Appuntamento a = new Appuntamento();
		a.setData(appuntamentoDTO.getData());
		a.setRicetta(appuntamentoDTO.getRicetta());
		a.setCompletato(appuntamentoDTO.getCompletato());
		a.setOrario(appuntamentoDTO.getOrario());
		a.setPrestazione(prr.findById(appuntamentoDTO.getPrestazioneId()).get());
		a.setPaziente(pr.findById(appuntamentoDTO.getPazienteId()).get());
		return a;
	}

}
