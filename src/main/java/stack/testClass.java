package stack;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class testClass {

    public static void main( String[] args ) throws FileNotFoundException {

        File file = new File( "input.txt" );
        Scanner sc = new Scanner( file );
        int n = sc.nextInt();
        int i, counter = 0;
        Boolean flag = true;
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        int l = 0, h = n - 1;
        for ( int j = 0; j < n; j++ ) {
            l1.add( sc.nextInt() );
        }

        long stime = System.currentTimeMillis();

        while ( flag ) {
            for ( i = l; i < h; i++ ) {
                if ( l1.get( i ) < l1.get( i + 1 ) ) {
                    l2.add( i + 1 );
                }

            }
            if ( l2.size() == 0 ) {
                flag = false;
                System.out.println( counter );
                break;
            }
            l = l2.get( 0 ) - 1;
            h = l2.get( l2.size() - 1 );
            Collections.sort( l2, Collections.reverseOrder() );
            for ( int q : l2 )
                l1.remove( q );
            l2.clear();
            if ( (l1.size() <= h) ) {
                h = l1.size() - 1;
            }
            counter++;
        }
        System.out.println( System.currentTimeMillis() - stime );
    }
}
