import java.util.Scanner;
public class PA2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the lenght of array :")  ;
        int n = s.nextInt() ;
        int arr[] = new int[n] ;
        System.out.println("Enter the data to array :")  ;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
            if (arr[i]==6) {
                if (count == 1) {
                    arr[i]= 7 ;
                }
                else{count ++ ;}
            }
        }
        s.close();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
