/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oco;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alunodev08
 */
public class Guerreiro {
    Scanner input = new Scanner(System.in);
    String nome;
    int vida;

    
    void setVidas(){
    Random gerador = new Random(); 
    vida = gerador.nextInt(4)+9;
    System.out.println("Número gerado: " + vida);     
  }
    
    void setNome(){
       System.out.println("Digite o nome do Guerreiro: ");
       nome = input.nextLine();
    }
}
