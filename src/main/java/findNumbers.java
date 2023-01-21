import java.util.Arrays;

public class findNumbers {


    static boolean find3numbers(int[] numbers, int k) {
        Arrays.sort(numbers);
        boolean isInArray = false;
        if (numbers.length < 3) {
            System.out.println("Array is to short!");
            return false;
        } else if (numbers[0] > k) {
            System.out.println("Value K is too small!");
            return false;
        } else {
            for (int o = 0; o < numbers.length - 2; o++) {
                int first = numbers[o];
                for (int i = o + 1; i < numbers.length - 1; i++) {
                    int second = numbers[i];
                    for (int j = i + 1; j < numbers.length; j++) {
                        int third = numbers[j];
                        if (first + second + third == k) {
                            isInArray = true;
                            o = numbers.length;
                            i = numbers.length;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(isInArray);
        return isInArray;
    }


    public static void main(String[] args) {
        int[] toFind = {8, 2, 6, 9, 10, 100, 80, 33, 4, 6, 0, 20};
        int[] toFind2 = {8, 2, 3, 7, 9};
        int[] toFind3 = {7, 9};
        int k = 13;


        find3numbers(toFind2, k);

    }

}
