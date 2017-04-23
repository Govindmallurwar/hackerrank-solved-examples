package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AndXorOr {

    static List<Integer> array;

    public static void main( String[] args ) throws FileNotFoundException {
        Scanner sc = new Scanner( new File( "D:\\APM\\APM-Onshore\\test\\input1.txt" ) );
        int n = sc.nextInt();
        array = new ArrayList<>();
        for ( int i = 0; i < n; i++ ) {
            array.add( sc.nextInt() );
        }
        int max = 0, val = 0;

        int j = 0;
        for ( int i = 0; i < n - 1; i++ ) {
            for ( j = i + 1; j < n - 1; j++ ) {
                val = ((array.get( i ) & array.get( j )) ^ (array.get( i ) | array.get( j ))) & (array.get( i ) ^ array.get( j ));
                if ( val > max ) {
                    max = val;
                }
                if ( array.get( j ) <= array.get( i ) || ((j < n - 1) && array.get( j + 1 ) > array.get( j )) )
                    break;
            }
        }
        System.out.println( max );
    }
}
