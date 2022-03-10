package Dio.Dominio;

import java.time.LocalDate;
import java.time.temporal.TemporalAccessor;

public class Mentoria  extends Conteudo{
	
	private TemporalAccessor data;

	public  Mentoria() {
	  
	}

	public void setdata (TemporalAccessor localDate) {
		this.data = localDate;
	}

	@Override
	public String toString() {
		return "Mentoria "
				+ "[titulo =" + getTitulo() +
				", descrição =" + getDescricao() + 
				", data =" + data +
				"]";
	}

	public void setdata(LocalDate now, int data) {
	 this.data = now;
		
	}

	@Override
	public double calcularxp() {
		return XP_PADAO + 20 ;
	}

}
