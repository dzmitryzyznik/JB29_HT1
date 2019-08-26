package by.htp.les02.main;
/*
 * Вычислить корни квадратного уравнения ах2+ bх + с = 0 с заданными коэффициентами a, b и с (предполагается, что а≠0 и что дискриминант уравнения неотрицателен).
 */
import java.util.Scanner;
public class Task25 {

	public static void main(String[] args) {
		
		double a, b, c, x1, x2,  D;
		
		Scanner readme = new Scanner(System.in);		 
		
		System.out.println("Введите a≠0: ");
		a = readme.nextDouble();
		
		System.out.println("Введите b: ");
		b = readme.nextDouble();
		
		System.out.println("Введите c: ");
		c = readme.nextDouble();
		
		D = Math.pow(b, 2) - 4 * a * c;
		
		if (D < 0) {
			System.out.println("Корней нет ");
		} else {
			
			if (D == 0) {
				x1 = (-b + Math.sqrt(D)) / 2 * a;
				System.out.println("x =" + x1 );
				
			}
			
		
		else {
		
		x1 = (-b + Math.sqrt(D)) / 2 * a;
		x2 = (-b - Math.sqrt(D)) / 2 * a;
		
		System.out.println("x1 =" + x1 + " x2 =" + x2);
		}

	}

}
}
