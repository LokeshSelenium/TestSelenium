package test_preparation;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Collections;
import java.util.Iterator;

public class Collection {

public static void main(String[] args)
{
        ArrayList<String>  al=new ArrayList<String>();
        al.add("Lokesh");
        al.add("Ravi");
        al.add("VInay");
        
        System.out.println("Using Get Method");
        System.out.println(al.get(0));
        System.out.println(al.get(1));
        System.out.println(al.get(2));
        
        System.out.println("Using for loop");
        for(int i=0; i<al.size();i++)
        {
        	System.out.println(al.get(i));
        }
        
        System.out.println("Using for each loop");
        for(String r:al)
        {
        	System.out.println(r);
        }
        System.out.println("Using Iterator");
        Iterator<String> r = al.iterator();
        while(r.hasNext())
        {
        	String a = r.next();
        	System.out.println(a);
        }
        System.out.println("Using List of Iterator forward");
        ListIterator<String> s = al.listIterator();
        while(s.hasNext())
        {
        	String t = s.next();
        	System.out.println(t);
        }
        System.out.println("Using List of Iterator backward");
        ListIterator<String> t1 = al.listIterator();
        while(t1.hasPrevious())
        {
        	String t2 = t1.previous();
        	System.out.println(t2);
        }
        
        
          
}

}
