package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameOfTwoStack {

    public static void main( String[] args ) {

        Scanner in = new Scanner( System.in );
        int g = in.nextInt();

        for ( int a0 = 0; a0 < g; a0++ ) {
            boolean flag = true, flagA = true, flagB = true, zeroFlag = true;
            int sumA = 0, sumB = 0, sum = 0, totalCount = 0, i = 0, totalCount1 = 0;
            int j = 0, max = 0;
            int n = in.nextInt();
            int m = in.nextInt();
            int x = in.nextInt();
            int eleInA = 0, eleInB = 0;
            List<Integer> a = new ArrayList<Integer>();
            List<Integer> both = new ArrayList<Integer>();
            for ( int a_i = 0; a_i < n; a_i++ ) {
                int temp = in.nextInt();
                if ( sumA + temp <= x && flagA ) {
                    a.add( temp );
                    sumA += temp;
                    eleInA++;
                } else {
                    flagA = false;
                }
            }

            for ( int a_i = eleInA - 1; a_i >= 0; a_i-- ) {
                both.add( a.get( a_i ) );
            }

            List<Integer> b = new ArrayList<>();
            for ( int b_i = 0; b_i < m; b_i++ ) {
                int temp = in.nextInt();
                if ( sumB + temp <= x && flagB ) {
                    b.add( temp );
                    both.add( temp );
                    sumB += temp;
                    eleInB++;
                } else {
                    flagB = false;
                }
            }
            sum = sumA;
            totalCount = eleInA;
            i = 0;
            j = eleInA - 1;
            max = eleInA;
            while ( i < eleInA || j < ((eleInA + eleInB) - 1) ) {
                if ( eleInA == 0 ) {
                    max = eleInB;
                    break;
                }
                if ( eleInB == 0 ) {
                    max = eleInA;
                    break;
                }
                if ( (sumA + sumB) <= x ) {
                    max = eleInA + eleInB;
                    break;
                }

                while ( flag ) {
                    if ( j + 1 > ((eleInA + eleInB) - 1) )
                        break;
                    if ( (sum + both.get( j + 1 )) <= x ) {
                        sum += both.get( j + 1 );
                        j++;
                        if ( both.get( i ) == 0 && zeroFlag ) {
                            int xi = i;
                            totalCount1 = totalCount + 1;
                            while ( both.get( xi ) == 0 ) {
                                xi--;
                                totalCount1++;
                                zeroFlag = false;
                                if ( xi < 0 )
                                    break;
                            }
                        }
                        totalCount++;
                        if ( totalCount > max || totalCount1 > max ) {
                            max = totalCount;
                        }
                    } else {
                        flag = false;
                        break;
                    }
                }
                i++;
                sum -= both.get( i - 1 );
                totalCount--;

                zeroFlag = true;
                totalCount1 = 0;
                flag = true;
            }
            System.out.println( max );
            // your code goes here
        }
    }
}
