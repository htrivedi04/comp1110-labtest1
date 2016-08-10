package comp1110.labtest1;

import java.util.Scanner;

/**
 * Created by Trivedi on 03-08-2016.
 */
public class Name {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println(name.toUpperCase());
        System.out.println(name.length());
    }
}
