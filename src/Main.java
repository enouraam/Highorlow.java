import java.util.Scanner;
import java.util.Random;
class HighorLow {
    public static void main(String[] args) {
        Random generator = new Random();

        int targetNum = generator.nextInt(10) + 1;  // val is 1 to 10

        Scanner in = new Scanner(System.in);

        int guess = 0;

        boolean valid = true;

        String trash = "";

        do{
            System.out.print("Guess a number 1-10: ");

            if (in.hasNextInt() ){

                guess = in.nextInt();

                if (guess >= 1 && guess <= 10) {

                    int result = Integer.compare(guess, targetNum); // returns a switch case friendly value

                    switch (result) {

                        case 0:

                            System.out.println("Correct! You've guessed the number!");

                            break;

                        case 1:

                            System.out.println("Too high! Try again.");

                            break;

                        case -1:

                            System.out.println("Too low! Try again.");

                            break;
                    }

                    valid = true;

                }else{

                    System.out.println("'"+guess+"'"+" is not a valid input");

                    valid = false;
                }

            }else{

                trash = in.next();

                System.out.println("'"+trash+"'"+" is not a valid input");

                valid = false;
            }

        }while(!valid);
    }
}