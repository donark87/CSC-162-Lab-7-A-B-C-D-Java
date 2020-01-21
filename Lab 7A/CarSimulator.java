//Donark Patel
//CSC 162-C1
//Lab 7A

public class CarSimulator
{
    public static void main(String []args)
    {
        FuelGauge amountOfFuel = new FuelGauge(16);
	    Odometer currentMileage = new Odometer(0);

	 	 while (amountOfFuel.getAmountOfFuel() > 0)
	 	 {
	 	    currentMileage.incrementMileage();

	        if( currentMileage.getcurrentMileage() % 24 == 0 )
	            amountOfFuel.decrementFuelTank();
	         {
				 System.out.println("Mileage: "+ currentMileage.getcurrentMileage() +
				 "\nFuel Level: " + amountOfFuel.getAmountOfFuel()+" gallons");
				 System.out.println("-------------------------");
	         }
	     }
	     System.out.println("Donark Patel");
		 System.out.println("CSC 162-C1");
		 System.out.println("Lab: 7A");
	}
}