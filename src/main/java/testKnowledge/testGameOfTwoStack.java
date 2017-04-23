package testKnowledge;

import java.util.ArrayList;
import java.util.List;

public class testGameOfTwoStack {

    static List<Integer> sec = new ArrayList<>();
    static List<Integer> first = new ArrayList<>();
    static List<Integer> bList = new ArrayList<>();

    static int x1, max;

    public static void main( String[] args ) {
        System.out.println( getI( 1024 ) );
    }

    private static List<Integer> getI( int u ) {
        int start = 0;
        int end = u;
        while ( start < end ) {
            int mid = (start + end) / 2;
            bList.add( end );
            bList.add( mid );
            end = mid / 2;
        }
        bList.add( end );
        return bList;
    }
}
