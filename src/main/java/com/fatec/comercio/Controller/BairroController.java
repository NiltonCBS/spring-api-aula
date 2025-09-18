package com.fatec.comercio.Controller;

import com.fatec.comercio.Entity.Bairro;
import com.fatec.comercio.Service.BairroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/bairros")
public class BairroController {

    @Autowired
    private BairroService bairroService;

    @GetMapping("")
    public List<Bairro> getbairros() {
        return bairroService.allBairros();
    }

    @GetMapping("/{id}")
    public Optional<Bairro> getBairroId(@PathVariable Integer id) {
        return  bairroService.bairroId(id);
    }

    @PostMapping("")
    public String postBairro(@RequestBody Bairro bairro) {
        bairroService.salvarBairro(bairro);
        return "Dados Salvos com Sucesso!!!";
    }

    @DeleteMapping("/{id}")
    public String deletaId(@PathVariable Integer id){
        bairroService.apagaId(id);
        return "O bairro de código: "+ id + " foi deletado";
    }

    @PutMapping("/{id}")
    public String putBairro(@PathVariable Integer id, @RequestBody Bairro bairro) {
        //TODO: process PUT request
        bairroService.editarBairro(id, bairro);
        return "Dados atualizados com sucesso!";
    }
}
