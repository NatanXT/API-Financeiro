package com.Financeiro.APIFinanceiro.repository;

import com.Financeiro.APIFinanceiro.model.Grupo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrupoRepository extends JpaRepository<Grupo, Long> {
}
