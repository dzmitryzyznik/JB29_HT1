package by.htp.les02.main;

import java.util.Scanner;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
/*
 * Заданы координаты трех вершин треугольника (х1 у2),(х2, у2) ),(х3, у3). Найти его периметр и площадь.
 */

public class Task13 {

	public static void main(String[] args) {
	
		Scanner readme = new Scanner(System.in);
		
		System.out.println("Введите координаты точек " + "(Нажмите ввод после каждого):");
		
		double x1;
		double x2;
		double x3;
		double y2;
		double y3;
	    double a;
	    double b;
	    double c;
	    double P;
	    double p;
	    double s;
	    
	    x1 = readme.nextDouble();
		x2 = readme.nextDouble();
		x3 = readme.nextDouble();
		y2 = readme.nextDouble();
		y3 = readme.nextDouble();
		
		a = sqrt((pow(x1-x2,2)) + (pow(y2-y2,2)));
		b = sqrt((pow(x2-x3,2)) + (pow(y2-y3,2)));
		c = sqrt((pow(x1-x3,2)) + (pow(y2-y3,2)));
		P = a + b + c;
		p = P / 2;
		s = sqrt(p * (p - a) * (p - b) * (p - c));
		
		System.out.println("Периметр равен " + P);
		System.out.println("Площадь равна " + s);
		
	
		
	    

	}

}
