package ApnaCollege;
import java.util.*;
public class Calender {
public static void main(String[] args) {
	 Scanner Sc = new Scanner(System.in);
	 
	 System.out.println("Enter The number to get a month");
	 
	int month = Sc.nextInt();
	
	System.out.println("ummmm Wait....");
	System.out.println("Here's the month you've asked for....");
	
	switch(month){
	case 1 :
		System.out.println("jan");
		break;
	case 2:
		System.out.println("feb");
		break;
	case 3:
		System.out.println("march");
		break;
	case 4:
		System.out.println("apr");
		break;
	case 5:
		System.out.println("may");
		break;
	case 6:
		System.out.println("june");
		break;
		default:
			System.out.println("There is no month");
		
	}
	
	 
}
}
