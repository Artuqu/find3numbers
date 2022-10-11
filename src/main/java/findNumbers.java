import java.util.Arrays;

public class findNumbers {


    static boolean find3numbers(int[] numbers, int k) {
        Arrays.sort(numbers);
        boolean isInArray = false;
        int counter = 0;
        if (numbers.length < 3) {
            System.out.println("Array is to short!");
        } else {
            for (int i = counter + 1; i < numbers.length; i++) {
                int first = numbers[counter];
                int second = numbers[i];
                if (first > k) {
                    System.out.println("First value is too big");
                    return isInArray;
                }
                for (int j = i + 1; j < numbers.length; j++) {
                    int third = numbers[j];
                    if (first + second + third == k) {
                        isInArray = true;
                        i = numbers.length - 1;
                    }
                }
                if (i == numbers.length - 2) {
                    counter++;
                    i = counter;
                }
            }
        }

        System.out.println(isInArray);
        return isInArray;
    }


    public static void main(String[] args) {
        int[] toFind = {8, 2, 6, 9, 10, 100, 80, 33, 4, 6, 0, 20};
        int[] toFind2 = {8, 2, 3, 7, 9};
        int k = 2;


        find3numbers(toFind2, k);

    }

}
