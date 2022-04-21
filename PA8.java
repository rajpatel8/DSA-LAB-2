import java.util.ArrayList;
import java.util.Scanner;   
public class PA8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        ArrayList <Integer> arr = new ArrayList<Integer>(n);
        int V ,x ,S=0;
        x = s.nextInt();
        for (int i = 0; i < n; i++) {
            V = s.nextInt();
            
            if (V == x) {
                S++ ;
            }
            arr.add(V);
        }
        s.close();
        if ((arr.size()/2) < S) {
            System.out.print(x +" appears " + S +" times ");
        }
    }
}