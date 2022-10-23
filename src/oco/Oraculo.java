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
public class Oraculo {
    int segredo; 
    String misericordia;
    Scanner input = new Scanner(System.in);
    OCO oco = new OCO();
    void dialog01(){
            System.out.println("Oraculo fala: ");
    }
    void dialog02(){
           System.out.println("Voce tem : ");
    }
    void dialog03(){
        System.out.println("Vamos jogar um jogo de Advinhe o Numero.");
        System.out.println("Como esse jogo funciona: voce vai escolher um numero de 1 a 100");
        System.out.println("Se voce acertar, passa para a proxima fase, se voce errar, daremos uma dica");
        System.out.println("Assim que voce acertar jogaremos um impar e par");
    }
    void dialog04(){
        System.out.println("Escolha um número de 1 a 5");
    }
    void dialog05(){
        System.out.println("Peca misericorida");
        misericordia = input.nextLine();
        if(misericordia.length() >= 5){
        System.out.println("Te darei misericordia: ");
          }else{
            System.out.println("Voce nao e digno de misericordia");
        }
        }
    void setSegredos(){
      Random gerador = new Random();
      segredo = gerador.nextInt(101);
  }
    void setDecid(){
        if(oco.tries2 / 2 == 0){
            System.out.println("");
        }
    }
}
