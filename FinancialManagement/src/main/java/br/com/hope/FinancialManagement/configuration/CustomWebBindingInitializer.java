//package br.com.hope.FinancialManagement.configuration;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.WebDataBinder;
//import org.springframework.web.bind.support.WebBindingInitializer;
//import org.springframework.web.context.request.WebRequest;
//
//import br.com.hope.FinancialManagement.converter.ConvertersRecorder;
//
//public class CustomWebBindingInitializer implements WebBindingInitializer {
//	
//	@Autowired
//	private ConvertersRecorder convertersRecorder;
//	
//	@Override
//	public void initBinder(WebDataBinder binder, WebRequest request) {
//		convertersRecorder.registerCustomEditors(binder);
//	}
//
//	public void test(){
//
//	}
//}
