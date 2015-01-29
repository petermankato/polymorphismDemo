import java.time.LocalDate;
// Java 7: import java.util.Date;

/**
 * <strong>Person.java</strong> - human 
 *
 * @author Peter K. Johnson - <a href="http://WebExplorations.com"
 *         target="_blank"> http://WebExplorations.com</a><br >
 *         Written: Sep 29, 2014<br >
 *         Revised: Sep 29, 2014<br>
 */

public class Person
{
  private String firstName = "";
  private String lastName = "";
  private String ssn = "";
  // Java 7: private Date dob = new Date( );
  // Java 8
  private LocalDate dob = LocalDate.now( );
  
  // Constructors
  public Person( ) { };
  
  public Person(String ssn)
  {
    this.ssn = ssn; 
  }
  
  public Person(String ssn, String firstName, String lastName, LocalDate dob)
  {
    this.ssn = ssn;
    this.firstName = firstName;
    this.lastName = lastName;
    this.dob = dob;
  }
  
  /**
  * toString( ) - Show the properties of a Person object
  */
 public String toString() {
    String result = "";
    result = String.format("*******  P E R S O N ****************\n");
    result += String.format("Name:  %s %s\n", firstName, lastName);
    result += String.format("SSN:  %s\n", ssn);
    result += String.format("Birthday: %s\n", dob.toString( ));
    result += String.format("**************************\n");
    return result;
 }

 // ================= SET METHODS ====================
  public void setFirstName(String fname) { firstName = fname; }
  public void setLastName(String lname) { lastName = lname; }
  public void setSSN(String ssn) { this.ssn = ssn; }
  public void setDOB(LocalDate dob) { this.dob = dob; }
  
  // ================= GET METHODS ====================
  public String getFirstName( ) { return firstName; } 
  public String getLastName( ) { return lastName; }   
  public String getSSN( ) { return ssn; }   
  public LocalDate getDOB( ) { return dob; }    
} // end of Person

