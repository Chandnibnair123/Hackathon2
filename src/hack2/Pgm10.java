package hack2;

import java.util.Collections;
import java.util.LinkedList;

 

public class Pgm10
{
      public static void main(String args[])
      {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Chandni");
        linkedList.add("Pooja");
        linkedList.add("Priya");
        linkedList.add("Lakshmi");
        linkedList.add("Anu");
        linkedList.add("Arun");
        System.out.println("Actual LinkedList:"+linkedList);
        Collections.shuffle(linkedList);
            System.out.println("Results after shuffle operation:" + linkedList);      
            Collections.shuffle(linkedList);
            System.out.println("Results after shuffle operation:" + linkedList);
      }
    }

	