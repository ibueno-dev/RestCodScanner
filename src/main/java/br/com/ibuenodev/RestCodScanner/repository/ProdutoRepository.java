package br.com.ibuenodev.RestCodScanner.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ibuenodev.RestCodScanner.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	Optional<Produto> findByCodigoBarras(String codigoBarras);
}
