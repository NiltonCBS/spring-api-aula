package com.fatec.comercio.Service;

import com.fatec.comercio.Entity.Marca;
import com.fatec.comercio.Repository.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MarcaService {

    @Autowired
    private MarcaRepository marcaRepository;

    //Buscar todos os Marcas
    public List<Marca> allMarcas(){
        return marcaRepository.findAll();
    }

    //Buscar Marca pelo Código
    public Optional<Marca> marcaId(Integer id){
        return marcaRepository.findById(id);
    }

    //Apagar Marca pelo Código
    public void apagaId(Integer id){
        marcaRepository.deleteById(id);
    }

    //Salvar Marca
    public String salvarMarca(Marca marca){
        marcaRepository.save(marca);
        return "Marca Cadastrado com sucesso!";
    }

    //Editar Marca
    public void editarMarca(Integer id, Marca marca){
        marca.setCodMarca(id);
        marcaRepository.save(marca);
    }
}
