package by.htp.les02.main;
/*
 * Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и объем этого куба.
 */
import static java.lang.Math.pow;
public class Task18 {

	public static void main(String[] args) {
		
		int a = 5;
		int s;
		int S;
		int Q;
		
		 s = (int) pow(a,2);
		 S = (int) (s * 6);
		 Q = (int) pow(a,3);
		 
		 System.out.println("Площадь грани = " + s);
		 System.out.println("Площадь полной поверхности = " + S);
		 System.out.println("Объем куба = " + Q);
		
	
		

	}

}
