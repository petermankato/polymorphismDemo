/**
 * <strong>Bus.java</strong> - A bus vehicle
 *
 * @author Peter K. Johnson - <a href="http://WebExplorations.com"
 *         target="_blank"> http://WebExplorations.com</a><br >
 *         Written: Oct 4, 2014<br >
 *         Revised: Oct 4, 2014<br>
 */

public class Bus extends Vehicle
{
   public Bus() 
   { 
      System.out.println("I am also a bus.\n******************");  
   }
   
   public void soundHorn( )
   {
      playSound("busHorn.wav", "BUS horn recording from: Dobroide http://freeSound.org");
     super.hitAnyKey();
   }
   
   public void drive( )
   {
      setIsMoving(true);
      playSound("busDriving.wav", "BUS driving recording from: Dobroide http://freeSound.org");
      super.hitAnyKey();
   } 
}


