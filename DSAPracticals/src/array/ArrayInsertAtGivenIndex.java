package array;
import java.util.Scanner;
public class ArrayInsertAtGivenIndex {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] originalArray = new int[size];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            originalArray[i] = scanner.nextInt();
        }
        System.out.println("Enter the element : ");
        int x = scanner.nextInt();
        
        System.out.println("Enter the position : ");
        int pos = scanner.nextInt();

        if (pos < 0 || pos > size) {
            System.out.println("Invalid position");
            return;
        }
        int[] newArray = new int[size + 1]; //one additional space
        
        for (int i = 0; i < pos; i++) {
            newArray[i] = originalArray[i];
        }
        newArray[pos] = x;
        
        for (int i = pos; i < size; i++) {
            newArray[i + 1] = originalArray[i];
        }
        System.out.println("Array after insertion:");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
	}

}
