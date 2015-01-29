/**
 * <strong>Auto.java</strong> - An auto vehicle
 *
 * @author Peter K. Johnson - <a href="http://WebExplorations.com"
 *         target="_blank"> http://WebExplorations.com</a><br >
 *         Written: Oct 12, 2014<br >
 *         Revised: Oct 12, 2014<br>
 */
public class Auto extends Vehicle
{
   // ================== PROPERTIES ===========================
   private float direction = 0.0F; // 0=north 90=east 180=south 270=west
   private int mileage = 0;
   private int speed = 0;
   private boolean isMoving = false;
   private Person driver = new Person( );
   private String make = "";
   private String model = "";
   private String year = "";
   private String vin = "";

   // ================== CONSTRUCTORS ===========================

   public Auto() 
   { 
      System.out.println("I am an automobile.\n******************");  
   }
   
   public Auto(String vin)
   {
      this.vin = vin;
      System.out.println("I am an automobile with a vin of" + vin + ".\n******************");  
   }
   
   public String toString() {
      String result = "";
      result = String.format("***** %s *********************\n", this.getClass().getSimpleName() );
      result += String.format("Mileage:  %s\n", mileage);
      result += String.format("Speed:  %s\n", speed);
      result += String.format("Is Moving: %s\n", isMoving);
      result += String.format("Direction: %.0f degrees.\n", direction);
      result += String.format("Driver is: %s %s.\n", driver.getFirstName( ), driver.getLastName());
      return result;
   }

   public void soundHorn( )
   {
     playSound("carHorn2.wav", "AUTO Horn Recording from: KewelDog http://freeSound.org");
     hitAnyKey();
   }
   
   public void drive( )
   {
      setIsMoving(true);
      playSound("car.wav", "AUTO driving Recording from: MonoTraum http://freeSound.org");
      super.hitAnyKey();
   }
   // ================= GET METHODS ====================
   public float getDirection( ){ return direction; }   
   public int getMileage( ){ return mileage; }   
   public int getSpeed( ){ return speed; }   
   public boolean getIsMoving( ){ return isMoving; }   
   public Person getPerson( ){ return driver; }
   public String getMake( ){ return make; }   
   public String getModel( ){ return model; }   
   public String getYear( ){ return year; }   
   public String getVin( ){ return vin; }  
   
   // ================= SET METHODS ====================
   public void setDirection(float direction) {this.direction = direction;}
   public void setMileage(int mileage) {this.mileage = mileage;}
   public void setSpeed(int speed) {this.speed = speed;}
   public void setIsMoving(boolean isMoving) {this.isMoving = isMoving;}
   public void setPerson(Person person) { driver = person; } 
   public void setMake(String make)   {this.make  = make;}
   public void setModel(String model) {this.model = model;}
   public void setYear(String year)   {this.year  = year;}
   public void setVin(String vin)     {this.vin   = vin;}
}


