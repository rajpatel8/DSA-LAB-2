import java.util.Scanner;
public class PA1 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n = s.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i <n; i++) {
            arr[i]=s.nextInt();
        }
        System.out.println("Enter the element to be searched :");
        int element  = s.nextInt();
        s.close();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==element) {
                System.out.println("Element " + element+ " is located at index " + i);
            }
        }
    }
}