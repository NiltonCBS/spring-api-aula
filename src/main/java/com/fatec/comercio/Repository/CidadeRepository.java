package com.fatec.comercio.Repository;

import com.fatec.comercio.Entity.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

    Cidade findByNomeCidade(String nomeCidade);
    Cidade findByCodCidade(Integer codCidade);
}
