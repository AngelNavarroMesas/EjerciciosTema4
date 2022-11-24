package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {
	
	
	static int calculadora(int opcion, int num1, int num2) {
		
		int operacion=0;
		
		switch(opcion) {
			case 1-> operacion = num1+num2;
			case 2-> operacion = num1-num2;
			case 3-> operacion = num1*num2;
			case 4-> operacion = num1/num2;
		}
		
		return(operacion);
		
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
		
		System.out.println(calculadora(opcion, num1, num2));
		
		sc.close();
	}

}
