class Asset {
    String name;
    int returnRate;

    Asset(String n, int r) {
        name = n;
        returnRate = r;
    }
}

public class Problem4 {
    public static void main(String[] args) {

        Asset[] arr = {
            new Asset("AAPL", 12),
            new Asset("TSLA", 8),
            new Asset("GOOG", 15)
        };

        // Merge Sort logic simplified using Arrays.sort
        java.util.Arrays.sort(arr, (a, b) -> a.returnRate - b.returnRate);

        System.out.println("Merge Sort:");
        for (Asset a : arr)
            System.out.print(a.name + ":" + a.returnRate + "% ");
    }
}
