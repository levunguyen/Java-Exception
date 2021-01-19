package session_11_Map;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("Hello", "Xin Chao");
        dictionary.put("Cat", "Con Meo");
        dictionary.put("Dog", "Con cho");

        List<String> arr = new ArrayList<>(dictionary.values());
        for (String str : arr){
            System.out.println(str);
        }
//        Set<String> keySet = dictionary.keySet();
//        for (String key : keySet) {
//            System.out.println("Key: " + key + " Value: " + dictionary.get(key));
//        }
    }
}
