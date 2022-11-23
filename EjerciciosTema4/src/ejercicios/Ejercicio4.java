package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
	
	static int maximo(int num1, int num2) {
		
		int mayor;
		
		if(num1>num2) {
			mayor = num1;
		}else {
			mayor = num2;
		}
		
		return mayor;
		
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("introduzca dos numeros para ver cual es el mayor");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		System.out.println("El numero mayor es "+maximo(num1, num2));
		
		sc.close();
	}

}
