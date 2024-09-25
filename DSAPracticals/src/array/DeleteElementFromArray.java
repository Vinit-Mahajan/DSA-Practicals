package array;
import java.util.Scanner;
public class DeleteElementFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter " + n + " elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter the position of the element to delete : ");
        int pos = sc.nextInt();
        
        if (pos < 0 || pos >= n) {
            System.out.println("Invalid position! Please enter a position between 0 and " + (n-1));
        } else {
            // Shift elements to the left
            for (int i = pos; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            n--;
            
            System.out.println("Array after deletion:");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
