package stack;

import org.python.util.PythonInterpreter;

public class TestJavaPaythonCall {
    public static void main( String[] args ) {
        PythonInterpreter interpreter = new PythonInterpreter();

        // Set a variable with the content you want to work with
        String code = "test";
        interpreter.set( "code", code );

        // Simple use Pygments as you would in Python
        interpreter.exec( "from pygments import highlight\n" + "from pygments.lexers import PythonLexer\n" + "from pygments.formatters import HtmlFormatter\n" + "\nresult = highlight(code, PythonLexer(), HtmlFormatter())" );

        // Get the result that has been set in a variable
        System.out.println( interpreter.get( "result", String.class ) );
    }
}
