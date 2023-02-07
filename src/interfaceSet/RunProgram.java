package interfaceSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class RunProgram {

	public static void main(String[] args) {
		
		System.out.println("--\tOrdem aleatória\t--");
		Set<Series>minhasSeries = new HashSet<>(){{
		add(new Series("got","fantasia",60));	
		add(new Series("dark","drama",60));
		add(new Series("that '70 show", "comedia",25));
		}};
		
		for (Series series : minhasSeries) {
			System.out.println(series.getNome() + " - " + series.getGenero() + 
			" - " + series.getTempoEpisodio());
		}
		
		System.out.println("\n\n--\tOrdem de inserção\t--");
		
		Set<Series>minhasSeries1 = new LinkedHashSet<>(){{
			add(new Series("Got","fantasia",60));	
			add(new Series("dark","drama",60));
			add(new Series("orange", "comedia",25));
			}};
			
			for (Series series : minhasSeries1) {
				System.out.println(series.getNome() + " - " + series.getGenero() + 
				" - " + series.getTempoEpisodio());
			}
			
			System.out.println("\n\n--\tOrdem natural (Tempo de episodio)\t--");
			Set<Series>minhasSeries2 = new TreeSet<>(minhasSeries1);
			for (Series series : minhasSeries2) {
				System.out.println(series.getNome() + " - " + series.getGenero() + 
				" - " + series.getTempoEpisodio());
			}
			
			System.out.println("\n\n--\tOrdem (nome/Genero/TempoEpisodio)\t--");
			Set<Series>minhasSeries3 = new TreeSet<>(new ordemNomeGeneroTempoEpisodio());
			minhasSeries3.addAll(minhasSeries);
			
			for (Series series : minhasSeries3) {
				System.out.println(series.getNome() + " - " + series.getGenero() + 
				" - " + series.getTempoEpisodio());
			}
			
			System.out.println("\n\n--\tOrdem Genero\t--");
			Set<Series>minhasSeries4 = new TreeSet<>(new ordemGenero());
			minhasSeries4.addAll(minhasSeries);
			
			for (Series series : minhasSeries4) {
				System.out.println(series.getGenero() + 
				" - " + series.getTempoEpisodio() + " - " + series.getNome());
			}
			
			System.out.println("\n\n--\tOrdem TempoEpisodio\t--");
			Set<Series>minhasSeries5 = new TreeSet<>(new ordemTempoEpisodio());
			minhasSeries5.addAll(minhasSeries);
			
			for (Series series : minhasSeries5) {
				System.out.println(series.getGenero() + 
				" - " + series.getTempoEpisodio() + " - " + series.getNome());
			}
		
		}

	}


