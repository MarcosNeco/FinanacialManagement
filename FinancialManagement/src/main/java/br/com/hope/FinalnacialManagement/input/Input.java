package br.com.hope.FinalnacialManagement.input;

import java.time.LocalDate;

public class Input {
	
	private String name;
	private InputType inputType;
	private Float value;
	private LocalDate date;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public InputType getInputType() {
		return inputType;
	}
	public void setInputType(InputType inputType) {
		this.inputType = inputType;
	}

	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Float getValue() {
		return value;
	}
	public void setValue(Float value) {
		this.value = value;
	}
	
	
}
