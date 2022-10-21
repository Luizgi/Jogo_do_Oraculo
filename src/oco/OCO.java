/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oco;

import java.util.Scanner;

/**
 *
 * @author alunodev08
 */
public class OCO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     Oraculo O01 = new Oraculo();
     Guerreiro G01 = new Guerreiro();

     
    System.out.println("Oraculo pergunta: Qual é o seu nome");
    G01.setNome();
    
     
     G01.setVidas();
     O01.setSegredos();
     
      while(G01.vida > 0){
         System.out.println( G01.nome + "Digite um número de 1 - 100");
         int tries = input.nextInt();
  
      
      
      if(tries == O01.segredo){
      System.out.println("Você Acertou!!!");
      }else if(tries < O01.segredo){
      System.out.println("Errou!!! ele eh maior");  
        G01.vida--;
      }
      else{
      System.out.println("Errou!!! ele eh menor");  
         G01.vida--;
  }
      }
    }
    
}
