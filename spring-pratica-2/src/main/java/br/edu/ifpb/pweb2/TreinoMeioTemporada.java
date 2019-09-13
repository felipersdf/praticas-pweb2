package br.edu.ifpb.pweb2;

import org.springframework.stereotype.Component;

@Component
public class TreinoMeioTemporada implements TreinoIntf{
	
	public void preparoFisico() {
		System.out.println("Corrida de 30 minutos");
	}
	public void jogoTreino() {
		System.out.println("Jogo com a equipe de semi-profissionais");
	}
	public void treinoTatico() {
		System.out.println("Cobran�as de penalidades m�ximas");
	}
}
