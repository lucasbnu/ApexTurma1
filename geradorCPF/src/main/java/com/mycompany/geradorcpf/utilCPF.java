
package com.mycompany.geradorcpf;


import java.text.ParseException;
import java.util.ArrayList;
import javax.swing.text.MaskFormatter;

public class utilCPF {
    
  private static int geraNumAleatorio(){
    int numero = (int) (Math.random() * 10);
    return numero;
  }
  
public boolean validaCPF( String CPF){
   ArrayList<Integer> CPFSemVerificador = new ArrayList<>();
   int numero = 0;
    for (int i = 0; i < 9; i++) {
         numero = Character.getNumericValue(CPF.charAt(i) );
         CPFSemVerificador.add( numero );     
    }
    CPFSemVerificador = retornaDigitoVerificador(CPFSemVerificador);//validarDigitos ele foi rebatizado
    String textoCPF = "";
    for (int digito : CPFSemVerificador){
         textoCPF += digito;
    }    
    return (CPF.equals(textoCPF));
}
  
  private String colocaMascaraCPF(String CPF){
       String CPFFormatado = ""; 
      try {
        MaskFormatter mf  = new MaskFormatter("###.###.###-##");
        mf.setValueContainsLiteralCharacters(false);
         CPFFormatado = mf.valueToString(CPF);    
      } catch (ParseException e) {
          e.printStackTrace();
      }  
   return CPFFormatado; 
  }
  
public String geraCPF(){
     ArrayList<Integer> listaNumAleatorios = new ArrayList<>();    
        for (int i = 0; i <= 8; i++) {
          listaNumAleatorios.add(geraNumAleatorio());
        }
        listaNumAleatorios = retornaDigitoVerificador(listaNumAleatorios);
        String texto = "";
        for(int digito : listaNumAleatorios){
            texto += digito;
        }
      
    return colocaMascaraCPF(texto);
}
private ArrayList<Integer> retornaDigitoVerificador(ArrayList<Integer> Digitos){
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
