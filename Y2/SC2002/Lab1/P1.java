package Lab1;
import java.util.Scanner;

public class P1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("A. Action movie \nC. Comedy movie \nD. Drama movie");
		System.out.print("Input your choice: ");
		char choice = sc.next().charAt(0);
		sc.close();
		switch(choice)
		{
			case 'A':
			case 'a':
				System.out.printf("Action movie fan\n");
				break;
			
			case 'C':
			case 'c':
				System.out.printf("Comedy movie fan\n");
				break;
			
			case 'D':
			case 'd':
				System.out.printf("Drama movie fan\n");
				break;
			
			default:
				System.out.printf("Invalid choice\n");
		}

	}

}
