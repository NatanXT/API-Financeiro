package com.Financeiro.APIFinanceiro.DTO;

import com.Financeiro.APIFinanceiro.enums.CategoriaEnum;
import com.Financeiro.APIFinanceiro.enums.TipoLancamentoEnum;

import java.time.LocalDate;

public record LancamentoFilterDTO(String nome,
                                  LocalDate data,
                                  TipoLancamentoEnum tipo,
                                  CategoriaEnum categoria) {
}
