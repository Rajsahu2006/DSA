package LinkedList;
//Collection Framework in java;
import java.util.*;
public class L2 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("This");
        list.addFirst("is");
        System.out.println(list);

        list.addLast("name  is ");
        list.addLast("your");
        System.out.println(list);
        System.out.println(list.size());
    }
    
}
