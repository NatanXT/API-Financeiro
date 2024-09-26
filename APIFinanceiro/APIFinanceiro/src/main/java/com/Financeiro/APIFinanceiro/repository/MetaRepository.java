package com.Financeiro.APIFinanceiro.repository;

import com.Financeiro.APIFinanceiro.model.Meta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MetaRepository extends JpaRepository<Meta,Long> {
}
