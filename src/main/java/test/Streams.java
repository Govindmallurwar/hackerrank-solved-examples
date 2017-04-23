package test;

import java.util.Scanner;
import java.util.Stack;

public class Streams {
    /*
     * public static void main( String[] args ) { // List<String> listForStream = Arrays.asList( new String( "first" ),
     * new String( "second" ), new String( // "Third" ), new String( "Forth" ) ); // listForStream.stream().filter( x ->
     * x.startsWith( "s" ) ).forEach( x -> System.out.println( x ) ); Scanner sc = new Scanner( System.in ); int n =
     * sc.nextInt(); int d = sc.nextInt();
     *
     * int array[] = new int[n]; for ( int i = 0; i < n; i++ ) { array[i] = sc.nextInt();
     *
     * } for ( int j = 0; j < n; j++ ) { System.out.println( array[(j + d) % n] );
     *
     * }
     *
     * }
     */
    public static void main( String[] args ) {
        char[] ch;
        int flag = 0;
        Scanner in = new Scanner( System.in );
        int t = in.nextInt();
        String s[] = new String[t];
        for ( int a0 = 0; a0 < t; a0++ ) {
            s[a0] = in.next();
        }
        for ( int j = 0; j < s.length; j++ ) {
            ch = s[j].toCharArray();

            Stack<Character> stack = new Stack<>();
            for ( int i = 0; i < ch.length; i++ ) {
                if ( stack.isEmpty() && (ch[i] == '}' || ch[i] == ']' || ch[i] == ')') ) {
                    System.out.println( "NO" );
                    flag = 1;
                    break;

                }
                if ( ch[i] == '{' || ch[i] == '[' || ch[i] == '(' ) {
                    stack.push( ch[i] );
                }
                if ( ch[i] == '}' || ch[i] == ']' || ch[i] == ')' ) {
                    char temp = stack.peek();
                    if ( (temp == '{' && ch[i] == '}') || (temp == '[' && ch[i] == ']') || (temp == '(' && ch[i] == ')') ) {
                        stack.pop();
                    } else {
                        System.out.println( "NO" );
                        flag = 1;
                        break;
                    }
                }

            }
            if ( flag == 0 ) {
                if ( !stack.isEmpty() ) {
                    System.out.println( "NO" );
                } else {
                    System.out.println( "YES" );
                }

            }
            flag = 0;
        }
    }

}
