package by.htp.les02.main;

import java.util.Scanner;

/*
 * Дан прямоугольник, ширина которого в два раза меньше длины. Найти площадь прямоугольника
 */

public class Task07 {

	public static void main(String[] args) {
	
        Scanner readme = new Scanner(System.in);
		
		System.out.println("Введите длину прямоугольника ");
		
		double a;
		double s;
		
		a = readme.nextInt();
		
		s = a * (a / 2);
		
		System.out.println("Площадь прямоугольника = " + s);
		
	}

}
