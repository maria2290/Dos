package com.leidy.agendap.dao;

import com.leidy.agendap.model.Cliente;

import java.util.ArrayList;

public class ClienteDao {

    private ArrayList<Cliente> clientes = new ArrayList<>();

    public void agregar(Cliente cliente) {
        clientes.add(cliente);
    }

    public ArrayList<Cliente> listar() {
        return clientes;
    }

    public Cliente buscar(int id) {
        for (Cliente cliente : clientes) {
            if (cliente.getIdCliente() == id) {
                return cliente;
            }
        }
        return null;
    }

    public boolean eliminar(int id) {
        Cliente cliente = buscar(id);

        if (cliente != null) {
            clientes.remove(cliente);
            return true;
        }

        return false;
    }
}

