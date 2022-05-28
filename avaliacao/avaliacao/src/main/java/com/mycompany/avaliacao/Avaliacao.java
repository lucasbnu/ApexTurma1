/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.avaliacao;

import javax.swing.JOptionPane;



/**
 *
 * @author lucas
 */
public class Avaliacao {

    public static void main(String[] args) {
        aluno var1 = new aluno();
        var1.setIdade(23);
        var1.setnome("Lucas de Sena");
        if (var1.preenchido()){
          var1.imprime();    
        }else{
            JOptionPane.showConfirmDialog(null, "O Objeto não está totalmente preenchido!");
        }
            
        
    }
}
