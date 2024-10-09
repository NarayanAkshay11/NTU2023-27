package Lab1;
import java.util.*;
public class P4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int height = 0;
		int i, j;
		while(true)
		{
			try
			{
				System.out.print("Input the height: ");
				height = sc.nextInt();
			}
			catch(InputMismatchException e)
			{
				System.out.println("Please input whole numbers only");
				sc.nextLine();
				continue;
			}
			if(height < 1)
			{
				System.out.println("Error input!!");
				continue;
			}
					
			break;
		}
		
		sc.close();
		for(i = 0; i < height; i++)
		{
			for(j = 0; j <= i; j++)
			{
				if(i % 2 == 0)
				{
					if(j % 2 == 0)
						System.out.print("AA");
					else
						System.out.print("BB");
				}
				else
				{
					if(j % 2 == 0)
						System.out.print("BB");
					else
						System.out.print("AA");
				}
			}
			System.out.println("");
		}

	}

}
