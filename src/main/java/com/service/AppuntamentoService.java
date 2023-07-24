package com.service;

import java.util.List;

import com.dto.AppuntamentoDTO;
import com.entity.Appuntamento;
import com.entity.Medico;
import com.entity.Paziente;

public interface AppuntamentoService {

	public List<Appuntamento> findAll();

	public List<Appuntamento> findByData(String data);

	public List<Appuntamento> findByPaziente(Paziente paziente);

	public List<Appuntamento> findByMedico(Medico medico);

	public Appuntamento patch(Appuntamento appuntamento);

	public Appuntamento post(AppuntamentoDTO appuntamentoDTO);

	public void delete(Integer id);

}
