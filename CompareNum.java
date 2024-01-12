package ApnaCollege;
 import java.util.*;
public class CompareNum {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter A");
		
		int a = sc.nextInt();
		
		System.out.println("Enter b");
		
		int b = sc.nextInt();
		
		if ( a == b) { 
			System.out.println("The number are equals");
		}
		else // else if  - else can be used also 
			{
			if( a  > b) {
				System.out.println("The a is greater ");
			}
			else
			{
				System.out.println("the b is greater");
			
			}
		}
	}

}
