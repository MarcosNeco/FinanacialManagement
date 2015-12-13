package br.com.hope.FinancialManagement.converter;

import org.springframework.core.convert.converter.Converter;

public class MoneyToStringConverter implements Converter<String, Float>{

	@Override
	public Float convert(String value) {
		if(value == null){
			throw new IllegalArgumentException();
		}
		String moneyFmt = value.replace(".", "").replace(",",".");
        Float moneyInFloat = Float.parseFloat(moneyFmt);			
		return moneyInFloat;
	}

}

