package br.com.hope.FinancialManagement.font;

public enum FontType {
	BANK(1, "Banco");
	
	private int index;
	private String name;
	
	private FontType(int index, String name){
		this.index = index; 
		this.name = name;
	}
	
	public int getIndex() {
		return index;
	}
	
	public String getName() {
		return name;
	}
}
