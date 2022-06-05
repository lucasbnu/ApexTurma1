/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exemplohashmap;

import java.util.HashMap;

/**
 *
 * @author lucas
 */
public class ExemploHashmap {

    public static void main(String[] args) {
        HashMap<Integer,String> ExemploHash = new HashMap<Integer,String>();
        ExemploHash.put(1,"Lucas");
        ExemploHash.put(2,"João");
        ExemploHash.put(3,"Guilherme");
        ExemploHash.put(99,"elisclaiton");
        System.out.println(ExemploHash.get(99));
        ExemploHash.remove(99);
        System.out.println(ExemploHash.get(99));
        //String nome = ""
    }
}
