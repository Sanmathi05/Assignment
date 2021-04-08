package Lab1;

import java.util.Scanner;

public class Ex1Sumofcubes {

	public static void main(String[] args) {
		int no= 0,i;
		Scanner s=new Scanner (System.in);
		System.out.println("digit numbers");
		int n=s.nextInt();
		s.close();
		
		for(i=1;i<=n;i++) {
			
			no+=(i*i*i);
			
			
		}
		
		System.out.println("sum of the cubes:" +no);


	}

	}


