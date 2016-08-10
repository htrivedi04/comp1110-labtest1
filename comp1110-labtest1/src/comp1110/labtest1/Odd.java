package comp1110.labtest1;

import java.util.Scanner;

/**
 * Created by Trivedi on 03-08-2016.
 */
public class Odd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if (isOdd(x))
            System.out.println(x + " is odd");
        else
            System.out.println(x + " is even");
    }

    public static boolean isOdd(int i) {
        if (i % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }
}
