package com.Financeiro.APIFinanceiro.controler;


import com.Financeiro.APIFinanceiro.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("api/pessoa")
@RequiredArgsConstructor
@CrossOrigin("*")
public class PessoaControler {
    @Autowired
    private PessoaService service;

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
    public void delete(Long id){
        this.service.delete(id);
    }
}
