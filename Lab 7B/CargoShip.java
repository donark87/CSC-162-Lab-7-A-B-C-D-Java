//Donark Patel
//CSC 162-C1
//Lab 7B

import java.text.DecimalFormat;

public class CargoShip extends Ship
{
	public int CargoCapacity;

	DecimalFormat formatter = new DecimalFormat("##,###");

	public CargoShip()
	{
	    CargoCapacity = 0;
	}

	public CargoShip (int cs, String n, String y)
	{
	   super(n,y);
	   CargoCapacity = cs;
	}

	public void setCargoCapacity(int CargoCapacity)
	{
	    this.CargoCapacity = CargoCapacity;
	}

	public int getCargoCapacity()
	{
	    return CargoCapacity;
	}

	public String toString()
	{
	        return "The ship's name is: " + getShipName() +
	        	"\nThe ship's year is: " + getShipYear() +
	        	"\nThe ship's cargo capacity is: "+ formatter.format(getCargoCapacity())
	        	+ "\n";
	}
}