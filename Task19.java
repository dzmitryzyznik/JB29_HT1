package by.htp.les02.main;
/*
 * Дана сторона равностороннего треугольника. Найти площадь этого треугольника, его высоту, радиусы вписанной и описанной окружностей.
 */
import static java.lang.Math.sqrt;
public class Task19 {

	public static void main(String[] args) {
		
		int a = 6;
		double s;
		double h;
		double r;
		double R;
		
		h = (a * sqrt(3)) / 2;
		s = (a * h) / 2;
		r = a / (2 * sqrt(3));
		R = a / sqrt(3);
		
		System.out.println("Высота треугольника = " + h);
		System.out.println("Площадь треугольника = " + s);
		System.out.println("Радиус вписанной окружности = " + r);
		System.out.println("Радиус описанной окружности = " +  R);

	}

}
