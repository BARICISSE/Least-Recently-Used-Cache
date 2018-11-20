import java.util.*;
public class Node {
      List<Integer> list;
      Node next;
      Node pre;
      
      public Node(){
        
      }
      
      public Node(int key, int value){
        list = new ArrayList<>();
        list.add(key);
        list.add(value);
      }
}
