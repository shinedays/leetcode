package No127;

import java.util.*;

/**
 * Created by bupt on 4/24/17.
 */
public class WordLadder {
    public int ladderLength(String beginWord,String endWord,List<String> wordList){
        Set<String> dict = new HashSet<>();
        for(String s:wordList)
            dict.add(s);

        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);

        int level = 1; //level num
        int curnum = 1; // this level word number
        int nextnum = 0; // the number od words added queue

        while(!queue.isEmpty()){
            String word = queue.poll();
            curnum --;

            for(int i = 0;i < word.length();i++){
                char[] wordunit = word.toCharArray();
                for(char j = 'a'; j <= 'z';j++){
                    wordunit[i] = j;
                    String temp = new String(wordunit);

                    if(temp.equals(endWord))
                        return level+1;
                    if(dict.contains(temp)){
                        queue.add(temp);
                        nextnum ++ ;
                        dict.remove(temp);
                    }
                }
            }

            if(curnum == 0){
                curnum = nextnum;
                nextnum = 0;
                level ++;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        String beginEord = "hit";
        String endWord = "cog";
        LinkedList<String> wordList = new LinkedList<>();
        wordList.add("hot");
        wordList.add("dog");
        wordList.add("dot");
        wordList.add("lot");
        wordList.add("cog");
        System.out.println(new WordLadder().ladderLength(beginEord,endWord,wordList));
    }
}
