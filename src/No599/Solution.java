package No599;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Wang jf on 2017/6/19.
 */
public class Solution {
    public static String[] findRestaurant(String[] list1,String[] list2){
        Map<String,Integer> map1 = new HashMap<>();
        Map<String,Integer> map2 = new HashMap<>();
        for(int i = 0; i < list1.length; i ++){
            map1.put(list1[i], i);
        }

        for(int i = 0; i < list2.length; i ++){
            map2.put(list2[i], i);
        }

        List<String> res = new ArrayList<>();
        int min = Integer.MAX_VALUE;

        for(Map.Entry<String,Integer> entry : map2.entrySet()){
            if(map1.containsKey(entry.getKey())){
                if(map1.get(entry.getKey()) + entry.getValue() < min){
                    min = map1.get(entry.getKey()) + entry.getValue();
                    if(!res.isEmpty()){
                        res.clear();
                    }
                    res.add(entry.getKey());
                } else if(map1.get(entry.getKey()) + entry.getValue() == min){
                    res.add(entry.getKey());
                }
            }
        }

        String[] result = res.toArray(new String[res.size()]);
        return  result;
    }

    public static void main(String[] args) {
        String[] test1 = {"Shogun", "KFC"};
        String[] test2 = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
        String[] test3 = {"KFC", "Shogun", "Burger King"};
        String[] res = findRestaurant(test1,test2);
        for(String s:res){
            System.out.println(s);
        }
        String[] res2 = findRestaurant(test1,test3);
        for(String s:res2){
            System.out.println(s);
        }
    }
}
