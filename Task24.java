package by.htp.les02.main;
/*
 * Найти площадь равнобедренной трапеции с основаниями а и b и углом α при большем основании а.
 */

import java.util.Scanner;
public class Task24 {

	public static void main(String[] args) {
		double a, b, α, h, S;
		
		 Scanner readme = new Scanner(System.in);		 
			
			System.out.println("Введите основание a: ");
			a = readme.nextDouble();
			
			System.out.println("Введите основание b (b<a): ");
			b = readme.nextDouble();
			
			System.out.println("Введите угол α (α<90) : ");
			α = readme.nextDouble();
			
			h = ((a - b) / 2) * Math.tan(α);
			
			S = ((a + b) / 2) * h ;
			
			System.out.println(S);
			
			
		

	}

}
