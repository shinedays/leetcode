package No412;

import com.sun.org.apache.regexp.internal.RE;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Wang jf on 2017/6/15.
 */
public class Solution {
    public static List<String> fizzBuzz(int n){
        List<String> res = new ArrayList<>();
        if(n < 1)
            return res;
        for(int i = 1;i <= n;i ++){
            if(i % 3 == 0 && i % 5 == 0){
                res.add("FizzBuzz");
                continue;
            }
            if( i % 3 == 0){
                res.add("Fizz");
                continue;
            }
            if(i % 5 == 0){
                res.add("Buzz");
                continue;
            }
            res.add(String.valueOf(i));
        }

        return res;
    }

    public static void main(String[] args) {
        int n = 0;
        List<String> list = fizzBuzz(n);
        for(String s:list)
            System.out.print(s + " ");
    }
}
