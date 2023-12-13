/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.passagens;

/**
 *
 * @author Duda
 */
public class Cliente {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome; //nome do cliente
    }

    public String getNome() { //pegando nome do cliente
        return nome;
    }

        public void comprarlugares(int lugaresComprados, int lugaresD) {
   
       if (lugaresComprados > 0 && lugaresComprados <= lugaresD) {
        lugaresD = lugaresComprados;
        System.out.println(lugaresComprados + " lugares comprados.");
    } else {
        System.out.println("Número inválido de lugares para poder comprar.");
    }
    }
    
    
    
}