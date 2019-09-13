package br.edu.ifpb.pweb2;

import org.springframework.stereotype.Component;

@Component
public class TreinoInicioTemporada implements TreinoIntf {
	
	public void preparoFisico() {
		System.out.println("Corrida leve de 10 minutos");
	}
	public void jogoTreino() {
		System.out.println("Jogo com a equipe de juniores");
	}
	public void treinoTatico() {
		System.out.println("Cobranças de escanteios e faltas");
	}
}

