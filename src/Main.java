import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> mapMap = new HashMap<>();
        mapMap.put("Mat", 6);
        mapMap.put("Casper", 5);
        mapMap.put("Marty", 5);
        mapMap.put("G", 6);
        mapMap.put("H", 6);

        rarest(mapMap);

    }

    public static void rarest(Map<String, Integer> map) {
        Map<Integer, Integer> rareMap = new TreeMap<>();
        Iterator<String> itr = map.keySet().iterator();

       while (itr.hasNext()){
           int i = map.get(itr.next());
           if (rareMap.containsKey(i)){
               rareMap.put(i,rareMap.get(i)+1);
           }else {
               rareMap.put(i,1);
           }
       }
        System.out.println(rareMap);

    }
}
