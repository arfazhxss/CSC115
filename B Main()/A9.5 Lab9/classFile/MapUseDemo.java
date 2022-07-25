import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import java.util.Iterator;

public class MapUseDemo{

    public static List<String> readFile(String filename, String delimiter) {
        List<String> listOfWords = new LinkedList<String>();

        File infile;
        Scanner instream;

        try {
            infile = new File(filename);
            instream = new Scanner(infile);
            instream.useDelimiter(delimiter);
        } catch (FileNotFoundException exp) {
            System.out.println("filename does not exist in this folder");
            return listOfWords; // return empty list
        }

        String line = "";
        String[] words = null;
        while (instream.hasNext()) {
            line = instream.nextLine();
            words = line.split(delimiter);
            for (String word: words) {
                listOfWords.add(word);
            }
        }
        return listOfWords;
    }

    public static void main(String[] args) {
        // Q1. what does readFile do?
        List<String> emailInfoWords = readFile("emailInfo.csv", ",");
        List<String> smallFileWords = readFile("small.txt", " ");
        List<String> happyFileWords = readFile("happy.txt", " ");

        System.out.println("\n\n emails:\n" + emailInfoWords + "\n");

        System.out.println("\n small file:\n" + smallFileWords + "\n");

        System.out.println("\n happy file:\n" + happyFileWords + "\n");
    }

    /* Q2.
     * Design a method that takes a list of strings that contains
     * names and email addresses.
     * The method should create and return a map of name keys to email values
     * populated from the given list of strings.
     * Use an iterator to go through the list.
     */


    /* Q3.
     * Design a method that takes a list of strings that contains words.
     * The method should create and return a map where the keys are the words
     *  and the values are the number of occurrences of the word in the list
     *  populated from the given list of strings.
     * Use an iterator to go through the list.
     */

}
