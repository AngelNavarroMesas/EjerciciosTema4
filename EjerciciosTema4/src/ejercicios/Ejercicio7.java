package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	static int esPrimo(int n) {
		
		int div = 0;
		boolean primo = true;
		
		for(int x=1;x<n;x++) {
			
			if(n%x==0) {
				for(int i=2;i<x;i++) {
					if(n%i==0) {
						primo = false;
					}
				}
				if(primo==true) {
					div++;
				}
			}
			
		}
		return div;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Introduzca un numero para ver si tiene divisores primos");
		n = sc.nextInt();
		
		
		System.out.println("El numero introducido tiene "+esPrimo(n)+" divisores primos");
		
		sc.close();
	}

}
