package br.com.hope.FinancialManagement.controller;

import br.com.hope.FinancialManagement.transaction.TransactionExecutor;
import br.com.hope.FinancialManagement.transaction.TransactionWork;

public class AbstractController{
	
	public <T> TransactionWork<T> execute(TransactionWork<T> transactionWork) throws Exception{
		TransactionExecutor transactionExecutor = new TransactionExecutor();
		transactionExecutor.execute(transactionWork);
		return transactionWork;
	}
}
