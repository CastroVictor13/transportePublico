package com.transporte.model;

import jakarta.persistence.*;
import java.time.LocalTime;

@Entity
@Table(name = "horario_passagem")
public class HorarioPassagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "horario", nullable = false)
    private LocalTime horario;

    @ManyToOne
    @JoinColumn(name = "parada_id", nullable = false)
    private Parada parada;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

    public Parada getParada() {
        return parada;
    }

    public void setParada(Parada parada) {
        this.parada = parada;
    }
}
