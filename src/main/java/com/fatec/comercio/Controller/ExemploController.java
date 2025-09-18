package com.fatec.comercio.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/exemplo")
public class ExemploController {
    @GetMapping("")
    public String getTodos(){
        return ("Bem Vindo ao método Get");
    }

    @DeleteMapping("/{id}")
    public String deletaId(@PathVariable Integer id){
        return "Você quer apagar o id = "+id;
    }

    @PostMapping("")
    public String postExemplo(){
        return "Salvei o exemplo";
    }

    @PutMapping("")
    public String putExemplo(){
        return "Atualizei os dados";
    }
}
