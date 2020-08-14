public class SharedDigit {

    public static boolean hasSharedDigit(int number1, int number2) {
        if ((number1 >= 10) && (number1 <= 99) && (number2 >= 10) && (number2 <= 99)) {

            int lastDigitn1 = number1 % 10;
            int lastDigitn2 = number2 % 10;
            int firstDigitn1 = number1 / 10;
            int firstDigitn2 = number2 / 10;

            if((firstDigitn1 == firstDigitn2) || (lastDigitn1 == lastDigitn2) || (firstDigitn1 == lastDigitn2) || (firstDigitn2 == lastDigitn1)){
                return true;
            }else{
                return false;
            }

        }else{
            return false;
        }

    }
}

