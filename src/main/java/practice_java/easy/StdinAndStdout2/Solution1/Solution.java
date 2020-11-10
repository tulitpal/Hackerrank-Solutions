package practice_java.easy.StdinAndStdout2.Solution1;

import java.util.Scanner;

/**
 * A simple code snippet showing how to accept different inputs from user
 * Note: the scan.nextLine() after the double input needs to be there in order
 * to do away with the newline character that is left behind by the previous input
 *
 * @author T
 */

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();

        /*** Only below code snippet needs to be filled up ***/

        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        /*****************************************************/

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

        scan.close();
    }
}