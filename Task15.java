package by.htp.les02.main;

/*
 * Написать программу, которая выводит на экран первые четыре степени числа π.
 */

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Task15 {

	public static void main(String[] args) {
		
		double x0;
		double x1;
		double x2;
		double x3;
		
		x0 = pow(PI, 0);
		x1 = pow(PI, 1);
		x2 = pow(PI, 2);
		x3 = pow(PI, 3);
		
		System.out.println("Нулевая степень = " + x0);
		System.out.println("Первая степень = " + x1);
		System.out.println("Вторая степень = " + x2);
		System.out.println("Третия степень = " + x3);
	}

}
