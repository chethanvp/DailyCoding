import java.util.HashSet;
import java.util.Set;

public class Daily_Code_1 {

// This problem was recently asked by Google.

// Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

// For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
    
    public static void main(String[] args) {
    
        int[] a = {10, 15, 3, 7};
        int k = 17;

        solution1(a, k);
        solution2(a,k);
    } 

    public static void solution1(int[] a, int k) {

        Boolean flag = false;

        for(int i=0; i<a.length-1; i++) {
            for(int j=i+1; j<a.length; j++) {
                if(a[i] + a[j] == k) {
                    flag = true;
                    break;
                }
            }
        }
        System.out.println(flag);
    }

    public static void solution2(int[] a, int k) {

        Set<Integer> h = new HashSet<>();
        Boolean flag = false;

        for(int i=0; i < a.length; i++) {
            if(h.contains(k-a[i])) {
              flag = true;
              break;  
            }
            h.add(a[i]);
        }
        System.out.println(flag);
    }
}
