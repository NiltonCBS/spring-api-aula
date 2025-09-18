package com.fatec.comercio.Controller;

import com.fatec.comercio.Entity.Tipo;
import com.fatec.comercio.Service.TipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tipos")
public class TipoController {

    @Autowired
    private TipoService tipoService;

    @GetMapping("")
    public List<Tipo> gettipos() {
        return tipoService.allTipos();
    }

    @GetMapping("/{id}")
    public Optional<Tipo> getTipoId(@PathVariable Integer id) {
        return  tipoService.tipoId(id);
    }

    @PostMapping("")
    public String postTipo(@RequestBody Tipo tipo) {
        tipoService.salvarTipo(tipo);
        return "Dados Salvos com Sucesso!!!";
    }

    @DeleteMapping("/{id}")
    public String deletaId(@PathVariable Integer id){
        tipoService.apagaId(id);
        return "O tipo de código: "+ id + " foi deletado";
    }

    @PutMapping("/{id}")
    public String putTipo(@PathVariable Integer id, @RequestBody Tipo tipo) {
        //TODO: process PUT request
        tipoService.editarTipo(id, tipo);
        return "Dados atualizados com sucesso!";
    }
}
