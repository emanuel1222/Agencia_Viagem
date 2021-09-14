package br.com.bilhete.agencia_viagem.config.validation;

public class FormularyErrorDto {
	
	private String campo;
	private String errorMessage;
	
	public FormularyErrorDto(String campo, String errorMessage) {

		this.campo = campo;
		this.errorMessage = errorMessage;
	}

	public String getCampo() {
		return campo;
	}


	public String getErrorMessage() {
		return errorMessage;
	}

	
	
	

}
