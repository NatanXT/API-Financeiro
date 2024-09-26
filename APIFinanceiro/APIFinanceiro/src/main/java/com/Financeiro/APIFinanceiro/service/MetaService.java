package com.Financeiro.APIFinanceiro.service;

import com.Financeiro.APIFinanceiro.exception.custom.NotFoundException;
import com.Financeiro.APIFinanceiro.model.Meta;
import com.Financeiro.APIFinanceiro.repository.MetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MetaService {

    private final MetaRepository repository;

    @Autowired
    public MetaService(MetaRepository repository) {
        this.repository = repository;
    }

    public Meta findById(Long id) {
        return this.repository.findById(id).orElseThrow(() -> new NotFoundException("Meta não encontrada"));
    }

    public List<Meta> findAll() {
        return this.repository.findAll();
    }

    public Meta save(Meta meta) {
        return this.repository.save(meta);
    }

    public Meta update(Meta meta) {
        return this.repository.save(meta);
    }

    public void delete(Long id) {
        this.repository.deleteById(id);
    }
}

