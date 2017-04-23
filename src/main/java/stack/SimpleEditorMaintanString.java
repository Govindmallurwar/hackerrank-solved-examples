package stack;

import java.util.Scanner;
import java.util.Stack;

public class SimpleEditorMaintanString {
    public static void main( String[] args ) {
        Scanner sc = new Scanner( System.in );
        int op = sc.nextInt();
        StringBuilder string = new StringBuilder();
        Stack<String> undoList = new Stack<>();
        for ( int i = 0; i < op; i++ ) {
            int ch = sc.nextInt();
            switch ( ch ) {
            case 1:
                undoList.push( new String( string ) );
                String temp = sc.nextLine();
                StringBuilder b2 = new StringBuilder( temp ).delete( 0, 1 );
                string = string.append( b2 );
                // System.out.println( string );
                break;
            case 3:
                int index = sc.nextInt();
                System.out.println( string.charAt( index - 1 ) );
                break;
            case 2:
                // string.delete( 0, 1 );
                undoList.push( new String( string ) );
                int x = sc.nextInt();
                int size = string.length();
                string.delete( size - x, size );
                // System.out.println( string );
                break;
            case 4:
                string = new StringBuilder( undoList.pop() );
                // System.out.println( string );
            }

        }
    }
}
