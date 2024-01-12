package ApnaCollege;

import java.util.*;

public class Calculator {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter two numbers");
		
		 int a = sc.nextInt();
		 int b = sc.nextInt();
		 
		 System.out.println("select the Operation");
		 
		 int c = sc.nextInt();
//		 1 = +
//	     2 = -
//	     3 = *
//	     4 = /
//	     5 = %
		 System.out.println(" calculatingg......");
		 System.out.println("here's your answer");
		 switch (c) {
		 case 1 :  System.out.println(a + b);
		 break ;
		 case 2 : System.out.println( a - b);
		 break ;
		 case 3 : System.out.println(a * b);
		 break ;
		 case 4 : System.out.println( a / b);
		 break ;
		 case 5 : System.out.println(a %b);
		 break;
		 default :
			 System.out.println("Imvalid operation");
		 
		 
		 
	}

}
}
