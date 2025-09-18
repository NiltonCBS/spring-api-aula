package com.fatec.comercio.Service;

import com.fatec.comercio.Entity.Bairro;
import com.fatec.comercio.Repository.BairroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BairroService {

    @Autowired
    private BairroRepository bairroRepository;

    //Buscar todos os Bairros
    public List<Bairro> allBairros(){
        return bairroRepository.findAll();
    }

    //Buscar Bairro pelo Código
    public Optional<Bairro> bairroId(Integer id){
        return bairroRepository.findById(id);
    }

    //Apagar Bairro pelo Código
    public void apagaId(Integer id){
        bairroRepository.deleteById(id);
    }

    //Salvar Bairro
    public String salvarBairro(Bairro bairro){
        bairroRepository.save(bairro);
        return "Bairro Cadastrado com sucesso!";
    }

    //Editar Bairro
    public void editarBairro(Integer id, Bairro bairro){
        bairro.setCodBairro(id);
        bairroRepository.save(bairro);
    }
}
