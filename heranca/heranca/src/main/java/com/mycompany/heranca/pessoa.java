/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heranca;

/**
 *
 * @author lucas
 */
public class pessoa {
  public String nome;
  public int idade;
  public float peso;
  public float altura;
  public String retornaNomeMaiusculo(){
      return nome.toUpperCase();
  }
  public String retornaNomeMinusculo(){
      return nome.toLowerCase();
  }
}
