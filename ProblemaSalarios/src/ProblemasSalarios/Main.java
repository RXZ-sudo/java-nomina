package ProblemasSalarios;

import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("CALCULADORA NOMINA PROFESOR SECUNDARIA");
		System.out.print("Introduce tu nombre: ");
		String nombre = sc.nextLine();
		System.out.print("Introduce tu edad: ");
		int edad = sc.nextInt();
		System.out.print("Cuantos años de servicio tienes: ");
		int años = sc.nextInt();
		System.out.print("Cuantos días has trabajado al mes: ");
		int dias = sc.nextInt();
		System.out.print("Que porcentaje de IRPF tienes: ");
		float irpf = sc.nextFloat();
		
		Nomina nomina = new Nomina(nombre, edad, años, dias, irpf);
	}
}
