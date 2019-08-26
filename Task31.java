package by.htp.les02.main;
/*
 * Составить программу для вычисления пути, пройденного лодкой, если ее скорость в стоячей воде v км/ч, скорость течения реки v1 км/ч, время движения по озеру t1 ч, а против течения реки — t2 ч.
 */

import java.util.Scanner;

public class Task31 {

	public static void main(String[] args) {
		
        double v, v1, t1, t2, S;
		
		Scanner readme = new Scanner(System.in);		 
		
		System.out.println("Введите скорость в стоячей воде: ");
		v = readme.nextDouble();
		
		System.out.println("Введите скорость течения реки: ");
		v1 = readme.nextDouble();
		
		System.out.println("Введите время движения по озеру: ");
		t1 = readme.nextDouble();
		
		System.out.println("Введите время движения против течения реки: ");
		t2 = readme.nextDouble();
		
		S = (v * t1) + (v - v1) * t2;
		
		
		System.out.println(S + " км в пути");
		

	}

}
