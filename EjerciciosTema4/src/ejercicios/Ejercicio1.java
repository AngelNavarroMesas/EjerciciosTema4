package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	
	public static void Eco(int num) {
		
		for(int i=0;i<num;i++) {
			System.out.println("ECO");
		}
		
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Introduzca un numero de ecos");
		num = sc.nextInt();
		
		Eco(num);
		sc.close();
	}

}
