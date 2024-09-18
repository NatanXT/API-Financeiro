package com.Financeiro.APIFinanceiro.repository;

import com.Financeiro.APIFinanceiro.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {
}
