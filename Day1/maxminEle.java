package Day1;

public class maxminEle {
    public static void main(String[] args) {
        int arr[] = { 1, 11, 21, 32, 0, 43 };
        int min = 0, max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else {
                max = arr[i];
            }
        }
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}