package by.htp.les02.main;

import java.util.Scanner;

/*
 * Составить алгоритм нахождения среднего арифметического двух чисел
 */
public class Task05 {

	public static void main(String[] args) {
		
		Scanner readme = new Scanner(System.in);
		
		System.out.println("Enter Two Numbers " + "(Press Enter after each):");
		
		double a;
		double b;
		double y;
		
		a = readme.nextDouble();
		b = readme.nextDouble();
		y = (a + b) / 2;
		
		System.out.println("Total = " + y);
		
		
		
	

	}

}
