package com.Financeiro.APIFinanceiro.DTO;

import com.Financeiro.APIFinanceiro.model.Lancamento;

public record LancamentoDto(
        long id,

        String nome ,
        String descricao,

         String data,

         String tipo,

         double valor,

         String categoria

){
    public Lancamento mapToEntity(){
        return Lancamento.builder()
                .id(this.id)
                .nome(this.nome)
                .descricao(this.descricao)
                .data(this.data)
                .tipo(this.tipo)
                .valor(this.valor)
                .categoria(this.categoria)
                .build();
    }
}
