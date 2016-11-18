package day2;
import java.util.Scanner;
/**
 * Created by icarusvolans on 11/16/16.
 */
public class DoWhile {
    Scanner scanner = new Scanner(System.in);
    int start = scanner.nextInt();


    public static void main(String args[]) {
        System.out.println("Please type a number between 1 and 25: ");

        DoWhile d = new DoWhile();


        d.whileLoop(); // call the whileLoop method
        System.out.println();
        d.dowhileLoop();
        //call the doWhileLoopMethod
    }

    public void whileLoop(){
        while(start > 0) {
            System.out.println("While loop: " + start);
            start--;
        }
    }

    public void dowhileLoop(){
        do {
            System.out.println("Do While loop: " + start);
            start--;

        }while( start > 0 );

    }

    // create a new method called 'whileLoop' that takes an int called 'start' from the command line
    // create a while loop that iterates from start to zero and prints out the result

    // create a new method called 'doWhileLoop' that takes an int called 'start' from the command line
    // create a do-while loop that iterates from start to zero and prints out the result
}
