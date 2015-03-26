package br.com.hope.FinancialManagement.font;

public class Font {
	
	private String name;
	private FontType fontType;
	private String description;
	private Float currentValue;
	private int agency;
	private int count;
	private int digit;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public FontType getFontType() {
		return fontType;
	}
	public void setFontType(FontType fontType) {
		this.fontType = fontType;
	}
	public int getAgency() {
		return agency;
	}
	public void setAgency(int agency) {
		this.agency = agency;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getDigit() {
		return digit;
	}
	public void setDigit(int digit) {
		this.digit = digit;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Float getCurrentValue() {
		return currentValue;
	}
	public void setCurrentValue(Float currentValue) {
		this.currentValue = currentValue;
	}
}
