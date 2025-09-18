package com.fatec.comercio.Repository;

import com.fatec.comercio.Entity.Cep;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CepRepository extends JpaRepository<Cep, Integer> {
}
