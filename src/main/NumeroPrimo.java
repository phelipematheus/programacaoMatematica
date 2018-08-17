package main;

import java.util.ArrayList;
import java.util.List;

public class NumeroPrimo {

	public static void main(String[] args) {
		List<Integer> listPrimos = new ArrayList<Integer>();
		Integer possivelPrimo = 1;
		Boolean isPrimo = Boolean.TRUE;
		for (; possivelPrimo > 0; possivelPrimo++) {
			for (int i = 1; i <= possivelPrimo; i++) {
				if (possivelPrimo % i == 0 && i != 1 && i != possivelPrimo) {
					isPrimo = Boolean.FALSE;
				}
			}
			
			if (isPrimo) {
				listPrimos.add(possivelPrimo);
			} else {
				isPrimo = Boolean.TRUE;
			}
			if(listPrimos.size() == 10002)
				break;
		}
		System.out.println(listPrimos.get(listPrimos.size()-1));
	}
}
