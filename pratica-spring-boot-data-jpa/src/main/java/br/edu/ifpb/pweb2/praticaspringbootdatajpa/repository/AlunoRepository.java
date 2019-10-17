package br.edu.ifpb.pweb2.praticaspringbootdatajpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.edu.ifpb.pweb2.praticaspringbootdatajpa.entity.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Integer>{
	
	List<Aluno> findByNomeStartingWithIgnoreCase(String nome);
	
//	@Query("from Turma where lower(nome) like lower(concat('%', :nome, '%'))")
//	List<Aluno> findByNomeAluno(@Param("nome") String nome);

}
