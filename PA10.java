import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PA10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int n = s.nextInt(),n1 = s.nextInt(), V;
        System.out.println("Enter the array : ");
        ArrayList <Integer> arr  = new ArrayList<Integer>(n);
        ArrayList <Integer> arr1  = new ArrayList<Integer>(n1);
        for (int i = 0; i < n; i++) {
            V = s.nextInt();
            arr.add(V);
        }
        for (int i = 0; i < n1; i++) {
            V = s.nextInt();
            arr1.add(V);
        }
        s.close();
        arr.addAll(arr1) ;
        Collections.sort(arr);
        System.out.println("The new arrays are : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        } 
        System.out.println(" ");
        for (int i = n; i < n1+n; i++) {
            System.out.print(arr.get(i)+" ");
        }
    }
}
