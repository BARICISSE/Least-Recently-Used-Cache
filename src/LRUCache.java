import java.util.*;
public class LRUCache {
  Node dummyHead;
  Node dummyTail;
  int size = 0;
  int capacity;
  HashMap<Integer, Node> map;
  
  public LRUCache(int capacity){
    this.capacity = capacity;
    dummyHead = new Node();
    dummyTail = new Node();
    dummyHead.next = dummyTail;
    dummyHead.pre = null;
    dummyTail.pre = dummyHead;
    dummyTail.next = null;
    map = new HashMap<Integer, Node>();
  }
  public int get(int key){
    if(map.containsKey(key)){
      return map.get(key).list.get(1);
    }
    
    return -1;
  }
  
  
  public void put(int key, int value){
    if(map.containsKey(key)) {
        Node old = new Node(key, value);
        removeNode(old.list.get(0));
        addFirst(old);
  }
    else {
      Node created = new Node(key, value);
      if(map.size() >= capacity){
        removeLast();
        map.remove(dummyTail.pre.list.get(0));
        map.put(key, created);
        addFirst(created);
      }
      else {
        addFirst(created);
        map.put(key, created);
      }
    }
  }
  public void removeLast(){
    Node temp = dummyTail.pre;
    dummyTail.pre = dummyTail.pre.pre;
    dummyTail.pre.next = dummyTail;
    
    temp.next = null;
    temp.pre = null;
    
    size--;
}
  public void addFirst(Node node){
    node.next = dummyHead.next;
    dummyHead.next.pre = node;
    node.pre = dummyHead;
    dummyHead.next = node;
    
    size++;
  }
  public void removeNode(int key){
    Node temp = dummyHead.next;
    while(temp.list.get(0) != key){
      temp = temp.next;
    }
    temp.pre.next = temp.next;
    temp.next.pre = temp.pre;
    temp.next = null;
    temp.pre = null;
  
    size--;
  }
  public List<List<Integer>> printToConsole(){
    List<List<Integer>> myList = new ArrayList<>();
    Node temp = dummyHead.next;
    while(temp!=dummyTail){
      myList.add(temp.list);
      temp = temp.next;
    }
    
    return myList;
  }

}
