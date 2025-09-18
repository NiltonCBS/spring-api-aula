package com.fatec.comercio.Controller;

import com.fatec.comercio.Entity.Uf;
import com.fatec.comercio.Service.UfService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ufs")
public class UfController {

    private final UfService ufService;

    public UfController(UfService ufService) {
        this.ufService = ufService;
    }

    @GetMapping("")
    public List<Uf> getUfs() {
        return ufService.allUfs();
    }

    @GetMapping("/{id}")
    public Uf getUfId(@PathVariable Integer id) {
        return  ufService.ufId(id);
    }

    @PostMapping("")
    public String postUf(@RequestBody Uf uf) {
        ufService.salvarUf(uf);
        return "Dados Salvos com Sucesso!!!";
    }

    @DeleteMapping("/{id}")
    public String deletaId(@PathVariable Integer id){
        ufService.apagaId(id);
        return "O Uf de código: "+ id + " foi deletado";
    }

    @PutMapping("/{id}")
    public String putUf(@PathVariable Integer id, @RequestBody Uf uf) {
        //TODO: process PUT request
        ufService.editarUf(id, uf);
        return "Dados atualizados com sucesso!";
    }
}
