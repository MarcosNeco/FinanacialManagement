package br.com.hope.FinancialManagement.dao;

import br.com.hope.FinancialManagement.input.Input;

public class InputDAO {
		
	public void salvar(Input input){
		System.out.println("salvando entrada, nome:" + input.getName() );  
	}
}
