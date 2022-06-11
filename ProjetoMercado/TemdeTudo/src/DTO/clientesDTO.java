package DTO;

import java.util.ArrayList;
import utils.campo;

public class clientesDTO extends ClassePaiDTO {
    private campo<Integer> id_cliente;
    private campo<String> Nome_Cliente;
    private campo<String> CPF;
    private campo<String> telefone; 
    private campo<String> email;
    
    public clientesDTO(){
        this.NomedaTabela = "clientes";
         id_cliente = new campo<>();
         Nome_Cliente = new campo<>();
         CPF = new campo<>();
         telefone = new campo<>();
         email = new campo<>();
         id_cliente.ChavePrimaria = true;
         id_cliente.nomedoCampo = "id_cliente";
         Nome_Cliente.nomedoCampo = "nome_cliente";
         CPF.nomedoCampo = "CPF ";
         telefone.nomedoCampo = "telefone";
         email.nomedoCampo = "email";
    }
    
    @Override
    public ArrayList<campo> retornaCampos(){
        ArrayList<campo> listadeCampos = new ArrayList<>();
        listadeCampos.add(id_cliente);
        listadeCampos.add(Nome_Cliente);
        listadeCampos.add(CPF);
        listadeCampos.add(telefone);
        listadeCampos.add(email);
        
        return listadeCampos;
    }

    public campo<Integer> getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(campo<Integer> id_cliente) {
        this.id_cliente = id_cliente;
    }


    public campo<String> getNome_Cliente() {
        return Nome_Cliente;
    }

    public void setNome_Cliente(campo<String> Nome_Cliente) {
        this.Nome_Cliente = Nome_Cliente;
    }


    public campo<String> getCPF() {
        return CPF;
    }


    public void setCPF(campo<String> CPF) {
        this.CPF = CPF;
    }


    public campo<String> getTelefone() {
        return telefone;
    }


    public void setTelefone(campo<String> telefone) {
        this.telefone = telefone;
    }

    public campo<String> getEmail() {
        return email;
    }


    public void setEmail(campo<String> email) {
        this.email = email;
    }
    
}
