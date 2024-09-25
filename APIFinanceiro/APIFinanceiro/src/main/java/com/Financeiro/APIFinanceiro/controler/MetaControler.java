package com.Financeiro.APIFinanceiro.controler;


import com.Financeiro.APIFinanceiro.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("api/meta")
@RequiredArgsConstructor
@CrossOrigin("*")
public class MetaControler {
    @Autowired
    private MetaService service;

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
    public void delete(Long id) {
        this.service.delete(id);
    }
}
