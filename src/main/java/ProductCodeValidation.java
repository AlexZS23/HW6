import java.util.Arrays;

public class ProductCodeValidation {

//    6. Product code validation eg: AX6BYU56UX6CV6BNT7NM 287430
//            1st part can contain only capital letters and 6 digits. 2nd part is all digits and = the product of the
//    first 6 digits taken in groups of two from the left. Eg 65*66*67 = 287430.

    public static void main(String[] args) {

        String yourCode = "AX6BYU56UX6CV6BNT7NM 287430";
        checkProductCode(yourCode);

    }

    public static void checkProductCode(String productCode) {

        boolean checkFirstBlock;

//        Проверяем код на наличие пробела
        int ind = productCode.indexOf(" ", 0);
        if (ind == -1) {
            System.out.println("Код продукта должен содержать пробел между первым и вторым блоком");
        } else {
            checkFirstBlock = true;

            String[] lenTwo = productCode.split(" ");
            String firstString = productCode.split(" ")[0];
            String secondString = productCode.split(" ")[1];

//        Проверяем содержит ли код две строки
            if (lenTwo.length > 2) {
                checkFirstBlock = false;
                System.out.println("Код продукта должен состоять из двух блоков");
            } else {
                checkFirstBlock = true;
            }

//        Проверяю первую часть на символы
            if (firstString.matches("[A-Z0-9]+")) {
            } else {
                checkFirstBlock = false;
                System.out.println("Код продукта содержит недопустимые символы");
            }

//        Ищем цифры в первой части и проверяем на к-во = 6
            char[] firstChar = firstString.toCharArray();
            int countLetters = 0;

            if (checkFirstBlock) {
                for (int i = 0; i < firstChar.length; i++) {
                    if (Character.isLetter(firstChar[i])) {
                        countLetters++;
                    }
                }
                if (firstChar.length - countLetters == 6) {
                    checkFirstBlock = true;
                } else {
                    checkFirstBlock = false;
                    System.out.println("Первая часть строки кода должна содержать 6 цифр");
                }
            }

            if (checkFirstBlock) {
                int forCalculateNumber = Integer.parseInt(firstString.replaceAll("[^0-9]", ""));
                String forCalculate = Integer.toString(forCalculateNumber);
                int secondBlock = Integer.parseInt(forCalculate.substring(0, 2)) * Integer.parseInt(forCalculate.substring(2, 4)) * Integer.parseInt(forCalculate.substring(4, 6));

                if (secondBlock == Integer.parseInt(secondString)) {
                    System.out.println("Код продукта корректный");
                } else {
                    System.out.println("Второй блок кода некорректный");
                }
            }
        }
    }
}







