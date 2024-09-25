package array;

import java.util.Scanner;

public class ArrayInsertion {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5};
		int i;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the element to insert : ");
		int element = sc.nextInt();
		
		int newarr[] = new int[arr.length+1];
		for(i = 0 ; i < arr.length; i++) {
			newarr[i] = arr[i];
		}
		newarr[i] = element;
		
		for(i = 0 ; i < newarr.length; i++) {
			System.out.print(newarr[i] + " ");
		}

	}

}
