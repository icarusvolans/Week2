package day2;
import java.util.*;
/**
 * Created by icarusvolans on 11/18/16.
 */
public class HashMaps {

    public static HashMap<String,String> names = new HashMap<String,String>();

    public static void main(String[] args){
        HashMaps h = new HashMaps();
        addElement();
        getValue();
        printAllElements();

    }


    // add another key,value to the HashMap
    public static void addElement() {
        //TODO: logic here
        names.put("apple", "orange"); // Create a new HashMap named names that holds String,String
        names.put("black","white");
        names.put("hot","cold");
        names.put("up","down");
    }

    // get a value from the HashMap at a specific key
    public static String getValue() {
        System.out.println(names.get("apple")); //outputs 113
       //TODO: logic here
        return ""; // DELETE ME
    }

    // print out all the Strings in the HashMap
    public static void printAllElements() {
        for(String key : names.keySet()) {
            System.out.println(key+" is "+names.get(key));
        }//TODO: logic here
    }
}
