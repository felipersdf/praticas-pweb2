package br.edu.ifpb.pweb2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TreinoApp {

	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TreinoSpringConfig.class);
		
		TreinamentoIntf treinamento = context.getBean("treinamento", TreinamentoIntf.class);
		treinamento.fazTreinamento();
		System.out.println(treinamento);
		System.out.println("\n");
		
		TreinamentoIntf treinamento_pesado = context.getBean("treinamentoCrossFit", TreinamentoIntf.class);
		treinamento_pesado.fazTreinamento();
		System.out.println(treinamento_pesado);
		System.out.println("\n");
		
		context.close();
		

	}

}
