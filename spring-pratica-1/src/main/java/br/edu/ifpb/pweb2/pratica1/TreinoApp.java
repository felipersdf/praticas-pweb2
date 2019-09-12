package br.edu.ifpb.pweb2.pratica1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TreinoApp {

	public static void main(String[] args) {
		
		// O arquivo applicationContext faz a injeção ser feita pelo método setTreino
		// O arquivo apllicationContextv2 faz a injeção através de um construtor da class Treino
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		TreinamentoIntf treinamento = context.getBean("treinamento", TreinamentoIntf.class);
		
		treinamento.fazTreinamento();
		
		context.close();
		

	}

}
