package array;
import java.util.Scanner;
public class MultiDimentionalArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows : ");
		int row = sc.nextInt();
		
		System.out.println("Enter cols : ");
		int cols = sc.nextInt();
		
		int arr[][]= new int[row][cols];
		
		for(int i = 0 ; i < row ; i++) {
			for(int j = 0 ; j < cols ; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0 ; i < row ; i++) {
			for(int j = 0 ; j < cols ; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
