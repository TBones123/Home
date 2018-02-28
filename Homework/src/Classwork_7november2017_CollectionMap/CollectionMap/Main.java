package Classwork_7november2017_CollectionMap.CollectionMap;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("one", 1);
        hashMap.put("two", 2);
        hashMap.put("three", 3);
        hashMap.put("foure", 4);
        System.out.println(hashMap);
        System.out.println(hashMap.values());
        System.out.println(hashMap.keySet());
        System.out.println(hashMap.size());
        System.out.println(hashMap.entrySet());
//        System.out.println(hashMap.containsKey());
        System.out.println(hashMap.getOrDefault("foure", 7));





        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("two", 2);
        linkedHashMap.put("three", 3);
        linkedHashMap.put("foure", 4);
        linkedHashMap.put("one", 5);
        System.out.println(linkedHashMap);





        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("a", 2);
        treeMap.put("b", 3);
        treeMap.put("c", 4);
        treeMap.put("e", 1);
        treeMap.put("d", 5);
        System.out.println(treeMap);




//        System.out.println(treeMap.headMap("d"));
//        System.out.println(treeMap.pollFirstEntry());
//        System.out.println(treeMap.ceilingKey("  "));
//        System.out.println(treeMap.floorKey(" "));
//        System.out.println(treeMap.higherKey("c"));
//        System.out.println(treeMap.higherEntry("d"));
//        System.out.println(treeMap.navigableKeySet());
//        System.out.println(treeMap.descendingMap());
//        System.out.println(treeMap);





//        Set<Map.Entry<String, Integer>> entries = treeMap.entrySet();
//        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
//        while (iterator.hasNext()) {
//            Map.Entry<String, Integer> entry = iterator.next();
//            if (entry.getValue().equals(3)){
//                iterator.remove();
//            }
//            System.out.println(treeMap);
//        }




        ArrayList<Liquid> liquids1 = new ArrayList<>();
        liquids1.add(new Liquid("vodka"));
        liquids1.add(new Liquid("tomaro"));
        liquids1.add(new Liquid("orange"));





        ArrayList<Liquid> liquids2 = new ArrayList<>();
        liquids2.add(new Liquid("vodka"));
        liquids2.add(new Liquid("beer"));
        liquids2.add(new Liquid("vine"));





        HashMap<Coctail, ArrayList<Liquid>> map = new HashMap<>();
        map.put(new Coctail("Blood marry"), liquids1);
        map.put(new Coctail("topolivka"), liquids2);




        Set<Map.Entry<Coctail, ArrayList<Liquid>>> entries = map.entrySet();




        for (Iterator<Map.Entry<Coctail, ArrayList<Liquid>>> entryIterator = entries.iterator(); entryIterator.hasNext(); ) {
            Map.Entry<Coctail, ArrayList<Liquid>> entry = entryIterator.next();
            if (entry.getKey().getNameOfCoctail().equals("blood marry")) {
                for (Iterator<Liquid> iterator = entry.getValue().iterator(); iterator.hasNext(); ) {
                    if (iterator.next().getNameOfLiquid().equals("orange")) {
                        iterator.remove();
                    }
                }
            }
        }

        System.out.println(map);


    }
}
