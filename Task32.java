package by.htp.les02.main;
/*
 * Текущее показание электронных часов: m ч (0 ≤ m ≤23) n мин (0 ≤ n ≤59) k с (0 ≤K ≤59). Какое время будут показывать часы через р ч q мин r с?
 */

public class Task32 {

	public static void main(String[] args) {
		
		int m = 22;
		int n = 43;
		int k = 21;
		int p = 28;
		int q = 3;
		int r = 4;
		int x1, x2, x3, x4;
		int y1, y2, y3, y4;
		
		x1 = m * 3600 + n * 60 + k;
		x2 = p * 3600 + q * 60 + r;
		x3 = x1 + x2;
		
		y1 = x3 / 3600;
		y2 = (x3 - (y1 * 3600)) / 60;
		y3 = x3 - (y1 * 3600) - (y2 * 60);
		
		if (y1 <=0 | y1>=23) {
			y4 = y1 % 24;
			System.out.println(y4 + " ч. " + y2 + " м. " + y3 + " с. ");
		}
		else {
			System.out.println(y1 + " ч. " + y2 + " ч. " + y3 + " ч. ");
		}
	}
}



