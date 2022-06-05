
package com.mycompany.geradorcpf;

import java.util.ArrayList;


public class GeradorCPF {
    static ArrayList<Integer> listaNumAleatorios = new ArrayList<>();
    
    public static void main(String[] args) {
        for (int i = 0; i <= 8; i++) {
          listaNumAleatorios.add(geraNumAleatorio());
        }
        System.out.println(listaNumAleatorios);
        validadorDigitos validador = new validadorDigitos();
        listaNumAleatorios = validador.ValidarDigitos(listaNumAleatorios);
         System.out.println(listaNumAleatorios);
    
    }    
  public static int geraNumAleatorio(){
    int numero = (int) (Math.random() * 10);
    return numero;
  }

}
