package practica_clonar;

import java.util.Scanner;

public class PracClonar {

	public static void main(String[] args) {
		
		Scanner ent= new Scanner(System.in);
		String frase = "";
		
		System.out.println("Introduce tu frase:");
		frase = ent.nextLine();
		
		for(int i = frase.length()-1; i>=0; i--) {
			System.out.print(frase.charAt(i));
		}

		ent.close();
		
	}
}
