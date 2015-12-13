package br.com.hope.FinancialManagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.hope.FinancialManagement.font.Font;
import br.com.hope.FinancialManagement.font.FontType;

@Controller
@RequestMapping("/font")
public class FontController {

	  @RequestMapping
	  public String open(Model model){
		  Font font = new Font();
		  font.setDescription("minha primeira descrição!");
		  model.addAttribute("font", font);
		  model.addAttribute("fontsType", FontType.values());
		  return "font";
	  }

}
