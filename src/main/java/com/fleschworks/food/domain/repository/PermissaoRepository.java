package com.fleschworks.food.domain.repository;

import java.util.List;

import com.fleschworks.food.domain.model.Permissao;

public interface PermissaoRepository {

	List<Permissao> todas();

	Permissao porId(Long id);

	Permissao salvar(Permissao permissao);

	void remover(Permissao permissao);
}
