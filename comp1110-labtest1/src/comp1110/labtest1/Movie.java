package comp1110.labtest1;

import java.util.Scanner;

/**
 * Created by Trivedi on 03-08-2016.
 */
public class Movie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String movie = in.nextLine();
        int length = in.nextInt();
        int hrs = length / 60;
        int mins = length % 60;
        System.out.println(movie + " runs for " + ((hrs > 0) ? hrs  + ((hrs > 1) ? " hours" : " hour") : "") + ((hrs > 0 && mins > 1) ? " and " : "") +  ((mins > 0) ? mins + ((mins > 1) ? " minutes" : " minute") : ""));
    }
}
