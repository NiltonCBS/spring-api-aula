package com.fatec.comercio.Service;

import com.fatec.comercio.Entity.Rua;
import com.fatec.comercio.Repository.RuaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RuaService {

    @Autowired
    private RuaRepository ruaRepository;

    //Buscar todos os Ruas
    public List<Rua> allRuas(){
        return ruaRepository.findAll();
    }

    //Buscar Rua pelo Código
    public Optional<Rua> ruaId(Integer id){
        return ruaRepository.findById(id);
    }

    //Apagar Rua pelo Código
    public void apagaId(Integer id){
        ruaRepository.deleteById(id);
    }

    //Salvar Rua
    public String salvarRua(Rua rua){
        ruaRepository.save(rua);
        return "Rua Cadastrado com sucesso!";
    }

    //Editar Rua
    public void editarRua(Integer id, Rua rua){
        rua.setCodRua(id);
        ruaRepository.save(rua);
    }
}
