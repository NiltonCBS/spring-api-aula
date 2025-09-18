package com.fatec.comercio.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fatec.comercio.Entity.Sexo;

public interface SexoRepository extends JpaRepository<Sexo, Integer> {

    Sexo findByNomesexo(String nomesexo);
    Sexo findByCodsexo (Integer codsexo);
}
