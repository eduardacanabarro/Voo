/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.passagens;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Duda
 */

 public class Voo {//classe sobre o voo com oq se pede, dentro da classe de reserva 
         
    private int numVoo;
    private String origem;
    private String destino;
    private int assentosD;
    private int capacidadeTotal;
    private int lugaresD;

    public Voo(int numVoo, String origem, String destino, int assentosD, int capacidadeTotal) {
        this.numVoo = numVoo;
        this.origem = origem;
        this.destino = destino;
        this.assentosD = assentosD;
        this.capacidadeTotal = capacidadeTotal;
        this.lugaresD = capacidadeTotal;
    }
    public int getNumVoo() { //gets para pega o valor no caso as respostas
        return numVoo;
    }

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }

    public int getAssentosD() {
        return assentosD;
    }
    //aqui é da classe de cima q é o sistema de reserva e esse codigo é pra isso, é o sistema de reserva
    public String Voo;
    
    private List<Voo> Voos = new ArrayList<>();

    public void adicionarVoo(Voo voo) {
        Voos.add(voo);

    }
}