import java.util.Scanner;

public class RandomString {

//    Write a method that accepts two parameters: mode of type String and length of type int.
//    This function should return a randomly generated string of given length according to the specified mode.
//    Modes: alpha, numeric, alphanumeric
//    Output —> String.

    public static void main(String[] args) {

        Scanner inputValues = new Scanner(System.in);
        System.out.println("Enter one of the proposed modes (alpha or numeric or alphanumeric)");
        String mode = inputValues.nextLine();
        System.out.println("Enter the requested length ");
        int lengthOfString = inputValues.nextInt();

        System.out.println(checkerIf(mode, lengthOfString));

    }

    public static String checkerIf(String mode, int lenOfString){

        String defaultValue = "Your mode doesn't match with any proposed";
        String result = "Your random string is ";

        if (mode.equals("alpha")){
            result = result + randomAlphaString(mode, lenOfString);
        }else if(mode.equals("numeric")){
            result = result + randomNumericString(mode, lenOfString);
        }else if(mode.equals("alphanumeric")){
            result = result + randomCombiString(mode, lenOfString);
        }else {
            result = defaultValue;
        }
        return result;
    }

    public static String randomAlphaString(String modeType, int lenOfString){

        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        char[] alphaChar = alpha.toCharArray();
        int temp;

//        заменил на toCharArray()
//        for (int i = 0; i < alpha.length(); i++) {
//            alpha1[i] = alpha.charAt(i);
//        }

        char[] alphaFinal = new char[lenOfString];

        for (int i = 0; i < lenOfString; i++){
            temp = (int) (Math.random() * (alphaChar.length));
            alphaFinal[i] = alphaChar[temp];

        }
        String result = String.valueOf(alphaFinal);
        String finalResult = result.substring(0, lenOfString);

        return finalResult;

    }

    public static String randomNumericString(String modeType, int lenOfString){

        char[] numberValue = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        int temp;
        char[] fin = new char[lenOfString];

        for (int i = 0; i < lenOfString; i++){
            temp = (int) (Math.random() * (numberValue.length));
            fin[i] = numberValue[temp];

        }
        String result = String.valueOf(fin);

        return result.substring(0, lenOfString);

    }
    public static String randomCombiString(String modeType, int lenOfString){
        String combi = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        char[] combiChar = combi.toCharArray();
        int temp;

//        for (int i = 0; i < combi.length(); i++) {
//            combi1[i] = combi.charAt(i);
//        }

        char[] combiFinal = new char[lenOfString];

        for (int i = 0; i < lenOfString; i++){
            temp = (int) (Math.random() * (combiChar.length));
            combiFinal[i] = combiChar[temp];

        }
        String result = String.valueOf(combiFinal);

        return result.substring(0, lenOfString);
    }
}

