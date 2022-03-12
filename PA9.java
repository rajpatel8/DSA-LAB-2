import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PA9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(),n1 = s.nextInt(), V;
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
        Collections.sort(arr);
        Collections.sort(arr1); 
        
    }
}
