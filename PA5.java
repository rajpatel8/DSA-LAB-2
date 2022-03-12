import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class PA5 {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        List < Integer > arr = new ArrayList<>(n) ;
        int S ;
        for (int i = 0; i < n; i++) {
            S = s.nextInt();
            arr.add(S);
        }
        s.close();
        Set <Integer> s1 = new LinkedHashSet<Integer>(arr) ;
        System.out.println(s1);
    }
}
