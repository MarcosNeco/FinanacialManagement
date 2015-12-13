package br.com.hope.FinancialManagement.converter;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.FIELD})
public @interface CustomConverter {
	
}
