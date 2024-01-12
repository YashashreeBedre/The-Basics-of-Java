package ApnaCollege;

import java.util.*;
//switch and break
public class Switch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the button");
		int a = sc.nextInt();
		
		switch (a) {
		case 1 : System.out.println("1");
		break;
		
		case 2 : System.out.println("2");
		break ;
		
		case 3 : System.out.println("3");
		break;
		
		default : System.out.println("NO expected input");
		
		}
		
		
		
	}

}
