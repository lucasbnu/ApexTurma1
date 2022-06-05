
package com.mycompany.geradorcpf;

import java.util.ArrayList;

public class validadorDigitos {
public ArrayList<Integer> ValidarDigitos(ArrayList<Integer> Digitos){
   int peso = 10;
   int somaDigitosComPeso;
   
    for (int i = 0; i < 2; i++) {
         somaDigitosComPeso = 0;
         if  (i ==  1){
           peso = 11;
         } 
         
         for(int Digito : Digitos){
           somaDigitosComPeso +=  (Digito * peso);
           peso--;
         }
         int restodaDivisao = (somaDigitosComPeso % 11);
         int digitoGerado;
         if (restodaDivisao < 2 ){
             digitoGerado = 0;    
         } else {
             digitoGerado = 11 - restodaDivisao;
         }
         Digitos.add(digitoGerado);
}
   return Digitos;
    
} 
}
