package com.Financeiro.APIFinanceiro.service;

import com.Financeiro.APIFinanceiro.DTO.PessoaDto;
import com.Financeiro.APIFinanceiro.model.Pessoa;
import com.Financeiro.APIFinanceiro.repository.PessoaRepository;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@SpringBootApplication
@RequiredArgsConstructor
public class PessoaService {
    private final PessoaRepository pessoaRepository;
    public Pessoa findById(Long id){
        return this.pessoaRepository.findById(id).orElseThrow(()->new PessoaNotFoundException("Pessoa não encontrada!"));

    }
    public List<Pessoa> findAll() {
        return this.pessoaRepository.findAll();
    }

    public Pessoa save(PessoaDto pessoaDto) {
        return this.pessoaRepository.save(pessoaDto.mapToEntity());
    }

    public Pessoa update(PessoaDto pessoaDto) {
        if (Objects.isNull(pessoaDto.id())) return this.save(pessoaDto);
        return this.pessoaRepository.save(pessoaDto.mapToEntity());
    }

    public void delete(Long id){
        this.pessoaRepository.deleteById(id);
    }
}
}
