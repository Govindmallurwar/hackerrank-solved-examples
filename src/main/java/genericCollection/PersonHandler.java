package genericCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonHandler {
    public static void main( String[] args ) {

        Person govind = new Person( "Govind", 25 );
        Person krishna = new Person( "Krishna", 27 );
        Person didi = new Person( "didi", 22 );
        // Person[] p = {krishna, govind, didi};
        Person papa = new Person( "Papa", 52 );
        // System.out.println( Arrays.toString( p ) );
        List<Person> personList = new ArrayList<>();
        personList.add( govind );
        personList.add( krishna );
        personList.add( didi );

        // personList.add( govind );
        // p = add( p, papa );
        System.out.println( personList );
        personList.add( papa );
        System.out.println( personList );
        Collections.sort( personList, new PersonAgeComparator() );
        System.out.println( personList );
    }
    /*
     * private static Person[] add( Person[] p, Person papa ) { int n = p.length; p = Arrays.copyOf( p, n + 1 ); p[n] =
     * papa; return p; }
     */

}
