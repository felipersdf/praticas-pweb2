package br.edu.ifpb.pweb2.bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.event.ActionEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.edu.ifpb.pweb2.dao.TurmaDAO;
import br.edu.ifpb.pweb2.model.Turma;

@Named
@ViewScoped
public class TurmasBean implements Serializable{

	private static final long serialVersionUID = 1L;

	private List<Turma> turmas;
	
	@Inject
	private TurmaDAO turdao;
	
	public void listarTurmas(ActionEvent e) {
		turmas = turdao.findAll();
	}
	
	public List<Turma> getTurmas() {
		return turmas;
	}

	public void setTurmas(List<Turma> turmas) {
		this.turmas = turmas;
	}
	
}
