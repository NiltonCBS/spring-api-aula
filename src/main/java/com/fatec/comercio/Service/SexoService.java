package com.fatec.comercio.Service;

import com.fatec.comercio.Entity.Sexo;
import com.fatec.comercio.Repository.SexoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SexoService {

    @Autowired
    private SexoRepository sexoRepository;

    public SexoService(SexoRepository sexoRepository) {
        this.sexoRepository = sexoRepository;
    }

    //buscar todos
    public List<Sexo> allSexos(){
        return sexoRepository.findAll();
    }

    //Buscar por Id
    public Sexo sexoId(Integer id){
        return sexoRepository.findByCodsexo(id);
    }

    //Apagar por id
    public String apagaId(Integer id) {
        sexoRepository.deleteById(id);
        return "Apaguei: " + id;
    }

    //salvar Sexo
    public Sexo salvarSexo(Sexo sexo){
        return sexoRepository.save(sexo);
    }

    //Editar Sexo
    public void editarSexo(Integer id, Sexo sexo){
        sexo.setCodsexo(id);
        sexoRepository.save(sexo);
    }
}
