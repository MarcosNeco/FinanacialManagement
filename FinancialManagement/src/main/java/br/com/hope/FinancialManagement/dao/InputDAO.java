package br.com.hope.FinancialManagement.dao;

import org.hibernate.Session;

import br.com.hope.FinancialManagement.input.Input;

public class InputDAO extends AbastractDAO<Input>{
		
	public InputDAO(Session session) {
		super(session);
	}

	public void save(Input input){
		saveOrUpdate(input);
	}
}
