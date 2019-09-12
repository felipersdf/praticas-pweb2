package br.edu.ifpb.pweb2.pratica1;

public class Treinamento implements TreinamentoIntf {
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
