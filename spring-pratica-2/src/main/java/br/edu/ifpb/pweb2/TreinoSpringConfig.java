package br.edu.ifpb.pweb2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TreinoSpringConfig {
		
	
//	Criando Beans programaticamente 
	
	@Bean
	public TreinamentoIntf treinamentoCrossFit() {
		return new TreinamentoCrossFit(treinamentoFimTemporada());
	}
	
	@Bean 
	public TreinamentoIntf treinamento() {
		return new Treinamento(treinamentoInicioTemporada());
	}
	
	@Bean
	public TreinoIntf treinamentoFimTemporada() {
		return new TreinoFimTemporada();
	}
	
	@Bean
	public TreinoIntf treinamentoInicioTemporada() {
		return new TreinoInicioTemporada();
	}
	
	@Bean
	public TreinoIntf treinamentoMeioTemporada() {
		return new TreinoMeioTemporada();
	}

}
