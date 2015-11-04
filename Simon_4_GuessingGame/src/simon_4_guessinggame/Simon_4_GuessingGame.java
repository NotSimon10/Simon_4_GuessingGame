package simon_4_guessinggame;

import java.util.Random;
import java.util.Scanner;


public class Simon_4_GuessingGame {
    
    static String username;
    static int uguess;
    static int magicnumber;
    static Random random = new Random();
    static boolean playagain;
    static int guessesleft = 6;
    
    public static void main(String[] args) {
     
        Scanner name = new Scanner(System.in);
        System.out.println("Hello, would you like to play a game?");
        System.out.println("What's your name?");
        username = name.nextLine();
        magicnumber = random.nextInt(10);
        playagain = true;
        System.out.println("Hello " + username + "! Let us get on with the game, Shall We?");
        System.out.println("You will have 7 guesses.");
        
        if(guessesleft < 0) {
            System.out.println("Goodbye.");
            
            }
        
        else { while (guessesleft > 0) {
            playthegame();
           
            guessesleft --; 
            if(guessesleft > 0) {
            System.out.println("You have " + guessesleft + " guesses remaining.");
            }
    }
    }
    }
    
    static void playthegame() {
    Scanner guess = new Scanner(System.in);
    System.out.println("Please pick a number between 1 and 10.");
    uguess = guess.nextInt();
    if(magicnumber == uguess) {
        System.out.println("You Win!");
        playagain = false;
        System.out.println("You finished with " + guessesleft + " guesses left. Good Job!");
        guessesleft = -1;
        
    }
     else if (magicnumber > uguess) {
        System.out.println("Too Low!");
    } else {
        System.out.println("Too High!");
  
    }
    
    if(guessesleft < 0) {
        System.out.println("I can't belive you guessed " + magicnumber + "!");
    }
    
    else if(guessesleft == 1) {
        
        System.out.println("Game Over! The number was " + magicnumber + "!");
    }
    
    }
        
    }
    
    
       
    
