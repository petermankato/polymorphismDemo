import java.util.ArrayList;

/**
 * <strong>VehicleMain.java</strong> - A test program showing polymorphism at work
 *
 * @author Peter K. Johnson - <a href="http://WebExplorations.com"
 *         target="_blank"> http://WebExplorations.com</a><br >
 *         Written: Oct 4, 2014<br >
 *         Revised: Oct 4, 2014<br>
 */
public class VehicleMain
{
   public static void main(String[ ] args)
   {
      ArrayList<Vehicle> cityGarage = new ArrayList<Vehicle>( );
      
      System.out.println("Filling up the garage with different vehicles:");
      cityGarage.add(new Auto()     );
      cityGarage.add(new PoliceCar());
      cityGarage.add(new Auto()     );
      cityGarage.add(new Bus()      );
      cityGarage.add(new Truck()    );
      cityGarage.add(new Auto()     );
      
      System.out.println("\n================================================");
      System.out.println("How does Java know which vehicle is which?");
      System.out.println("The Array List is just a bunch of vehicles!!!");
      System.out.println("===================================================");
      
      int parkingSpot = 1;
      for(Vehicle thisVehicle: cityGarage)
      {
         System.out.println("In parking spot #" + (parkingSpot++) 
               + " a " + thisVehicle.getClass() );
         thisVehicle.drive();
         thisVehicle.soundHorn( ); 
         System.out.println("- - - - - - - - - - - - - - - - - - - - - - - ");
      }
      
      System.out.println("Java can look at each object in the ArrayList " 
            + "\nand know what CHILD class was used to create it.");
      System.out.println("And that is POLYMORPHISM at work.");
      System.out.println("End of program.");
      System.exit(0);
   }   
}





