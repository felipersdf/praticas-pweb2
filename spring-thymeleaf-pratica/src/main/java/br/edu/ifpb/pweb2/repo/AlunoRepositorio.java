package br.edu.ifpb.pweb2.repo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalLong;

import br.edu.ifpb.pweb2.model.Aluno;

public class AlunoRepositorio {
	
	private static Map<Long, Aluno> alunos = new HashMap<Long, Aluno>();
	
	static {
		alunos.put(1L, new Aluno("Albert Einstein"));
		alunos.put(2L, new Aluno("Alberto Santos Dumont"));
		alunos.put(3L, new Aluno("Ada Lovelace"));
		alunos.put(4L, new Aluno("Charles Darwin"));
		alunos.put(5L, new Aluno("Carl Sagan"));
	}
	
	public static Aluno findById(Long id) {
		return alunos.get(id);
	}
	
	public static Aluno add(Aluno aluno) {
		long nextId = 0L;
		OptionalLong maxId = alunos.keySet().stream().mapToLong(v -> v).max();
		
		if(maxId != null && maxId.isPresent()) {
			nextId = maxId.getAsLong() + 1;
		} else {
			nextId = 1L;
		}
		alunos.put(nextId, aluno);
		aluno.setId(nextId);
		return aluno;
	}
	
	public static Aluno getAlunos() {
		List<Aluno> cadastrados = null;
		
		for(Aluno a: alunos.values()) {
			cadastrados.add(a);
		}
		return (Aluno) cadastrados;
	}

}
