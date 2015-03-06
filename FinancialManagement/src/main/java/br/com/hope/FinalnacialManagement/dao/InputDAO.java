package br.com.hope.FinalnacialManagement.dao;

import br.com.hope.FinalnacialManagement.input.Input;

public class InputDAO {
		
	public void salvar(Input input){
		System.out.println("salvando entrada, nome:" + input.getName() );  
	}
}
