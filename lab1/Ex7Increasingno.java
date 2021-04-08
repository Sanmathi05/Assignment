package Lab1;

import java.util.Scanner;

public class Ex7Increasingno {

		boolean isIncreasing(int number)
		{
		String s = Integer.toString(number);
		char ch;
		int f = 0;
		for (int i = 0; i < s.length() - 1; i++) {
		ch = s.charAt(i);
		if (ch > s.charAt(i + 1))
		{
		f = 1;
		break;
		}
		}
		if (f == 1)
		return false;
		else
		return true;
		}

		boolean isDecreasing(int number)
		{
		String s = Integer.toString(number);
		char ch;
		int f = 0;
		for (int i = 0; i < s.length() - 1; i++) {
		ch = s.charAt(i);
		if (ch < s.charAt(i + 1))
		{
		f = 1;
		break;
		}
		}
		if (f == 1)
		return false;
		else
		return true;
		}

		void isBouncy(int number) {
		if (isIncreasing(number) == true)
		System.out.println("The number " + number + " is Increasing");
		else
		System.out.println("The number " + number + " is not in increasing order");
		}

		public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		Ex7Increasingno bouncyNumber = new Ex7Increasingno();
		System.out.print("Enter a number : ");
		int number = scanner.nextInt();
		bouncyNumber.isBouncy(number);
		scanner.close();
		}
		}


