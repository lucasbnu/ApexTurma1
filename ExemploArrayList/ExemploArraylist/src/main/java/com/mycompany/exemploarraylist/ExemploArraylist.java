/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exemploarraylist;

import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class ExemploArraylist {

    public static void main(String[] args) {

        
        ArrayList<cliente> ListaClientes = new ArrayList();
        cliente cliente1;
        cliente1 = new cliente(6, "Guilherme", 0);
        cliente1.setIdade(30);
        
        ListaClientes.add(new cliente(1,"lucas",23));
        ListaClientes.add(new cliente(2,"diego",25));
        ListaClientes.add(new cliente(3,"Anderson",26));
        ListaClientes.add(new cliente(4,"Marcelo",27));
        
        ListaClientes.add(cliente1);
        System.out.println((ListaClientes.get(3).getName()));
        
        
        
    }
}
