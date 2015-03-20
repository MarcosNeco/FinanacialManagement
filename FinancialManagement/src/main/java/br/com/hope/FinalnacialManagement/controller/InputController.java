package br.com.hope.FinalnacialManagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import br.com.hope.FinalnacialManagement.dao.InputDAO;
import br.com.hope.FinalnacialManagement.input.Input;

@Controller
@RequestMapping("/input")
public class InputController {

	  @RequestMapping(value="/open", method = RequestMethod.GET)
	  public ModelAndView open(Model model){
		  Input input = new Input();
		  input.setName("marcos");
		  model.addAttribute("input",input);
		  return new ModelAndView("input", "input", input);
	  }
	  
	  @RequestMapping("save")
	  public String helloWord(Input input){
		InputDAO dao = new InputDAO();
		dao.salvar(input);
		return "adicionado";
	  }
	  
	  public void nothing(){
		  System.out.println("nothing");
	  }
}
