package Lab1;

import java.util.Scanner;

public class Ex6Sqsum {

	public static void main(String[] args) {
		int no= 0,i;
		Scanner s=new Scanner (System.in);
		System.out.println("limt of natural numbers");
		int n=s.nextInt();
		s.close();
		
		for(i=1;i<=n;i++) {
			
			no=+(i*i);
			
			
		}
		
		System.out.println("natural no:" +no);


	}

}
