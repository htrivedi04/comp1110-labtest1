package comp1110.labtest1;

import java.util.Scanner;

/**
 * Created by Trivedi on 04-08-2016.
 */
public class Ones {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int ctr = 0;
        while (num > 1){
            if(num % 2 == 1)
                ctr += 1;
            num = num / 2;
        }
        if (num == 1)
            ctr++;
        System.out.println(ctr);
    }
}
