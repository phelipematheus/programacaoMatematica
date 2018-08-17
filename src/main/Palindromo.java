package main;

import java.util.ArrayList;
import java.util.List;

public class Palindromo {

	public static void main(String[] args) {
		System.out.println("Este programa descobre o maior palíndromo da multiplicação de dois números de 3 dígitos");
		int numeros = 900;
		Integer resultado = 0;
		List<Integer> listaPalindromo = new ArrayList<Integer>();
		Integer numMaior = 0;
		StringBuffer contrario;
		for (; numeros < 1000; numeros++) {
			for (int i = 900; i < 1000; i++) {
				resultado = numeros * i;
				contrario = new StringBuffer(resultado.toString().substring(3, 6));
				if (resultado.toString().substring(0, 3).equals(contrario.reverse().toString())) {
					listaPalindromo.add(resultado);
				}
			}
		}
		for (int i = 0; i < listaPalindromo.size(); i++) {
			for (Integer a : listaPalindromo) {
				if (listaPalindromo.get(i) > a) {
					numMaior = listaPalindromo.get(i);
				}
			}
		}
		System.out.print("O maior número é : ");
		System.out.print(numMaior);
	}

}
