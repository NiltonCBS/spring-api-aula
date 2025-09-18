package com.fatec.comercio.Controller;

import com.fatec.comercio.Entity.Marca;
import com.fatec.comercio.Service.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/marcas")
public class MarcaController {

    @Autowired
    private MarcaService marcaService;

    @GetMapping("")
    public List<Marca> getmarcas() {
        return marcaService.allMarcas();
    }

    @GetMapping("/{id}")
    public Optional<Marca> getMarcaId(@PathVariable Integer id) {
        return  marcaService.marcaId(id);
    }

    @PostMapping("")
    public String postMarca(@RequestBody Marca marca) {
        marcaService.salvarMarca(marca);
        return "Dados Salvos com Sucesso!!!";
    }

    @DeleteMapping("/{id}")
    public String deletaId(@PathVariable Integer id){
        marcaService.apagaId(id);
        return "A marca de código: "+ id + " foi deletado";
    }

    @PutMapping("/{id}")
    public String putMarca(@PathVariable Integer id, @RequestBody Marca marca) {
        //TODO: process PUT request
        marcaService.editarMarca(id, marca);
        return "Dados atualizados com sucesso!";
    }

}
