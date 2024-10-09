package Lab3;
import java.util.*;
public class PlaneApp {
	public static void main(String[] args) {
		int choice;
		int seatId;
		int cust_id;
		Scanner sc = new Scanner(System.in);
		Plane colossusAirLine = new Plane();
		System.out.println("(1) Show number of empty seats");
		System.out.println("(2) Show the list of empty seats");
		System.out.println("(3) Show the list of seat assignments by seat ID");
		System.out.println("(4) Show the list of seat assignments by customer ID");
		System.out.println("(5) Assign a customer to a seat");
		System.out.println("(6) Remove a seat assignment");
		System.out.println("(7) Exit");
		do
		{
			System.out.print("\n  Enter the number of your choice: ");
			choice = sc.nextInt();
			switch(choice)
			{
				case 1:	colossusAirLine.showNumEmptySeats();
						break;
				
				case 2:	colossusAirLine.showEmptySeats();
					break;
				
				case 3:	colossusAirLine.showAssignedSeats(true);
						break;
				
				case 4:	colossusAirLine.showAssignedSeats(false);
						break;
				
				case 5:
						System.out.println("Assigning Seat .. ");
						System.out.print("  Please enter SeatID: ");
						seatId = sc.nextInt();
						System.out.print("  Please enter Customer ID: ");
						cust_id = sc.nextInt();
						colossusAirLine.assignSeat(seatId, cust_id);
						break;
				
				case 6:	System.out.print("  Enter SeatID to unassign customer from: ");
						seatId = sc.nextInt();
						colossusAirLine.unAssignSeat(seatId);
						break;
			}
		}
    while(choice != 7);
		sc.close();
	}
}
