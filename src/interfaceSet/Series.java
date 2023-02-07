package interfaceSet;

import java.util.Objects;

public class Series implements Comparable<Series> {
	private String nome;
	private String genero;
	private Integer tempoEpisodio;
	
	public Series(String nome, String genero, Integer tempoEpisodio) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.tempoEpisodio = tempoEpisodio;
	}

	public String getNome() {
		return nome;
	}

	public String getGenero() {
		return genero;
	}

	public Integer getTempoEpisodio() {
		return tempoEpisodio;
	}

	@Override
	public String toString() {
		return "[nome=" + nome + ", genero=" + genero + ", tempoEpisodio=" + tempoEpisodio + ", getNome()="
				+ getNome() + ", getGenero()=" + getGenero() + ", getTempoEpisodio()=" + getTempoEpisodio()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(genero, nome, tempoEpisodio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Series other = (Series) obj;
		return Objects.equals(genero, other.genero) && Objects.equals(nome, other.nome)
				&& Objects.equals(tempoEpisodio, other.tempoEpisodio);
	}

	@Override
	public int compareTo(Series serie) {
		int tempoEpisodio=  Integer.compare(this.getTempoEpisodio(),serie.getTempoEpisodio());
		if(tempoEpisodio !=0) return tempoEpisodio;
		return this.getGenero().compareTo(serie.getGenero());
	}
	
	
	
	
	
	
}
