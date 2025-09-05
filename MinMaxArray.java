public class MinMaxArray {
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 89, 2, 67};

        int min = arr[0];
        int max = arr[0];

        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        System.out.println("Smallest: " + min);
        System.out.println("Largest: " + max);
    }
}
