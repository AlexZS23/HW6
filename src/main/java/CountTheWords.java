import java.util.Scanner;

public class CountTheWords {

//    3. Count the words in some text


    public static void main(String[] args) {

        Scanner text = new Scanner(System.in);
        System.out.println("Введите предложение для подсчета слов");
        String inputText = text.nextLine();
        System.out.println("Количество слов в строке = "+ countOfWords(inputText));

    }

    public static Integer countOfWords(String someString) {

        boolean isWord = false;
        int endOfLine = someString.length() - 1;
        char[] characters = someString.toCharArray();
        int wordCount = 0;

        for (int i = 0; i < characters.length; i++) {
            if (Character.isLetter(characters[i]) && i != endOfLine) {
                isWord = true;
            } else if (!Character.isLetter(characters[i]) && isWord) {
                wordCount++;
                isWord = false;
            } else if (Character.isLetter(characters[i]) && i == endOfLine) {
                wordCount++;
            }
        }
            return wordCount;
    }
}
