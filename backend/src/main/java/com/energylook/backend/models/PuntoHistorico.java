package com.energylook.backend.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "punto_historico", schema = "energylook")
public class PuntoHistorico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "pais", nullable = false, length = 100)
    private String pais;

    @Column(name = "tipo", nullable = false, length = 50)
    private String tipo;

    @Column(name = "`año`", nullable = false)
    private Integer ano;

}