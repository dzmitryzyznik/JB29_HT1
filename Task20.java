package by.htp.les02.main;
/*
 * Известна длина окружности. Найти площадь круга, ограниченного этой окружностью.
 */
import static java.lang.Math.PI;
import static java.lang.Math.pow;
public class Task20 {

	public static void main(String[] args) {
		
		int l = 10;
		double s;
		double r;
		
		r = l / 2 * PI;
		s = PI * pow(r,2);
		
		System.out.println("Площадь окружности = " + s);
	
		
		

	}

}
