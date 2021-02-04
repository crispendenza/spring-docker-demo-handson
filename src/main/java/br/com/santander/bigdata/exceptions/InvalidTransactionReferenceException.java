package br.com.santander.bigdata.exceptions;

public class InvalidTransactionReferenceException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public InvalidTransactionReferenceException(String errorMessage) {
		super(errorMessage);
	}

}
