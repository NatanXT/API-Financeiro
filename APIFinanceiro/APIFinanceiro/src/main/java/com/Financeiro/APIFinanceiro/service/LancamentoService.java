package com.Financeiro.APIFinanceiro.service;

import com.Financeiro.APIFinanceiro.DTO.LancamentoFilterDTO;
import com.Financeiro.APIFinanceiro.exception.custom.NotFoundException;
import com.Financeiro.APIFinanceiro.model.Lancamento;
import com.Financeiro.APIFinanceiro.repository.LancamentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LancamentoService {

    private final LancamentoRepository repository;

    public Lancamento findById(Long id) {
        return this.repository.findById(id).orElseThrow(() -> new NotFoundException("Lançamento não encontrado"));
    }

    public List<Lancamento> findAll() {
        return this.repository.findAll();
    }

    public Lancamento save(Lancamento lancamento) {
        return this.repository.save(lancamento);
    }

    public Lancamento update(Lancamento lancamento) {
        return this.repository.save(lancamento);
    }

    public void delete(Long id) {
        this.repository.deleteById(id);
    }

    public List<Lancamento> filter(LancamentoFilterDTO filterDTO) {
        return this.repository.findByNomeContainingOrTipoOrDataOrCategoria(
                filterDTO.nome(),
                filterDTO.tipo(),
                filterDTO.data(),
                filterDTO.categoria()
        );
    }
}