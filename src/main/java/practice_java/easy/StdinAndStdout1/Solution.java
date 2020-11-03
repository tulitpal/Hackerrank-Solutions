package practice_java.easy.StdinAndStdout1;

import java.util.Scanner;

/**
 * This is a simple code that accepts integers and prints them out
 *
 * @author T
 */

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        scan.close();
    }
}