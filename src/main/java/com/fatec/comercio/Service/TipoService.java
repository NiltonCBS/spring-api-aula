package com.fatec.comercio.Service;

import com.fatec.comercio.Entity.Tipo;
import com.fatec.comercio.Repository.TipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoService {

    @Autowired
    private TipoRepository tipoRepository;

    //Buscar todos os Tipos
    public List<Tipo> allTipos(){
        return tipoRepository.findAll();
    }

    //Buscar Tipo pelo Código
    public Optional<Tipo> tipoId(Integer id){
        return tipoRepository.findById(id);
    }

    //Apagar Tipo pelo Código
    public void apagaId(Integer id){
        tipoRepository.deleteById(id);
    }

    //Salvar Tipo
    public String salvarTipo(Tipo tipo){
        tipoRepository.save(tipo);
        return "Tipo Cadastrado com sucesso!";
    }

    //Editar Tipo
    public void editarTipo(Integer id, Tipo tipo){
        tipo.setCodTipo(id);
        tipoRepository.save(tipo);
    }
}
