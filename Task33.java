package by.htp.les02.main;
/*
 * Ввести любой символ и определить его порядковый номер, а также указать предыдущий и последующий символы.
 */
import java.util.Scanner;
public class Task33 {

	public static void main(String[] args) {
		char ch;
        Scanner readme = new Scanner(System.in);		 
		
		System.out.println("Ввести любой символ ");
		ch = readme.next().charAt(0);
		int x, y, z;
		x = ch;
		y = x - 1;
		z = x + 1;
		
		System.out.println(x);
		System.out.println((char)y);
		System.out.println((char)z);
		

	}

}
