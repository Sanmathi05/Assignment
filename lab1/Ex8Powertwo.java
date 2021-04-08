package Lab1;

import java.util.Scanner;

public class Ex8Powertwo {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("enter the numbers: ");
		int n=s.nextInt();
		s.close();
		if(n%2==0) {
			System.out.println( +n+ " power of 2");
		}
			else {
				System.out.println("the given "+n+" is not power of 2");
			
		}

	}

}
