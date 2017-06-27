package No492;

/**
 * Created by Wang jf on 2017/6/19.
 */
public class Solution {
    public static int[] constuctRectangle(int area){
        int width = (int) Math.sqrt(area);
        int[] res = new int[2];
        while(width >= 1){
            if(area % width == 0){
                int length = area / width;
                res[0] = length;
                res[1] = width;
                break;
            }
            width --;
        }
        return res;
    }

    public static void main(String[] args) {
        int area = 7;
        int[] res = constuctRectangle(area);
        for(int a :res){
            System.out.println(a);
        }
    }
}
