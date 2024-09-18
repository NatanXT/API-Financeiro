package com.Financeiro.APIFinanceiro.service;

import com.Financeiro.APIFinanceiro.DTO.LancamentoDto;
import com.Financeiro.APIFinanceiro.model.Lancamento;
import com.Financeiro.APIFinanceiro.repository.LancamentoRepository;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@SpringBootApplication
@RequiredArgsConstructor
public class LancamentoService {
    private final LancamentoRepository lancamentoRepository;
    public Lancamento findById(Long id){
        return this.lancamentoRepository.findById(id).orElseThrow(()->new LancamentoNotFoundException("Lancamento não encontrado!"));

    }
    public List<Lancamento> findAll() {
        return this.lancamentoRepository.findAll();
    }

    public Lancamento save(LancamentoDto LancamentoDto) {
        return this.lancamentoRepository.save(LancamentoDto.mapToEntity());
    }

    public Lancamento update(LancamentoDto lancamentoDto) {
        if (Objects.isNull(lancamentoDto.id())) return this.save(lancamentoDto);
        return this.lancamentoRepository.save(lancamentoDto.mapToEntity());
    }

    public void delete(Long id){
        this.lancamentoRepository.deleteById(id);
    }
}
}
