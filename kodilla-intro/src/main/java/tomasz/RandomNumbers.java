package tomasz;

import java.util.*;

public class RandomNumbers {

    public int getMinRandomNumber(int max) {
        Random random = new Random();
        int min = 30;
        int sum = 0;
        while (sum < max) {
            int temp = random.nextInt(30);
            sum = sum + temp;
            if (min > temp) {
                min = temp;
            }
        }
        return min;
    }

    public int getMaxRandomNumber(int max) {
        Random random = new Random();
        int maks = 0;
        int sum = 0;
        while (sum < max) {
            int temp = random.nextInt(30);
            sum = sum + temp;
            if (maks < temp) {
                maks = temp;
            }
        }
        return maks;
    }

    public static void main(String[] args) {
        RandomNumbers numer = new RandomNumbers();
        System.out.println("Najmniejszą wylosowana liczba to: " + numer.getMinRandomNumber(5000));
        System.out.println("Największa wylosowana liczba to: " + numer.getMaxRandomNumber(5000));
    }

}