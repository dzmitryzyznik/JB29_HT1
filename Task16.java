package by.htp.les02.main;
import java.util.Scanner;
/*
 * Найти произведение цифр заданного четырехзначного числа.
 */

public class Task16 {

	public static void main(String[] args) {
		int a = 1234;
	    int b;
	    int x = 1;
	    b = a % 10;
	    x = x * b;
	    a = a /10;
	    b = a % 10;
	    x = x * b;
	    a = a /10;
	    b = a % 10;
	    x = x * b;
	    
	    System.out.println("Произведение равно:" + x);
		

	}

}
