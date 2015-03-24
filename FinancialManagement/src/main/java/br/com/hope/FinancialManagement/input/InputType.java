package br.com.hope.FinancialManagement.input;

public enum InputType {
	CHECKING_ACCOUT(1, "Conta corrente");
	
	private String name;
	private int index;
	
	private InputType(int index, String name){
		this.index = index;
		this.name = name;
	}	
	
	public String getName(){
		return this.name;
	}
	public int getIndex(){
		return this.index;
	}
}
