package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EqualStacks {
    public static void main( String[] args ) {
        Scanner in = new Scanner( System.in );
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int t1 = 0, t2 = 0, t3 = 0, flag = 0;
        List<Integer> stack1 = new ArrayList<>();
        List<Integer> stack2 = new ArrayList<>();
        List<Integer> stack3 = new ArrayList<>();

        List<Integer> sum4 = new ArrayList<>();
        List<Integer> sum5 = new ArrayList<>();
        List<Integer> sum6 = new ArrayList<>();

        for ( int h1_i = 0; h1_i < n1; h1_i++ ) {
            stack1.add( in.nextInt() );
        }
        for ( int h2_i = 0; h2_i < n2; h2_i++ ) {
            stack2.add( in.nextInt() );
        }

        for ( int h3_i = 0; h3_i < n3; h3_i++ ) {
            stack3.add( in.nextInt() );
        }

        for ( int i = n1 - 1; i >= 0; i-- ) {
            t1 = t1 + stack1.get( i );
            sum4.add( t1 );
        }

        for ( int i = n2 - 1; i >= 0; i-- ) {
            t2 = t2 + stack2.get( i );
            sum5.add( t2 );
        }

        for ( int i = n3 - 1; i >= 0; i-- ) {
            t3 = t3 + stack3.get( i );
            sum6.add( t3 );
        }

        if ( n1 < n2 ) {
            if ( n1 < n3 ) {
                // System.out.println( "A is the smallest" );
                for ( int j = n1 - 1; j >= 0; j-- ) {
                    int ele = sum4.get( j );
                    if ( sum5.contains( ele ) && sum6.contains( ele ) ) {
                        System.out.println( ele );
                        flag = 1;
                        break;
                    }
                    sum4.remove( j );
                }
                if ( flag == 0 ) {
                    System.out.println( 0 );
                }

            } else {
                // System.out.println( "C" );

                for ( int j = n3 - 1; j >= 0; j-- ) {
                    int ele = sum6.get( j );
                    if ( sum4.contains( ele ) && sum5.contains( ele ) ) {
                        System.out.println( ele );
                        flag = 1;
                        break;
                    }
                    sum6.remove( j );
                }
                if ( flag == 0 ) {
                    System.out.println( 0 );
                }

            }
        } else {
            if ( n2 < n3 ) {
                // System.out.println( "B is the smallest" );

                for ( int j = n2 - 1; j >= 0; j-- ) {
                    int ele = sum5.get( j );
                    if ( sum4.contains( ele ) && sum6.contains( ele ) ) {
                        System.out.println( ele );
                        flag = 1;
                        break;
                    }
                    sum5.remove( j );
                }
                if ( flag == 0 ) {
                    System.out.println( 0 );
                }

            } else {
                // System.out.println( "C is the smallest" );

                for ( int j = n3 - 1; j >= 0; j-- ) {
                    int ele = sum6.get( j );
                    if ( sum5.contains( ele ) && sum4.contains( ele ) ) {
                        System.out.println( ele );
                        flag = 1;
                        break;
                    }
                    sum6.remove( j );
                }
                if ( flag == 0 ) {
                    System.out.println( 0 );
                }

            }
        }
    }
}
