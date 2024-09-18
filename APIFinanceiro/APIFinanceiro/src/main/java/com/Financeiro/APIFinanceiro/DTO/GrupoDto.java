package com.Financeiro.APIFinanceiro.DTO;

import com.Financeiro.APIFinanceiro.model.Grupo;

public record GrupoDto(
        Long id,
        String nome,
        String descricao

){
    public Grupo mapToEntity(){
        return Grupo.builder()
                .id(this.id)
                .nome(this.nome)
                .descricao(this.descricao)
                .build();
    }
}
