import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PA7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int V , r;
        ArrayList<Integer> arr = new ArrayList<Integer>(n);
        for (int i = 0; i < n; i++) {
            V = s.nextInt();
            arr.add(V);
        }
        r=s.nextInt();
        s.close();
        Collections.sort(arr);
        while (arr.contains(r)) {
            arr.remove(arr.indexOf(r));
        }
        System.out.print(arr.size());
    }
}
