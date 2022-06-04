/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.heranca;

/**
 *
 * @author lucas
 */
public class Heranca {

    public static void main(String[] args) {
        funcionario fun = new funcionario();
        cliente cli = new cliente();
        cli.nome = "lucas";
        System.out.println(cli.retornaNomeMaiusculo());
       
    }
}
