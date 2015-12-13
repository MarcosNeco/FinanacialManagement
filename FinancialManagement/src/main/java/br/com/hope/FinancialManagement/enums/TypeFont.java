package br.com.hope.FinancialManagement.enums;

public enum TypeFont {
	
	JOB("Trabalho");
	
	private String name;
	
	private TypeFont(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
