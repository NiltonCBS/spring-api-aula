package com.fatec.comercio.Forms;

import com.fatec.comercio.Entity.Cidade;
import com.fatec.comercio.Entity.Uf;
import com.fatec.comercio.Repository.UfRepository;

public class CidadeForm {
    private Integer codCidade;
    private String nomeCidade;
    private String nomeUf;

    public Integer getCodCidade() {
        return codCidade;
    }

    public void setCodCidade(Integer codCidade) {
        this.codCidade = codCidade;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    public String getNomeUf() {
        return nomeUf;
    }

    public void setNomeUf(String nomeUf) {
        this.nomeUf = nomeUf;
    }




    //método de conversão para a entidade Cidade
    public Cidade converter(UfRepository ufRepository){

        Uf uf = ufRepository.findByNomeuf(nomeUf);

        return new Cidade(nomeCidade, uf);
    }
}
