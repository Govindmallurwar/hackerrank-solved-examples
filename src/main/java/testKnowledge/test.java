package testKnowledge;

public class test {
    public static void main( String[] args ) {
        String s1 = "govindg";
        int flag = 0;
        char[] array = s1.toCharArray();
        for ( int i = 0; i < array.length; i++ ) {
            for ( int j = i + 1; j < array.length; j++ ) {
                if ( array[i] == array[j] ) {
                    flag = 1;
                    break;
                }

            }
            if ( flag == 0 )
                System.out.println( array[i] );
            flag = 0;
        }

    }
}
