package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.entity.Appuntamento;

public interface PazienteAppuntamentoRepository extends JpaRepository<Appuntamento, Integer> {

	@Query("SELECT p.codicefiscale, a.ricetta FROM Paziente p Appuntamento WHERE p.codicefiscale = :codicefiscale AND a.ricetta = :ricetta")
	public Appuntamento prenotazionePaziente(String codiceFiscale, String ricetta);

}
