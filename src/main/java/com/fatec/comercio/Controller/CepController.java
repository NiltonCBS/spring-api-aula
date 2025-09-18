package com.fatec.comercio.Controller;

import com.fatec.comercio.Entity.Cep;
import com.fatec.comercio.Service.CepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ceps")
public class CepController {

    @Autowired
    private CepService cepService;

    @GetMapping("")
    public List<Cep> getceps() {
        return cepService.allCeps();
    }

    @GetMapping("/{id}")
    public Optional<Cep> getCepId(@PathVariable Integer id) {
        return  cepService.cepId(id);
    }

    @PostMapping("")
    public String postCep(@RequestBody Cep cep) {
        cepService.salvarCep(cep);
        return "Dados Salvos com Sucesso!!!";
    }

    @DeleteMapping("/{id}")
    public String deletaId(@PathVariable Integer id){
        cepService.apagaId(id);
        return "O cep de código: "+ id + " foi deletado";
    }

    @PutMapping("/{id}")
    public String putCep(@PathVariable Integer id, @RequestBody Cep cep) {
        //TODO: process PUT request
        cepService.editarCep(id, cep);
        return "Dados atualizados com sucesso!";
    }
}
