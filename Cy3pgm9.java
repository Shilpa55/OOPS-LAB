import java.util.*;
import java.io.*;
  public class Cy3pgm9
   {
  public static void main(String[] args) {
    // create an empty linked list
     LinkedList<String> l_list = new LinkedList<String>();
   // use add() method to add values in the linked list
          l_list.add("Yellow");
          l_list.add("Blue");
          l_list.add("Black");
          l_list.add("Violet");
          l_list.add("Red");

     // print the list
   System.out.println("The Original linked list: " + l_list);

  // Removing all the elements from the linked list
    l_list.clear();

    System.out.println("The New linked list: " + l_list);
  }
}
