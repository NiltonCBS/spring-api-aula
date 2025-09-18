package com.fatec.comercio.Repository;

import com.fatec.comercio.Entity.Uf;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UfRepository extends JpaRepository<Uf, Integer> {

    //Variações de Consultas com o JpaRepository
    //List<Uf> findByNomeuf(String nomeuf);
    //Uf   findByNomeufAndSigla(String nomeUf, String sigla);

    Uf findByNomeuf(String nomeuf);
    Uf findBySigla(String sigla);
    Uf findByCoduf(Integer coduf);

}
