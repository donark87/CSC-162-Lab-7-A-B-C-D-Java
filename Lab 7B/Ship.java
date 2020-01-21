//Donark Patel
//CSC 162-C1
//Lab 7B

public class Ship
{
	public String shipName;
	public String shipYear;

	public Ship()
	{
	  shipName = "";
	  shipYear = "";
	}

	public Ship (String n, String y)
	{
	   shipName = n;
	   shipYear = y;
	}

	public void setShipName(String shipName)
	{
	    this.shipName = shipName;
	}

	public void setShipYear(String shipYear)
	{
	    this.shipYear = shipYear;
	}

	public String getShipName()
	{
        return shipName;
	}

	public String getShipYear()
	{
	    return shipYear;
	}

	public String toString()
	{
	    return "The ship's name is: " + getShipName() +
	    		"\nThe ship's year is: " + getShipYear()+ "\n";
	}
}