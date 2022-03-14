import java.util.Scanner;

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
        System.out.println("New array");
        for (int i = S; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < S; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
