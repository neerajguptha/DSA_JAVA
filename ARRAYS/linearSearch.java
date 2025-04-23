package ARRAYS;
import java.util.*;  
public class linearSearch {

    public static int search(int arr[], int size, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // Return the index if the key is found
            }
        }
        return -1; // Return -1 if the key is not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1, 2, 3, 4, 6, 7, 8};
        System.out.println("Enter the key you want");
        int key = sc.nextInt();
        int index = search(arr, 7, key);
        if (index != -1) {
            System.out.println("Key is found at index " + index);
        } else {
            System.out.println("Key is not found");
        }
        sc.close();
    }
}