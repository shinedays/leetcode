package No383;

/**
 * Created by Wang jf on 2017/6/20.
 */
public class Solution {
    public static boolean canConstruct(String ransomNote,String magazine){
        boolean flag = true;
        int[] ransom = new int[26];
        int[] mana = new int[26];

        for(int i = 0;i < ransomNote.length(); i++){
            ransom[ransomNote.charAt(i) - 'a'] ++;
        }

        for(int i = 0;i < magazine.length(); i++){
            mana[magazine.charAt(i) - 'a'] ++;
        }

        for(int i = 0; i < 26; i ++){
            if(ransom[i] > mana[i]){
                flag = false;
                break;
            }
        }

        return flag;
    }

    public static void main(String[] args) {
        String ransomNote = "";
        String magazine = "";
        System.out.println(canConstruct(ransomNote,magazine));
    }
}
