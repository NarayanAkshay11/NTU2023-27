package Lab2;
import java.util.*;
public class Lab2p1 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int choice;
		int m, n;
		long num;
		
		do {
			System.out.println("Perform the following methods:");
			System.out.println("1: multiplication test");
			System.out.println("2: quotient using division by subtraction");
			System.out.println("3: remainder using division by subtraction");
			System.out.println("4: count the number of digits");
			System.out.println("5: position of a digit");
			System.out.println("6: extract all odd digits");
			System.out.println("7: quit");
			choice = sc.nextInt();
		
			switch (choice) {
			case 1:
					mulTest();
				break;
			case 2:
					System.out.println("Input m:");
					m = sc.nextInt();
					System.out.println("Input n:");
					n = sc.nextInt();
					System.out.printf("%d/%d = %d\n", m, n, divide(m, n));
				break;
			case 3:
					System.out.println("Input m:");
					m = sc.nextInt();
					System.out.println("Input n:");
					n = sc.nextInt();
					System.out.printf("%d%%%d = %d\n", m, n, modulus(m, n));
				break;
			case 4:
					System.out.println("Enter the value:");
					n = sc.nextInt();
					m = countDigits(n);
					if(m == 0)
						System.out.printf("n: %d - Error input!!\n", n);
					else
						System.out.printf("n: %d - count = %d\n", n, m);
				break;
			case 5: System.out.println("Input value:");
					n = sc.nextInt();
					System.out.printf("Input digit to look for in %d:\n", n);
					m = sc.nextInt();
					System.out.printf("position = %d\n", position(n, m));
				break;
			case 6: System.out.println("Input value:");
					num = sc.nextLong();
					if(num > 0)
						System.out.printf("oddDigits = %d\n", extractOddDigits(num));
					else
						System.out.println("oddDigits = Error input!!");
					
				break; 
			case 7: System.out.println("Program terminating �.");
			}
		} while (choice < 7);
	}
	
	//question 3.2
	public static void mulTest()
	{
		int num1, num2;
		int numOfCorrect=0;
		
		for(int i=0; i<5; i++)
		{
			num1 = (int)(Math.random()*10) + 1;
			num2 = (int)(Math.random()*10) + 1;
			num1 += (num1 != 0) ? 0 : 1;
			num2 += (num2 != 0) ? 0 : 1;
			System.out.printf("How much is %d times %d? ", num1, num2);
			if((num1 * num2) == sc.nextInt())
				++numOfCorrect;
		}
		System.out.printf("%d answers out of 5 are correct.\n", numOfCorrect);
	}
	
	//question 3.3
	public static int divide(int m, int n)
	{
		int counter=0;
		while(m > 0)
		{
			m -= n;
			if(m >= 0)
				++counter;
		}
		
		return counter;
	}
	
	//question 3.4
	public static int modulus(int m, int n)
	{
		int remainder=0;
		while(m > 0)
		{
			remainder = m;
			m -= n;
		}
		
		return (m != 0) ? remainder : 0;
	}
	
	//question 3.5
	public static int countDigits(int n)
	{
		int count=0;
		while(n > 0)
		{
			n /= 10;
			++count;
		}
		return count;
	}
	
	//question 3.6
	public static int position(int n, int digit)
	{
		int pos = 1;
		while(n > 0)
		{
			if(n%10 == digit)
				return pos;
			n /= 10;
			++pos;
		}
		return -1;
	}
	
	//question 3.7
	public static long extractOddDigits(long n)
	{
		long oddDigits=0;
		long counter=1;
		while(n > 0)
		{
            if((n%10) % 2 != 0)
			{
				oddDigits += (counter * (n%10));
				counter *= 10;
			}
			n /= 10;
		}
		
		return (oddDigits != 0) ? oddDigits : -1;
	}

}
