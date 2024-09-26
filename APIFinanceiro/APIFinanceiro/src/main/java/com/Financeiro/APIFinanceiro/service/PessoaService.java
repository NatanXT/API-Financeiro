package com.Financeiro.APIFinanceiro.service;

import com.Financeiro.APIFinanceiro.exception.custom.NotFoundException;
import com.Financeiro.APIFinanceiro.model.Pessoa;
import com.Financeiro.APIFinanceiro.repository.PessoaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PessoaService {

    private final PessoaRepository repository;

    public Pessoa findById(Long id) {
        return this.repository.findById(id).orElseThrow(() -> new NotFoundException("Pessoa não encontrada"));
    }

    public List<Pessoa> findAll() {
        return this.repository.findAll();
    }

    public Pessoa save(Pessoa pessoa) {
        return this.repository.save(pessoa);
    }

    public Pessoa update(Pessoa pessoa) {
        return this.repository.save(pessoa);
    }

    public void delete(Long id) {
        this.repository.deleteById(id);
    }
}
