/*

Problem Statement

Welcome to Day 7! Check out a video review of arrays here
	(https://www.youtube.com/watch?v=TY58y58GPdY&feature=youtu.be), or just jump
	right into the problem.

An array is a series of elements of the same type placed in contiguous memory locations that can be individually referenced by adding an index to a unique identifier.

You'll be given an array of N integers, and you have to print the integers in reverse order.

Good luck!

Input Format

The first line of input contains N, the number of integers. The next line contains N integers separated by a space.

Constraints

1<=N<=1000
1<=Ai<=10000, where Ai is the ith integer in the array.

Output Format

Print the N integers of the array in the reverse order on a single line separated by a space.

Sample Input

4
1 4 3 2

Sample Output

2 3 4 1

 */
import java.util.Scanner;

// Arrays class definition
public class Arrays {

	// Start the program here
	public static void main(String[] args) {
		// Create an input scanner instance for reading input
		Scanner in = new Scanner(System.in);
		
		// Read the number of elements in the array
        int N = in.nextInt();
        // Create an array with N elements
        int arr[] = new int[N];
        // Read N items into the array
        for(int i=0; i < N; i++){
            arr[i] = in.nextInt();
        }
        // Print the array from the last element (N-1) back to the first element (0)
        for (int r=(N-1); r>=0; r--) {
            System.out.print(arr[r] + " ");
        }
        // Finish the line after printing the array
        System.out.println();
        
    	/* Close the input stream after use */
    	in.close();
	}

}
