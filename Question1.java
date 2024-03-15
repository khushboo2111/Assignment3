import java.util.*;
import java.util.Collections;
class Question1 {
    public static void main(String[] args) {
        SortedSet<Integer> ts 
            = new TreeSet<Integer>(); 
        ts.add(3); 
        ts.add(6); 
        ts.add(9); 
        ts.add(2); 
        ts.add(8); 
        ts.add(7); 
        
       Iterator iterator = ts.iterator();

        while (iterator.hasNext())
        {
            System.out.print(iterator.next());
            System.out.print("\t");
        }

    }
}
