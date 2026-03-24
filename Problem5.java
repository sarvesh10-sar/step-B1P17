public class Problem5 {
    public static void main(String[] args) {

        String[] arr = {"accB", "accA", "accB", "accC"};

        // Linear search
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("accB")) {
                System.out.println("First found at index: " + i);
                break;
            }
        }

        // Binary Search (after sort)
        java.util.Arrays.sort(arr);

        int low = 0, high = arr.length - 1;
        String target = "accB";

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid].equals(target)) {
                System.out.println("Binary found at: " + mid);
                break;
            } else if (arr[mid].compareTo(target) < 0)
                low = mid + 1;
            else
                high = mid - 1;
        }
    }
}
