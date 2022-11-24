package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	
static boolean esPrimo(int x) {
		
		boolean primo = true;
		
		for(int i=2;i<x;i++) {
			if(x%i==0) {
				primo=false;
			}
		}
		
		return primo;
	}
	
	
	static int divisores(int n) {
		
		int div = 0;
		
		for(int x=1;x<=n;x++) {
			
			if(n%x==0) {
				
				if(esPrimo(x)==true) {
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
		
		
		System.out.println("El numero introducido tiene "+divisores(n)+" divisores primos");
		
		sc.close();
	}
	
	

}
