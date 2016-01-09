package br.com.hope.FinancialManagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.hope.FinancialManagement.expense.Expense;

@Controller
@RequestMapping("/expense")
public class ExpenseController extends AbstractController{
	
	public void save(Expense expense){
		System.out.println("Despesa salva...");
	}
}
