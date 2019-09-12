package br.edu.ifpb.pweb2.pratica1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TreinoApp {

	public static void main(String[] args) {
		
		// O arquivo applicationContext faz a inje��o ser feita pelo m�todo setTreino
		// O arquivo apllicationContextv2 faz a inje��o atrav�s de um construtor da class Treino
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		TreinamentoIntf treinamento = context.getBean("treinamento", TreinamentoIntf.class);
		
		treinamento.fazTreinamento();
		
		context.close();
		

	}

}
