package com.Financeiro.APIFinanceiro.repository;

import com.Financeiro.APIFinanceiro.model.Lancamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LancamentoRepository extends JpaRepository<Lancamento, Integer> {
}
