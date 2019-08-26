package by.htp.les02.main;
/*
 * Даны натуральные числа М и N. Вывести старшую цифру дробной части и младшую цифру целой части числа M/N.

 */

public class Task35 {

	public static void main(String[] args) {
		
		int M = 5464654;
		int N = 5478;
		
		double x = (double) M / N;
		double  x1;
		
		x1 = (int) x;
		
		double y = (x * 100) - (x1 * 100);
		
		x1 = x1 % 10;
		y = (y - (y % 10)) / 10;
		
		
		System.out.println("M/N = " + x);
		System.out.println("Младшая цифра целой части " + (int)x1);
		System.out.println("Старшую цифра дробной части " + (int)y);


	}

}
