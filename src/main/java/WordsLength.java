import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class WordsLength {

//    4. Count words of each length
//    Count the number of words of each length in some text.


    public static void main(String[] args) {

         String input = "На на на три слова снова три на";
         calculateWords(input);

    }

    public static void calculateWords(String inputString){

        String[] words = inputString.split(" ");
        Map<Integer, Integer> occurencesMap = new HashMap<Integer, Integer>();
        for (String word : words) {
            int len = word.length();
            if (occurencesMap.get(len) == null) {
                occurencesMap.put(len, 1);
            } else {
                occurencesMap.put(len, occurencesMap.get(len) + 1);
            }
        }
        Iterator<Map.Entry<Integer, Integer>> entries = occurencesMap.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<Integer, Integer> entry = entries.next();
            System.out.println("Количество слов с длиной " + entry.getKey() + " = " + entry.getValue());
        }

    }

}
