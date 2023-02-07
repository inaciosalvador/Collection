package interfaceSet;

import java.util.Comparator;

public class ordemGenero implements Comparator<Series>{

	@Override
	public int compare(Series s1, Series s2) {
		int genero = s1.getGenero().compareTo(s2.getGenero());
		if(genero !=0) return genero;
		return Integer.compare(s1.getTempoEpisodio(),s2.getTempoEpisodio());
	}
	
}
