package by.htp.les02.main;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/*
 * Вычислить значение выражения по формуле (все переменные принимают действительные значения):
𝑏+√𝑏2 +4𝑎𝑐−𝑎3𝑐+𝑏−2
 */
public class Task08 {

	public static void main(String[] args) {
		double a = 16;
		double b = 25;
		double c = 41;
		double z;
		
		z = ((b + sqrt(b * b + 4 + a + c)) / (2 * a)) - (pow(a, 3) * c + pow(b, -2));
				
				System.out.println(z);
		
		

	}

}
