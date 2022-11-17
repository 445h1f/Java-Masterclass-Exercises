public class DigitsSum {

    public static int sumDigits(int number){
        if (number < 10){
            return -1;
        }
        int sum = 0;
        while (number > 0){
            int lastDigit = number % 10; // getting last digit e.g. 102 % 10 = 2
            sum += lastDigit;
            number /= 10; // trailing off last digit e.g. 102/10 = 10
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumDigits(2));
        System.out.println(sumDigits(25228)); // 2+5+2+2+8 = 19
    }
}
