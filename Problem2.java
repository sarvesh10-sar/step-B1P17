class Client {
    String name;
    int risk;

    Client(String n, int r) {
        name = n;
        risk = r;
    }
}

public class Problem2 {
    public static void main(String[] args) {

        Client[] arr = {
            new Client("C", 80),
            new Client("A", 20),
            new Client("B", 50)
        };

        // 🔹 Bubble Sort ASC
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].risk > arr[j + 1].risk) {
                    Client temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Bubble ASC:");
        for (Client c : arr)
            System.out.print(c.name + ":" + c.risk + " ");

        // 🔹 Insertion Sort DESC
        for (int i = 1; i < arr.length; i++) {
            Client key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].risk < key.risk) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        System.out.println("\nInsertion DESC:");
        for (Client c : arr)
            System.out.print(c.name + ":" + c.risk + " ");
    }
}
