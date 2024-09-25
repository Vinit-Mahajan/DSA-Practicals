package array;
import java.util.Scanner;

public class MultDim {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of rows : ");
		int rows = sc.nextInt();

		System.out.println("Enter the size of cols : ");
		int cols = sc.nextInt();
		
		int arr[][] = new int[rows][cols];
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0 ; j < cols; j++) {
				System.out.println("Enter the value of: arr [" + i +"]["+ j + "]");
			}
		}
		
	}

}
