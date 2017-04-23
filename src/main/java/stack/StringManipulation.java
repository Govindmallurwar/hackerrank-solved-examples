package stack;

public class StringManipulation {
    public static void main( String[] args ) {
        String s1 = new String( "aaaa" );
        Boolean flag = false;
        char[] charArray = s1.toCharArray();
        for ( int i = 0; i < charArray.length - 1; i++ ) {
            if ( !(charArray[i] == charArray[(charArray.length - 1) - i]) ) {
                System.out.println( "not palindrome..." );
                flag = true;
                break;
            }
        }
        if ( !flag )
            System.out.println( "palindrome" );

    }

}
