package by.htp.les02.main;
/*
 * Дано значение a. Не используя никаких функций и никаких операций, кроме умножения, получить значение а8 за три операции и а10 за четыре операции.
 */
import java.util.Scanner;
public class Task27 {

	public static void main(String[] args) {
		
        int a , a2, a4, a8, a10;
		
		Scanner readme = new Scanner(System.in);		 
		
		System.out.println("Введите a: ");
		a = readme.nextInt();
		
		a2 = a * a;
		a4 = a2 * a2;
		a8 = a4 * a4;
		a10 = a8 * a2;
		
		System.out.println("a в восьмой степени равно " + a8 +  " ,a в десятой степени равно " + a10);

	}

}
