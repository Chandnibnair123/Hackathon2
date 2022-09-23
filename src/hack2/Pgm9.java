package hack2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

 

public class Pgm9
{
      public static void main(String args[])
      {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Chandni");
        list.add("Priya");
        list.add("Pooja");
        list.add("Vasavi");
        list.add("Lakshmi");
        list.add("Anu");
        System.out.println("Actual LinkedList:"+list);
        List<String> list1 = new ArrayList<String>(list);
           
            System.out.println("Results after toarray operation:" + list1);
      }
    }
 