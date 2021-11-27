public class CountLetters {

//    2. Count letters
//    Count the single character frequencies

    static final int maxValue = 65536;

    public static void main(String[] args) {

        String inputString = "тестовое";
        singleCharacter(inputString);

    }

    public static int[] singleCharacter(String someString){

        int count[] = new int[maxValue];
        int len = someString.length();

        for (int i = 0; i < len; i++)
            count[someString.charAt(i)]++;

        char ch[] = new char[someString.length()];
        for (int i = 0; i < someString.length(); i++) {
            ch[i] = someString.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++) {

                if (someString.charAt(i) == ch[j])
                    find++;
            }
            if (find == 1)
                System.out.println("Count the single character " + someString.charAt(i) + " = " + count[someString.charAt(i)]);
        }
        return count;
    }
}
