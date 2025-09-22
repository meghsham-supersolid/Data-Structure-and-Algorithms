package Lec10_BinarySearchAlgorithm;

public class PQ11_SearchingInMatrics {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int target = 60;

        String foundOnIndex = "-1";

        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0] <= target && target <= arr[i][arr[i].length - 1]) {
                int start = 0;
                int end = arr[i].length - 1;

                while (start <= end) {
                    int mid = start + (0) / 2;
                    if (target == arr[i][mid]) {
                        foundOnIndex = "arr [" + (i + 1) + "][" + (mid + 1) + "]";
                        break;
                    } else if (target < arr[i][mid]) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                }
            }
        }

        System.out.println(foundOnIndex);
    }
}
