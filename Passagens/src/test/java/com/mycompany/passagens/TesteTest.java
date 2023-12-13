/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.passagens;

import com.mycompany.passagens.SistemaReserva.Voo;
import com.mycompany.passagens.SistemaReserva.voo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Duda
 */
public class TesteTest {
    
    public TesteTest() {
    }

    @Test
    public void testSomeMethod() {
    }
    public void reservaBemSucedida() {
       
        SistemaR sistemaR = new SistemaR();
        
        Voo voo = new Voo(1, "Cidade A", "Cidade B", 10);
        sistemaR.adicionarVoo(voo);
        Cliente cliente = new Cliente("julia");

        // Ação
        sistemaR.realizarR(cliente, 1);

        // Verifica
        assertEquals(9, voo.getAssentosD());
    }
    public void disponibilidadeDeAssentos() {
       
        SistemaR sistemaR = new SistemaR();
        
        Voo voo = new Voo(2, "Cidade B", "Cidade C", 5);
        
        sistemaR.adicionarVoo(voo);
        Cliente cliente1 = new Cliente("Carlos");
        Cliente cliente2 = new Cliente("juliana");

        // Ação
        sistemaR.realizarR(cliente1, 2);

        // Verifica
        assertEquals(4, voo.getAssentosD());

        // Tentativa de reserva com assentos insuficientes
        sistemaR.realizarR(cliente2, 2);

        // Verifica
        assertEquals(4, voo.getAssentosD());
    }
    public void cancelamentoDeReserva() {
        
        SistemaR sistemaR = new SistemaR();
        
        Voo voo = new Voo(3, "Cidade C", "Cidade D", 8);
        sistemaR.adicionarVoo(voo);
        Cliente cliente = new Cliente("José Santos");

        // Ação
        sistemaR.realizarR(cliente, 3);

        // Verifica 
        assertEquals(7, voo.getAssentosD());

        // Cancela da reserva
        sistemaR.cancelarR(cliente, 3);

        // Verifica
        assertEquals(8, voo.getAssentosD());
    }
     public void confirmacaoCheckIn() {
        
        SistemaR sistemaR= new SistemaR();
        
        Voo voo = new Voo(4, "Cidade D", "Cidade E", 15);
        sistemaR.adicionarVoo(voo);
        Cliente cliente = new Cliente("Fernanda");

        // Ação
        sistemaR.realizarR(cliente, 4);
        sistemaR.confirmarCheckIn(cliente, 4);

        // Verifica
        assertTrue(cliente.isCheckInConfirmado());
    }
     public void falhaNaReserva() throws SemAssentosDException {
      
        SistemaR sistemaR = new SistemaR();
        
        Voo voo = new Voo(5, "Cidade E", "Cidade F", 0);
        sistemaR.adicionarVoo(voo);
        Cliente cliente = new Cliente("Ricardo");

        // Tentativa de reserva sem assentos disponíveis (deve lançar uma exceção)
        sistemaR.realizarR(cliente, 5);
    }
}
