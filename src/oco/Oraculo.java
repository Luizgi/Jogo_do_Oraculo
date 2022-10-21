/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oco;

import java.util.Random;

/**
 *
 * @author alunodev08
 */
public class Oraculo {
    int segredo; 
    
    void setSegredos(){
      Random gerador = new Random();
      segredo = gerador.nextInt(101);
      System.out.println(segredo);
  }
}
