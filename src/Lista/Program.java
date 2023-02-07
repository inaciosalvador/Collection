package Lista;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		List<Double> temp = new ArrayList<>();
		temp.add(5d);
		temp.add(19d);
		temp.add(36d);
		temp.add(34d);
		temp.add(35d);
		temp.add(29d);
		
		Iterator<Double> iterator1 = temp.iterator();
		Double soma=0d;
		
		//Logica para - > soma usando Iterator
		while(iterator1.hasNext()) {
			Double next = iterator1.next();
			soma += next;
		}
		System.out.printf("Temperatura total:%.0f\n ", soma);
		
		Double media = (soma/temp.size()); // Definição da média
		
		System.out.printf("Média: %.2f\n", media);
		System.out.println("====================================");
		
			
		Iterator<Double> iterator2 = temp.iterator();
		int count = 1;
		System.out.println("\nMeses com temperatura maior que a média: ");
		while(iterator2.hasNext()) {
			Double next = iterator2.next();
			
			if(next > media && count == 1) {
				System.out.println("1 - Janeiro");
			}else if(next > media && count == 2) {
				System.out.println("2 - Fevereiro");
			}else if(next > media && count == 3) {
				System.out.println("3 - Março");
			}else if(next > media && count == 4) {
				System.out.println("4 - Abril ");
			}else if(next > media && count == 5) {
				System.out.println("5 - Maio");
			}else if(next > media && count == 6) {
				System.out.println("6 - Junho");
			}
			
			count++;
		}
	}
}
