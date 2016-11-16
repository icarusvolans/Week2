/**
 * Created by icarusvolans on 11/15/16.
 */
public class EnhancedLoops {

    // build a private static char array with the values a,b,c,d,e,f,g, and h
    private static char[] charArray = {'a','b','c','d','e','f','g','h'};

    public static void main(String[] args) {
        forloop();
        // call forLoop

        System.out.println(" ");
        System.out.println("---");
        // call enhancedForLoop
        enhancedForLoop();
    }

    /*    for (int myValue : myArray) {

            System.out.println(myValue);
    }
    */
    public static void forloop() {
        for(int i = 0; i < charArray.length ; i++) {
            System.out.println(charArray[i]);
            // create a method named 'forLoop' that prints out all the values of the char array using a standard for-loop

        }

        // create a method named 'enhancedForLoop' that prints out all the values of the char array using an enhanced for-loop

    }
    private static void enhancedForLoop() {
        for (char myValue : charArray) {
            System.out.println(myValue);
        }
    }

}
