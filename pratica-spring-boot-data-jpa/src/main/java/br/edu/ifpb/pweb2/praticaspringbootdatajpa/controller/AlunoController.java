package br.edu.ifpb.pweb2.praticaspringbootdatajpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.edu.ifpb.pweb2.praticaspringbootdatajpa.entity.Aluno;
import br.edu.ifpb.pweb2.praticaspringbootdatajpa.repository.AlunoRepository;

@Controller
@RequestMapping("/alunos")
public class AlunoController {
	
	@Autowired
	private AlunoRepository repository;
	
	@RequestMapping
	public ModelAndView list(String nome) {
		ModelAndView model = new ModelAndView("aluno/alunos");
		nome = (nome == null) ? "" : nome;
		List<Aluno> alunos = repository.findAll();
//		List<Aluno> turmas = repository.findByDisciplinaStartingWithIgnoreCase(disciplina);
//		List<Aluno> alunos = repository.findByNomeAluno(nome);
		model.addObject("alunos", alunos);
		return model;
	}
	
	@RequestMapping("/form")
	public String form() {
		return "aluno/form";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String save(Aluno aluno) {
		repository.save(aluno);
		return "redirect:alunos";
	}
	
}