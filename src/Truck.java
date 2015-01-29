/**
 * <strong>Truck.java</strong> - A Truck Vehicle
 *
 * @author Peter K. Johnson - <a href="http://WebExplorations.com"
 *         target="_blank"> http://WebExplorations.com</a><br >
 *         Written: Oct 4, 2014<br >
 *         Revised: Oct 4, 2014<br>
 */

public class Truck extends Vehicle
{
   public Truck() 
   { 
      System.out.println("I am also a truck.\n******************");  
   }
   
   public void soundHorn( )
   {
     playSound("truckHorn.aiff", "TRUCK Horn.  Recording from: Bone666138 http://freeSound.org");
     super.hitAnyKey();
   }
   
   public void drive( )
   {
      setIsMoving(true);
      playSound("truck.wav", "TRUCK starting up. Recording from: MorganTJ http://freeSound.org");
      super.hitAnyKey();
   }  
}


