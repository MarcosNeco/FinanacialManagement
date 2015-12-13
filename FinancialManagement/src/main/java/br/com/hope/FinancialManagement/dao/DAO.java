package br.com.hope.FinancialManagement.dao;

import java.util.List;

public interface DAO<T> {
	
	public void saveOrUpdate(T t);
	
	public T get(Integer id);
	
	public List<T> getAll();
	
	public void delete(T t);
	
}
