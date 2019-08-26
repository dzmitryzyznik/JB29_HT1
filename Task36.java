package by.htp.les02.main;
/*
 * Найти частное произведений четных и нечетных цифр четырехзначного числа.
 */
import java.util.Scanner;
public class Task36 {

	public static void main(String[] args) {
		
		int x;
        Scanner readme = new Scanner(System.in);
        System.out.println("Введите четырехзначное число ");
		x = readme.nextInt();
		int ch1 , ch2, ch3, ch4, nech1, nech2, nech3, nech4;
		
		int x1 = x % 10;
		if (x1 % 2 == 0)
		{ ch1 = x1;
		  nech1 = 1;
		
		}
		else {
			nech1 = x1;
			ch1 = 1;
		}
		
		int x2 = ((x - x1) / 10) % 10;
		if (x2 % 2 == 0)
		{ ch2 = x2;
		  nech2 = 1;
		
		}
		else {
			nech2 = x2;
			ch2 = 1;
		}
		int x3 = ((((x - x1) / 10) - x2)/10) % 10;
		if (x3 % 2 == 0)
		{ ch3 = x3;
		  nech3 = 1;
		
		}
		else {
			nech3 = x3;
			ch3 = 1;
		}
		
		int x4 = ((((x - x1) / 10) - x2)/10)/ 10;
		if (x4 % 2 == 0)
		{ ch4 = x4;
		  nech4 = 1;
		
		}
		else {
			nech4 = x4;
			ch4 = 1;
		}
		
		double X = (double)(ch1 * ch2 * ch3 * ch4) / (nech1 * nech2 * nech3 * nech4);
		 System.out.println(X);
		
		}

	}


