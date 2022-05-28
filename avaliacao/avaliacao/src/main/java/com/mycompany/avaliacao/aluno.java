/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avaliacao;

/**
 *
 * @author lucas
 */
public class aluno {
  private String nome;
  private int idade;
  
  public void setnome(String paramnome){
      nome = paramnome;  
  }  
  public String getnome(){
      
      return nome;
  }
  public void setIdade(int paramIdade){
      idade = paramIdade;
  }
  public int getIdade(){
      return idade;
      }
  public void imprime(){
      String texto = "Nome: "+nome + " idade: "+idade;
      System.out.println(texto);
  }
  
  public boolean preenchido(){
      return idade > 0 && nome.length() > 0;
  }
  
}
