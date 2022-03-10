package Dio.Dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("curso java");
		curso1.setDescricao("descrição java");
		curso1.setCargaHoraria(8);

		Curso curso2 = new Curso();
		curso2.setTitulo( " curso java " );
		curso2.setDescricao( " descrição java " );
		curso2.setCargaHoraria(4);

		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo( " mentoria " );
		mentoria.setDescricao( " descição mentoria java " );
		mentoria.setdata(LocalDate.now());
		
	/*	
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);
		*/
		@SuppressWarnings("unused")
		Conteudo conteudo = new Curso();
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("botcamp java develope");
		bootcamp.setDescriao("decrição bootcamp java develop");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		
		Dev dev = new Dev();
		dev.setName("fabiano");
		dev.inscreverBootcamp(bootcamp);
		System.out.println("conteudo insritos fabiano:" + dev.getConteudosInscrito());
		dev.progredir();
		dev.progredir();
		System.out.println("-");
		System.out.println("conteudo insritos fabiano:" + dev.getConteudosInscrito());
		System.out.println("conteudo concluidos fabiano:" + dev.getContrudosConcluidoSet());
		System.out.println(" xp " + dev.calcularTotalxp());
		System.out.println("----------------");
		

		
		Dev dev2 = new Dev();
		dev2.setName("eduardo");
		dev2.inscreverBootcamp(bootcamp);
		System.out.println("conteudo inscrito eduardo:" + dev2.getConteudosInscrito());
		dev2.progredir();
		dev2.progredir();
		dev2.progredir();
		System.out.println("-");
		System.out.println("conteudo inscrito eduardo:" + dev2.getConteudosInscrito());
		System.out.println("conteudo concluido eduardo:" + dev2.getContrudosConcluidoSet());
		System.out.println(" xp " + dev2.calcularTotalxp());
		System.out.println("------------------");

		
		
		
		
		
		
		
	}

}
