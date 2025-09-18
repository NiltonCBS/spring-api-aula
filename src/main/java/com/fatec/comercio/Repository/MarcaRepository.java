package com.fatec.comercio.Repository;

import com.fatec.comercio.Entity.Marca;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarcaRepository extends JpaRepository<Marca, Integer> {
}
