package com.fleschworks.food.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fleschworks.food.domain.model.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Long> {

	}
