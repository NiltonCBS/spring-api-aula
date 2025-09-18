package com.fatec.comercio.Controller;

import com.fatec.comercio.Entity.Rua;
import com.fatec.comercio.Service.RuaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ruas")
public class RuaController {

    @Autowired
    private RuaService ruaService;

    @GetMapping("")
    public List<Rua> getRuas() {
        return ruaService.allRuas();
    }

    @GetMapping("/{id}")
    public Optional<Rua> getRuaId(@PathVariable Integer id) {
        return  ruaService.ruaId(id);
    }

    @PostMapping("")
    public String postRua(@RequestBody Rua rua) {
        ruaService.salvarRua(rua);
        return "Dados Salvos com Sucesso!!!";
    }

    @DeleteMapping("/{id}")
    public String deletaId(@PathVariable Integer id){
        ruaService.apagaId(id);
        return "O rua de código: "+ id + " foi deletado";
    }

    @PutMapping("/{id}")
    public String putRua(@PathVariable Integer id, @RequestBody Rua rua) {
        //TODO: process PUT request
        ruaService.editarRua(id, rua);
        return "Dados atualizados com sucesso!";
    }
}
