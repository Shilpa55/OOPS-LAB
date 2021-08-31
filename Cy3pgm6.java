import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.io.*;

public class Cy3pgm6 {

    public static void main(String[] args) {

        TreeSet<Integer> tSet = new TreeSet<Integer>();
          tSet.add(35);
            tSet.add(13);
              tSet.add(90);
        tSet.add(7);
        tSet.add(3);
        tSet.add(8);
        tSet.add(5);
        tSet.add(2);

        System.out.println("TreeSet contains: " + tSet);

        /*
         * To get the a reverse order view of this TreeSet, use
         * the descendingSet method
         */
        Set<Integer> reverseSet = tSet.descendingSet();

        //get an iterator
        Iterator<Integer> itr = reverseSet.iterator();

        System.out.println("Reverse set contains: ");
        while(itr.hasNext()){
            System.out.println( itr.next() );
        }
    }
}
