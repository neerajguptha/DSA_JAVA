package ARRAYS;

public class largestNumber {
    public static void main(String[] args) {
        int arr[] = {1,2,36,5};  
        int temp = arr[0]; 

        for (int i = 1; i < arr.length; i++) { 
            if (arr[i] > temp) {
                temp = arr[i]; 
            }
        }

        System.out.println("Largest number in the array: " + temp);
    }
}
