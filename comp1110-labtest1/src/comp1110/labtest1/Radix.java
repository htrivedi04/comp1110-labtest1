package comp1110.labtest1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Trivedi on 04-08-2016.
 */
public class Radix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sbase = in.nextInt();
        int dbase = in.nextInt();
        Scanner numIn = new Scanner(System.in);
        String num = numIn.nextLine();

        int input = Integer.parseInt(num);
        int dec = 0;
        for (int i = 0; input > 1; i++) {
            dec += (int) (Math.pow(sbase, i) * input % 10);
            input = input / 10;
        }
        ArrayList<Integer> output = new ArrayList<>();
        while(dec >= 1){
            output.add(dec % dbase);
            dec = dec / dbase;
        }
        for(int j = output.size() - 1; j >= 0; j--){
            System.out.print(output.get(j));
        }
        //System.out.println(Integer.toString(Integer.parseInt(num, sbase), dbase));
    }
}
