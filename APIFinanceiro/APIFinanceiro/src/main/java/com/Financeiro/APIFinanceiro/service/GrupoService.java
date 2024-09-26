package com.Financeiro.APIFinanceiro.service;

import com.Financeiro.APIFinanceiro.exception.custom.ApplicationException;
import com.Financeiro.APIFinanceiro.exception.custom.NotFoundException;
import com.Financeiro.APIFinanceiro.exception.custom.RegraNegocioException;
import com.Financeiro.APIFinanceiro.model.Grupo;
import com.Financeiro.APIFinanceiro.repository.GrupoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GrupoService {

    private final GrupoRepository repository;

    public Grupo findById(Long id) {
        return this.repository.findById(id).orElseThrow(() -> new NotFoundException("Grupo não encontrado"));
    }

    public List<Grupo> findAll() {
        return this.repository.findAll();
    }

    public Grupo save(Grupo grupo) {
        return this.repository.save(grupo);
    }

    public Grupo update(Grupo grupo) {
        Grupo existingGrupo = this.findById(grupo.getId());
        if (!grupo.getPessoa().getId().equals(existingGrupo.getPessoa().getId())) {
            throw new RegraNegocioException("Propriedade é uma informação que não é permitido alterar.");
        }
        return this.repository.save(grupo);
    }

    public void delete(Long id) {
        this.repository.deleteById(id);
    }
}
