package by.htp.les02.main;
/*
 * Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
ННч ММмин SSc.
 */

public class Task22 {

	public static void main(String[] args) {
		
		int t = 44657;
		
		int h;
		int m;
		int s;
		
		h = t / 3600 ;	
		m = (t - (h * 3600)) / 60; 
		s = t - (h * 3600) - (m * 60); 
		System.out.println(h + "ч " + m + "мин " + s + "с" );
		
	}

}
