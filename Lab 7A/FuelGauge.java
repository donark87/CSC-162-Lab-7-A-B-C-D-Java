//Donark Patel
//CSC 162-C1
//Lab 7A

public class FuelGauge
{
	private int amountOfFuel;

	public FuelGauge()
	{
		amountOfFuel = 0;
	}

	public FuelGauge(int gallons)
	{
	    amountOfFuel = gallons;
	}

	public int getAmountOfFuel()
	{
	    return amountOfFuel;
	}

	public void incrementFuelTank()
	{
	    if (amountOfFuel < 15 )
	        amountOfFuel++;
	}

	public void decrementFuelTank()
	{
	    if (amountOfFuel > 0 )
	        amountOfFuel--;
	}
}