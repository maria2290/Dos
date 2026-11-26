package com.leidy.agendap.dao;


import com.leidy.agendap.model.Servicio;

import java.util.ArrayList;

public class ServicioDao {

    private ArrayList<Servicio> servicios = new ArrayList<>();

    public void agregar(Servicio servicio) {
        servicios.add(servicio);
    }

    public ArrayList<Servicio> listar() {
        return servicios;
    }

    public Servicio buscar(int id) {
        for (Servicio servicio : servicios) {
            if (servicio.getIdServicio() == id) {
                return servicio;
            }
        }
        return null;
    }

    public boolean eliminar(int id) {
        Servicio servicio = buscar(id);

        if (servicio != null) {
            servicios.remove(servicio);
            return true;
        }

        return false;
    }
}
