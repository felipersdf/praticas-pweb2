package br.edu.ifpb.pweb2;

import javax.annotation.*;

public class TreinamentoCrossFit implements TreinamentoIntf{
	
	private TreinoIntf treino;
	
	public TreinamentoCrossFit(TreinoIntf treino) {
		this.treino = treino;
	}
	
	public void fazTreinamento() {
		
		System.out.println("VAMO L�, GALERA");
		System.out.println("VAMO COME�AR COM O B�SICO:");
		treino.preparoFisico();
		System.out.println("AGORA QUE J� TA TODO MUNDO AQUECIDO, VAMO FAZER UM:");
		treino.jogoTreino();
		System.out.println("S� PRA FECHAR E IR PRA CASA, VAMOS FAZER UM:");
		treino.treinoTatico();
		
	}
	
	@PostConstruct
	public void init() {
		System.out.println("COME�OU!!!");
	}
	
	@PreDestroy
	public void finish() {
		System.out.println("ACABOU!!");
	}

}
