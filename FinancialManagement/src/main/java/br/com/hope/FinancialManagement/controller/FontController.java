package br.com.hope.FinancialManagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/font")
public class FontController {

	  @RequestMapping
	  public String open(Model model){
		  return "font";
	  }
}
