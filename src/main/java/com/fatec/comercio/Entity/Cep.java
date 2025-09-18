package com.fatec.comercio.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Cep {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codCep;

    @Column
    private String numeroCep;
}
