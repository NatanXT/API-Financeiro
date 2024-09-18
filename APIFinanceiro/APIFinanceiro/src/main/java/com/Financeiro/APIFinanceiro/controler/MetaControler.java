package com.Financeiro.APIFinanceiro.controler;


import com.Financeiro.APIFinanceiro.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/pessoa")
public class MetaControler {
    @Autowired
    private MetaService metaService;

    @GetMapping("/")
    public List<Meta> listarMeta(){
        return this.MetaService.listarMeta();
    }

    @PostMapping("/")
    public void salvarMeta(@RequestBody Meta meta){
        this.MetaService.adicionarPessoa(meta);
    }

    @GetMapping("/{id}")
    public Meta pesquisarMeta(@RequestParam("id") Integer id){
        return this.MetaService.buscarMetaPorId(id);
    }

    @PutMapping("/")
    public void alterarMeta(@RequestBody Meta meta){
        this.MetaService.alterarMeta(meta);
    }
    @DeleteMapping("/{id}")
    public void removerMeta(@PathVariable("id") Integer id){
        this.MetaService.excluirMeta(id);
    }
}
