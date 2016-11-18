package day2;
import java.util.*;
/**
 * Created by icarusvolans on 11/16/16.
 */


public class OddArray {
    private List<int[]> arrayHolder = new ArrayList<int[]>();

    public static void main(String[] args) {
        OddArray oddArray = new OddArray();
        oddArray.initializeNumberHolder();
        oddArray.checkOddArrays();
    }

    private void initializeNumberHolder() {
        System.out.println("populating arrays");
        arrayHolder.add(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,16,18,19});
        arrayHolder.add(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18});
        arrayHolder.add(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17});
        arrayHolder.add(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16});
        arrayHolder.add(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15});
        arrayHolder.add(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14});
        arrayHolder.add(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13});
        arrayHolder.add(new int[]{1,2,3,4,5,6,7,8,9,10,11,12});
        arrayHolder.add(new int[]{1,2,3,4,5,6,7,8,9,10,11});
        arrayHolder.add(new int[]{1,2,3,4,5,6,7,8,9,10});
        arrayHolder.add(new int[]{2,3,4,5,6,7,8,9,10});
        arrayHolder.add(new int[]{3,4,5,6,7,8,9,10});
        arrayHolder.add(new int[]{4,5,6,7,8,9,10});
        arrayHolder.add(new int[]{6,7,8,9,10});
        arrayHolder.add(new int[]{7,8,9,10});
        arrayHolder.add(new int[]{8,9,10});
        System.out.println("arrays populated");
    }

    private void checkOddArrays() {
        for (int[] tt : arrayHolder) {
            for (int i : tt) {
                System.out.println(i);

            }
            System.out.println("Array Length tt: " + tt.length);
            boolean isOdd = false;
            boolean isOddSum = false;
            boolean bothOdd = false;

            if (tt.length % 2 != 0) {
                isOdd = true;
            }
            System.out.println("isOdd: " + isOdd);

            int sum = 0;
            for (int i = 0; i < tt.length; i++) {
                sum += tt[i];
                if (tt.length % 2 != 0) {
                    isOddSum = true;
                }

            }
            System.out.println("isOddSum: " + isOddSum);
            if(isOdd && isOddSum == true) {
                System.out.println("ODD MATCH");
            }else{
                System.out.println("REJECTED");

            }


            //loop through the ArrayList and pull out the int[]s
            //As you pull out each int[], check the count for odd
            // and the sum for odd
            // TODO: add the logic
            //if both are odd, print "ODD MATCH", else print "REJECTED"
            // TODO: add the logic
        }
    }

    private boolean isOddCount(int[] numHolder) {
        // count the number of ints in the int[]
        // if odd, return true, else return false
        boolean isOdd = false;
        // TODO: add the logic
        return isOdd;
    }

    private boolean isSummedOdd(int[] numHolder) {
        // sum the ints in the int[]
        // if they equal an odd number, return true, else return false
        boolean isOdd = false;
        // TODO: add the logic
        return isOdd;
    }
}