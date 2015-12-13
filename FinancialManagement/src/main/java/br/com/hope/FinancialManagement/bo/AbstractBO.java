package br.com.hope.FinancialManagement.bo;

import org.hibernate.Session;

public abstract class AbstractBO {
	
	protected Session session;
	
	public void setSession(Session session) {
		this.session = session;
	}
	
}
