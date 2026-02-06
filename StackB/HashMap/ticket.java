package StackB.HashMap;
import java.util.*;
public class ticket {

    public static String getStart(HashMap<String,String> ticket){
        HashMap<String,String> rev = new HashMap<>();
        for(String k : ticket.keySet()){
            rev.put(ticket.get(k),k);
        }

        for( String k : ticket.keySet()){
            if(! rev.containsKey(k) ){
                return k;
            }
        }

        return null;
    }
    public static void main(String[] args) {
        HashMap<String,String> ticket = new HashMap<>();
        ticket.put("Chennai","Bengaluru");
        ticket.put("Mumbai","Delhi");
        ticket.put("Goa","Chennai");
        ticket.put("Delhi","Goa");

        String start = getStart(ticket);
        System.out.print(start);

        for( String k : ticket.keySet()){
            System.out.print( " -> " +ticket.get(start));
            start = ticket.get(start);
        }

         System.out.println();
    }
}
