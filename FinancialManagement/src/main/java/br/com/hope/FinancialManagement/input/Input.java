package br.com.hope.FinancialManagement.input;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import br.com.hope.FinancialManagement.entity.AbstractEntity;


@Entity
@Table(name="FONT_INPUT")
public class Input extends AbstractEntity{
	
	@Column(name = "type")
	@Enumerated(EnumType.ORDINAL)
	private InputType inputType;
	
	@Column(name="value")
	private Float value;
	
	@Column(name="date")
	private LocalDate date;
	
	@Transient
	private Boolean reply;
	
	@Transient
	@Min(2)
	private Integer numberOfTimes;
	
	@Column(name="description")
	@Size(max = 100)
	private String description;
	
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
	public Boolean getReply() {
		return reply;
	}
	public void setReply(Boolean reply) {
		this.reply = reply;
	}
	public Integer getNumberOfTimes() {
		return numberOfTimes;
	}
	public void setNumberOfTimes(Integer numberOfTimes) {
		this.numberOfTimes = numberOfTimes;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
