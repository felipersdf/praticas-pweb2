package br.edu.ifpb.pweb2;

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

}
