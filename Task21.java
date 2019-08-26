package by.htp.les02.main;
/*
 * Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами дробную и целую части числа и вывести полученное значение числа.
 */

public class Task21 {

	public static void main(String[] args) {
		double r = 123.567;
		double x;
		double y;
		double z;
		
		x = (int)r;
		y = r * 1000 - x * 1000;
		z = y + (x / 1000);
		
		   
		    
	System.out.println(z);
		

	}

}
