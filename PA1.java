import java.util.Scanner;
public class PA1 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int arr[]=new int[5];
        for (int i = 0; i <5; i++) {
            arr[i]=s.nextInt();
        }
        int element  = s.nextInt();
        s.close();
        System.out.println("Enter the element to be searched :");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==element) {
                System.out.println("Element " + element+ " is located at index " + i);
            }
        }
    }
}