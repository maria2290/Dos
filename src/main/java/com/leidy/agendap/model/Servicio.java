package com.leidy.agendap.model;



public class Servicio {

    private int idServicio;
    private String nombre;
    private String descripcion;
    private double precio;

    public Servicio(int idServicio, String nombre, String descripcion, double precio) {
        this.idServicio = idServicio;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public static void remove(Servicio servicio) {

    }

    public int getIdServicio() {
        return idServicio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}