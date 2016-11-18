package day2;

import java.util.*;

/**
 * Created by icarusvolans on 11/15/16.
 */
public class Day2FixEnhancedForLoop {
    private static int[][] twoDArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    private static int[][][] threeDArray =
            {  { {1,   2,  3}, { 4,  5,  6}, { 7,  8,  9} },
                    { {10, 11, 12}, {13, 14, 15}, {16, 17, 18} },
                    { {19, 20, 21}, {22, 23, 24}, {25, 26, 27} } };

    public static List<int[]> arrayHolder = new ArrayList<int[]>();
    public static List<int[]> arrayOneHolder = new ArrayList<int[]>();
    public static List<int[]> arrayTwoHolder = new ArrayList<int[]>();
    public static List<int[]> arrayThreeHolder = new ArrayList<int[]>();
    public static List<List<Integer>> arrayAllThreeHolder = new ArrayList<List<Integer>>();


    public static void main(String[] args) {
        Day2FixEnhancedForLoop d = new Day2FixEnhancedForLoop();
        printTwoDArray();
        d.initializeNumberHolder();
        d.EnhancedPrintTwoDArray();
        printThreeDArray();
        d.initializeNumberHolder3();
        EnhancedPrintThreeDArray();
    }


    private void initializeNumberHolder() {
        System.out.println("populating arrays");
        arrayHolder.add(new int[]{1, 2, 3});
        arrayHolder.add(new int[]{4, 5, 6});
        arrayHolder.add(new int[]{7, 8, 9});
        System.out.println("arrays populated");

    }

    private void initializeNumberHolder3() {
        System.out.println("populating arrays");
        arrayOneHolder.add(new int[]{1, 2, 3});
        arrayOneHolder.add(new int[]{4, 5, 6});
        arrayOneHolder.add(new int[]{7, 8, 9});

        arrayTwoHolder.add(new int[]{10, 11, 12});
        arrayTwoHolder.add(new int[]{13, 14, 15});
        arrayTwoHolder.add(new int[]{16, 17, 18});

        arrayThreeHolder.add(new int[]{19, 20, 21});
        arrayThreeHolder.add(new int[]{22, 23, 24});
        arrayThreeHolder.add(new int[]{25, 26, 27});
        System.out.println("arrays populated");

    }

    private static void printTwoDArray() {
        System.out.println("Printing out 2D Array with standard for-loop:");
        for(int i = 0; i < twoDArray.length; i++) {
            int[] secondDArray = twoDArray[i];
            String secondDPrint = "";
            for(int j = 0; j < secondDArray.length; j++) {
                secondDPrint += secondDArray[j]+" ";
            }
            System.out.println(secondDPrint);
        }
    }

    private static void EnhancedPrintTwoDArray() {
        System.out.println("Printing out 2D Array with ENHANCED for-loop:");

        for (int[] myValue : arrayHolder) {
            for (int i : myValue){

            System.out.println(i);
            }
        }

    }

    private static void printThreeDArray() {
        System.out.println("Printing out 3D Array with standard for-loop:");
        for(int i = 0; i < threeDArray.length; i++) {
            int[][] secondDArray = threeDArray[i];
            for(int j = 0; j < secondDArray.length; j++) {
                int[] thirdDArray = secondDArray[j];
                String thirdDPrint = "";
                for(int k = 0; k < thirdDArray.length; k++) {
                    thirdDPrint += thirdDArray[k]+" ";
                }
                System.out.println(thirdDPrint);
            }
        }
    }

    private static void EnhancedPrintThreeDArray() {
        System.out.println("Printing out 3D Array with ENHANCED for-loop:");

        for (int[][] myValue : threeDArray) {
            for (int[] i : myValue){
                for (int j : i){
                    System.out.println(j);
                }


            }
        }

    }
}