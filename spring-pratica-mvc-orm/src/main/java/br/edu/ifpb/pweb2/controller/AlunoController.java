package br.edu.ifpb.pweb2.controller;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.edu.ifpb.pweb2.dao.AlunoDAO;
import br.edu.ifpb.pweb2.model.Aluno;

@Controller
@RequestMapping("/alunos")
public class AlunoController {
	@Autowired
	AlunoDAO dao;
	
	@RequestMapping("/cadastreAluno")
	public ModelAndView cadastreAluno(Aluno aluno) {
		dao.gravar(aluno);
		return listeAlunos();
	}
	
	@RequestMapping("/showAlunoForm")
	public String showAlunoForm(Model model) {
		model.addAttribute("aluno", new Aluno());
		model.addAttribute("cursoOptions", this.getCursoOptions());
		return "form";
	}
	
	@RequestMapping("/listeAlunos")
	public ModelAndView listeAlunos() {
		ModelAndView mav = new ModelAndView("lista");
		List<Aluno> alunos = dao.findAll();
		mav.addObjects("alunos", alunos);
		return mav;
	}
	
	
	private Map<String, String> getCursoOptions() {
		LinkedHashMap<String, String> options = new LinkedHashMap<String, String>();
		options.put("TSI", "TSI");
		options.put("REDES", "REDES");
		options.put("ENG. EL�TRICA", "ENG. EL�TRICA");
		return options;
	}
}
