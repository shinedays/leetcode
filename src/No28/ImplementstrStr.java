package No28;

/**
 * Created by bupt on 3/30/17.
 */
public class ImplementstrStr {
    public int[] nextArray(String needle){
        int needleLength = needle.length();
        int[] next = new int[needleLength];
        next[0] = -1;
        int i = 0;
        int k = -1;
        int j = 0;
        while(j < needleLength - 1){
            if(k == -1 || needle.charAt(j) == needle.charAt(k)){
                ++k;
                ++j;
                next[j] = k;
            }
            else{
                k = next[k];
            }
        }
        return next;
    }

    public int strStr(String haystack,String needle){
        int[] next = nextArray(needle);
        int i = 0;
        int j = 0;

        int haystackLength = haystack.length();
        int needleLength = needle.length();

        while(i < haystackLength && j < needleLength){
            if(j == -1 || haystack.charAt(i) == needle.charAt(j)){
                i++;
                j++;
            } else {
                j = next[j];
            }
        }
        if(j == needleLength)
            return i - j;
        else
            return -1;
    }

    public static void main(String[] args) {
        String str = "BBC ABACAB ABCDABCDABDE";
        String needle = "ABCDABD";
        System.out.println(new ImplementstrStr().strStr(str,needle)) ;
    }

}
