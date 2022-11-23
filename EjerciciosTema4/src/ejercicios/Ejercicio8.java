package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {
	
	
	static int calculadora(int num1, int num2) {
		
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int opcion, num1, num2;
		
		System.out.println("Introduzca dos numeros");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		System.out.println("Que operacion desea hacer?");
		System.out.println("1 Sumar");
		System.out.println("2 Restar");
		System.out.println("3 Multiplicar");
		System.out.println("4 Dividir");
		opcion = sc.nextInt();
		
		
		sc.close();
	}

}
