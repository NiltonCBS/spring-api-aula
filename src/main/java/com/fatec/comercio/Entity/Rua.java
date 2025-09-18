package com.fatec.comercio.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Rua {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codRua;

    @Column
    private String nomeRua;
}
