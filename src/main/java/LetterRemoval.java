public class LetterRemoval {

//    5. Letter removal
//    Given a phrase and a letter (or series of letters) remove all occurrences of that letter(s) in the phrase.

    public static void main(String[] args) {

        String phrase = "Some string for test";
        String[] removeLetters = {"o", "t"};
        System.out.println(removeLetters(phrase, removeLetters));

    }

    public static String removeLetters(String phrase, String[] removeLetters){
        for (int i = 0; i < phrase.length(); i++) {
            for (int j = 0; j < removeLetters.length; j++) {
                if (phrase.substring(i, i+1).equals(removeLetters[j])) {
                    phrase = phrase.replaceAll(removeLetters[j], "");
                }

            }

        }
        return phrase;
    }
}



