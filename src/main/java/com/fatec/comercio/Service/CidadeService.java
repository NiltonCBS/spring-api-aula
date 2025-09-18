package com.fatec.comercio.Service;

import com.fatec.comercio.Entity.Cidade;
import com.fatec.comercio.Entity.Uf;
import com.fatec.comercio.Forms.CidadeForm;
import com.fatec.comercio.Repository.CidadeRepository;
import com.fatec.comercio.Repository.UfRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CidadeService {

    @Autowired
    private CidadeRepository cidadeRepository;

    @Autowired
    private UfRepository ufRepository;

    public CidadeService (CidadeRepository cidadeRepository){
        this.cidadeRepository = cidadeRepository;
    }

    public List<Cidade> allCidades(){
        return cidadeRepository.findAll();
    }

    public Cidade cidadeId(Integer id){
        return cidadeRepository.findByCodCidade(id);
    }

    public Cidade cidadeNomecidade(String nomecidade){
        return cidadeRepository.findByNomeCidade(nomecidade);
    }

    public void apagaCidadeId(Integer id){
        cidadeRepository.deleteById(id);
    }

    public Cidade salvarCidade(CidadeForm cidadeForm){
        Cidade cidade = cidadeForm.converter(ufRepository);
        return cidadeRepository.save(cidade);
    }

    public Cidade editaCidade(CidadeForm cidadeForm, Integer id){
        Uf uf = ufRepository.findByNomeuf(cidadeForm.getNomeUf());

        Cidade cidade = cidadeRepository.getOne(id);
        cidade.setNomeCidade(cidadeForm.getNomeCidade());
        cidade.setUf(uf);
        return cidade;

    }

}
