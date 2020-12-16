import java.util.*;
public class App {
    public static void main(String[] args) {
        System.out.println("Adventure Through The Forest");
        System.out.println("Are you ready to start? (Y/N)");
        Scanner scanner = new Scanner(System.in);
        String readyOrNot = scanner.next();
        if (!readyOrNot.equals("Y")) {
          System.out.println("OK! Try again when you're ready.");
          return;
        }
        System.out.println("You reach a fork in the road. To the left is a dimly lit street and to the right is a forest. Which way will you go? (L/R)");
        String option1 = scanner.next();
        if (option1.equals("L"))  {
          System.out.println("You head toward the dimly lit road. The lightbulbs flicker as a car starts to come up behind you. Do you keep walking, flag it down, or hide? (W/F/H)");
          String option2 = scanner.next();



        }
        else {
          System.out.println("You branch out toward the forest. Oh no! You fell into a hole! Guess what I have in mind so I can help you get out.");

        }
        
        
    }
}
