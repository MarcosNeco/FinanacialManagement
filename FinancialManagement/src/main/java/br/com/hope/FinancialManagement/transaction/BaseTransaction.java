package br.com.hope.FinancialManagement.transaction;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import br.com.hope.FinancialManagement.input.Input;

public class BaseTransaction {
	
	private static final Logger LOGGER = Logger.getLogger(BaseTransaction.class); 
	private static SessionFactory sessionFactory;
	
	static{
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(Input.class);
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		try {
			sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		} catch (Exception e) {
			LOGGER.error("Erro ao iniciar sessionFactory -", e);
			StandardServiceRegistryBuilder.destroy(serviceRegistry);
		}
	}
	
	public static Session openSession(){
		return sessionFactory.openSession();
	}

}
