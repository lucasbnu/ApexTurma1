
package com.mycompany.geradorcpf;

public class GeradorCPF {
    public static void main(String[] args) {
         utilCPF utilitarioCPF = new utilCPF();
         
         if ( utilitarioCPF.validaCPF("61782997024") ){
             System.out.println("CPF Verdadeiro");    
         }else {
             System.out.println("CPF False");    
         }
         System.out.println(utilitarioCPF.geraCPF());
            
    }    
}
