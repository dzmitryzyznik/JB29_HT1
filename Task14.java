package by.htp.les02.main;
import java.util.Scanner;
import static java.lang.Math.PI;
import static java.lang.Math.pow;
/*
 * Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.
 */
public class Task14 {
	
	

	public static void main(String[] args) {
		
        Scanner readme = new Scanner(System.in);
		
		System.out.println("Введите радиус окружности ");
		
		double r;
		double d;
		double S;
		double c;
		
		 r = readme.nextDouble();
		 
		 d = r * 2;
		 c = PI * d;
		 S = PI * pow(r, 2);
		 
		 System.out.println("Длина окружности = " + c);
		 System.out.println("Площадь окружности = " + S);
		
		 
		
	}

}
