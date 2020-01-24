package tomasz;

public class Loops {

    public int sumNumbers(int[] numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result = result + numbers[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Loops numer = new Loops();
        int[] numery = new int[] {3, 5, 7, 1, 9, 31, 65, 32, 76};
    System.out.println("Suma liczb w tablicy wynosi: "+ numer.sumNumbers(numery));



        String[] names = new String[]{"Zygfryd", "Gwidon", "Florentyna"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);
        }
        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }
}