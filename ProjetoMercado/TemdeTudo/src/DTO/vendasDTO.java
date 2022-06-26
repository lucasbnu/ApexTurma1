package DTO;

import java.util.ArrayList;
import utils.campo;

public class vendasDTO extends ClassePaiDTO {
    private campo<Integer> id_venda;
    private campo<Integer> fk_produto;
    private campo<Integer> fk_cliente;
    private campo<Integer> quantidade;
    
    public vendasDTO(){
         this.NomedaTabela = "vendas";
         id_venda = new campo<>();
         fk_produto = new campo<>();
         fk_cliente = new campo<>();
         quantidade = new campo<>();
         
         id_venda.ChavePrimaria = true;
         id_venda.nomedoCampo = "id_venda";
         fk_produto.nomedoCampo = "fk_produto";
         fk_cliente.nomedoCampo = "fk_cliente";
         quantidade.nomedoCampo = "quantidade";
    }
    
    @Override
    public ArrayList<campo> retornaCampos(){
        ArrayList<campo> listadeCampos = new ArrayList<>();
        listadeCampos.add(id_venda);
        listadeCampos.add(fk_produto);
        listadeCampos.add(fk_cliente);
        listadeCampos.add(quantidade);

        return listadeCampos;
    }    

    public campo<Integer> getId_venda() {
        return id_venda;
    }

    public void setId_venda(int id_venda) {
        this.id_venda.valorCampo = id_venda;
    }

    public campo<Integer> getFk_produto() {
        return fk_produto;
    }

    public void setFk_produto(int fk_produto) {
        this.fk_produto.valorCampo = fk_produto;
    }

    public campo<Integer> getFk_cliente() {
        return fk_cliente;
    }

    public void setFk_cliente(int fk_cliente) {
        this.fk_cliente.valorCampo = fk_cliente;
    }

    public campo<Integer> getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade.valorCampo = quantidade;
    }
    
  
    
    
}
