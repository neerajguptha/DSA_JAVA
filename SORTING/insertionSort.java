package SORTING;

public class insertionSort {
        public static void InsertionSort(int arr[], int n) {
            for (int i = 1; i < n; i++) { // Fixed loop condition
                int temp = arr[i];
                int j = i - 1;
                for (; j >= 0; j--) {
                    if (arr[j] > temp) {
                        arr[j + 1] = arr[j];
                    } else {
                        break;
                    }
                }
                arr[j + 1] = temp;
            }
        }
    
        public static void main(String[] args) {
            int[] arr = {23, 12, 45, 43, 67, 87};
            InsertionSort(arr, arr.length); // Fixed method call
            System.out.print("Sorted array: ");
            for (int i = 0; i < arr.length; i++) { // Regular for loop to print the array
                System.out.print(arr[i] + " ");
            }
        }
    }

