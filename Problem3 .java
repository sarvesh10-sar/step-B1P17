import java.util.*;

public class import java.util.*;

public class Problem3 {

    // 🔹 Merge Sort
    static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    static void merge(int[] arr, int l, int m, int r) {
        int[] temp = new int[r - l + 1];
        int i = l, j = m + 1, k = 0;

        while (i <= m && j <= r) {
            temp[k++] = (arr[i] < arr[j]) ? arr[i++] : arr[j++];
        }
        while (i <= m) temp[k++] = arr[i++];
        while (j <= r) temp[k++] = arr[j++];

        System.arraycopy(temp, 0, arr, l, temp.length);
    }

    public static void main(String[] args) {

        int[] arr = {500, 100, 300};

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("MergeSort:");
        System.out.println(Arrays.toString(arr));

        // Total
        int sum = 0;
        for (int x : arr) sum += x;

        System.out.println("Total Volume: " + sum);
    }
} {

    // 🔹 Merge Sort
    static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    static void merge(int[] arr, int l, int m, int r) {
        int[] temp = new int[r - l + 1];
        int i = l, j = m + 1, k = 0;

        while (i <= m && j <= r) {
            temp[k++] = (arr[i] < arr[j]) ? arr[i++] : arr[j++];
        }
        while (i <= m) temp[k++] = arr[i++];
        while (j <= r) temp[k++] = arr[j++];

        System.arraycopy(temp, 0, arr, l, temp.length);
    }

    public static void main(String[] args) {

        int[] arr = {500, 100, 300};

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("MergeSort:");
        System.out.println(Arrays.toString(arr));

        // Total
        int sum = 0;
        for (int x : arr) sum += x;

        System.out.println("Total Volume: " + sum);
    }
}
