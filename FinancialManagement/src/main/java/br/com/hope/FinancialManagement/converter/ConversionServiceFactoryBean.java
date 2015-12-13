package br.com.hope.FinancialManagement.converter;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.core.convert.converter.Converter;
import org.springframework.format.FormatterRegistry;
import org.springframework.format.support.FormattingConversionServiceFactoryBean;

public class ConversionServiceFactoryBean extends FormattingConversionServiceFactoryBean{
	
	@Resource
	@CustomConverter
	private List<Converter<?, ?>> converters;
	
	@SuppressWarnings("deprecation")
	@Override
	protected void installFormatters(FormatterRegistry registry) {
		super.installFormatters(registry);
		for (final Converter<?, ?> converter : this.converters) {
		      registry.addConverter(converter);
		}
	}
}
