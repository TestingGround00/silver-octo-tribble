import java.util.*;

public class Main {
  public static void main(String[] args) {
    
    Scanner scnr = new Scanner(System.in);
    int puedecCapacity = 0;
        
    String spa_nameString = null;

    System.out.print("Enter capacity of the Puedec: ");
        puedecCapacity = scnr.nextInt();

    Puedec puep = new Puedec(puedecCapacity);
    
    System.out.print("Enter a string to add: ");
        spa_nameString = scnr.next();
                            
    if(puep.addPue(spa_nameString)) {
        
        System.out.println("Your " + spa_nameString + " was successfully added!");
    }
  }

}
