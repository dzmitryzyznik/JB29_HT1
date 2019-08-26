package by.htp.les02.main;

/*
 * Даны два действительных числа х и у. Вычислить их сумму, разность, произведение и частное.
 */
public class Task01 {
	
	public static void main(String[] args) {
		int x;
		int y;
		
		int Sum;
		int Dif;
		int Prod;
        double Quot;	
		
		x = 99;
		y = 57;
	    
		Sum = x + y;
		Dif = x - y;
		Prod = x * y;
		Quot = (double)x / y;
		
		System.out.println("Сумма равна " + Sum);
		System.out.println("Разница равна " + Dif);
		System.out.println("Произведение равно " + Prod);
		System.out.println("Частное равно " + Quot);
	
	}

}
