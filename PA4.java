import java.util.Scanner;

/*Given an array with n numbers split it from a specified position, and move the first part of array and append it to the end.
Example: Given A=[12,10,5,6,22,52] and position =2
Your function should return the modified array as:[5,6,22,52,12,10] */

public class PA4 {
    public static void main(String[] args) {
        int n ;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n] ;
        System.out.println("Enter the elements :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Enter the index ");
        int S = s.nextInt();
        s.close();
        for (int i = S; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < S; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
