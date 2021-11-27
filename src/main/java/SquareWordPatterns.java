public class SquareWordPatterns {

//    7. Square word patterns
////    Given a word, print a square made from letter rotations of the word as in:
////    help
////    elph
////    lphe
////    phel

    public static void main(String[] args) {

        String word = "words";
        convertWord(word);

    }

    public static void convertWord(String someWord) {

        int len = someWord.length();

        StringBuilder sb;

        for (int i = 0; i < len; i++) {
            sb = new StringBuilder();

            int j = i;  // Текущий индекс в строке
            int k = 0;  // Текущий индекс временный

            for (int k2 = j; k2 < someWord.length(); k2++) {
                sb.insert(k, someWord.charAt(j));
                k++;
                j++;
            }
            j = 0;

            while (j < i) {
                sb.insert(k, someWord.charAt(j));
                j++;
                k++;
            }

            System.out.println(sb);
        }
    }

}




