package br.com.hope.FinancialManagement.controller;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.hope.FinancialManagement.bo.InputBO;
import br.com.hope.FinancialManagement.input.Input;
import br.com.hope.FinancialManagement.input.InputType;

@Controller
@RequestMapping("/input")
public class InputController extends AbstractController{

	private static final Logger LOGGER = Logger.getLogger(InputController.class); 
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String open(Input input, Model model) {
		model.addAttribute("inputTypes", InputType.values());
		return "input";
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String save(@Valid Input input, BindingResult bindingResult) {
		try {
			if(bindingResult.hasErrors()){
				return "input";
			}
			execute(new InputBO().save(input));
		} catch (Exception e) {
			LOGGER.error("Erro ao salvar entrada!");
		}
		return "input";
	}

	@RequestMapping("/inputType")
	public String inputType(InputType inputType) {
		return "input";
	}

}
