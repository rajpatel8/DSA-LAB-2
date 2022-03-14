import java.util.Scanner;

public class PA6 {
    public static void main(String[] args) {
        int n , t;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        n = s.nextInt();
        System.out.println("Enter the target number");
        t = s.nextInt();
        System.out.println("Enter the elements");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        s.close();
        int x=0,y=0 ;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]+arr[j]==t && i!=j) {
                    x = i;y=j;break;
                }
            }
        }
        System.out.println("The elements which add add up to " + t + " are :");
        System.out.print(""+x + " " + y);
    }
}
