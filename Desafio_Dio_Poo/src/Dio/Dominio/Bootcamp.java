package Dio.Dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
	private String nome;
	private String descriao;
	private LocalDate dateInicial = LocalDate.now();
	private final LocalDate dataFInal = dateInicial.plusDays(45);
	private Set<Dev>devsIncritos = new HashSet<>();
	private Set<Conteudo> conteudos = new LinkedHashSet<>();
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescriao() {
		return descriao;
	}
	public void setDescriao(String descriao) {
		this.descriao = descriao;
	}
	public LocalDate getDateInicial() {
		return dateInicial;
	}
	public void setDateInicial(LocalDate dateInicial) {
		this.dateInicial = dateInicial;
	}
	public Set<Dev> getDevsIncritos() {
		return devsIncritos;
	}
	public void setDevsIncritos(Set<Dev> devsIncritos) {
		this.devsIncritos = devsIncritos;
	}
	public Set<Conteudo> getConteudos() {
		return conteudos;
	}
	public void setConteudos(Set<Conteudo> conteudos) {
		this.conteudos = conteudos;
	}
	public LocalDate getDataFInal() {
		return dataFInal;
	}
	@Override
	public int hashCode() {
		return Objects.hash(conteudos, dataFInal, dateInicial, descriao, devsIncritos, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bootcamp other = (Bootcamp) obj;
		return Objects.equals(conteudos, other.conteudos) && Objects.equals(dataFInal, other.dataFInal)
				&& Objects.equals(dateInicial, other.dateInicial) && Objects.equals(descriao, other.descriao)
				&& Objects.equals(devsIncritos, other.devsIncritos) && Objects.equals(nome, other.nome);
	}
	
	
}
