package comp1110.labtest1;

import java.util.Scanner;

/**
 * Created by Trivedi on 03-08-2016.
 */
public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
//        for (int i = 1; i <= num; i++) {
//            boolean isPrime = true;
//            for (int j = 2; j <= i; j++) {
//                if (i % j != 0) {
//                    isPrime = true;
//                    continue;
//                } else {
//                    isPrime = false;
//                    break;
//                }
//            }
//            if (isPrime == true)
//                System.out.println(i);
//        }

        for (int i = 1; i <= num; i++)
        {
            int counter = 0;
            for(int j = i; j >= 1; j--)
            {
                if(i%j == 0)
                {
                    counter = counter + 1;
                }
            }
            if (counter == 2)
            {
                //Appended the Prime number to the String
                System.out.println(i);
            }
        }
    }
}
