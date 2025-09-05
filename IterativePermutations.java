import java.util.*;

public class IterativePermutations {
    static void printPermutations(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        while (true) {
            System.out.println(new String(arr));
            int i = arr.length - 2;
            while (i >= 0 && arr[i] >= arr[i + 1]) i--;
            if (i < 0) break;

            int j = arr.length - 1;
            while (arr[j] <= arr[i]) j--;

            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            for (int l = i + 1, r = arr.length - 1; l < r; l++, r--) {
                char t = arr[l];
                arr[l] = arr[r];
                arr[r] = t;
            }
        }
    }

    public static void main(String[] args) {
        printPermutations("ABC");
    }
}
