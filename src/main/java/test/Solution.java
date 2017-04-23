package test;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main( String[] args ) {
        Scanner sc = new Scanner( System.in );
        int size = Integer.parseInt( sc.next() );
        long inputArray[] = new long[size];
        long noOfInputes = sc.nextLong();
        long max = 0;
        for ( int i = 1; i <= noOfInputes; i++ ) {
            int start = sc.nextInt() - 1;
            int end = sc.nextInt();
            long element = sc.nextLong();
            for ( int j = start; j < end; j++ ) {
                inputArray[j] += element;
            }
        }
        System.out.print( Arrays.stream( inputArray ).max().getAsLong() );
    }
}
