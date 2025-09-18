package com.fatec.comercio.Service;

import com.fatec.comercio.Entity.Cep;
import com.fatec.comercio.Repository.CepRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CepService {

    @Autowired
    private CepRepository cepRepository;

    //Buscar todos os Ceps
    public List<Cep> allCeps(){
        return cepRepository.findAll();
    }

    //Buscar Cep pelo Código
    public Optional<Cep> cepId(Integer id){
        return cepRepository.findById(id);
    }

    //Apagar Cep pelo Código
    public void apagaId(Integer id){
        cepRepository.deleteById(id);
    }

    //Salvar Cep
    public String salvarCep(Cep cep){
        cepRepository.save(cep);
        return "Cep Cadastrado com sucesso!";
    }

    //Editar Cep
    public void editarCep(Integer id, Cep cep){
        cep.setCodCep(id);
        cepRepository.save(cep);
    }
}
