package by.htp.les02.main;
/*
 * Дана величина А, выражающая объем информации в байтах. Перевести А в более крупные единицы измерения информации.
 */
import java.util.Scanner;
public class Task34 {
	

	public static void main(String[] args) {
		
		double  K, M, G, T;
		int A;
        Scanner readme = new Scanner(System.in);
        System.out.println("Введите байты: ");
		A = readme.nextInt();
		
		K = A / 1024;
		M = K / 1024;
		G = M / 1024;
		T = G / 1024;
		
		System.out.println(K);
		System.out.println(M);
		System.out.println(G);
		System.out.println(T);

	}

}
