/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.passagens;

/**
 *
 * @author Duda
 */
class Reserva {
 
    public int lugaresD;
    

    public boolean realizarR(Reserva reserva) {
    if (reserva.getQuantidade() <= lugaresD) {
        reservas.add(reserva);
        lugaresD -= reserva.getQuantidade();
        System.out.println("Reserva realizada");
        return true;
    } else {
        System.out.println("Não há lugares suficientes para a reserva.");
        return false;
    }
    
    
}

    private int getQuantidade() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}