package modelo;

public class RespostaModelo {
private String Mensagem;

public RespostaModelo(){}

public RespostaModelo(String Mensagem) {
	this.Mensagem = Mensagem;
}

public String getMensagem() {
	return Mensagem;

}

public void setMensagem(String mensagem) {
	Mensagem = mensagem;
}


}
