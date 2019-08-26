package by.htp.les02.main;
/*
 * Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и false — в противном случае:
• Целое число N является четным двузначным числом.
• Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его
последних цифр.
• Сумма цифр данного трехзначного числа N является четным числом.
• Точка с координатами (х, у) принадлежит части плоскости, лежащей между прямыми
х= т, х= п (т<п).
• Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа.
• Треугольник со сторонами а,b,с является равнобедренным.
• Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна
третьей цифре.
• Заданное число N является степенью числа а (показатель степени может находиться
в диапазоне от 0 до 4).
• График функции у = ах2 + bх+ с проходит через заданную точку с координатами (m,
п).
 */
import java.util.Scanner;
public class Task37 {
	public static Scanner readme = new Scanner(System.in);
	public static void main(String[] args) {
	
		
		one();
		two();
		three();
		four();
		five();
		six();
		seven();
		eight();
		nine();
	}
		public static void one() {
		System.out.println("Введите целое двухзначное число: ");
		int N = readme.nextInt();
		int a,b;
		a = N /10;
		b = N % 10;
		
		if(N % 2 == 0){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
	}
		
        public static void two() {
		System.out.println("Введите целое четырехзначное число:");
	    int N = readme.nextInt();
		
		int a,b,c,d;
		a = N / 1000;
		b = N / 100 % 10;
		c = N % 100 / 10;
		d = N % 1000 % 10;
		if((a + b) == (c + d)){
			System.out.println("true");
		}else
			System.out.println("false");
	}
        
        public static void three(){
    		System.out.println("Введите целое трехзначное число");
    		int N = readme.nextInt();
    		int a, b,c;
    		a = N / 100;
    		b = N / 10 % 10;
    		c = N % 10;
    		
    		if((a + b + c) % 2 == 0){
    			System.out.println("true");
    		}else{
    			System.out.println("false");
    		}
        }
    	public static void four() {
    		System.out.println("Введите координаты x");
    		int x = readme.nextInt();
    		System.out.println("Введите координаты y");
    		int y = readme.nextInt();
    		System.out.println("Введите точку m, с условием m<n");
    		int m = readme.nextInt();
    		System.out.println("Введите точку n, с условием m<n");
    		int n = readme.nextInt();
    		
    		if (x >= m & x <=n) {
    			System.out.println("true");
    		}
    			else {
    				System.out.println("false");
    			}
    		}
    	
    	public static void five() {
    		System.out.println("Введите трехзначное число x");
    		int x = readme.nextInt();
    		
    		
    	    int x1 = x / 100;
    	    int x2 = x / 10 % 10;
    	    int x3 = x % 10;
    	    
    	    if(Math.pow((x1 + x2 + x3),3) == x*x){
    	      System.out.println("true");
    	    }else
    	      System.out.println("false");
    	    }
    	public static void six() {
    		System.out.println("Введите сторону a");
    		int a = readme.nextInt();
    		System.out.println("Введите сторону b");
    		int b = readme.nextInt();
    		System.out.println("Введите сторону c");
    		int c = readme.nextInt();
    		
    		if (a==b && a==c && b==c ) {
    		      System.out.println("false");
    		      
    		    }else if (a==b || a==c || b==c ) {
    		      System.out.println("true");
    		    }
    		    else {
    		      System.out.println("false");
    	}
    		    
    		}
    	public static void seven() {
    		
    		System.out.println("Введите трехзначное число");
    		int x = readme.nextInt();
    		
    		
    	    int x1 = x / 100;
    	    int x2 = x / 10 % 10;
    	    int x3 = x % 10;
    	    
    	    if (x1 + x2 == x3 | x2 + x3 == x1 | x1 + x3 == x2) {
    	    	System.out.println("true");
    	    	
    	    }
    	    else {
  		      System.out.println("false");
  	}
    		
    	}
    	public static void eight() {
    		
    		System.out.println("Введите число N");
    		int N = readme.nextInt();
    		
    		System.out.println("Введите число a");
    		int a = readme.nextInt();
    		
    		if (N / a == 1 | N % Math.pow(a, 2) == 0 | N % Math.pow(a, 3) == 0 | N % Math.pow(a, 4) == 0  ) {
    			System.out.println("true");
    		}
    		else {
    		      System.out.println("false");
    	}
    		
    	
    		
    		
    	}
    	public static void nine() {
    		System.out.println("Введите a");
    		int a = readme.nextInt();
    		
    		System.out.println("Введите b");
    		int b = readme.nextInt();
    		
    		System.out.println("Введите c");
    		int c = readme.nextInt();
    		
    		System.out.println("Введите m");
    		int m = readme.nextInt();
    		
    		System.out.println("Введите n");
    		int n = readme.nextInt();
    		
    		double y = (a * Math.pow(n, 2)) + (b * n) + c;  
    		
    		if (y == m) {
    			System.out.println("true");
    		}
    		else {
    			System.out.println("false");
    		}
    		
    		
    	}
    		
    		
    	}
    	
    		
      	



