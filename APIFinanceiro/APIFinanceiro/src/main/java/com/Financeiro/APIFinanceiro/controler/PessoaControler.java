package com.Financeiro.APIFinanceiro.controler;

import com.Financeiro.APIFinanceiro.model.Pessoa;
import com.Financeiro.APIFinanceiro.service.PessoaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/pessoa")
@RequiredArgsConstructor
@CrossOrigin("*")
public class PessoaControler {

    private final PessoaService service;

    @GetMapping(value = "/{id}")
    public Pessoa findById(@PathVariable Long id) {
        return this.service.findById(id);
    }

    @GetMapping
    public List<Pessoa> findAll() {
        return this.service.findAll();
    }

    @PostMapping
    public Pessoa save(@RequestBody Pessoa pessoa) {
        return this.service.save(pessoa);
    }

    @PutMapping
    public Pessoa update(@RequestBody Pessoa pessoa) {
        return this.service.update(pessoa);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        this.service.delete(id);
    }
}
