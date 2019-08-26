package by.htp.les02.main;
/*
 * Найти площадь кольца, внутренний радиус которого равен r, а внешний — R (R> r).
 */
import java.util.Scanner;
public class Task23 {

	public static void main(String[] args) {
		
		double R, r, S;
		
		 Scanner readme = new Scanner(System.in);		 
			
			System.out.println("Введите внутрениий радиус r: ");
			r = readme.nextDouble();
			
			System.out.println("Введите внешний радиус R (R> r): ");
			R = readme.nextDouble();
			
			S = Math.PI * (Math.pow(R, 2) - Math.pow(r, 2));
			
			System.out.println("Площадь колца равна " + S);
		
		

	}

}
