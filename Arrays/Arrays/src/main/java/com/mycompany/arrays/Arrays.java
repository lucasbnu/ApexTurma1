/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.arrays;

/**
 *
 * @author lucas
 */
public class Arrays {

    public static void main(String[] args) {
        int salaSelecionada;
        salaSelecionada = 13;
        int[] salasEmManutencao = {42,52,13};
        
        for (int i = 0; i <= 2; i++) {
          if ( salasEmManutencao[i] == salaSelecionada ){
              System.out.println("Está sala está em manutenção, favor selecionar outra.");
          }else{
              System.out.println("Agendamento ok");
          }
          }   
        }
    
        
        
   
}
