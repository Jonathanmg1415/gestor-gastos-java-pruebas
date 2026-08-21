package com.practica.expensetracker.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

public class Gasto {

    private final String id;
    private BigDecimal monto;
    private Categoria categoria;
    private LocalDate fecha;
    private String descripcion;

    public Gasto(BigDecimal monto, Categoria categoria, LocalDate fecha, String descripcion) {
        this(UUID.randomUUID().toString(), monto, categoria, fecha, descripcion);
    }

    public Gasto(String id, BigDecimal monto, Categoria categoria, LocalDate fecha, String descripcion) {
        validarMonto(monto);
        validarCategoria(categoria);
        validarFecha(fecha);
        this.id = Objects.requireNonNull(id, "El id no puede ser nulo");
        this.monto = monto;
        this.categoria = categoria;
        this.fecha = fecha;
        this.descripcion = descripcion;
    }

    private static void validarMonto(BigDecimal monto) {
        if (monto == null || monto.signum() <= 0) {
            throw new IllegalArgumentException("El monto debe ser positivo");
        }
    }

    private static void validarCategoria(Categoria categoria) {
        if (categoria == null) {
            throw new IllegalArgumentException("La categoria no puede ser nula");
        }
    }

    private static void validarFecha(LocalDate fecha) {
        if (fecha == null) {
            throw new IllegalArgumentException("La fecha no puede ser nula");
        }
    }

    public String getId() {
        return id;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        validarMonto(monto);
        this.monto = monto;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        validarCategoria(categoria);
        this.categoria = categoria;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        validarFecha(fecha);
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Gasto)) {
            return false;
        }
        Gasto gasto = (Gasto) o;
        return Objects.equals(id, gasto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Gasto{" +
                "id='" + id + '\'' +
                ", monto=" + monto +
                ", categoria=" + categoria +
                ", fecha=" + fecha +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
