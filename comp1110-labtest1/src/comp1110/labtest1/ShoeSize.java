package comp1110.labtest1;

import java.util.Scanner;

/**
 * Created by Trivedi on 03-08-2016.
 */
public class ShoeSize {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double height = in.nextDouble();
        int shoeSize = (int) Math.round(height * 5.0);
        System.out.println(shoeSize);
    }
}
