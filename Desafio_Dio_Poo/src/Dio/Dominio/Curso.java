package Dio.Dominio;

public class Curso extends Conteudo {

	private int CargaHoraria;

	public Curso() {

	}

	public int getCargaHoraria() {
		return CargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		CargaHoraria = cargaHoraria;
	}

	@Override
	public String toString() {
		return "Curso [titulo=" + getTitulo() +
				", descrição=" + getDescricao() +
				", CargaHoraria=" + CargaHoraria +
				"]";
	}

	@Override
	public double calcularxp() {
		// TODO Auto-generated method stub
		return 0;
	}

}
