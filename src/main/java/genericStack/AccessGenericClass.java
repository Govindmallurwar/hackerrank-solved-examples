package genericStack;

public class AccessGenericClass {
    public static void main( String[] args ) {
        Stack<Object> stack = new Stack<>();
        stack.push( 1 );
        stack.push( "Govind" );
        stack.push( 2 );
        stack.push( 3 );
        stack.push( 4.4 );
        stack.push( 5d );
        System.out.println( stack.toString() );
        System.out.println( stack.pip() );
        stack.pop();
        System.out.println( stack.toString() );
        System.out.println( stack.pip() );
    }

}
