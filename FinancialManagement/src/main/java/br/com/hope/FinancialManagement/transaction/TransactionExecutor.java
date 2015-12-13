package br.com.hope.FinancialManagement.transaction;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class TransactionExecutor {
	
	public <T> TransactionWork<T> execute(TransactionWork<T> work) throws Exception{
	    Session session = BaseTransaction.openSession();
	    Transaction transaction = null;
	    try {
			transaction = session.beginTransaction();
	    	work.execute(session);
			transaction.commit();
		} catch (Exception e) {
			if(transaction != null){
				transaction.rollback();
			}
			throw e;
		}finally{
			session.close();
		}
		return work; 
	}
}
