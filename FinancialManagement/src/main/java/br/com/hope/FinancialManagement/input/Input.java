package br.com.hope.FinancialManagement.input;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.hope.FinancialManagement.entity.AbstractEntity;


@Entity
@Table(name="INPUT")
public class Input extends AbstractEntity{
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "type")
	@Enumerated(EnumType.ORDINAL)
	private InputType inputType;
	
	@Column(name="value")
	private Float value;
	
	@Column(name="date")
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
