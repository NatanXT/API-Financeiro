package com.Financeiro.APIFinanceiro.repository;

import com.Financeiro.APIFinanceiro.enums.CategoriaEnum;
import com.Financeiro.APIFinanceiro.enums.TipoLancamentoEnum;
import com.Financeiro.APIFinanceiro.model.Lancamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {
    List<Lancamento> findByNomeContainingOrTipoOrDataOrCategoria(String nome, TipoLancamentoEnum tipo, LocalDate data, CategoriaEnum categoria);
}
