import java.util.*;
import java.util.LinkedHashSet;
import java.io.*;
class Cy3pgm7
{
 public static void main(String args[]){
 //Creating HashSet and adding elements
        LinkedHashSet<String> set=new LinkedHashSet<String>();
               set.add("Shilpa");
               set.add("Mithu");
               set.add("Rudra");
               set.add("Dhruv");
               set.add("Aryaman");
               Iterator<String> i=set.iterator();
               while(i.hasNext())
               {
               System.out.println(i.next());
               }
               System.out.println("Size of LinkedHashSet = " +set.size());
 }
}
