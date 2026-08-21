package com.practica.expensetracker.service;

import com.practica.expensetracker.exception.CategoriaInvalidaException;
import com.practica.expensetracker.exception.FechaInvalidaException;
import com.practica.expensetracker.exception.MontoInvalidoException;
import com.practica.expensetracker.model.Categoria;
import com.practica.expensetracker.model.Gasto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ValidadorGasto {

    public void validar(Gasto gasto) {
        if (gasto == null) {
            throw new IllegalArgumentException("El gasto no puede ser nulo");
        }
        validarMonto(gasto.getMonto());
        validarCategoria(gasto.getCategoria());
        validarFecha(gasto.getFecha());
    }

    private void validarMonto(BigDecimal monto) {
        if (monto == null || monto.signum() <= 0) {
            throw new MontoInvalidoException("El monto del gasto debe ser mayor que cero");
        }
    }

    private void validarCategoria(Categoria categoria) {
        if (categoria == null) {
            throw new CategoriaInvalidaException("La categoria del gasto no puede ser nula");
        }
    }

    private void validarFecha(LocalDate fecha) {
        if (fecha == null) {
            throw new FechaInvalidaException("La fecha del gasto no puede ser nula");
        }
    }
}
