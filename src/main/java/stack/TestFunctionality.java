package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestFunctionality {
    static List<Integer> array;

    public static void main( String[] args ) {
        Scanner sc = new Scanner( System.in );
        int n = sc.nextInt();
        array = new ArrayList( n );
        for ( int i = 0; i < n; i++ ) {
            array.add( sc.nextInt() );
        }
        int max = 0;
        int j = 0;
        for ( int i = 0; i < n - 1; i++ ) {
            int m = Math.max( left( i, array.get( i ) ), right( i, array.get( i ) ) );
            max = Math.max( max, m );
        }
        System.out.println( max );
    }

    private static int right( int i, int num1 ) {

        i++;
        while ( i < array.size() && array.get( i ) >= num1 ) {
            i++;
        }
        if ( i == array.size() ) {
            return -1;
        } else {
            int num2 = array.get( i );
            return ((num1 & num2) ^ (num1 | num2)) & (num1 ^ num2);
        }
    }

    private static int left( int i, int num1 ) {

        i--;
        while ( i >= 0 && array.get( i ) >= num1 ) {
            i--;
        }
        if ( i == -1 ) {
            return -1;
        } else {
            int num2 = array.get( i );
            return ((num1 & num2) ^ (num1 | num2)) & (num1 ^ num2);
        }
    }

}
