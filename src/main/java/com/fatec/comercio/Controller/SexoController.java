package com.fatec.comercio.Controller;

import com.fatec.comercio.Entity.Sexo;
import com.fatec.comercio.Service.SexoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sexos")
public class SexoController {

    @Autowired
    private SexoService sexoService;

    @GetMapping
    public List<Sexo> getSexos(){
        return sexoService.allSexos();
    }

    @GetMapping("/{id}")
    public Sexo getSexoId(@PathVariable Integer id){
        return sexoService.sexoId(id);
    }

    @PostMapping("")
    public String postSexo(@RequestBody Sexo sexo) {
        sexoService.salvarSexo(sexo);
        return "Dados Salvos com sucesso!!!";
    }

    @DeleteMapping("/{id}")
    public String  deletaId(@PathVariable Integer id){
        sexoService.apagaId(id);
        return "O sexo de código: " + id + " foi deletado";
    }

    @PutMapping("/{id}")
    public String putSexo(@PathVariable Integer id, @RequestBody Sexo sexo){
        sexoService.editarSexo(id, sexo);
        return "Dados atualizados com sucesso";
    }
}
