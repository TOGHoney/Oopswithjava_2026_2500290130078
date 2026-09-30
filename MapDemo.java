import java.util.*;
public class MapDemo {
    public static void main(String[] args){
      Map<Integer, Integer>m = new HashMap<>();
      m.put(1, 10);
      m.put(202, 39);
      m.put(102, 62);
        for(Map.Entry<Integer, Integer> i:m.entrySet()){
            System.out.println(i.getKey()+ ":"+i.getValue());
        }
        m.put(202, 33);
        m.remove(1);
        for(Map.Entry<Integer, Integer> i:m.entrySet()){
            System.out.println(i.getKey() + ":" + i.getValue());
        }
    }
}
