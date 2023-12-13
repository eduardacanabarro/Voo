/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.passagens;

/**
 *
 * @author Duda
 */
class SemAssentosDException extends Exception {
       public void reservarAssento() throws SemAssentosDException { // throws pra poder usar uma exception q no caso é nao ter assentos
          
         int assentosD = 0; //criei uma variavel pq sem ela tava dando erro
         
        if (assentosD > 0) { //se os assentos for maior q 0 ele sera reservado
            assentosD--;
            System.out.println("Assento reservado");
        } else {
             System.out.println("Não tem assentos disponíveis.");
        }
    }
    
}
