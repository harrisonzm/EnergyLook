package com.energylook.backend.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "consumo", schema = "energylook", indexes = {
        @Index(name = "id_punto_historico", columnList = "id_punto_historico")
})
public class Consumo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "id_punto_historico", nullable = false)
    private PuntoHistorico idPuntoHistorico;

    @Column(name = "consumo", nullable = false, precision = 10, scale = 2)
    private BigDecimal consumo;

}