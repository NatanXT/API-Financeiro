package com.Financeiro.APIFinanceiro.controler;


import com.Financeiro.APIFinanceiro.service.LancamentoService;
import com.Financeiro.APIFinanceiro.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("api/lancamento")
@RequiredArgsConstructor
@CrossOrigin("*")
public class LancamentoControler {
    @Autowired
    private LancamentoService service;

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
    public void delete(Long id) {
        this.service.delete(id);
    }

    @PostMapping(value = "/filter")
    public List<Lancamento> filter(@RequestBody LancamentoFilterDTO lancamento) {
        return this.service.filter(lancamento);
    }

}
