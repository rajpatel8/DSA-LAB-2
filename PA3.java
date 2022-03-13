import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class PA3 {
    public static void main(String[] args) {
        int n ,e;
        Scanner s = new Scanner(System.in);
        n= s.nextInt();
        ArrayList<Integer> arr  = new ArrayList<Integer>(n);
        for (int i = 0; i < n; i++) {
            e=s.nextInt();
            arr.add(e);
        }
        int v , r , E ,I;
        while (true) {
            System.out.print("==============================\n 1. Insert\n 2. Deletion\n 3.Traversal\n 4.Search\n 5.Break\n==============================\n");
            v = s.nextInt();
            if (v==1) {
                System.out.print("==============================\n1. Insert at start\n2. Insert at end \n3. Using Index\n4. Based on value\n==============================\n");
                r=s.nextInt();
                if (r==1) {
                    System.out.print("Enter the element :");
                    E = s.nextInt();
                    arr.add(0, E);
                }
                else if (r==2) {
                    System.out.print("Enter the element :");
                    E = s.nextInt();
                    arr.add(E);
                }
                else if (r==3) {
                    System.out.println("Enter the element :");
                    E = s.nextInt();
                    System.out.println("Enter the Index :");
                    I = s.nextInt();
                    arr.add(I, E);
                }
                else if (r==4) {
                    System.out.println("Enter the element :");
                    E = s.nextInt();
                    arr.add(E);
                    Collections.sort(arr);
                }
            }
            else if (v==2) {
                System.out.print("==============================\n1. Remove at start\n2. Remove at end \n3. Using Index\n4. Based on value\n==============================\n");
                r=s.nextInt();
                if (r==1) {
                    arr.remove(0);
                    System.out.println("Element removed from the front");
                }
                else if (r==2) {
                    arr.remove(arr.size()-1);
                    System.out.println("Element removed from the end");
                }
                else if (r==3) {
                    System.out.println("Enter the Index :");
                    I = s.nextInt();
                    arr.remove(I);
                    System.out.println("Element Removed from the Index");
                }
                else if (r==4) {
                    System.out.println("Enter the value to be removed");
                    E = s.nextInt();
                    if (arr.remove(new Integer(E))) {
                        System.out.println("Element removed");
                    }
                    else
                    {
                        System.out.println("Element doesn't exist ");
                    }
                }
            }
            else if (v==3) {
                 System.out.println(arr);
            }
            else if (v==4) {
                System.out.print("==============================\n1. Based on value\n2. Based on index\n==============================\n");
                r=s.nextInt();
                if (r==1) {
                    System.out.println("Enter the value to Search");
                    E = s.nextInt();
                    if (arr.contains(E)) {
                        System.out.println("Element " + E + " is present at index " +arr.indexOf(E));
                    }
                    else{
                        System.out.println("Element is not present in list");
                    }
                }
                else
                {
                    System.out.println("Enter the Index to Search");
                    E = s.nextInt();
                    System.out.println("Element "+arr.get(E) + " is present at index " + E );
                }   
            }
            else{
                break;
            }
        }
        s.close();
    }
}