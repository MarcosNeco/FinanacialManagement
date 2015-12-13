package br.com.hope.FinancialManagement.dao;

import java.util.List;

import org.hibernate.Session;

import br.com.hope.FinancialManagement.entity.AbstractEntity;

public class AbastractDAO<T extends AbstractEntity> implements DAO<T> {
	
	private Session session;
	
	public AbastractDAO(Session session) {
		this.session = session;
	}
	@Override
	public void saveOrUpdate(T entity) {
	  this.session.saveOrUpdate(entity);
	}

	@Override
	public T get(Integer id) {
	  System.out.println();
	  return null;
	}

	@Override
	public List<T> getAll() {
	
		return null;
	}

	@Override
	public void delete(T e) {

	}
	
	public Session getSession() {
		return session;
	}

}
