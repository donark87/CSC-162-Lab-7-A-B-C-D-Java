//Donark Patel
//CSC 162-C1
//Lab 7A

public class Odometer
{
	private int currentMileage;

	public Odometer(int gallons)
	{
	    currentMileage = gallons;
	}

	public int getcurrentMileage()
	{
	    return currentMileage;
	}

	public void incrementCurrentMileage()
	{
      if (currentMileage > 999999 )
         currentMileage++;
	}

	public void decrementCurrentMileage()
	{
	    if (currentMileage > 24 )
	    currentMileage--;
	}

	public void incrementMileage()
	{
		currentMileage = (currentMileage+24);
		if(currentMileage > 999999)
		{
			currentMileage = 0;
		}
	}
}
