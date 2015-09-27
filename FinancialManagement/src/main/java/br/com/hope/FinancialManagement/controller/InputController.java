package br.com.hope.FinancialManagement.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.hope.FinancialManagement.bo.InputBO;
import br.com.hope.FinancialManagement.dao.InputDAO;
import br.com.hope.FinancialManagement.input.Input;
import br.com.hope.FinancialManagement.input.InputType;

@Controller
@RequestMapping("/input")
public class InputController extends AbstractController{

	private static final Logger LOGGER = Logger.getLogger(InputController.class); 
	
	@RequestMapping(method = RequestMethod.GET)
	public String open(Input input, Model model) {
		input.setName("marcos");
		List<String> listNames = createListNames();
		model.addAttribute("inputTypes", listNames);
		return "input";
	}

	private List<String> createListNames() {
		List<String> inputsTypes = new ArrayList<String>();
		for (InputType inputType : InputType.values()) {
			inputsTypes.add(inputType.getName());
		}
		return inputsTypes;
	}

	@RequestMapping(value = "save")
	public String save(Input input) {
		input.setDate(LocalDate.now());
		try {
			execute(new InputBO().save(input));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "input";
	}

	@RequestMapping("/inputType")
	public String inputType(InputType inputType) {
		return "input";
	}

}
