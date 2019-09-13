package br.edu.ifpb.pweb2;

import org.springframework.stereotype.Component;

@Component
public class TreinoFimTemporada implements TreinoIntf{
		public void preparoFisico() {
			System.out.println("Corrida de crossfit 30 minutos");
		}
		public void jogoTreino() {
			System.out.println("Jogo com a equipe de profissionais");
		}
		public void treinoTatico() {
			System.out.println("Marcação pesada e treino de tiro livre");
		}
	}