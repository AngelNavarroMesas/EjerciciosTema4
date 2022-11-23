package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
	
	public static void calcular(int opcion, double altura, double radio) {
		
		double volumen, area;
		
		
		if(opcion==1) {
			
			volumen = Math.PI*(radio*2)*altura;
			System.out.println("El volumen del cilindro es "+volumen);
			
		}else if(opcion==2) {
			
			area = (2*Math.PI)*radio*(altura+radio);
			System.out.println("El area del cilindro es "+area);
			
			
		}else {
			System.out.println("No ha elegido una opcion");
		}
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double altura, radio;
		int opcion;
		
		System.out.println("Elija una opcion");
		System.out.println("1 Para calcular el volumen");
		System.out.println("2 Para calcular el area");
		opcion = sc.nextInt();
		
		System.out.println("Introduzca la altura del cilindro");
		altura = sc.nextDouble();
		System.out.println("Introduzca el radio del cilindro");
		radio = sc.nextDouble();
		
		calcular(opcion, altura, radio);
		sc.close();
	}

}
