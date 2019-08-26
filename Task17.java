package by.htp.les02.main;
/*
 * Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее геометрическое модулей этих чисел.
 */

import static java.lang.Math.pow;
import static java.lang.Math.abs;
import static java.lang.Math.sqrt;
public class Task17 {

	public static void main(String[] args) {
		
		int a = 12;
		int b = 10;
		
		int s;
		double g;
		
		s= ((int) pow(a,3) + (int) pow(b,3)) / 2;
		g =  sqrt(abs(a) * abs(b));
		
		System.out.println("Среднее арифметическое = " + s);
		System.out.println("Среднее геометрическое = " + g);

	}

}
