package com.practica.expensetracker.repository;

import com.practica.expensetracker.model.Gasto;

import java.util.List;
import java.util.Optional;

public interface RepositorioGastos {

    void agregar(Gasto gasto);

    void eliminar(String id);

    Optional<Gasto> buscarPorId(String id);

    List<Gasto> listarTodos();
}
