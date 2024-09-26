package com.Financeiro.APIFinanceiro.controller;

import com.Financeiro.APIFinanceiro.model.Meta;
import com.Financeiro.APIFinanceiro.service.MetaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/meta")
@RequiredArgsConstructor
@CrossOrigin("*")
public class MetaControler {

    private final MetaService service;

    @GetMapping(value = "/{id}")
    public Meta findById(@PathVariable Long id) {
        return this.service.findById(id);
    }

    @GetMapping
    public List<Meta> findAll() {
        return this.service.findAll();
    }

    @PostMapping
    public Meta save(@RequestBody Meta meta) {
        return this.service.save(meta);
    }

    @PutMapping
    public Meta update(@RequestBody Meta meta) {
        return this.service.update(meta);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        this.service.delete(id);
    }
}
