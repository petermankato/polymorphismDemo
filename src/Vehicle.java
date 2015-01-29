import java.io.*;
import java.util.Scanner;
import sun.audio.*;
/**
 * <strong>Vehicle.java</strong> - A general default vehicle
 *
 * @author Peter K. Johnson - <a href="http://WebExplorations.com"
 *         target="_blank"> http://WebExplorations.com</a><br >
 *         Written: Oct 4, 2014<br >
 *         Revised: Oct 4, 2014<br>
 */
public class Vehicle
{

   // ================== PROPERTIES ===========================
   private float direction = 0.0F; // 0=north 90=east 180=south 270=west
   private int mileage = 0;
   private int speed = 0;
   private boolean isMoving = false;
   private Person driver = new Person( );

   // ================= CONSTRUCTOR METHODS ====================
   // default constructor
   public Vehicle()  
   { 
      System.out.println("******************\nI am a vehicle.");  
   }

   public Vehicle(int mileage)
   {
      System.out.println("******************\nI am a vehicle.");  
      this.mileage = mileage;
   }

    /**
    * toString( ) - Show the properties of a vehicle object
    */
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
     playSound("toyCarHorn.wav", "Toy Car Horn Recording from: BeatsByCasper http://freeSound.org");
     this.hitAnyKey();
   }
   
   public void drive( )
   {
      isMoving = true;
      playSound("toyCar2.wav", "Toy Car Driving Recording from: AnnaBloom http://freeSound.org");
      this.hitAnyKey();
   }
   
  /* http://alvinalexander.com/java/java-audio-example-java-au-play-sound
   * Creative Commons sounds: http://www.freesound.org
   */
   public void playSound(String thisSound, String description)
   {
         try {     
      // Open the sound file as a Java input stream
      InputStream in = new FileInputStream(thisSound);
       // create an audioStream from the inputStream
      AudioStream audioStream = new AudioStream(in);
      // Play the audio clip with the audioPlayer class
      AudioPlayer.player.start(audioStream);
      System.out.println(description); 
      }
         catch(FileNotFoundException e)
         {
            System.out.println(thisSound + " cannot be found." + e);             
         }
         catch(IOException e)
         {
              System.out.println(thisSound + " is not a valid sound file." + e); 
         }
         catch(Exception e)
         {
            System.out.println("There was an error: " + e);
         }       
   }// end of playSound( )

   public void hitAnyKey( )
   {
      Scanner keyIn = new Scanner(System.in);
      System.out.println("Click here and hit ENTER to continue.");
      keyIn.nextLine( );
   }

   // ================= GET METHODS ====================
   public float getDirection( ){ return direction; }   
   public int getMileage( ){ return mileage; }   
   public int getSpeed( ){ return speed; }   
   public boolean getIsMoving( ){ return isMoving; }   
   public Person getPerson( ){ return driver; }
   
   // ================= SET METHODS ====================
   public void setDirection(float direction) {this.direction = direction;}
   public void setMileage(int mileage) {this.mileage = mileage;}
   public void setSpeed(int speed) {this.speed = speed;}
   public void setIsMoving(boolean isMoving) {this.isMoving = isMoving;}
   public void setPerson(Person person) { driver = person; }
} // end of Vehicle


