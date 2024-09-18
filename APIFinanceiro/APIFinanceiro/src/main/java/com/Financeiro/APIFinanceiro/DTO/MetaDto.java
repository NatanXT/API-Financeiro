package com.Financeiro.APIFinanceiro.DTO;

import com.Financeiro.APIFinanceiro.model.Meta;

public record MetaDto(
        Long id,
        String tipo,
        String valor

){
    public Meta mapToEntity(){
        return Meta.builder()
                .id(this.id)
                .tipo(this.tipo)
                .valor(this.valor)
                .build();
    }
}
