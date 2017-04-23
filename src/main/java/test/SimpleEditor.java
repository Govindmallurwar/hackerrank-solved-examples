package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.stream.Collectors;

public class SimpleEditor {
    public static void main( String[] args ) {
        Scanner sc = new Scanner( System.in );
        int op = sc.nextInt();
        List<Character> s = new ArrayList<>();
        Stack<String> undoList = new Stack<>();
        for ( int i = 0; i < op; i++ ) {
            int ch = sc.nextInt();
            switch ( ch ) {
            case 1:
                if ( s.size() == 0 )
                    undoList.add( "" );
                else {
                    undoList.add( s.toString().replaceAll( "[,\\s\\[\\]]", "" ) );
                }

                String s1 = sc.nextLine();
                if ( s1.charAt( 0 ) == ' ' )
                    s1.trim();
                s1.replaceAll( "^\\s+|\\s+$", "" );
                s.addAll( s1.chars().mapToObj( e -> (char)e ).collect( Collectors.toList() ) );
                s.remove( 0 );
                break;
            case 3:
                int temp = sc.nextInt();
                System.out.println( s.get( temp - 1 ) );
                break;
            case 2:

                int x = sc.nextInt();
                char chArray[] = new char[s.size()];
                int j = 0;
                int size = s.size() - x;
                for ( int i_i = s.size() - 1; i_i >= size; i_i-- ) {
                    chArray[j] = s.remove( i_i );
                    j++;
                }
                String strtemp = new String( chArray );
                undoList.push( new StringBuffer( strtemp ).reverse().toString() );
                break;
            case 4:
                s.clear();
                if ( undoList.size() != 0 )
                    s.addAll( undoList.pop().chars().mapToObj( e -> (char)e ).collect( Collectors.toList() ) );
            }

        }
    }
}
