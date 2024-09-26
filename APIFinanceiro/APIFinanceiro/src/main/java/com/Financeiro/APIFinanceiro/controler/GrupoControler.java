package com.Financeiro.APIFinanceiro.controler;

import com.Financeiro.APIFinanceiro.model.Grupo;
import com.Financeiro.APIFinanceiro.service.GrupoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/grupo")
@RequiredArgsConstructor
@CrossOrigin("*")
public class GrupoControler {

    private final GrupoService service;

    @GetMapping(value = "/{id}")
    public Grupo findById(@PathVariable Long id) {
        return this.service.findById(id);
    }

    @GetMapping
    public List<Grupo> findAll() {
        return this.service.findAll();
    }

    @PostMapping
    public Grupo save(@RequestBody Grupo grupo) {
        return this.service.save(grupo);
    }

    @PutMapping
    public Grupo update(@RequestBody Grupo grupo) {
        return this.service.update(grupo);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        this.service.delete(id);
    }
}
