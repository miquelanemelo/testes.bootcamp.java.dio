package com.innovation.digital;

import java.io.IOException;
import java.util.Scanner;

public class NumeroDivisores {

	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		int numero = leitor.nextInt();
		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0)
				System.out.println(i);
		}
	}

}
