package by.htp.les02.main;

import java.util.Scanner;

/*
 * Написать код для решения задачи. В n малых бидонах 80 л молока. Сколько литров молока в m больших бидонах, если в каждом большом бидоне на 12 л. больше, чем в малом?
 */
public class Task06 {

	public static void main(String[] args) {
		
        Scanner readme = new Scanner(System.in);
		
		System.out.println("Введите кол-во малых и больших бидонов " + "(Нажмите ввод после каждого):");
		
		int n;
		int m;
		double l;
		double q;
		
		n = readme.nextInt();
		m = readme.nextInt();
	
		l = (double)80 / n;
		q = (double)(m * (l + 12));
	
		System.out.println("Литров молока в болших бидонах = " + q);
		
		

		

	}

}
