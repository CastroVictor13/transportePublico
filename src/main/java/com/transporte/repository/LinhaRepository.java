package com.transporte.repository;

import com.transporte.model.Linha;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface LinhaRepository extends JpaRepository<Linha, Long> {
    List<Linha> findByNome(String nome);
}
