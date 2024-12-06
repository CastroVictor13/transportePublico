package com.transporte.service;

import com.transporte.model.Linha;
import com.transporte.repository.LinhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LinhaService {

    @Autowired
    private LinhaRepository linhaRepository;

    public Optional<Linha> buscarPorId(Long id) {
        return linhaRepository.findById(id);
    }

    public List<Linha> buscarPorNumero(String numero) {
        return linhaRepository.findByNome(numero);
    }
}
