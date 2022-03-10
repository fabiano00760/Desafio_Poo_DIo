package Dio.Dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;


public class Dev {
	private String name;

	private Set<Conteudo> conteudosInscrito = new LinkedHashSet<>();
	private Set<Conteudo> contrudosConcluidoSet = new LinkedHashSet<>();

	public void inscreverBootcamp(Bootcamp bootcamp) {
		// estou pegando todos  o conteudo do bootcamp e jogando nos conteudo escritos 
		this.conteudosInscrito.addAll(bootcamp.getConteudos());
		bootcamp.getDevsIncritos().add(this);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Conteudo> getConteudosInscrito() {
		return conteudosInscrito;
	}

	public void setConteudosInscrito(Set<Conteudo> conteudosInscrito) {
		this.conteudosInscrito = conteudosInscrito;
	}

	public Set<Conteudo> getContrudosConcluidoSet() {
		return contrudosConcluidoSet;
	}

	public void setContrudosConcluidoSet(Set<Conteudo> contrudosConcluidoSet) {
		this.contrudosConcluidoSet = contrudosConcluidoSet;
	}

	public void progredir() {
		
	Optional <Conteudo> conteudo = this.conteudosInscrito.stream().findFirst();
	if (conteudo.isPresent()) {
		this.conteudosInscrito.add(conteudo.get());
		this.conteudosInscrito.remove(conteudo.get());
		
	}else {
		System.err.println("voce não esta escrito matriculado em nem um conteudo ");
	}
		

	}

	public double calcularTotalxp() {
		return this.contrudosConcluidoSet
		.stream()
		.mapToDouble(Conteudo::calcularxp)
		.sum();
		
	}

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(conteudosInscrito, other.conteudosInscrito)
				&& Objects.equals(contrudosConcluidoSet, other.contrudosConcluidoSet)
				&& Objects.equals(name, other.name);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(conteudosInscrito, contrudosConcluidoSet, name);
	}
	
	
	
	
}