package JD06_Sorting.Sort_CyclicSort;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String arg[]) {
        int arr[] = {4, 2, 3, 1, 0};
//        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));


        int n = arr.length;

        int sum = 0;

        for (int i = 0; i < arg.length; i++) {
            sum += arr[i];
        }

        int sum2 = (n * (n + 1)) / 2;

        System.out.println(sum2 - sum);
        ;
    }

    public static int[] cyclicSort(int arr[]) {
        for (int i = 0; i < arr.length; ) {

            if (arr[i] != i) {
                swapValues(arr, i, arr[i]);

                /* or use
                    int correctIndex = arr[i], temp = arr[i];
                    arr[i] = arr[correctIndex];
                    arr[correctIndex] = temp;
                 */
            } else
                i++;
        }
        return arr;
    }

    public static void swapValues(int[] arr, int indexOne, int indexTwo) {
        int temp = arr[indexOne];
        arr[indexOne] = arr[indexTwo];
        arr[indexTwo] = temp;
    }
}

