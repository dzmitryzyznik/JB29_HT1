package by.htp.les02.main;
/*
 * Составить программу перевода радианной меры угла в градусы, минуты и секунды.
 */
import java.util.Scanner;
public class Task28 {

	public static void main(String[] args) {
		
		 double r;
		 double R, M, S;
		 
			
			Scanner readme = new Scanner(System.in);		 
			
			System.out.println("Введите радианную меру угла: ");
			r = readme.nextDouble();
			
			R =(r * 180 / Math.PI);
			int cel = (int) R;
			double drob = R - cel;
			
			M = drob * 60;
			int cel1 = (int) M;
			double drob1 = M - cel1;
			
			S = drob1 * 60;
			
		
			
			
			 
			
			System.out.println((int)R + "°" + (int)M + "'" + (int)S + "''");
			
	

	}

}
