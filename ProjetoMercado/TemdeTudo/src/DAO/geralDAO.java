package DAO;

import DTO.ClassePaiDTO;
import java.util.ArrayList;
import utils.StringUtil;
import utils.campo;

public class geralDAO {
    
    
    public String atualizaRegistro(ClassePaiDTO objDTO){
        ArrayList<campo> listadeCampos = objDTO.retornaCampos();
        StringUtil trataSTR = new StringUtil();
        String comando = "UPDATE " + objDTO.NomedaTabela +" SET ";
        //String campos = "";
        String valores = "";
        for (int i = 0; i < listadeCampos.size(); i++) {

            if (!listadeCampos.get(i).ChavePrimaria) {
                
                valores += listadeCampos.get(i).nomedoCampo;
                if (listadeCampos.get(i).valorCampo.getClass() == String.class){
                     valores += " = "+ trataSTR.colocaAspasSimples(listadeCampos.get(i).valorCampo.toString());
                }else{
                       valores +=  " = "+listadeCampos.get(i).valorCampo.toString();
                }
                if (i < listadeCampos.size() - 1) {
                    valores += ",";
                }
            }

        }
        String comandoWhere = " WHERE ";
        for (int i = 0; i < listadeCampos.size(); i++) {
            if (listadeCampos.get(i).ChavePrimaria){
               comandoWhere += listadeCampos.get(i).nomedoCampo + " = " + listadeCampos.get(i).valorCampo.toString();
            }
        }        

        String comandoFinal = comando + valores +comandoWhere;

        return comandoFinal;
        
    }
    
    public String apagaRegistro(ClassePaiDTO objDTO) {
        ArrayList<campo> listadeCampos = objDTO.retornaCampos();
        String comando = "delete from "+objDTO.NomedaTabela+" where ";
        String comandoWhere = "";
        for (int i = 0; i < listadeCampos.size(); i++) {
            if (listadeCampos.get(i).ChavePrimaria){
               comandoWhere = listadeCampos.get(i).nomedoCampo + " = " + listadeCampos.get(i).valorCampo.toString();
            }
        }
        return comando + comandoWhere;
    }
    public String insereRegistro(ClassePaiDTO objDTO) {
        ArrayList<campo> listadeCampos = objDTO.retornaCampos();
        StringUtil trataSTR = new StringUtil();
        String comando = "Insert into " + objDTO.NomedaTabela;
        String campos = "";
        String valores = "";
        for (int i = 0; i < listadeCampos.size(); i++) {

            if (!listadeCampos.get(i).ChavePrimaria) {
                campos += listadeCampos.get(i).nomedoCampo;
                if (listadeCampos.get(i).valorCampo.getClass() == String.class){
                     valores += trataSTR.colocaAspasSimples(listadeCampos.get(i).valorCampo.toString());
                }else{
                       valores += listadeCampos.get(i).valorCampo.toString();
                }
                if (i < listadeCampos.size() - 1) {
                    campos += ",";
                    valores += ",";
                }
            }

        }

        comando += " (" + campos + ")" + " values (" + valores + ")";

        return comando;
    }

}
