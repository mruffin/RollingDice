//Margie Ruffin
//Software Engineering


/* This program rolls two dice 36,000 times
    and records how often a certain sum
    occurs when the two faces are added.

    The results are displayed in a table
    with the SUM and number of RECURRENCES.
 */


//import the Java Random Lib
import java.util.Random;


public class Main {

    public static void main(String[] args) {




        //create an instance of the Random Class
        Random randomRoll = new Random();


        //iitalize a 1D array with the same number of indexes
        //as possible sum outcomes
        int OUTCOMES = 13;
        int sums[] = new int[OUTCOMES];


        //create the dice (faces)
        int die1;
        int die2;


        //initialize the array to zeros
        for(int i = 0; i < sums.length; i++)
        {
            sums[i] = 0;

        }


        //

        for(int rolls = 1; rolls <= 36000; rolls++){

            //roll the first die
            die1 = 1+ randomRoll.nextInt(6);

            //roll the second
            die2 = 1 + randomRoll.nextInt(6);

            //pass the two ints to the sum function to calculate total
            int total = sum(die1, die2);

            //incirment the frequency of the sum in its respective index in the array
            sums[total]++;

        }

        //print out the header for the table
        System.out.printf("%s%12s\n", "SUM", "RECURRENCE");



        //print out the results from the array.
        //the sum outcome first
        //the number of times the outcome was given in the 36,000 rolls
        for(int i = 2; i < sums.length; i++){
            System.out.printf("%3d%12d\n", i, sums[i]);
        }

    }


    //this function adds the two ints (faces of the dice)
    public static int sum(int die1, int die2){

        int total = die1 + die2;

         return total;

    }
}
