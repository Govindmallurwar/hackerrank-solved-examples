package genericStack;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
    List<T> stack;

    public Stack() {
        stack = new ArrayList<>();
    }

    public Boolean push( T t ) {
        return stack.add( t );
    }

    @Override
    public String toString() {
        return "Stack [stack=" + stack + "]";
    }

    public T pop() {
        T t = null;
        int size = stack.size();
        return stack.remove( size - 1 );
    }

    public T pip() {
        return stack.get( stack.size() - 1 );

    }
}
