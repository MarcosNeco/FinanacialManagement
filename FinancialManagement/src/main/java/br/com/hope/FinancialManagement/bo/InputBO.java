package br.com.hope.FinancialManagement.bo;

import org.hibernate.Session;

import br.com.hope.FinancialManagement.dao.InputDAO;
import br.com.hope.FinancialManagement.input.Input;
import br.com.hope.FinancialManagement.transaction.TransactionWork;

public class InputBO {

	public TransactionWork<Input> save(final Input input){
		return new TransactionWork<Input>() {
			@Override
			public void execute(Session session) throws Exception {
				InputDAO dao = new InputDAO(session);
				dao.save(input);;
			}
		};
	}
}
