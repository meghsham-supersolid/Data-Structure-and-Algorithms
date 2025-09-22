package Lec10_BinarySearchAlgorithm;

public class PQ11_SearchingInMatrics {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int target = 60;

        String foundOnIndex = "-1";
        int rowStart = 0;
        int rowEnd = arr.length - 1;

        while (rowStart <= rowEnd) {
            int rowMid = rowStart + (rowEnd - rowStart) / 2;

            int colStart = 0;
            int colEnd = arr[rowMid].length - 1;

            if (arr[rowMid][colStart] > target)
                rowEnd = rowMid - 1;

            else if (arr[rowMid][colEnd] < target)
                rowStart = rowMid + 1;

            else {
                while (colStart <= colEnd) {
                    int colMid = colStart + (colEnd - colStart) / 2;
                    if (arr[rowMid][colMid] == target) {
                        foundOnIndex = "Element found arr[" + rowMid + "] [" + colMid + "] ";
                        break;
                    } else if (arr[rowMid][colMid] < target)
                        colStart = colMid + 1;
                    else
                        colEnd = colMid - 1;
                }
            }

            if (!foundOnIndex.equals("-1"))
                break;

        }
        System.out.println("Result => " + foundOnIndex);
    }
}