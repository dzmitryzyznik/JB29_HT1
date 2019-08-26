package by.htp.les02.main;

import java.util.Scanner;
import static java.lang.Math.sqrt;

/*
 * Вычислить периметр и площадь прямоугольного треугольника по длинам а и b двух катетов
 */
public class Task11 {

	public static void main(String[] args) {
		
        Scanner readme = new Scanner(System.in);
		
		System.out.println("Введите длинну двух катетов " + "(Нажмите ввод после каждого):");
		
		double a;
		double b;
		double p;
		double s;
		double c;
	
		
		a = readme.nextDouble();
		b = readme.nextDouble();
		c = sqrt((a * a) + (b * b));
		p = a + b + c;
		s = (a * b) / 2;
		
		System.out.println("Периметр равен " + p);
		System.out.println("Площадь равна " + s);

	}

}
