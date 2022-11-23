package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void NumEntre(int num1, int num2) {
		
		for(int i=num1+1;i<num2;i++) {
			System.out.println(i);
		}
		for(int i=num2+1;i<num1;i++) {
			System.out.println(i);
		}
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Introduzca dos numeros");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		System.out.println("Estos son los numeros entre esos dos numeros");
		
		NumEntre(num1, num2);
		sc.close();
	}

}
