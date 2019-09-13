package br.edu.ifpb.pweb2;

public class TreinamentoCrossFit implements TreinamentoIntf{
	
	private TreinoIntf treino;
	
	public TreinamentoCrossFit(TreinoIntf treino) {
		this.treino = treino;
	}

	
	public void fazTreinamento() {
		
		System.out.println("VAMO LÁ, GALERA");
		System.out.println("VAMO COMEÇAR COM O BÁSICO:");
		treino.preparoFisico();
		System.out.println("AGORA QUE JÁ TA TODO MUNDO AQUECIDO, VAMO FAZER UM:");
		treino.jogoTreino();
		System.out.println("SÓ PRA FECHAR E IR PRA CASA, VAMOS FAZER UM:");
		treino.treinoTatico();
		
	}

}
