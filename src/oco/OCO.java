/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oco ;

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
        int acerto = 0;
        int tries2 = 0;
     Scanner input = new Scanner(System.in);
     Oraculo O01 = new Oraculo();
     Guerreiro G01 = new Guerreiro();
     
     O01.dialog01();
     G01.setNome();
    
     O01.dialog01();
     O01.dialog02();
     G01.setVidas();
     O01.setSegredos();
     
     
     O01.dialog03();
      while(G01.vida > 0){
          O01.dialog01();
         System.out.println(G01.nome + " Digite um numero de 1 - 100");
         G01.guerreirodialog();
         int tries = input.nextInt();
  
      
      
      if(tries == O01.segredo){
       O01.dialog01();
      System.out.println("Você Acertou!!!");
      acerto++;
      }else if(tries < O01.segredo){
           O01.dialog01();
      System.out.println("Errou!!! ele eh maior");  
        G01.vida--;
      }
      else{
           O01.dialog01();
      System.out.println("Errou!!! ele eh menor");  
         G01.vida--;
  }
      if(acerto == 1 & G01.vida > 0){
          O01.dialog01();
          O01.dialog04();
          G01.guerreirodialog();
          tries2 = input.nextInt();  
      }
      if(G01.vida == 0){
         O01.dialog05();
      } 
         }
      }
    }
    

