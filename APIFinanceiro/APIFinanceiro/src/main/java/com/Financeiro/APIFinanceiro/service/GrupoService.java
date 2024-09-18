package com.Financeiro.APIFinanceiro.service;

import com.Financeiro.APIFinanceiro.DTO.GrupoDto;
import com.Financeiro.APIFinanceiro.model.Grupo;
import com.Financeiro.APIFinanceiro.repository.GrupoRepository;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@SpringBootApplication
public class GrupoService {
    private final GrupoRepository grupoRepository;
    public Grupo findById(Long id){
        return this.grupoRepository.findById(id).orElseThrow(()->new GrupoNotFoundException("Grupo não encontrada!"));

    }
    public List<Grupo> findAll() {
        return this.grupoRepository.findAll();
    }

    public Grupo save(GrupoDto grupoDto) {
        return this.grupoRepository.save(grupoDto.mapToEntity());
    }

    public Grupo update(GrupoDto grupoDto) {
        if (Objects.isNull(grupoDto.id())) return this.save(grupoDto);
        return this.grupoRepository.save(grupoDto.mapToEntity());
    }

    public void delete(Long id){
        this.grupoRepository.deleteById(id);
    }
}
}
