package com.transporte.service;

import com.transporte.model.Linha;
import com.transporte.repository.LinhaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LinhaService {
    private final LinhaRepository repository;

    public LinhaService(LinhaRepository repository) {
        this.repository = repository;
    }

    public Linha salvar(Linha linha) {
        return repository.save(linha);
    }

    public List<Linha> listar() {
        return repository.findAll();
    }

    public List<Linha> buscarPorNumero(String numero) {
        return repository.findByNumero(numero);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
