package Session_08_List;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        ArrayList array = new ArrayList();
//        array.add(1);
//        array.add("String 1");
//        array.add(true);
//        Iterator iterator = array.iterator();
//        while (iterator.hasNext()) {
//            System.out.print(iterator.next() + "	");
//
//        }
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add("String");
        ArrayList list = new ArrayList();
        list.add(1);
        list.add("A");
        list.add(true);
        list.add('a');
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
