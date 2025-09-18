package com.fatec.comercio.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Cidade {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer codCidade;

    @Column
    private String nomeCidade;

    @ManyToOne
    @JoinColumn(name = "idUf_fk")
    private Uf uf;

    public Cidade(String nomeCidade, Uf uf){
        this.nomeCidade = nomeCidade;
        this.uf = uf;
    }
}
