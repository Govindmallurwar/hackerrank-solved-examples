package test;

import java.util.Scanner;

public class TestXorOrAnd {
    public static void main( String[] args ) {

        Scanner sc = new Scanner( System.in );
        while ( true ) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println( ((a & b) ^ (a | b)) & (a ^ b) );
        }
    }
}
