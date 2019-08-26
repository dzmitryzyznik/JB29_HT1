package by.htp.les02.main;
/*
 * Найти (в радианах в градусах) все углы треугольника со сторонами а, b, с.
 */
import java.util.Scanner;
public class Task29 {

	public static void main(String[] args) {
        double a, b, c;
        double alpha, beta, gamma, x, x1, y, y1, z, z1;
       
		
		Scanner readme = new Scanner(System.in);		 
		
	    System.out.println("Введите a: ");
		a = readme.nextDouble();
		
		System.out.println("Введите b: ");
		b = readme.nextDouble();
		
		System.out.println("Введите c: ");
		c = readme.nextDouble();
		
		alpha = ((a * a) + (c * c) - (b * b)) / (2 * a * c);
		
	    x = Math.acos(alpha);
	    
	    x1 = Math.toDegrees(x);
	    
	    beta = ((a * a) + (b * b) - (c * c)) / (2 * a * b);
	    
	    y = Math.acos(beta);
	    y1 = Math.toDegrees(y);
	    
	    gamma = ((b * b) + (c * c) - (a * a)) / (2 * c * b);
	   
	    z = Math.acos(gamma);
	    z1 = Math.toDegrees(z);
	    
	    
	    
	    
		
		System.out.println("Угол альфа равен" + x1 + " градусов или " + x + " радиан");
		System.out.println("Угол альфа равен" + y1 + " градусов или " + y + " радиан");
		System.out.println("Угол альфа равен" + z1 + " градусов или " + z + " радиан");;

	}

}
