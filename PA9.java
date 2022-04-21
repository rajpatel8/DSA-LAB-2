import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class PA9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n ;
        n = s.nextInt();
        ArrayList <Integer> arr = new ArrayList<Integer>(n);
        int V,r ;
        for (int i = 0; i < n; i++) {
            V = s.nextInt();
            arr.add(V);
        }
        r = s.nextInt();
        s.close();
        int S= 0;
        Collections.sort(arr);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int j2 = 0; j2 < n; j2++) {
                    if(arr.get(i)+arr.get(j)+arr.get(j2)==r && i!=j && j!=j2 && i!=j){
                        S = arr.get(i)+arr.get(j)+arr.get(j2) ;
                        System.out.println(arr.get(i)+" "+arr.get(j)+" "+arr.get(j2));
                        break;
                    }
                }if (S!=0) {break;}
            }if (S!=0) {break;}
        }
    }
}