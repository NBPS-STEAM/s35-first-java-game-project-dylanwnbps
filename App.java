import java.util.Scanner;
public class App {
    public static void main(String[] args) {
      // Ask user if they want to play 
        System.out.println("Adventure Through The Forest");
        System.out.println("Are you ready to start? (Y/N)");
        Scanner scanner = new Scanner(System.in); 
        String readyOrNot = scanner.next();
        if (!readyOrNot.equals("Y")) { // if statement
          System.out.println("OK! Try again when you're ready.");
          return;
        }
        // Asks user first question
        System.out.println("You reach a fork in the road. To the left is a dimly lit street and to the right is a forest. Which way will you go? (L/R)");
        String option1 = scanner.next();
        // Left or right
        if (option1.equals("L"))  { // comparing objects
          System.out.println("You head toward the dimly lit road. The lightbulbs flicker as a car starts to come up behind you. Do you keep walking, flag it down, or hide? (W/F/H)");
          String option2 = scanner.next(); 
          // action if player chooses to keep walking
          if (option2.equals("W")) {
          System.out.println("You continue on down the road and eventually reach the next city. Congrats on your survival.");
          }
          // action if player chooses to flag it down
          else if (option2.equals ("F")) { // else if statement
          System.out.println("The driver picks you up and you are kidnapped and never seen again. Game over.");
          return;
          }
          // action if player chooses to hide
          else {
          System.out.println("You hide until the car passes. You survived!");
          }
        }
        // action if player chooses to go right into the forest
        else {
          System.out.println("You branch out toward the forest. Oh no! You fell into a hole! Guess what color I have in mind so I can help you get out. You have three guesses before you die of starvation(Green/Yellow/Red/Purple");
          String colorGuess = scanner.next();
          // correct color to guess in order to live
          String correctColor = "Red";
          
          // three total chances before it switches the game
          int guesses = 1;
          int totalChance = 3;
          
         while (!colorGuess.equals(correctColor) && (guesses < totalChance)){ // while loop + compound boolean expression
            int remainingChance = totalChance - guesses;
            System.out.println("Wrong. If you can guess my number then I will save you. Pick a number 1-5.");
            int numberGuess = scanner.nextInt();
            int totalAvailableNumberGuess = 3;
            // correct number declared for the new game
            int correctNumber = 2;
            for (int i = 1; i < totalAvailableNumberGuess; i++) { // for loop and it's a nesting loop because it's within the while loop 
              if (numberGuess == correctNumber) {
            System.out.println("You got it right! You win.");
                 return;
              }
              // different actions based on the user's final input that shows they either win or lose.
            System.out.println("Wrong again. Please try again.");
            numberGuess = scanner.nextInt();
          }
            System.out.println("You have run out of attempts. Please try to guess the color again.");
          colorGuess = scanner.next();
          guesses ++;
          }
          if (colorGuess.equals(correctColor)){ // if else statement
          System.out.println("You got it right! You win!");
          }
         else { System.out.println("You died."); 
         return;

         }
       }
     }
    }