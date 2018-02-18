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

       while (itr.hasNext()){ //while loop for serching the map
           int i = map.get(itr.next()); //sets the itr to the map keyset
           if (rareMap.containsKey(i)){ //if the rare map contains a value from the start map
               rareMap.put(i,rareMap.get(i)+1); //up the value and occurece in the raremap
           }else { //if none is found put the value and occor to 1
               rareMap.put(i,1);
           }
       }
        System.out.println(rareMap); //prin out the rare map

        Set<Integer> set = rareMap.keySet(); //Makes a set out of the rareMap Keyset
        Iterator<Integer> intItr = set.iterator(); //Put an Iterator on the set
        int rare = intItr.next(); //Puts a min int on the iterator

        while (intItr.hasNext()){
            int temp = intItr.next(); //temp int to keep track of position
            if (rareMap.get(temp) < rareMap.get(rare)){ // if temp is smaller than min value set min to the smaller value
                rare = temp;
            }
            System.out.println(rare); //Prin out the rares value in the map
        }

    }
}
