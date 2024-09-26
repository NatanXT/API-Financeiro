package com.Financeiro.APIFinanceiro.controler;

import com.Financeiro.APIFinanceiro.dto.LancamentoFilterDTO;
import com.Financeiro.APIFinanceiro.model.Lancamento;
import com.Financeiro.APIFinanceiro.service.LancamentoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/lancamento")
@RequiredArgsConstructor
@CrossOrigin("*")
public class LancamentoControler {

    private final LancamentoService service;

    @GetMapping(value = "/{id}")
    public Lancamento findById(@PathVariable Long id) {
        return this.service.findById(id);
    }

    @GetMapping
    public List<Lancamento> findAll() {
        return this.service.findAll();
    }

    @PostMapping
    public Lancamento save(@RequestBody Lancamento lancamento) {
        return this.service.save(lancamento);
    }

    @PutMapping
    public Lancamento update(@RequestBody Lancamento lancamento) {
        return this.service.update(lancamento);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        this.service.delete(id);
    }

    @PostMapping(value = "/filter")
    public List<Lancamento> filter(@RequestBody LancamentoFilterDTO lancamentoFilterDTO) {
        return this.service.filter(lancamentoFilterDTO);
    }
}
