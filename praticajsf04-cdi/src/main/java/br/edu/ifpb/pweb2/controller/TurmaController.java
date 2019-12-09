package br.edu.ifpb.pweb2.controller;

import java.util.List;

import javax.inject.Inject;

import br.edu.ifpb.pweb2.dao.Transactional;
import br.edu.ifpb.pweb2.dao.TurmaDAO;
import br.edu.ifpb.pweb2.model.Aluno;
import br.edu.ifpb.pweb2.model.Turma;


public class TurmaController {

	@Inject
	TurmaDAO turmaDAO;

	TurmaController(){
		
	}
	@Transactional
	public void criarTurma(String nome) {
		// Validacao
		Turma t = new Turma();
		t.setNome(nome);
		turmaDAO.beginTransaction();
		turmaDAO.insert(t);
		turmaDAO.commit();
	}
	
	public List<Turma> listarTurmas() {
	
		List<Turma> turmas = turmaDAO.findAll();
		return turmas;
	}
	
	@Transactional
	public void matricularAluno(Long idTurma, String matricula, String nome) {
	
		turmaDAO.beginTransaction();
		Turma turma = turmaDAO.find(idTurma);
		Aluno novo = new Aluno();
		novo.setMatricula(matricula);
		novo.setNome(nome);
		turma.addAluno(novo);
		turmaDAO.commit();
	}

	public Turma getTurmaById(Long id) {
		
		return turmaDAO.find(id);
	}
}
