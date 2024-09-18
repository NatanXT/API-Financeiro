package com.Financeiro.APIFinanceiro.controler;


import com.Financeiro.APIFinanceiro.service.LancamentoService;
import com.Financeiro.APIFinanceiro.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/pessoa")
public class LancamentoControler {
    @Autowired
    private LancamentoService lancamentoService;

    @GetMapping("/")
    public List<Lancamento> listarLancamento(){
        return this.lancamentoService.listarLancamento();
    }

    @PostMapping("/")
    public void salvarLancamento(@RequestBody Lancamento lancamento){
        this.lancamentoService.adicionarLancamento(lancamento);
    }

    @GetMapping("/{id}")
    public Pessoa pesquisarLancamento(@RequestParam("id") Integer id){
        return this.lancamentoService.buscarLancamentoPorId(id);
    }

    @PutMapping("/")
    public void alterarLancamento(@RequestBody Lancamento lancamento){
        this.lancamentoService.alterarLancamento(lancamento);
    }
    @DeleteMapping("/{id}")
    public void removerLancamento(@PathVariable("id") Integer id){
        this.lancamentoService.excluirLancamento(id);
    }
}
