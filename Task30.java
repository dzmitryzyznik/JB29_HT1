package by.htp.les02.main;
/*
 * Три сопротивления R1 R2, и R3 соединены параллельно. Найдите сопротивление соединения.
 */
import java.util.Scanner;
public class Task30 {

	public static void main(String[] args) {
		
       double R, R1, R2, R3;
		
		Scanner readme = new Scanner(System.in);		 
		
		System.out.println("Введите R1: ");
		R1 = readme.nextDouble();
		
		System.out.println("Введите R2: ");
		R2 = readme.nextDouble();
		
		System.out.println("Введите R3: ");
		R3 = readme.nextDouble();
		
		R = 1 / ((1 / R1) + (1 / R2) + (1 / R3));
		
		System.out.println("Cопротивление соединения равно " + R);

	}

}
