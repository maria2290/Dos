package com.leidy.agendap.model;
import java.time.LocalDate;
import java.time.LocalTime;

public class Cita {

    private int idCita;
    private Cliente cliente;
    private Servicio servicio;
    private LocalDate fecha;
    private LocalTime hora;
    private String estado;

    public Cita(int idCita, Cliente cliente, Servicio servicio,
                LocalDate fecha, LocalTime hora, String estado) {

        this.idCita = idCita;
        this.cliente = cliente;
        this.servicio = servicio;
        this.fecha = fecha;
        this.hora = hora;
        this.estado = estado;
    }

    public int getIdCita() {
        return idCita;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public String getEstado() {
        return estado;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
