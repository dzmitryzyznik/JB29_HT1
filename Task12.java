package by.htp.les02.main;

import java.util.Scanner;
import static java.lang.Math.sqrt;

/*
 * Вычислить расстояние между двумя точками с данными координатами (х1, у1)и (x2, у2).
 */
public class Task12 {

	public static void main(String[] args) {
		
		    Scanner readme = new Scanner(System.in);
			
			System.out.println("Введите координаты точек " + "(Нажмите ввод после каждого):");
			
			double x1;
			double x2;
			double y1;
			double y2;
			double s;
			
			x1 = readme.nextDouble();
			x2 = readme.nextDouble();
			y1 = readme.nextDouble();
			y2 = readme.nextDouble();
	
            s = sqrt(((x2-x1) * (x2-x1)) + ((y2-y1) * (y2-y1)));
            
            System.out.println("Расстояние равно " + s);
	}

}
