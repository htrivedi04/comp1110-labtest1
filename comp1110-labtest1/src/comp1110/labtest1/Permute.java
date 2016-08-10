package comp1110.labtest1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Trivedi on 04-08-2016.
 */
public class Permute {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        System.out.println(CheckPermute(str1, str2));
    }

    public static String CheckPermute(String str1, String str2) {
        if (str1.length() != str2.length())
            return "No";

        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if(Arrays.equals(a, b))
            return "Yes";
        else
            return "No";
    }
}
