package by.htp.les02.main;
/*
 * Найти площадь треугольника, две стороны которого равны а и b, а угол между этими сторонами у.
 */
import java.util.Scanner;
public class Task26 {
	

	public static void main(String[] args) {
        double a, b, y, S, Y;
		
		Scanner readme = new Scanner(System.in);		 
		
		System.out.println("Введите сторону a: ");
		a = readme.nextDouble();
		
		System.out.println("Введите сторону b: ");
		b = readme.nextDouble();
		
		System.out.println("Введите угол y: ");
		y = readme.nextDouble();
		
		Y = Math.toRadians(y);
		
		S = (a * b * Math.sin(Y))/ 2;
		System.out.println("Площадь треугольника равна " +S);
	}

}
