package br.edu.ifpb.pweb2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Treinamento implements TreinamentoIntf {
	
//	Anotações necessárias para injetar o Bean direto na variável de instância
//	@Autowired
//	@Qualifier("treinoInicioTemporada")  

//	Anotação necessária para injetar o Bean pelo construtor
//	@Autowired
//	public Treinamento(@Qualifier("treinoInicioTemporada") TreinoIntf treino) {
//		this.treino = treino;
//	}

	private TreinoIntf treino;
	
	public Treinamento() {
		super();
	}
	
	public Treinamento(TreinoIntf treino) {
		this.treino = treino;
	}
	
	public void fazTreinamento() {
		
		System.out.println("Vamos lá, pessoal!!");
		System.out.println("Primeiro vamos fazer um treinamento de:");
		treino.preparoFisico();
		System.out.println("Em seguida, vamos seguir com:");
		treino.jogoTreino();
		System.out.println("Pra finalizar, realizaremos um:");
		treino.treinoTatico();
		
	}
	
	public TreinoIntf getTreino() {
		return treino;
	}
	
	public void setTreino(TreinoIntf treino) {
		this.treino = treino;
	}
}
