//Donark Patel
//CSC 162-C1
//Lab 7B

public class ShipDemo
{
	public static void main(String[] args)
	{
	   	   Ship[] Ship1 = new Ship[1];
	   	   CruiseShip[] Ship2 = new CruiseShip[1];
	   	   CargoShip[] Ship3 = new CargoShip[1];

	   	   Ship1[0] = new Ship();
	   	   Ship1[0].setShipName("Lolipop");
	   	   Ship1[0].setShipYear("1960");

	   	   System.out.println(Ship1[0]);

	   	   Ship2[0] = new CruiseShip();
	   	   Ship2[0].setShipName("Disney Magic");
	   	   Ship2[0].setShipYear("1988");
	   	   Ship2[0].setMaxPassanger(2400);

	   	   System.out.println(Ship2[0]);

	   	   Ship3[0] = new CargoShip();
	   	   Ship3[0].setShipName("Black Pearl");
	   	   Ship3[0].setShipYear("1800");
		   Ship3[0].setCargoCapacity(50000);

	   	   System.out.println(Ship3[0]);

	   	   System.out.println("Donark Patel");
		   System.out.println("CSC 162-C1");
		   System.out.println("Lab: 7B");
	}
}

