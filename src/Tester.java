
public class Tester {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    LRUCache lruCache = new LRUCache(2);
    
   /* lruCache.addFirst(new Node(0, 0));
    lruCache.addFirst(new Node (1,1));
    System.out.println(lruCache.printToConsole().toString());
   // lruCache.put(2, 2);
    lruCache.addFirst(new Node(2, 2));
    lruCache.addFirst(new Node(3, 3));
    lruCache.addFirst(new Node(4, 4));
    
    
    System.out.println(lruCache.printToConsole().toString());
    
    lruCache.removeNode(4);
    System.out.println(lruCache.printToConsole().toString());
    lruCache.removeNode(3);
    
    System.out.println(lruCache.printToConsole().toString()); */
    lruCache.put(0, 0);
    lruCache.put(1, 1);
    System.out.println(lruCache.printToConsole().toString());
    
    lruCache.put(2, 2);
    System.out.println(lruCache.printToConsole().toString());
    
    lruCache.put(3, 3);
    
    System.out.println(lruCache.printToConsole().toString());
    
    System.out.println(lruCache.get(1));
   
  }

}
