package com.practica.expensetracker;

import com.practica.expensetracker.repository.RepositorioGastos;
import com.practica.expensetracker.repository.RepositorioGastosEnMemoria;
import com.practica.expensetracker.ui.VentanaPrincipal;

import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {
        RepositorioGastos repositorio = new RepositorioGastosEnMemoria();
        SwingUtilities.invokeLater(() -> new VentanaPrincipal(repositorio).setVisible(true));
    }
}
