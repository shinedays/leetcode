package No500;

import java.util.*;

/**
 * Created by bupt on 6/9/17.
 */
public class Solution {
    public static String[] findWords(String[] words){
        Set<Character> firstLine = new HashSet<Character>(){{
            add('q');
            add('w');
            add('e');
            add('r');
            add('t');
            add('y');
            add('u');
            add('i');
            add('o');
            add('p');
        }};

        Set<Character> secondLine = new HashSet<Character>(){{
            add('a');
            add('s');
            add('d');
            add('f');
            add('g');
            add('h');
            add('j');
            add('k');
            add('l');
        }};

        Set<Character> thirdLine = new HashSet<Character>(){{
            add('z');
            add('x');
            add('c');
            add('v');
            add('b');
            add('n');
            add('m');
        }};

        List<String> list = new LinkedList<>();

        flag:for(String word:words){
            String smallWord = word.toLowerCase();
            char firstChar = smallWord.charAt(0);
            Set set;
            if(firstLine.contains(firstChar)){
                set = firstLine;
            } else if(secondLine.contains(firstChar))
                set = secondLine;
            else
                set = thirdLine;

            for(int i = 1;i < smallWord.length();i++){
                char character = smallWord.charAt(i);
                if(!set.contains(character))
                    continue flag;
            }
            list.add(word);
        }

        return list.toArray(new String[list.size()]);
    }

    public static void main(String[] args) {
        String[] input = {"zZxcvbnm","Alaska","Dad","Peace"};
        String[] res = findWords(input);
        for(String s:res){
            System.out.println(s);
        }
    }
}
