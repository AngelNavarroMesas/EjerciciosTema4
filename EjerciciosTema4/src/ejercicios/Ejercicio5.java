package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
	
	
	static boolean vocal(char caracter) {
		
		boolean vocal=false;
		
		switch(caracter) {
		case 'a'-> vocal=true;
		case 'e'-> vocal=true;
		case 'i'-> vocal=true;
		case 'o'-> vocal=true;
		case 'u'-> vocal=true;
		}	
		
		return vocal;
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char caracter;
		
		
		System.out.println("introduzca un caracter cualquiera");
		caracter = sc.next().charAt(0);
		
		System.out.print("El caracter es una vocal? "+vocal(caracter));
		
		sc.close();
	}

}
