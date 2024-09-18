package com.Financeiro.APIFinanceiro.controler;


import com.Financeiro.APIFinanceiro.service.GrupoService;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/grupo")
public class GrupoControler {
    @Autowired
    private GrupoService grupoService;

    @GetMapping("/")
    public List<Grupo> listarGrupos(){
        return this.grupoService.listarGrupos();
    }

    @PostMapping("/")
    public void salvarGrupo(@RequestBody Grupo grupo){
        this.grupoService.adicionarGrupo(grupo);
    }

    @GetMapping("/{id}")
    public Grupo pesquisarGrupo(@RequestParam("id") Integer id){
        return this.grupoService.buscarGrupoPorId(id);
    }

    @PutMapping("/")
    public void alterarGrupo(@RequestBody Grupo grupo){
        this.grupoService.alterarGrupo(grupo);
    }
    @DeleteMapping("/{id}")
    public void removerGrupo(@PathVariable("id") Integer id){
        this.grupoService.excluirGrupo(id);
    }
}
