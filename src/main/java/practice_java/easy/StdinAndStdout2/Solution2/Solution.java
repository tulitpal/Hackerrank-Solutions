package practice_java.easy.StdinAndStdout2.Solution2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This is an alternative solution to the problem using BufferedReader
 * which does away with the need to write an extra scan.nextLine()
 * and can directly proceed to accept the next input correctly
 *
 * @author T
 */

public class Solution {

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());

        /*** Only below code snippet needs to be filled up ***/

        double d = Double.parseDouble(br.readLine());
        String s = br.readLine();

        /*****************************************************/

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

        br.close();
    }
}