package br.com.hope.FinancialManagement.expense;

import java.time.LocalDate;

import br.com.hope.FinancialManagement.font.Font;

public class Expense {
	
	private Float value;
	
	private String description;

	private LocalDate dateToReceive;
	
	private LocalDate dateReceived;
	
	private Boolean repeatly;
	
	private Integer quantityRepeatly;
	
	private ExpenseCategory expenseCategory;
	
	private String observations;
	
	private Font font;
	
	public Float getValue() {
		return value;
	}

	public void setValue(Float value) {
		this.value = value;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getRepeatly() {
		return repeatly;
	}

	public void setRepeatly(Boolean repeatly) {
		this.repeatly = repeatly;
	}

	public Integer getQuantityRepeatly() {
		return quantityRepeatly;
	}

	public void setQuantityRepeatly(Integer quantityRepeatly) {
		this.quantityRepeatly = quantityRepeatly;
	}

	public LocalDate getDateToReceive() {
		return dateToReceive;
	}

	public void setDateToReceive(LocalDate dateToReceive) {
		this.dateToReceive = dateToReceive;
	}

	public LocalDate getDateReceived() {
		return dateReceived;
	}

	public void setDateReceived(LocalDate dateReceived) {
		this.dateReceived = dateReceived;
	}

	public ExpenseCategory getExpenseCategory() {
		return expenseCategory;
	}

	public void setExpenseCategory(ExpenseCategory expenseCategory) {
		this.expenseCategory = expenseCategory;
	}

	public String getObservations() {
		return observations;
	}

	public void setObservations(String observations) {
		this.observations = observations;
	}

	public Font getFont() {
		return font;
	}

	public void setFont(Font font) {
		this.font = font;
	}
}
