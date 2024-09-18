package com.Financeiro.APIFinanceiro.controler;


import com.Financeiro.APIFinanceiro.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/pessoa")
public class PessoaControler {
    @Autowired
    private PessoaService pessoaService;

    @GetMapping("/")
    public List<Pessoa> listarPessoas(){
        return this.pessoaService.listarPessoas();
    }

    @PostMapping("/")
    public void salvarPessoa(@RequestBody Pessoa pessoa){
        this.pessoaService.adicionarPessoa(pessoa);
    }

    @GetMapping("/{id}")
    public Pessoa pesquisarPessoa(@RequestParam("id") Integer id){
        return this.pessoaService.buscarPessoaPorId(id);
    }

    @PutMapping("/")
    public void alterarPessoa(@RequestBody Pessoa pessoa){
        this.pessoaService.alterarPessoa(pessoa);
    }
    @DeleteMapping("/{id}")
    public void removerPessoa(@PathVariable("id") Integer id){
        this.pessoaService.excluirPessoa(id);
    }
}
