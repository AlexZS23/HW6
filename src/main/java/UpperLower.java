import java.util.Scanner;

public class UpperLower {

//    1. Upper/Lower case change
//    Change given text into all upper case or lower case or change the first letter of each word
//    (or sentence) to upper and the rest to lower, etc.

    public static void main(String[] args) {

        Scanner text = new Scanner(System.in);
        System.out.println("Введите строку для преобразования");
        String inputText = text.nextLine();

        System.out.println(allToLower(inputText));
        System.out.println(allToUpper(inputText));
        System.out.println(firstToLow(inputText));
        System.out.println(firstToUp(inputText));
        System.out.println(firstAllToLow(inputText));
        System.out.println(firstAllToUp(inputText));

    }

    public static String allToLower(String someString){

        return someString.toLowerCase();

    }

    public static String firstToLow(String someString){

        return someString.substring(0, 1).toLowerCase() + someString.substring(1);

    }

    public static String firstAllToLow(String someString){

        String result = "";
        String space = " ";

        result = result + someString.substring(0, 1).toLowerCase();

        for (int i = 1; i < someString.length(); i++) {
            if (space.equals(someString.substring(i-1, i))){
            result = result + someString.substring(i, i+1).toLowerCase();
        }else {
                result = result + someString.substring(i , i+1);
            }
        }
        return result;

    }

    public static String allToUpper(String someString){

        return someString.toUpperCase();
    }

    public static String firstToUp(String someString){

        return someString.substring(0, 1).toUpperCase() + someString.substring(1);

    }
    public static String firstAllToUp(String someString){

        String result = "";
        String space = " ";

        result = result + someString.substring(0, 1).toUpperCase();

        for (int i = 1; i < someString.length(); i++) {
            if (space.equals(someString.substring(i-1, i))){
                result = result + someString.substring(i, i+1).toUpperCase();
            }else {
                result = result + someString.substring(i , i+1);
            }
        }
        return result;

    }

}
