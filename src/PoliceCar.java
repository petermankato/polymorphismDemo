/**
 * <strong>PoliceCar.java</strong> - A police car vehicle
 *
 * @author Peter K. Johnson - <a href="http://WebExplorations.com"
 *         target="_blank"> http://WebExplorations.com</a><br >
 *         Written: Oct 4, 2014<br >
 *         Revised: Oct 4, 2014<br>
 */

public class PoliceCar extends Vehicle
{
   public PoliceCar() 
   { 
      System.out.println("I am also a police car.\n******************");  
   }
   
   public void soundHorn( )
   {
     playSound("siren2.wav", "POLICE CAR siren Recording from: FatLane http://freeSound.org");
     super.hitAnyKey();
   }
   
   public void drive( )
   {
      setIsMoving(true);
      playSound("car.wav", "POLICE CAR driving Recording from: MonoTraum http://freeSound.org");
      super.hitAnyKey();
   } 
}


