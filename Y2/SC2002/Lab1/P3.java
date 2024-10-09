package Lab1;
import java.util.*;
public class P3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start = 0;
		int end = 0;
		int increment= 0;
		int i;
		String spaceNeeded = "            ";
		while(true)
		{
			try
			{
				System.out.print("Input the starting US$: ");
				start = sc.nextInt();
			}
			catch(InputMismatchException e)
			{
				System.out.println("Please input whole numbers only");
				sc.nextLine();
				continue;
			}
			break;
		}
		
		while(true)
		{
			try
			{
				System.out.print("Input the ending US$: ");
				end = sc.nextInt();
			}
			catch(InputMismatchException e)
			{
				System.out.println("Please input whole numbers only");
				sc.nextLine();
				continue;
			}
			if(end < start)
			{
				System.out.println("Error input!!");
				continue;
			}
			
			break;
		}
		while(true)
		{
			try
			{
				System.out.print("Input the increment: ");
				increment = sc.nextInt();
			}
			catch(InputMismatchException e)
			{
				System.out.println("Please input whole numbers only");
				sc.nextLine();
				continue;
			}
			
			sc.close();
			
			break;
		}
		System.out.println("US$         S$");
		System.out.println("--------------");
		
		for(i = start; i <= end; i += increment)
		{
			System.out.printf("%d", i);
			System.out.print(spaceNeeded.substring(0, spaceNeeded.length() - Integer.toString(i).length()));
			System.out.printf(Float.toString(Math.round(i*1.82f*100)/100.0f) + "\n");
		}
		i = start;
		System.out.println("\nUS$         S$");
		System.out.println("--------------");
		while(i <= end)
		{
			System.out.printf("%d", i);
			System.out.print(spaceNeeded.substring(0, spaceNeeded.length() - Integer.toString(i).length()));
			System.out.printf(Float.toString(Math.round(i*1.82f*100)/100.0f) + "\n");
			i += increment;
		}
		i = start;
		System.out.println("\nUS$         S$");
		System.out.println("--------------");
		do
		{
            System.out.printf("%d", i);
			System.out.print(spaceNeeded.substring(0, spaceNeeded.length() - Integer.toString(i).length()));
			System.out.printf(Float.toString(Math.round(i*1.82f*100)/100.0f) + "\n");
			i += increment;
		}
        while(i <= end);
	}
}
