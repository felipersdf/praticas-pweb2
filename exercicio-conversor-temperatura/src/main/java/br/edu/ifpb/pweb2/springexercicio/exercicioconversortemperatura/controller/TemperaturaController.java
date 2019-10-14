package br.edu.ifpb.pweb2.springexercicio.exercicioconversortemperatura.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller	
@RequestMapping("/converte")
public class TemperaturaController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String converteTemp(Model model) {	
		return "temp";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String converteCtoF(String tempC, String tempF, Model model) {
		System.out.println(tempC);
		System.out.println(tempF);
		
		if(tempF.equals("")) {
			double temperaturaF = ((Double.parseDouble(tempC) * 1.8) + 3);
			model.addAttribute("temperaturaF", temperaturaF);
		} else if (tempC.equals("")){
			double temperaturaC = 5/9 * ((Double.parseDouble(tempC)-32));
			model.addAttribute("temperaturaC", temperaturaC);
		}
		
		return "redirect:converte";
	}
	
}
