package com.Financeiro.APIFinanceiro.DTO;

import com.Financeiro.APIFinanceiro.model.Pessoa;

public record PessoaDto (
        Long id,
        String nome,
        String email,
        String cpf,
        String telefone

){
    public Pessoa mapToEntity(){
        return Pessoa.builder()
                .id(this.id)
                .nome(this.nome)
                .cpf(this.cpf)
                .email(this.email)
                .telefone(this.telefone)
                .build();
    }
}
