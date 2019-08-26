package by.htp.les02.main;

/*
 * Вычислить значение выражения по формуле (все переменные принимают действительные значения):
𝑎 ∗ 𝑏 − 𝑎𝑏 − 𝑐 𝑐𝑑 𝑐𝑑
 */

public class Task09 {

	public static void main(String[] args) {
		
		double a = 86;
		double b = 70;
		double c = 11;
		double d = 57;
		double z;
		
		z = ((a / c) * (b / d)) - ((a * b -c) / (c * d));
		
		System.out.println(z);
	
		

	}

}
