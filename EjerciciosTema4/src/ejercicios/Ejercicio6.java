package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
	
	
	static boolean esPrimo(int n) {
		
		boolean primo = true;
		
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				primo=false;
			}
		}
		
		return primo;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Introduzca un numero para ver si es primo");
		n = sc.nextInt();
		
		
		System.out.println("El numero introducido es primo? "+esPrimo(n));
		
		sc.close();
	}

}
