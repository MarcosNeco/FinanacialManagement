package br.com.hope.FinancialManagement.transaction;

import org.hibernate.Session;


public abstract class TransactionWork <T>{
	
	private T result;
	private String message;
	
	public abstract void execute(Session session) throws Exception;
	
	public T getResult() {
		return result;
	}

	public String getMessage() {
		return message;
	}
}
