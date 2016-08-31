// program to counts the number of word occurences in a string
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;

public class WordTypeCount
{
    public static void main(String[] args)
    {
        Map<String, Integer>myMap = new HashMap<String, Integer>();

        createMap(myMap);
        displayMap(myMap);
    }

    private static void createMap(Map<String, Integer> map)
    {
        System.out.println("Enter a String: ");
        Scanner myScanner = new Scanner(System.in);
        String inputString = myScanner.nextLine();

        // tokeninze using space character
        String[] tokens = inputString.split(" ");

        for (String token : tokens)
        {
            // get the lowercase word
            String word = token.toLowerCase();

            if (map.containsKey(word))
            {
                int count = map.get(word);
                map.put(word, count + 1);
            }
            else
            {
                // first time occurence
                map.put(word, 1);
            }
        }
    }

    public static void displayMap(Map<String, Integer>map)
    {
        Set<String> keys = map.keySet();

        // sort keys
        TreeSet<String> sortedKeys = new TreeSet<String>(keys);

        System.out.println("Map contains: \n key \t value\n");

        // generate output for each key in map
        for (String key : sortedKeys )
        {
            System.out.printf("%-10s%10s\n", key, map.get(key));
        }

        System.out.printf("\nsize: %d\nIsEmpty: %b\n", map.size(), map.isEmpty());
    }

}
