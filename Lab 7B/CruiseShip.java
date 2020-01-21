//Donark Patel
//CSC 162-C1
//Lab 7B

import java.text.DecimalFormat;

public class CruiseShip extends Ship
{
	public int MaxPassanger;

	DecimalFormat formatter = new DecimalFormat("#,###");

	public CruiseShip()
	{
		MaxPassanger = 0;
	}

	public CruiseShip(int mp, String n, String y)
	{
		super(n,y);
		MaxPassanger = mp;
	}

	public void setMaxPassanger(int MaxPassanger)
	{
		this.MaxPassanger = MaxPassanger;
	}

	public int getMaxPassanger()
	{
		return MaxPassanger;
	}

	public String toString()
	{
		return "The ship's name is: " + getShipName() +
				"\nThe ship's year is: " + getShipYear() +
				"\nThe Maximum Number of Passangers are: "
				+ formatter.format(getMaxPassanger()) +
				 "\n";
	}
}
