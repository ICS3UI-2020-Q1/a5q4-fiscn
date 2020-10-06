import java.util.Scanner; 

/**
 * calculate intrest rate for number inputed by user
 * @author Neil Fischer
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //Create scanner for user input 
    Scanner input = new Scanner(System.in); 

    //prompt user to enter in starting balance and create variable for balance and total at end
    System.out.println("Please enter starting balance"); 
    double balanceN = input.nextDouble(); 
    double totalN = 1;

    //prompt the user to enter they're intrest rate and create variable for intrest rate 
    System.out.println("Please enter intrest rate"); 
    double intrestN = input.nextDouble(); 
    intrestN = intrestN / 100; 

    //prompt the user to enter the number of years they will be investing and create variable for years 
    System.out.println("Please enter how many years you will be investing"); 
    int yearsN = input.nextInt(); 

    //create loop to calculate their intrest after the years typed by user 
    for(double count = 1; count <= yearsN; count++){
      balanceN = balanceN * intrestN + balanceN;   
    } 
    
    //create line for total
     System.out.print("Your final balance would be " + balanceN);
  }
}
