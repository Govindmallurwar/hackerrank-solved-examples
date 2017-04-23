package testKnowledge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Waiter {
    public static void main( String[] args ) {
        Scanner reader = new Scanner( System.in );
        int n = reader.nextInt();
        int q = reader.nextInt();
        java.util.Stack<Integer> a0 = new java.util.Stack<>();
        for ( int i = 0; i < n; i++ ) {
            a0.push( reader.nextInt() );
        }
        reader.close();
        int primeIs = 0;
        Stack<Integer> a = new Stack<>();
        Stack<Integer> b = new Stack<>();
        List<Integer> blist = new ArrayList<>();
        while ( q != 0 ) {

            primeIs = nextPrime( primeIs );
            while ( !a0.isEmpty() ) {
                int ele = a0.pop();
                if ( ele % primeIs == 0 )
                    b.push( ele );
                else
                    a.push( ele );
            }
            List<Integer> temp = new ArrayList<>();

            while ( !b.isEmpty() )
                blist.add( b.pop() );
            while ( !a.isEmpty() )
                temp.add( a.pop() );
            for ( int i = (temp.size() - 1); i >= 0; i-- ) {
                a0.push( temp.get( i ) );
            }
            q--;
        }
        for ( Integer integer : blist ) {
            System.out.println( integer );
        }
        List<Integer> temp = new ArrayList<>();
        while ( !a0.isEmpty() )
            temp.add( a0.pop() );
        for ( int i = 0; i < temp.size(); i++ ) {
            System.out.println( temp.get( i ) );

        }
    }

    public static int nextPrime( int x ) {
        int num = x, j;
        for ( j = num + 1;; j++ ) {
            int count = 0;
            for ( int i = 1; i <= j; i++ ) {
                if ( j % i == 0 ) {
                    count++;
                }
            }
            if ( count == 2 ) {
                break;
            }
        }
        return j;
    }
}
