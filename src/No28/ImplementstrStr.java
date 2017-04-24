package No28;

/**
 * Created by bupt on 3/30/17.
 */
public class ImplementstrStr {
    public int[] strStr(String haystack,String needle){

        int needleLength = needle.length();
        int[] next = new int[needleLength + 1];
        int j = 0;
        next[0] = next[1] = 0;
        for(int i = 0;i<needleLength;i++){
            while(j > 0 && needle.charAt(i) != needle.charAt(j))
                j = next[j];
            if( needle.charAt(i) == needle.charAt(j)){
                j++;
            }
            next[i+1] = j;
        }

        return next;
    }

    public static void main(String[] args) {
        String str = "aaaaaa";
        int[] res = new ImplementstrStr().strStr(str,str);
        for(int i : res){
            System.out.println(i);
        }
    }

}
