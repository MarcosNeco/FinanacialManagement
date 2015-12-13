package br.com.hope.FinancialManagement.converter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
@CustomConverter
public class LocalDateConverter implements Converter<String, LocalDate>{
	
	public static final String DATE_PATTERN = "dd/MM/yyyy";  
	
	@Override
	public LocalDate convert(final String date) {
		return LocalDate.parse(date, DateTimeFormatter.ofPattern(DATE_PATTERN));
	}

}
