package com.transporte.repository;

import com.transporte.model.Linha;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface LinhaRepository extends JpaRepository<Linha, Long> {
    Optional<Linha> findById(Long id);
    List<Linha> findByNumero(String numero);
}
