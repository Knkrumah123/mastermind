import java.util.Scanner;
import java.util.Random;

public class masteruser
{
      // main method to run game
      public static void main (String[] args){
       
             inputGuess();
       
       
       }
      
 
      
        
      public static void inputGuess(){
      
           
           
          int guesses=0;// The user's gues
          int redPegs=0; //initialize number of redpegs
          int whitePegs=0;//initalize number of white pegs
          int maxGuesses=10;//maximum ammaount of guess attempt
          
          //Create an instance of Random class
          Random ran = new Random();

      
          String colors[]= {"G","B","Y","R","O","P"};

         //initialize the string code 
         String code = "";
         String randomColor;

         /* for loop to generate a 4 letter string random color without any duplicate 
         letter(colors)*/
       
         for (int i = 0; i < 4; i++){
          
           do{
               
               randomColor=colors[ran.nextInt(6)];

           }while(code.contains(randomColor));

           
           code+=randomColor;
         }



       //print code
       //System.out.println(code);
           
           
             // int guesses=0;//amount of guesses
        
             Scanner keyboard= new Scanner(System.in);
            
            
             System.out.println("Secret code has been simulated.");
             System.out.println("Pick four colors to put in each hole.");
             System.out.println("Choices are B for blue,G for green, O for orange,");
             System.out.println("R for red,P for purple and Y for yellow.");
             System.out.println("Enter your guess in a string format.");   
      
             // use user enters guess
             System.out.print("Enter your guess: ");
             String guess = keyboard.nextLine().toUpperCase();
             guesses++;
                
                 // loop to keep count of number of white and red pegs 
                for(int i = 0; i < 4; i++){
                         int x = code.indexOf(guess.charAt(i));
                             if(x != -1){
                                if(x == i) redPegs++;
                                else whitePegs++;
                              }
                         }
                 
                 /*for each red peg and white peg keep a running total of astericks
                 to let the user know how many reg pegs and white pegs
                  that the user has*/
                 System.out.print("Red pegs:");
                 for(int i = 0; i < redPegs; i++) System.out.print("*");
                 System.out.print("\nWhite pegs:");
                 for(int i = 0; i < whitePegs; i++) System.out.print("*");
                     
                  redPegs = 0;
                  whitePegs = 0;   
             
            do{
       
              
              // if the guess and code are the same
              if(guess.compareTo(code) == 0){
                  // print results
                  System.out.println("Congradualtions you guessed the right colors.");
                  System.out.println("Red pegs:****");
                  System.out.println("White pegs:");
                  guesses=maxGuesses;
                   
   
                  // System.out.print("Do you want to enter another(y=yes) quit(anything else)?");
                  // again=keyboard.nextLine();
              }
   
                 // if the guess and code are not the same
                 if(guess.compareTo(code) != 0) {
                     // enter another guess
                     System.out.print("\nEnter another guess: ");
                     guess = keyboard.nextLine().toUpperCase();
                     guesses++;
                     
                     for(int i = 0; i < 4; i++){
                      int x = code.indexOf(guess.charAt(i));
                          if(x != -1){
                             if(x == i) redPegs++;
                             else whitePegs++;
                           }
                      }
              
                     System.out.print("Red pegs:");
                     for(int i = 0; i < redPegs; i++) System.out.print("*");
                     System.out.print("\nWhite pegs:");
                     for(int i = 0; i < whitePegs; i++) System.out.print("*");
                     
      
                 }   
                  while (guess.length()!=4 && guess!= null) {
                    System.out.print("Enter a four letter string as your guess: ");
                    guess = keyboard.nextLine().toUpperCase();
                    
                  }
                   
              
            
              // if statement for if the max guesses are up
              if (guesses==maxGuesses){
                  if(guess.compareTo(code) == 0){
                     
                     System.out.print("You have guesed the correct code");
                     
                  }
                   //if user enters the corrrect code 
                   if(guess.compareTo(code) != 0){
                     
                     
                     System.out.print("Sorry you are out of guesses");
                     
                  
                  }
                  
                 
                  
              }
               redPegs = 0;
               whitePegs = 0;
          }
          while(guesses<maxGuesses);
              
           
      }
      
  
 }
      
