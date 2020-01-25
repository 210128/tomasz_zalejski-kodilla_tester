package tomasz;

import java.util.*;

public class RandomNumbers {

    Integer[] drawNumber() {
        ArrayList<Integer> randomNumbers = new ArrayList<>();
        Random random = new Random();
        int sum = 0;
        while (sum <= 5001) {
            int randomNumber = random.nextInt(30);
            sum = sum + randomNumber;
            randomNumbers.add(randomNumber);
        }
        return randomNumbers.toArray(new Integer[0]);
    }

    public int getMinRandomNumber() {
        int min = 30;
        Integer[] drawNumbers = drawNumber();
        for (Integer drawNumber : drawNumbers) {
            if (min > drawNumber) {
                min = drawNumber;
            }
        }
        return min;
    }

    public int getMaxRandomNumber() {
        int max = 0;
        Integer[] drawNumbers = drawNumber();
        for (Integer drawNumber : drawNumbers) {
            if (max < drawNumber) {
                max = drawNumber;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        RandomNumbers numer = new RandomNumbers();
        System.out.println("Najmniejszą wylosowana liczba to: " + numer.getMinRandomNumber());
        System.out.println("Największa wylosowana liczba to: " + numer.getMaxRandomNumber());
    }

}