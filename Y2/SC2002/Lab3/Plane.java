package Lab3;
public class Plane {
	private PlaneSeat[] seat;
	private int numEmptySeat;
	private static final int numOfSeats = 12;
	public Plane()
	{
		this.seat = new PlaneSeat[numOfSeats];
		this.numEmptySeat = numOfSeats;
		for(int i=0; i<numOfSeats; i++)
		{
			this.seat[i] = new PlaneSeat(i+1);
		}
	}
	
	private PlaneSeat[] sortSeats()
	{
		PlaneSeat[] tempSeat = new PlaneSeat[12];
		PlaneSeat tempSeat1;
		for(int i=0; i<numOfSeats; i++)
		{
			tempSeat[i] = seat[i];
		}
		
		for(int i=1; i<numOfSeats; i++)
		{
			for(int j=i; j>0; j--)
			{
				if(tempSeat[j].getCustomerID() < tempSeat[j-1].getCustomerID())
				{
					tempSeat1 = tempSeat[j];
					tempSeat[j] = tempSeat[j-1];
					tempSeat[j-1] = tempSeat1;
				}
				else
					break;
			}
		}
		
		return tempSeat;
	}
	
	public void showNumEmptySeats()
	{	
    System.out.printf("There are %d empty seats\n", this.numEmptySeat);
	}
	
	public void showEmptySeats()
	{
		System.out.println("The following seats are empty:");
		for(int i=0; i<numOfSeats; i++)
		{
			if(!this.seat[i].isOccupied())
				System.out.printf("SeatID %d\n", i+1);
		}
	}
	
	public void showAssignedSeats(boolean bySeatId)
	{
		PlaneSeat[] tempPlaneSeat = bySeatId ? this.seat : sortSeats();
		for(int i=0; i<numOfSeats; i++)
		{
      if(tempPlaneSeat[i].isOccupied()){
				System.out.printf("SeatID %d assigned to CustomerID %d.\n", tempPlaneSeat[i].getSeatID(), tempPlaneSeat[i].getCustomerID());
		}
	}
	
	public void assignSeat(int seatId, int cust_id)
	{
		if(this.seat[seatId-1].isOccupied())
			System.out.println("Seat already assigned to a customer.");
		else
		{
			this.seat[seatId-1].assign(cust_id);
			--this.numEmptySeat;
			
			System.out.println("Seat Assigned!");
		}
	}
	
	public void unAssignSeat(int seatId)
	{
		if(this.seat[seatId-1].isOccupied())
		{
			this.seat[seatId-1].unAssign();
			++this.numEmptySeat;
		}
		System.out.println("Seat Unassigned!");
	}
}
