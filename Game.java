
import java.util.Random;
import java.util.Scanner;

class Guess_The_Number {

    public int number;
    public int noOfGuesses = 0;
    int inputNumber;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    Guess_The_Number() {
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

    void takeUserInput() {
        System.out.println("Guess The Number :");
        Scanner sc = new Scanner(System.in);
         inputNumber = sc.nextInt();
    }

    // boolean isCorrect() {
    //     noOfGuesses++;
    //     if (inputNumber == number) {
    //         return true;
    //        // System.out.println("You Guess the right number in %d attemps", noOfGuesses);
    //     } else if (inputNumber < number) {
    //         System.out.println("TOO LESS!!!");
    //     } else if (inputNumber > number){
    //         System.out.println("TOO HIGH!!!");
    //     }
    //         return false;
    }
// }





public class Game {
    public static void main(String[] args) {
        Guess_The_Number g = new Guess_The_Number();
        boolean b = false;
        while (!b) {

            g.takeUserInput();
            b = g.isCorrect();
            System.out.println(b);
        }
    }
}

