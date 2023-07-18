package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Appuntamento;

public interface AppuntamentoRepository extends JpaRepository<Appuntamento, Integer> {

	public List<Appuntamento> findByData(String data);

}
