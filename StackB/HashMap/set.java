package StackB.HashMap;
import java.util.*;
public class set {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Noida");
        cities.add("Bangaluru");

        //1st way to iterate HashSet
        // Iterator it = cities.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }


        //2nd way to iterate HashSet
        // for(String city : cities){
        //     System.out.println(city);
        // }

        //Linked HashSet

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("India");
        lhs.add("japan");
        lhs.add("Germany");
        lhs.add("Nepal");
        System.out.println(lhs);
        lhs.remove("Nepal");
        System.out.println(lhs);


        //Tree Set

        TreeSet<String> ts = new TreeSet<>();
        ts.add("Bombay");
        ts.add("America");
        ts.add("India");
        ts.add("Germany");
        ts.add("Japan");
        System.out.println(ts);

    }
}
