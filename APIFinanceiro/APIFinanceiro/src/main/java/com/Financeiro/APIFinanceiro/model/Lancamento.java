package com.Financeiro.APIFinanceiro.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table
public class Lancamento {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private String nome;
    @Column
    private String descricao;
    @Column
    private String data;
    @Column
    private String tipo;
    @Column
    private double valor;
    @Column
    private String categoria;


    public double getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Lancamento() {
    }

    public Lancamento(long id, String nome, String descricao, String data, String tipo, double valor, String categoria) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.data = data;
        this.tipo = tipo;
        this.valor = valor;
        this.categoria = categoria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lancamento that = (Lancamento) o;
        return Double.compare(id, that.id) == 0 && Double.compare(valor, that.valor) == 0 && Objects.equals(nome, that.nome) && Objects.equals(descricao, that.descricao) && Objects.equals(data, that.data) && Objects.equals(tipo, that.tipo) && Objects.equals(categoria, that.categoria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, descricao, data, tipo, valor, categoria);
    }

    @Override
    public String toString() {
        return "Lançamento{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", data='" + data + '\'' +
                ", tipo='" + tipo + '\'' +
                ", valor=" + valor +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}
