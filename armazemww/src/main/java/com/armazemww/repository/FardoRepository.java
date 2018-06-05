package com.armazemww.repository;

import org.springframework.data.repository.CrudRepository;

import com.armazemww.models.Fardo;
import com.armazemww.models.Fornecedor;

public interface FardoRepository extends CrudRepository<Fardo, String> {

	Iterable<Fardo> findByFornecedor(Fornecedor fornecedor);
}
