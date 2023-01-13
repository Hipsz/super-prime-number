import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] numbersArray = {2,34,52,5,3,83,7,67,193,29};
        System.out.println(Arrays.toString(getSuperPrimeNumbers(numbersArray)));

    }
    public static int[] getSuperPrimeNumbers(int[] numbers) {
//        ArrayList<Integer> superPrimeList = new ArrayList<Integer>();
//        for (int number : numbers) {
//            if (isPrime(number) && isSuperPrime(number)) {
//                superPrimeList.add(number);
//            }
//        }
//        int[] superPrimeArray = new int[superPrimeList.size()];
//        for (int i = 0; i < superPrimeArray.length; i++) {
//            superPrimeArray[i] = superPrimeList.get(i);
//        }
//        return superPrimeArray;

        int count = 0;
        for (int number : numbers) {
            if (isPrime(number) && isSuperPrime(number)) {
                count++;
            }
        }
        int[] superPrimeArray = new int[count];
        int index = 0;
        for (int number : numbers) {
            if (isPrime(number) && isSuperPrime(number)) {
                superPrimeArray[index] = number;
                index++;
            }
        }
        return superPrimeArray;

    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isSuperPrime(int number) {
        int digitSum = 0;
        int temp = number;
        while (temp > 0) {
            digitSum += temp % 10;
            temp /= 10;
        }
        return isPrime(digitSum);
    }

}
